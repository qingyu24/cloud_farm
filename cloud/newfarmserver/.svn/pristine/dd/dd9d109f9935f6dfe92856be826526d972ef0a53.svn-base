package com.fngame.farm.userdate;

import com.fngame.farm.manager.ConfigManager;
import com.fngame.farm.util.BeanTools;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.HashMap;


@Component
@Scope("prototype")
public class ResultInfo {
    private Long userid;

    private String main;

    private String sub;

    private String resp_code;

    private String resp_desc;

    private HashMap<String, Object> data;

    private PlayerMessage playerMessage;

    public PlayerMessage getPlayerMessage() {
        try {
            playerMessage = new PlayerMessage(userid);
        } catch (Exception e) {
            playerMessage = new PlayerMessage();
        } finally {
            return playerMessage;
        }

    }

    Logger logger = LoggerFactory.getLogger(this.getClass());

    public void setPlayerMessage(PlayerMessage playerMessage) {
        this.playerMessage = playerMessage;
    }




    public String getResp_code() {
        return resp_code;
    }

    public void setResp_code(String resp_code) {
        ConfigManager configManager= (ConfigManager) BeanTools.getBean(ConfigManager.class);
        this.resp_code = resp_code;
        String resp = configManager.getResp(resp_code);
        this.resp_desc = resp;
    }

    public String getResp_desc() {
        return resp_desc;
    }

    public void setResp_desc(String resp_desc) {
        this.resp_desc = resp_desc;
    }

    public void setResult(String code, String resp_desc) {
        this.resp_code = code;
        this.resp_desc = resp_desc;
    }

    public HashMap<String, Object> getData() {
        if (data == null) data = new HashMap<>();
        return data;
    }

    public void setData(HashMap<String, Object> data) {
        this.data = data;
    }


    public void setSucess(boolean issucess) {
        if (issucess) {
            this.resp_code = "000000";
            this.resp_desc = "操作成功";
        }
    }

    public String getMain() {
        logger.info("返回参数：" + this.toString());
        return main;
    }

    public String getSub() {
        return sub;
    }

    public void setOrder(RequserOrder order) {
        resp_code = null;
        resp_desc = null;
        userid = 0l;
        main = null;
        sub = null;
        if (data != null) data.clear();
        this.userid = order.getUserid();
        this.main = order.main;
        this.sub = order.sub;
    }

    @Override
    public String toString() {
        return "ResultInfo{" + "resp_code='" + resp_code + '\'' + ", resp_desc='" + resp_desc + '\'' + ", data=" + data + ", main='" + main + '\'' + ", sub='" + sub + '\'' + '}';
    }

    public void setfalse() {
        this.resp_code = "999999";
        this.resp_desc = "处理有误";
    }
}
