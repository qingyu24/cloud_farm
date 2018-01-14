package com.fngame.farm.userdate;

import com.alibaba.fastjson.JSONObject;
import com.fngame.farm.model.User;
import com.fngame.farm.util.HttpRequest;

/**
 * Created by qingyu on 2018/1/11 /18:27
 */
public class AdressUtil {

    static final String ak = "auCGZBXjzwvOq819zL0aiEnuohfdjZm6";
    /* static final String sn = "";*/
    static final String coor = "";
    /**
     * coor不出现、或为空：百度墨卡托坐标，即百度米制坐标；
     * coor = bd09ll：百度经纬度坐标，在国测局坐标基础之上二次加密而来；
     * coor = gcj02：国测局02坐标，在原始GPS坐标基础上，按照国家测绘行业统一要求，加密后的坐标；
     */
    static final String url = "http://api.map.baidu.com/location/ip";

    public static String getAdress(String ip) {
        String param = "ak=" + ak + "&ip=" + ip;
        return HttpRequest.sendGet(url, param);
    }

    public static String getPoint(String adress) {

        JSONObject parse = (JSONObject) JSONObject.parse(adress);
        JSONObject jsonObject = parse.getJSONObject("content").getJSONObject("point");
        double x = jsonObject.getDouble("x");
        double y = jsonObject.getDouble("y");
        System.out.println("坐标" + x + "坐标" + y);
        return null;

    }

    public static void updatePoint(String ipAddr, User userByname) {
        if (ipAddr.contains("192.168.")) return;//局域网不做处理

        String adress = AdressUtil.getAdress(ipAddr);
        JSONObject parse = (JSONObject) JSONObject.parse(adress);
        JSONObject jsonObject = parse.getJSONObject("content").getJSONObject("point");
        double x = jsonObject.getDouble("x");
        double y = jsonObject.getDouble("y");
        userByname.setXpoint(x);
        userByname.setYpoint(y);
        userByname.setIpadress(ipAddr);
    }
}
