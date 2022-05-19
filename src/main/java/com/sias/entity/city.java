package com.sias.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Edgar
 * @create 2022-05-19 10:24
 * @faction:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class city {
    String id;
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
