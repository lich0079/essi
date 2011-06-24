package com.joinbright.grsm.model.project;

/**
 * Reactance entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Reactance extends com.joinbright.grsm.model.BaseModel implements
        java.io.Serializable {

    // Fields

    private String id;
    private String name;
    private String substation;
    private String description;
    private String factory;
    private String model;
    private Short type;
    private Float voltagelevel;
    private Float ratedkv;
    private Float rateda;
    private Float xratio;
    private Float XPu;
    private Float splitXPu;
    private Float mutualinductancfactor;
    private Float basecurrent;
    private String remark;
    private String company;

    // Constructors

    /** default constructor */
    public Reactance() {
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

    public Short getType() {
        return this.type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public Float getVoltagelevel() {
        return this.voltagelevel;
    }

    public void setVoltagelevel(Float voltagelevel) {
        this.voltagelevel = voltagelevel;
    }

    public Float getRatedkv() {
        return this.ratedkv;
    }

    public void setRatedkv(Float ratedkv) {
        this.ratedkv = ratedkv;
    }

    public Float getRateda() {
        return this.rateda;
    }

    public void setRateda(Float rateda) {
        this.rateda = rateda;
    }

    public Float getXratio() {
        return this.xratio;
    }

    public void setXratio(Float xratio) {
        this.xratio = xratio;
    }

    public Float getXPu() {
        return this.XPu;
    }

    public void setXPu(Float XPu) {
        this.XPu = XPu;
    }

    public Float getSplitXPu() {
        return this.splitXPu;
    }

    public void setSplitXPu(Float splitXPu) {
        this.splitXPu = splitXPu;
    }

    public Float getMutualinductancfactor() {
        return this.mutualinductancfactor;
    }

    public void setMutualinductancfactor(Float mutualinductancfactor) {
        this.mutualinductancfactor = mutualinductancfactor;
    }

    public Float getBasecurrent() {
        return this.basecurrent;
    }

    public void setBasecurrent(Float basecurrent) {
        this.basecurrent = basecurrent;
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