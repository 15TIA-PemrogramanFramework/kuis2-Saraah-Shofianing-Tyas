/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis.kuis_1076.controller;

import com.kuis.kuis_1076.entity.identitas_1076;
import com.kuis.kuis_1076.service.identitas_1076Service;
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
@RequestMapping("/identitas_1076")

    
 public class identitas_1076Controller {   
    @Autowired
    private identitas_1076Service identitas1076Service;

    @RequestMapping(method = RequestMethod.POST)
    public identitas_1076 insert(@RequestBody identitas_1076 identitas_1076) {
        return identitas1076Service.insert(identitas_1076);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public identitas_1076 update(@RequestBody identitas_1076 identitas_1076) {
        return identitas1076Service.update(identitas_1076);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return identitas1076Service.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public identitas_1076 getById(@PathVariable("id") Long id){
        return identitas1076Service.getById(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<identitas_1076> getAll(){
        return identitas1076Service.getAll();
    }
}


