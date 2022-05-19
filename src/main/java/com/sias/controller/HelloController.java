package com.sias.controller;

import com.sias.commons.constans.Constant;
import com.sias.commons.domain.ReturnObject;
import com.sias.entity.WCAll;
import com.sias.entity.city;
import com.sias.service.impl.CityWeatherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;

/**
 * @author Edgar
 * @create 2022-05-19 11:20
 * @faction:
 */
@Controller
public class HelloController {

    @Autowired
    private CityWeatherServiceImpl cityWeatherService;

    /*1.按照城市名和日期，查询某一月的天气*/
    @ResponseBody
    @RequestMapping(value = "/queryCityMonthWeather.do")
    public Object queryCityMonthWeather(@RequestParam("cityZh") String cityZh,
                                        @RequestParam("weatherDay") String weatherDay ){
        HashMap<Object, Object> map = new HashMap<>();
        map.put("cityZh",cityZh);
        map.put("weatherDay",weatherDay);
        ReturnObject returnObject = new ReturnObject();

            List<WCAll> alls = cityWeatherService.queryCityMonthWeather(map);
            if (alls!=null){
                returnObject.setCode(Constant.ReTURN_OBJECT_CODE_SUCCESS);
                returnObject.setMessage("查询数据成功");
            }else {
                returnObject.setCode(Constant.ReTURN_OBJECT_CODE_FAIL);
                returnObject.setMessage("查询数据失败");
            }
        HashMap<Object, Object> map1 = new HashMap<>();
        map1.put("alls",alls);
        map1.put("returnObject",returnObject);
        return map1;
    }


    /*2.按照城市的ID和日期查询出当天的天气*/
    @RequestMapping(value = "/queryCityWeatherAsIDDate.do")
    @ResponseBody
    public Object queryCityWeatherAsIDDate(@RequestParam("id") String id,
                                           @RequestParam("weatherDay") String weatherDay){
        HashMap<Object, Object> map = new HashMap<>();
        map.put("id",id);
        map.put("weatherDay",weatherDay);
        ReturnObject returnObject = new ReturnObject();
        List<WCAll> wcAlls = cityWeatherService.queryCityWeatherAsIDDate(map);
        if (wcAlls!=null){
            returnObject.setCode(Constant.ReTURN_OBJECT_CODE_SUCCESS);
            returnObject.setMessage("查询数据成功");
        }else {
            returnObject.setCode(Constant.ReTURN_OBJECT_CODE_FAIL);
            returnObject.setMessage("查询数据失败");
        }
        HashMap<Object, Object> hashMap = new HashMap<>();
        hashMap.put("returnObject",returnObject);
        hashMap.put("wcalls",wcAlls);
        return hashMap;
    }
}
