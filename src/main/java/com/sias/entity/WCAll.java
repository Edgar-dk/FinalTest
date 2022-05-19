package com.sias.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Edgar
 * @create 2022-05-19 11:23
 * @faction:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WCAll {
    String id;
    String cityId;
    String weatherDay;
    String maxtem;
    String mintem;
    String wea;
    String win;
    String cityEn;
    String cityZh;
    String provinceEn;
    String provinceZh;
    String countryEn;
    String countryZh;
    String leaderEn;
    String leaderZh;
    String lat;
    String lon;
}
