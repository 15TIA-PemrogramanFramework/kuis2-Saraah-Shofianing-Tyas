/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis.kuis_1076.repo;


import com.kuis.kuis_1076.entity.identitas_1076;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author PC-8-320
 */
public interface identitas_1076Repo extends CrudRepository<identitas_1076, Long> {

    @Query("select i from identitas_1076 i")
   

    public List<identitas_1076> findAllidentitas_1076();
}
