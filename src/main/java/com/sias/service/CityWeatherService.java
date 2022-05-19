package com.sias.service;



import com.sias.entity.WCAll;
import com.sias.entity.city;

import java.util.List;
import java.util.Map;

/**
 * @author Edgar
 * @create 2022-04-04 13:49
 * @faction:
 */
public interface CityWeatherService{

     /*1.按照城市名和日期，查询某一月的天气*/
     public List<WCAll> queryCityMonthWeather(Map map);

     /*2.按照城市ID和日期查询出当天的天气*/
     public List<WCAll> queryCityWeatherAsIDDate(Map map);
}
