package com.mmm.springboot.jparedisdemo.dao;

import com.mmm.springboot.jparedisdemo.entity.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GirlDao extends JpaRepository<Girl,Integer>{
}
