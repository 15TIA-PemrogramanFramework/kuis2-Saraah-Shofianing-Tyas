/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis.kuis_1076.controller;

import com.kuis.kuis_1076.entity.ipk_1076;
import com.kuis.kuis_1076.entity.ipk_1076;
import com.kuis.kuis_1076.service.ipk_1076Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author PC-8-320
 */
@RestController
@RequestMapping("/ipk_1076")

    
 public class ipk_1076Controller {   
    @Autowired
    private ipk_1076Service ipk_1076Service;

    @RequestMapping(method = RequestMethod.POST)
    public ipk_1076 insert(@RequestBody ipk_1076 ipk_1076) {
        return ipk_1076Service.insert(ipk_1076);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public ipk_1076 update(@RequestBody ipk_1076 ipk_1076) {
        return ipk_1076Service.update(ipk_1076);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return ipk_1076Service.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public ipk_1076 getById(@PathVariable("id") Long id){
        return ipk_1076Service.getById(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<ipk_1076> getAll(){
        return ipk_1076Service.getAll();
    }
}


