package com.joinbright.grsm.model.project;

/**
 * Bus entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Bus extends com.joinbright.grsm.model.BaseModel implements
        java.io.Serializable {

    // Fields

    private String id;
    private String name;
    private String substation;
    private String description;
    private String factory;
    private String model;
    private Float voltagelevel;
    private Short nodetype;
    private Float voltageamplitudePu;
    private Float voltageangle;
    private Float maximumvoltageamplitudePu;
    private Float minimumvoltageamplitudePu;
    private String remark;
    private String company;

    // Constructors

    /** default constructor */
    public Bus() {
    }


    // Property accessors

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Short getNodetype() {
        return this.nodetype;
    }

    public void setNodetype(Short nodetype) {
        this.nodetype = nodetype;
    }

    public Float getVoltageamplitudePu() {
        return this.voltageamplitudePu;
    }

    public void setVoltageamplitudePu(Float voltageamplitudePu) {
        this.voltageamplitudePu = voltageamplitudePu;
    }

    public Float getVoltageangle() {
        return this.voltageangle;
    }

    public void setVoltageangle(Float voltageangle) {
        this.voltageangle = voltageangle;
    }

    public Float getMaximumvoltageamplitudePu() {
        return this.maximumvoltageamplitudePu;
    }

    public void setMaximumvoltageamplitudePu(Float maximumvoltageamplitudePu) {
        this.maximumvoltageamplitudePu = maximumvoltageamplitudePu;
    }

    public Float getMinimumvoltageamplitudePu() {
        return this.minimumvoltageamplitudePu;
    }

    public void setMinimumvoltageamplitudePu(Float minimumvoltageamplitudePu) {
        this.minimumvoltageamplitudePu = minimumvoltageamplitudePu;
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