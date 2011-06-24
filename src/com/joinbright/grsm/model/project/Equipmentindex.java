package com.joinbright.grsm.model.project;

import java.util.HashSet;
import java.util.Set;

/**
 * Equipmentindex entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Equipmentindex extends com.joinbright.grsm.model.BaseModel
        implements java.io.Serializable {

    // Fields

    private String id;
    private Integer index1;
    private String tablename;

    // Constructors

    /** default constructor */
    public Equipmentindex() {
    }


    // Property accessors

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getIndex1() {
        return this.index1;
    }

    public void setIndex1(Integer index1) {
        this.index1 = index1;
    }

    public String getTablename() {
        return this.tablename;
    }

    public void setTablename(String tablename) {
        this.tablename = tablename;
    }


    public Equipmentindex(String id, Integer index1, String tablename) {
        super();
        this.id = id;
        this.index1 = index1;
        this.tablename = tablename;
    }


}