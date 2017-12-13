/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis.kuis_1076.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author PC-8-320
 */
 @Entity
@Table(name = "ipk_1076")
public class ipk_1076 implements Serializable {    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_matkul;
    @Column(length = 100, nullable = false, unique = true)
    private String id_mahasiswa;
    @Column(length = 100, nullable = true)
    private String semester;
    @Column(length = 100, nullable = true)
    private String ipk;
     @ManyToOne
    private identitas_1076 identitas_1076;
     
     
    public Long getId_Matkul() {
        return id_matkul;
    }

    public void setId_Matkul(Long id_matkul) {
        this.id_matkul = id_matkul;
    }

    
    
    /**
     * @return the name
     */
    public String getId_Mahasiswa() {
        return id_mahasiswa;
    }

    /**
     * @param id_mahasiswa the name to set
     */
    public void setId_Mahasiswa(String id_mahasiswa) {
        this.id_mahasiswa = id_mahasiswa;
    }

    
    
    public String getSemester() {
        return semester;
    }
    /**
     * @param semester the description to set
     */
    public void setSemester(String semester) {
        this.semester = semester;
    }

    
    
    
    
    /**
     * @return the description
     */
    public String getIpk() {
        return ipk;
    }

    /**
     * @param ipk the description to set
     */
    public void setIpk(String ipk) {
        this.ipk = ipk;
    }

   

}


