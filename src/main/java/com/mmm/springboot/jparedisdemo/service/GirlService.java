package com.mmm.springboot.jparedisdemo.service;

import com.mmm.springboot.jparedisdemo.entity.Girl;

public interface GirlService{
    Girl save(Girl girl);
    Girl update(Girl girl);
    void deleteGirlById(Integer id);
    Girl getGirlById(Integer id);
}
