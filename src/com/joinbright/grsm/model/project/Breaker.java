package com.joinbright.grsm.model.project;

/**
 * Breaker entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Breaker extends com.joinbright.grsm.model.BaseModel implements
        java.io.Serializable {

    // Fields

    private String id;
    private String name;
    private String substation;
    private String description;
    private String factory;
    private String model;
    private Float voltagelevel;
    private Short type;
    private String remark;
    private String company;
    private Float ct1;
    private Float ct2;

    // Constructors

    /** default constructor */
    public Breaker() {
    }


    // Property accessors

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Breaker(String id, String name, String substation,
            String description, String factory, String model,
            Float voltagelevel, Short type, String remark, String company,
            Float ct1, Float ct2) {
        super();
        this.id = id;
        this.name = name;
        this.substation = substation;
        this.description = description;
        this.factory = factory;
        this.model = model;
        this.voltagelevel = voltagelevel;
        this.type = type;
        this.remark = remark;
        this.company = company;
        this.ct1 = ct1;
        this.ct2 = ct2;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubstation() {
        return this.substation;
    }

    public void setSubstation(String substation) {
        this.substation = substation;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFactory() {
        return this.factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Float getVoltagelevel() {
        return this.voltagelevel;
    }

    public void setVoltagelevel(Float voltagelevel) {
        this.voltagelevel = voltagelevel;
    }

    public Short getType() {
        return this.type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCompany() {
        return this.company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Float getCt1() {
        return this.ct1;
    }

    public void setCt1(Float ct1) {
        this.ct1 = ct1;
    }

    public Float getCt2() {
        return this.ct2;
    }

    public void setCt2(Float ct2) {
        this.ct2 = ct2;
    }

}