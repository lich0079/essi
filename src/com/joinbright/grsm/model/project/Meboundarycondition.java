package com.joinbright.grsm.model.project;

/**
 * Meboundarycondition entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Meboundarycondition extends com.joinbright.grsm.model.BaseModel
        implements java.io.Serializable {

    // Fields

    private Integer id;
    private Multipointequivalencecase multipointequivalencecase;
    private String borderid;
    private Short bordertype;
    private String borderproperty;

    // Constructors

    /** default constructor */
    public Meboundarycondition() {
    }

    /** minimal constructor */
    public Meboundarycondition(Integer id) {
        this.id = id;
    }

    /** full constructor */
    public Meboundarycondition(Integer id,
            Multipointequivalencecase multipointequivalencecase,
            String borderid, Short bordertype, String borderproperty) {
        this.id = id;
        this.multipointequivalencecase = multipointequivalencecase;
        this.borderid = borderid;
        this.bordertype = bordertype;
        this.borderproperty = borderproperty;
    }

    // Property accessors

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Multipointequivalencecase getMultipointequivalencecase() {
        return this.multipointequivalencecase;
    }

    public void setMultipointequivalencecase(
            Multipointequivalencecase multipointequivalencecase) {
        this.multipointequivalencecase = multipointequivalencecase;
    }

    public String getBorderid() {
        return this.borderid;
    }

    public void setBorderid(String borderid) {
        this.borderid = borderid;
    }

    public Short getBordertype() {
        return this.bordertype;
    }

    public void setBordertype(Short bordertype) {
        this.bordertype = bordertype;
    }

    public String getBorderproperty() {
        return this.borderproperty;
    }

    public void setBorderproperty(String borderproperty) {
        this.borderproperty = borderproperty;
    }

}