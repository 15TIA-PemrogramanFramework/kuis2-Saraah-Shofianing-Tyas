/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis.kuis_1076.repo;


import com.kuis.kuis_1076.entity.ipk_1076;
import com.kuis.kuis_1076.entity.ipk_1076;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author PC-8-320
 */
public interface ipk_1076Repo extends CrudRepository<ipk_1076, Long> {

    @Query("select ip from ipk_1076 ip")

    public List<ipk_1076> findAllipk_1076();

}