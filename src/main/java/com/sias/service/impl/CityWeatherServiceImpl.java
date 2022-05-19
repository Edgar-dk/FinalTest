package com.sias.service.impl;


import com.sias.commons.Sleep.SleepUtils;
import com.sias.entity.WCAll;
import com.sias.entity.city;
import com.sias.mapper.CityWeather;
import com.sias.service.CityWeatherService;
//import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author Edgar
 * @create 2022-04-04 13:49
 * @faction:
 */
@Service
public class CityWeatherServiceImpl implements CityWeatherService {

    @Resource
    private CityWeather cityWeather;


    /*1.按照城市名和日期，查询某一月的天气*/
    @Override
    public List<WCAll> queryCityMonthWeather(Map map) {
        SleepUtils.sleep(3);
        return cityWeather.selectCityMonthWeather(map);
    }

    /*2.按照城市的ID和日期查询出当天的天气*/
    @Override
    public List<WCAll> queryCityWeatherAsIDDate(Map map) {
        return cityWeather.selectCityWeatherAsIDDate(map);
    }
}
