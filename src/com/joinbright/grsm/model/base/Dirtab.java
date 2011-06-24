package com.joinbright.grsm.model.base;

/**
 * Dirtab entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Dirtab extends com.joinbright.grsm.model.BaseModel implements
        java.io.Serializable {

    // Fields

    private String filename;
    private Integer index1;

    // Constructors

    /** default constructor */
    public Dirtab() {
    }


    /** full constructor */
    public Dirtab(String filename, Integer index1) {
        this.filename = filename;
        this.index1 = index1;
    }

    // Property accessors

    public String getFilename() {
        return this.filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public Integer getIndex1() {
        return this.index1;
    }

    public void setIndex1(Integer index1) {
        this.index1 = index1;
    }

}