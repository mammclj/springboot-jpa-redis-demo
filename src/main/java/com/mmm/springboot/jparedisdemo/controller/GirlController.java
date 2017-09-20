package com.mmm.springboot.jparedisdemo.controller;

import com.mmm.springboot.jparedisdemo.entity.Girl;
import com.mmm.springboot.jparedisdemo.exception.LogException;
import com.mmm.springboot.jparedisdemo.model.JsonResult;
import com.mmm.springboot.jparedisdemo.redis.RedisService;
import com.mmm.springboot.jparedisdemo.service.GirlService;
import com.mmm.springboot.jparedisdemo.utils.CodeEnum;
import com.mmm.springboot.jparedisdemo.utils.JsonResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class GirlController {
    private static final Logger logger = LoggerFactory.getLogger(GirlController.class);
    @Autowired
    private GirlService girlService;
    @Autowired
    private RedisService redisService;
    @PostMapping("/girls/add")
    public JsonResult save(@Valid Girl girl, BindingResult bindingResult) throws LogException{
        if(bindingResult.hasErrors()){
            throw new LogException(CodeEnum.FIELD);
        }
        return JsonResultUtil.returnSuccessResult(girlService.save(girl));
    }

    @DeleteMapping("/girls/{id}")
    public JsonResult deleteGirlById(@PathVariable Integer id){
        girlService.deleteGirlById(id);
        return JsonResultUtil.returnSuccessResult(null);
    }
    @PutMapping("/girls/update")
    public JsonResult updateGirl(Girl girl){
        return JsonResultUtil.returnSuccessResult(girlService.update(girl));

    }
    @GetMapping("/girls/{id}")
    public JsonResult getGirlById(@PathVariable Integer id){
        redisService.set("girl",id);
        logger.info("girl: {}",redisService.get("girl"));
        return JsonResultUtil.returnSuccessResult(girlService.getGirlById(id));
    }


}
