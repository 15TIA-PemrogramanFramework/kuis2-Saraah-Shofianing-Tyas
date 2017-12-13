/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis.kuis_1076.service;

import com.kuis.kuis_1076.entity.identitas_1076;
import com.kuis.kuis_1076.repo.identitas_1076Repo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author PC-8-320
 */
@Service("identitas1076Service")
@Transactional
public class identitas_1076Service {

    @Autowired
    private identitas_1076Repo repo;

    public identitas_1076 insert(identitas_1076 identitas_1076) {
        return repo.save(identitas_1076);
    }
    
    public identitas_1076 update(identitas_1076 identitas_1076) {
        return repo.save(identitas_1076);
    }
    
    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    
    public identitas_1076 getById(Long id){
        return repo.findOne(id);
    }
    
    public List<identitas_1076> getAll(){
        return repo.findAllidentitas_1076();
    }

   
}
