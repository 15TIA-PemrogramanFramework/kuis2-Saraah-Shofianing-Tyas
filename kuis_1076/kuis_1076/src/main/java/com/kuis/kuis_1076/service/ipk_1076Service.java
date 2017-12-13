/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis.kuis_1076.service;

import com.kuis.kuis_1076.entity.identitas_1076;
import com.kuis.kuis_1076.entity.ipk_1076;
import com.kuis.kuis_1076.repo.identitas_1076Repo;
import com.kuis.kuis_1076.repo.ipk_1076Repo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author PC-8-320
 */
@Service("ipk1076Service")
@Transactional
public class ipk_1076Service {

    @Autowired
    private ipk_1076Repo repo;

    public ipk_1076 insert(ipk_1076 ipk_1076) {
        return repo.save(ipk_1076);
    }
    
    public ipk_1076 update(ipk_1076 ipk_1076) {
        return repo.save(ipk_1076);
    }
    
    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    
    public ipk_1076 getById(Long id){
        return repo.findOne(id);
    }
    
    public List<ipk_1076> getAll(){
        return repo.findAllipk_1076();
    }

   
}
