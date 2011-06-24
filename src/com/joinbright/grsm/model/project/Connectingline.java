package com.joinbright.grsm.model.project;

/**
 * Connectingline entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Connectingline extends com.joinbright.grsm.model.BaseModel
        implements java.io.Serializable {

    // Fields

    private String id;
    private String name;
    private String substation;
    private String description;
    private Float voltagelevel;
    private String remark;
    private String company;

    // Constructors

    /** default constructor */
    public Connectingline() {
    }


    // Property accessors

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public Connectingline(String id, String name, String substation,
            String description, Float voltagelevel, String remark,
            String company) {
        super();
        this.id = id;
        this.name = name;
        this.substation = substation;
        this.description = description;
        this.voltagelevel = voltagelevel;
        this.remark = remark;
        this.company = company;
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

    public Float getVoltagelevel() {
        return this.voltagelevel;
    }

    public void setVoltagelevel(Float voltagelevel) {
        this.voltagelevel = voltagelevel;
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

}