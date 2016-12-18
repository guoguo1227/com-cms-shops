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
    private String getNavJson(){
        //测试用
        JSONArray urlArray  = new JSONArray();
        JSONArray childrenArray  = new JSONArray();

        JSONObject object1 = new JSONObject();
        object1.put("id","61");
        object1.put("dir","shop");
        object1.put("html","shop.html");

        JSONObject object2 = new JSONObject();
        object2.put("id","62");
        object2.put("dir","district");
        object2.put("html","district.html");

        JSONObject object3 = new JSONObject();
        object3.put("id","63");
        object3.put("dir","street");
        object3.put("html","street.html");

        JSONObject  object4 = new JSONObject();
        object4.put("id","64");
        object4.put("dir","hotcat");
        object4.put("html","hotcat.html");

        JSONObject  object5 = new JSONObject();
        object5.put("id","65");
        object5.put("dir","renovation");
        object5.put("html","renovation.html");

        JSONObject  object6 = new JSONObject();
        object6.put("id","66");
        object6.put("dir", "build");
        object6.put("html","build.html");

        JSONObject  object7 = new JSONObject();
        object7.put("id","67");
        object7.put("dir","adapt");
        object7.put("html","adapt.html");

        JSONObject  object8 = new JSONObject();
        object8.put("id","68");
        object8.put("dir","property");
        object8.put("html","property.html");

        JSONObject  object9 = new JSONObject();
        object9.put("id","69");
        object9.put("dir","support");
        object9.put("html","support.html");

        JSONArray shopChildArray = new JSONArray();
        shopChildArray.add(object1);
        shopChildArray.add(object2);
        shopChildArray.add(object3);
        shopChildArray.add(object4);
        shopChildArray.add(object5);
        shopChildArray.add(object6);
        shopChildArray.add(object7);
        shopChildArray.add(object8);
        shopChildArray.add(object9);

        //商铺管理
        JSONObject shopParent = new JSONObject();
        shopParent.put("id", "1");
        shopParent.put("dir","shops");
        shopParent.put("html","shops.html");
        shopParent.put("children",shopChildArray);


        JSONObject  object10 = new JSONObject();
        object10.put("id","2");
        object10.put("dir","check");
        object10.put("html","check.html");

        JSONObject  object11 = new JSONObject();
        object11.put("id","3");
        object11.put("dir","comment");
        object11.put("html","comment.html");

      /*  JSONObject  object12 = new JSONObject();
        object12.put("id","4");
        object12.put("dir","reply");
        object12.put("html","reply.html");

        JSONObject  object13 = new JSONObject();
        object13.put("id","5");
        object13.put("dir","investment");
        object13.put("html","investment.html");*/

        JSONObject  object15 = new JSONObject();
        object15.put("id","6");
        object15.put("dir","ad");
        object15.put("html","ad.html");

        JSONObject  object16 = new JSONObject();
        object16.put("id","7");
        object16.put("dir","partner");
        object16.put("html","partner.html");

        JSONObject  object17 = new JSONObject();
        object17.put("id","8");
        object17.put("dir","link");
        object17.put("html","link.html");

        JSONObject  object18 = new JSONObject();
        object18.put("id","9");
        object18.put("dir","report");
        object18.put("html","report.html");

        JSONObject  object19 = new JSONObject();
        object19.put("id", "10");
        object19.put("dir", "flash");
        object19.put("html", "flash.html");

        JSONObject  boardObj = new JSONObject();
        boardObj.put("id","11");
        boardObj.put("dir","board");
        boardObj.put("html","board.html");

        JSONObject  object21 = new JSONObject();
        object21.put("id","12");
        object21.put("dir","business");
        object21.put("html","business.html");

        JSONObject  object20 = new JSONObject();
        object20.put("id","13");
        object20.put("dir","investment");
        object20.put("html","investment.html");

        childrenArray.add(shopParent);
        childrenArray.add(object10);
        childrenArray.add(object11);
        //childrenArray.add(object12);
        //childrenArray.add(object13);
        childrenArray.add(object15);
        childrenArray.add(object16);
        childrenArray.add(object17);
        childrenArray.add(object18);
        childrenArray.add(object19);
        childrenArray.add(boardObj);
        childrenArray.add(object20);
        childrenArray.add(object21);

        JSONObject parent = new JSONObject();
        parent.put("id", "0");
        parent.put("dir","cms");
        parent.put("html","cms.html");
        parent.put("children",childrenArray);

        urlArray.add(parent);

        JSONArray navArray  = new JSONArray();
        JSONObject object51 = new JSONObject();
        object51.put("id","61");
        object51.put("name","商铺列表");
        object51.put("icon","");

        JSONObject object52 = new JSONObject();
        object52.put("id","62");
        object52.put("name","地区列表");
        object52.put("icon","");
        JSONObject object53 = new JSONObject();
        object53.put("id", "63");
        object53.put("name","街道列表");
        object53.put("icon","");

        JSONObject object54 = new JSONObject();
        object54.put("id","64");
        object54.put("name","商铺类型列表");
        object54.put("icon","");

        JSONObject object55= new JSONObject();
        object55.put("id","65");
        object55.put("name","装修列表");
        object55.put("icon","");

        JSONObject object56 = new JSONObject();
        object56.put("id","66");
        object56.put("name","建筑结构列表");
        object56.put("icon","");

        JSONObject object57 = new JSONObject();
        object57.put("id","67");
        object57.put("name","适应业态列表");
        object57.put("icon","");

        JSONObject object58 = new JSONObject();
        object58.put("id","68");
        object58.put("name","物业性质列表");
        object58.put("icon","");

        JSONObject object59 = new JSONObject();
        object59.put("id","69");
        object59.put("name","配套设施列表");
        object59.put("icon","");

        //商铺管理列表
        JSONArray shopNavArr = new JSONArray();
        shopNavArr.add(object51);
        shopNavArr.add(object52);
        shopNavArr.add(object53);
        shopNavArr.add(object54);
        shopNavArr.add(object55);
        shopNavArr.add(object56);
        shopNavArr.add(object57);
        shopNavArr.add(object58);
        shopNavArr.add(object59);

        JSONObject shopNavParentObj  = new JSONObject();
        shopNavParentObj.put("id","1");
        shopNavParentObj.put("name","商铺管理");
        shopNavParentObj.put("icon","");
        shopNavParentObj.put("children",shopNavArr);


        JSONObject object60 = new JSONObject();
        object60.put("id","2");
        object60.put("name","审核列表");
        object60.put("icon","");

        JSONObject object61 = new JSONObject();
        object61.put("id","3");
        object61.put("name","留言列表");
        object61.put("icon","");

        /*JSONObject object62 = new JSONObject();
        object62.put("id","4");
        object62.put("name","回复模板列表");
        object62.put("icon","");


        JSONObject object63 = new JSONObject();
        object63.put("id","5");
        object63.put("name","招商留言模板");
        object63.put("icon","");*/

        JSONObject object64 = new JSONObject();
        object64.put("id","6");
        object64.put("name","广告列表");
        object64.put("icon","");

        JSONObject object65 = new JSONObject();
        object65.put("id","7");
        object65.put("name","合作伙伴列表");
        object65.put("icon","");

        JSONObject object66 = new JSONObject();
        object66.put("id","8");
        object66.put("name","友情链接列表");
        object66.put("icon","");

        JSONObject object67 = new JSONObject();
        object67.put("id","9");
        object67.put("name","报表");
        object67.put("icon","");

        JSONObject object68 = new JSONObject();
        object68.put("id", "10");
        object68.put("name", "上传Flash");
        object68.put("icon", "");

        JSONObject object69 = new JSONObject();
        object69.put("id","11");
        object69.put("name","公告管理列表");
        object69.put("icon","");

        JSONObject object71 = new JSONObject();
        object71.put("id","12");
        object71.put("name","招商项目");
        object71.put("icon","");

        JSONObject object70 = new JSONObject();
        object70.put("id","13");
        object70.put("name","招商热线");
        object70.put("icon","");

        navArray.add(shopNavParentObj);
        navArray.add(object60);
        navArray.add(object61);
        //navArray.add(object62);
        //navArray.add(object63);
        navArray.add(object64);
        navArray.add(object65);
        navArray.add(object66);
        navArray.add(object67);
        navArray.add(object68);
        navArray.add(object69);
        navArray.add(object71);
        navArray.add(object70);

        JSONObject object = new JSONObject();
        object.put("url",urlArray);
        object.put("nav",navArray);

        return gson.toJson(object);
    }
}
