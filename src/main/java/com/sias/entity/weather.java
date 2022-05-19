package com.sias.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Edgar
 * @create 2022-05-19 10:27
 * @faction:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class weather {
    int id;
    String cityId;
    String weatherDay;
    String maxtem;
    String mintem;
    String wea;
    String win;

}
