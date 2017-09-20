package com.mmm.springboot.jparedisdemo.service.impl;

import com.mmm.springboot.jparedisdemo.dao.GirlDao;
import com.mmm.springboot.jparedisdemo.entity.Girl;
import com.mmm.springboot.jparedisdemo.service.GirlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GirlServiceImpl implements GirlService{
    @Autowired
    private GirlDao girlDao;
    @Override
    public Girl save(Girl girl) {
        return girlDao.save(girl);
    }

    @Override
    public Girl update(Girl girl) {
        return girlDao.save(girl);
    }

    @Override
    public void deleteGirlById(Integer id) {
        girlDao.delete(id);
    }

    @Override
    public Girl getGirlById(Integer id) {
        return girlDao.findOne(id);
    }
}
