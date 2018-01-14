
package com.fngame.farm.service;

import com.fngame.farm.userdate.AdressIP;
import com.fngame.farm.util.HttpRequest;
import com.fngame.farm.util.XlsUtil;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.util.Date;

/** 
* PetService Tester. 
* 
* @author <Authors name> 
* @since <pre>一月 3, 2018</pre> 
* @version 1.0 
*/ 
public class PetServiceTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: add(ResultInfo resultInfo, PetData PetData) 
* 
*/ 
@Test
public void testAdd() throws Exception { 
//TODO: Test goes here...
    String s="1";
    int m=1;
    System.out.println(s.equals(String.valueOf(m)));
} 

/** 
* 
* Method: modify(ResultInfo resultInfo, PetData PetData) 
* 
*/ 
@Test
public void testModify() throws Exception { 
//TODO: Test goes here...
int sds=10;
    for (int i = 0; i < 100; i++) {
        int v = (int) (Math.random() * 10);
        System.out.println(v);
    }
} 

/** 
* 
* Method: remove(ResultInfo resultInfo, PetData PetData) 
* 
*/ 
@Test
public void testRemove() throws Exception { 
//TODO: Test goes here...
    XlsUtil xlsUtil = new XlsUtil();

xlsUtil.readManager();
}

/** 
* 
* Method: get(ResultInfo resultInfo, PetData PetData) 
* 
*/ 
@Test
public void testGet() throws Exception { 
//TODO: Test goes here...

  /*  String s = HttpRequest.sendGet("http://192.168.1.253:1111/building/get?userid=33", null);
    System.out.println(s);*/
    String adress = AdressIP.getAdress("47.94.42.4");
    System.out.println(adress);
    AdressIP.getPoint(adress);
} 

/** 
* 
* Method: activity(ResultInfo resultInfo, PetData PetData) 
* 
*/ 
@Test
public void testActivity() throws Exception { 
//TODO: Test goes here...

    String s="3223|dssd";
    String[] split = s.split("\\|");
    for (String s1 : split) {
        System.out.println(s1);
    }
} 

/** 
* 
* Method: getLefttime(PetData petData) 
* 
*/ 
@Test
public void testGetLefttime() throws Exception { 
//TODO: Test goes here...
    Date date = new Date();
    System.out.println(date);
} 

/** 
* 
* Method: update(PetData petData) 
* 
*/ 
@Test
public void testUpdate() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: petharvest(ResultInfo resultInfo, PetData petData) 
* 
*/ 
@Test
public void testPetharvest() throws Exception { 
//TODO: Test goes here... 
} 


/** 
* 
* Method: toResult(List<PetData> pets) 
* 
*/ 
@Test
public void testToResult() throws Exception { 
//TODO: Test goes here... 
    Class<Object[]> aClass = Object[]. class;
    System.out.println(aClass+"dd"+Object.class);
}

/** 
* 
* Method: search(ResultInfo resultInfo, PetData PetData, Integer skil) 
* 
*/ 
@Test
public void testSearch() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = PetService.getClass().getMethod("search", ResultInfo.class, PetData.class, Integer.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

/** 
* 
* Method: trick(ResultInfo resultInfo, PetData PetData) 
* 
*/ 
@Test
public void testTrick() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = PetService.getClass().getMethod("trick", ResultInfo.class, PetData.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

/** 
* 
* Method: steal(ResultInfo resultInfo, PetData PetData) 
* 
*/ 
@Test
public void testSteal() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = PetService.getClass().getMethod("steal", ResultInfo.class, PetData.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

} 
