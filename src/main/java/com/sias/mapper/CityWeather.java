package com.sias.mapper;

import com.sias.entity.WCAll;
import com.sias.entity.city;
import org.apache.ibatis.annotations.Mapper;
import com.sias.entity.city;

import java.util.List;
import java.util.Map;

/**
 * @author Edgar
 * @create 2022-05-19 11:06
 * @faction:
 */

@Mapper
public interface CityWeather {

    /*1.按照城市名和日期，查询某一月的天气*/
    public List<WCAll> selectCityMonthWeather(Map map);

    /*2.按照城市ID，日期查询出当天天气*/
    public List<WCAll> selectCityWeatherAsIDDate(Map map);

}
