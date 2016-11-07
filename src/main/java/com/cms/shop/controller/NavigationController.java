package com.cms.shop.controller;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author : samuel
 * @Description :获取导航栏
 * @Date : 15-12-25 下午3:04
 */
@Controller
@RequestMapping("navigation")
public class NavigationController extends BaseController{

    @RequestMapping(value = "getNavData.json",produces = "application/json;charset=utf-8")
    @ResponseBody
    public String getNavData(String callback){
        String json = getNavJson();
        if(callback != null){
            json = callback + "(" +json + ")";
        }
        return json;
    }
    /**
     * @ Description : 获取导航列表数据栏
     * @return
     */
    private String getNavJsons(){
        //测试用
        JSONArray urlArray  = new JSONArray();
        JSONArray childrenArray  = new JSONArray();

        JSONObject object3 = new JSONObject();
        object3.put("id","1");
        object3.put("dir","dashboard");
        object3.put("html","dashboard.html");

        JSONObject object1 = new JSONObject();
        object1.put("id","2");
        object1.put("dir","user");
        object1.put("html","user.html");

        JSONObject object2 = new JSONObject();
        object2.put("id","3");
        object2.put("dir","journey");
        object2.put("html","journey.html");

        JSONObject  object4 = new JSONObject();
        object4.put("id","4");
        object4.put("dir","microblog");
        object4.put("html","microblog.html");

        JSONObject  object5 = new JSONObject();
        object5.put("id","5");
        object5.put("dir","comment");
        object5.put("html","comment.html");

        JSONObject  object16 = new JSONObject();
        object16.put("id","6");
        object16.put("dir","customization");
        object16.put("html","customization.html");

        childrenArray.add(object3);
        childrenArray.add(object1);
        childrenArray.add(object2);
        childrenArray.add(object4);
        childrenArray.add(object5);
        childrenArray.add(object16);

        JSONObject parent = new JSONObject();
        parent.put("id", "0");
        parent.put("dir","travels");
        parent.put("html","travels.html");
        parent.put("children",childrenArray);

        urlArray.add(parent);

        JSONArray navArray  = new JSONArray();
        JSONObject object8 = new JSONObject();
        object8.put("id","1");
        object8.put("name","控制台");
        object8.put("icon","");

        JSONObject object6 = new JSONObject();
        object6.put("id","2");
        object6.put("name","用户列表");
        object6.put("icon","");
        JSONObject object7 = new JSONObject();
        object7.put("id","3");
        object7.put("name","行程分享");
        object7.put("icon","");

        JSONObject object9 = new JSONObject();
        object9.put("id","4");
        object9.put("name","微游记");
        object9.put("icon","");

        JSONObject object10 = new JSONObject();
        object10.put("id","5");
        object10.put("name","评论");
        object10.put("icon","");

        JSONObject object11 = new JSONObject();
        object11.put("id","6");
        object11.put("name","定制");
        object11.put("icon","");

        navArray.add(object8);
        navArray.add(object6);
        navArray.add(object7);
        navArray.add(object9);
        navArray.add(object10);
        navArray.add(object11);

        JSONObject object = new JSONObject();
        object.put("url",urlArray);
        object.put("nav",navArray);

        return gson.toJson(object);
    }
    /**
     * @ Description : 获取导航列表数据栏
     * @return
     */
    private String getNavJson(){
        //测试用
        JSONArray urlArray  = new JSONArray();
        JSONArray childrenArray  = new JSONArray();

        JSONObject object1 = new JSONObject();
        object1.put("id","1");
        object1.put("dir","shop");
        object1.put("html","shop.html");

        JSONObject object2 = new JSONObject();
        object2.put("id","2");
        object2.put("dir","district");
        object2.put("html","district.html");

        JSONObject object3 = new JSONObject();
        object3.put("id","3");
        object3.put("dir","street");
        object3.put("html","street.html");

        JSONObject  object4 = new JSONObject();
        object4.put("id","4");
        object4.put("dir","hotcat");
        object4.put("html","hotcat.html");

        JSONObject  object5 = new JSONObject();
        object5.put("id","5");
        object5.put("dir","renovation");
        object5.put("html","renovation.html");

        JSONObject  object6 = new JSONObject();
        object6.put("id","6");
        object6.put("dir", "build");
        object6.put("html","build.html");

        JSONObject  object7 = new JSONObject();
        object7.put("id","7");
        object7.put("dir","adapt");
        object7.put("html","adapt.html");

        JSONObject  object8 = new JSONObject();
        object8.put("id","8");
        object8.put("dir","property");
        object8.put("html","property.html");

        JSONObject  object9 = new JSONObject();
        object9.put("id","9");
        object9.put("dir","support");
        object9.put("html","support.html");

        JSONObject  object10 = new JSONObject();
        object10.put("id","10");
        object10.put("dir","check");
        object10.put("html","check.html");

        JSONObject  object11 = new JSONObject();
        object11.put("id","11");
        object11.put("dir","comment");
        object11.put("html","comment.html");

        JSONObject  object12 = new JSONObject();
        object12.put("id","12");
        object12.put("dir","reply");
        object12.put("html","reply.html");

        JSONObject  object13 = new JSONObject();
        object13.put("id","13");
        object13.put("dir","investment");
        object13.put("html","investment.html");

        JSONObject  object15 = new JSONObject();
        object15.put("id","14");
        object15.put("dir","ad");
        object15.put("html","ad.html");

        JSONObject  object16 = new JSONObject();
        object16.put("id","15");
        object16.put("dir","friend");
        object16.put("html","friend.html");

        JSONObject  object17 = new JSONObject();
        object17.put("id","16");
        object17.put("dir","link");
        object17.put("html","link.html");

        JSONObject  object18 = new JSONObject();
        object18.put("id","17");
        object18.put("dir","report");
        object18.put("html","report.html");

        JSONObject  object19 = new JSONObject();
        object19.put("id","18");
        object19.put("dir","flash");
        object19.put("html","flash.html");

        childrenArray.add(object1);
        childrenArray.add(object2);
        childrenArray.add(object3);
        childrenArray.add(object4);
        childrenArray.add(object5);
        childrenArray.add(object6);
        childrenArray.add(object7);
        childrenArray.add(object8);
        childrenArray.add(object9);
        childrenArray.add(object10);
        childrenArray.add(object11);
        childrenArray.add(object12);
        childrenArray.add(object13);
        childrenArray.add(object15);
        childrenArray.add(object16);
        childrenArray.add(object17);
        childrenArray.add(object18);
        childrenArray.add(object19);

        JSONObject parent = new JSONObject();
        parent.put("id", "0");
        parent.put("dir","cms");
        parent.put("html","cms.html");
        parent.put("children",childrenArray);

        urlArray.add(parent);

        JSONArray navArray  = new JSONArray();
        JSONObject object51 = new JSONObject();
        object51.put("id","1");
        object51.put("name","商铺列表");
        object51.put("icon","");

        JSONObject object52 = new JSONObject();
        object52.put("id","2");
        object52.put("name","地区列表");
        object52.put("icon","");
        JSONObject object53 = new JSONObject();
        object53.put("id", "3");
        object53.put("name","街道列表");
        object53.put("icon","");

        JSONObject object54 = new JSONObject();
        object54.put("id","4");
        object54.put("name","商铺类型列表");
        object54.put("icon","");

        JSONObject object55= new JSONObject();
        object55.put("id","5");
        object55.put("name","装修列表");
        object55.put("icon","");

        JSONObject object56 = new JSONObject();
        object56.put("id","6");
        object56.put("name","建筑结构列表");
        object56.put("icon","");

        JSONObject object57 = new JSONObject();
        object57.put("id","7");
        object57.put("name","适应业态列表");
        object57.put("icon","");

        JSONObject object58 = new JSONObject();
        object58.put("id","8");
        object58.put("name","物业性质列表");
        object58.put("icon","");

        JSONObject object59 = new JSONObject();
        object59.put("id","9");
        object59.put("name","配套设施列表");
        object59.put("icon","");

        JSONObject object60 = new JSONObject();
        object60.put("id","10");
        object60.put("name","审核列表");
        object60.put("icon","");

        JSONObject object61 = new JSONObject();
        object61.put("id","11");
        object61.put("name","留言列表");
        object61.put("icon","");

        JSONObject object62 = new JSONObject();
        object62.put("id","12");
        object62.put("name","回复模板列表");
        object62.put("icon","");


        JSONObject object63 = new JSONObject();
        object63.put("id","13");
        object63.put("name","招商留言模板");
        object63.put("icon","");

        JSONObject object64 = new JSONObject();
        object64.put("id","14");
        object64.put("name","广告列表");
        object64.put("icon","");

        JSONObject object65 = new JSONObject();
        object65.put("id","15");
        object65.put("name","合作伙伴列表");
        object65.put("icon","");

        JSONObject object66 = new JSONObject();
        object66.put("id","16");
        object66.put("name","友情链接列表");
        object66.put("icon","");

        JSONObject object67 = new JSONObject();
        object67.put("id","17");
        object67.put("name","报表");
        object67.put("icon","");

        JSONObject object68 = new JSONObject();
        object68.put("id","18");
        object68.put("name","上传Flash");
        object68.put("icon","");
        navArray.add(object51);
        navArray.add(object52);
        navArray.add(object53);
        navArray.add(object54);
        navArray.add(object55);
        navArray.add(object56);
        navArray.add(object57);
        navArray.add(object58);
        navArray.add(object59);
        navArray.add(object60);
        navArray.add(object61);
        navArray.add(object62);
        navArray.add(object63);
        navArray.add(object64);
        navArray.add(object65);
        navArray.add(object66);
        navArray.add(object67);
        navArray.add(object68);


        JSONObject object = new JSONObject();
        object.put("url",urlArray);
        object.put("nav",navArray);

        return gson.toJson(object);
    }
}
