package com.joinbright.grsm.model.project;

/**
 * Equivalentline entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Equivalentline extends com.joinbright.grsm.model.BaseModel
        implements java.io.Serializable {

    // Fields

    private String id;
    private String name;
    private String substationbegin;
    private String substationend;
    private String description;
    private Float voltagelevel;
    private Float maxmodeX0;
    private Float maxmodeX;
    private Float minmodeX0;
    private Float minmodeX;
    private Float maxmodeR0;
    private Float maxmodeR;
    private Float minmodeR0;
    private Float minmodeR;
    private Float maxmodeX0Pu;
    private Float maxmodeXPu;
    private Float minmodeX0Pu;
    private Float minmodeXPu;
    private Float maxmodeR0Pu;
    private Float maxmodeRPu;
    private Float minmodeR0Pu;
    private Float minmodeRPu;
    private Float maximumloadcurrent;
    private String remark;
    private String company;

    // Constructors

    /** default constructor */
    public Equivalentline() {
    }


    // Property accessors

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public Equivalentline(String id, String name, String substationbegin,
            String substationend, String description, Float voltagelevel,
            Float maxmodeX0, Float maxmodeX, Float minmodeX0, Float minmodeX,
            Float maxmodeR0, Float maxmodeR, Float minmodeR0, Float minmodeR,
            Float maxmodeX0Pu, Float maxmodeXPu, Float minmodeX0Pu,
            Float minmodeXPu, Float maxmodeR0Pu, Float maxmodeRPu,
            Float minmodeR0Pu, Float minmodeRPu, Float maximumloadcurrent,
            String remark, String company) {
        super();
        this.id = id;
        this.name = name;
        this.substationbegin = substationbegin;
        this.substationend = substationend;
        this.description = description;
        this.voltagelevel = voltagelevel;
        this.maxmodeX0 = maxmodeX0;
        this.maxmodeX = maxmodeX;
        this.minmodeX0 = minmodeX0;
        this.minmodeX = minmodeX;
        this.maxmodeR0 = maxmodeR0;
        this.maxmodeR = maxmodeR;
        this.minmodeR0 = minmodeR0;
        this.minmodeR = minmodeR;
        this.maxmodeX0Pu = maxmodeX0Pu;
        this.maxmodeXPu = maxmodeXPu;
        this.minmodeX0Pu = minmodeX0Pu;
        this.minmodeXPu = minmodeXPu;
        this.maxmodeR0Pu = maxmodeR0Pu;
        this.maxmodeRPu = maxmodeRPu;
        this.minmodeR0Pu = minmodeR0Pu;
        this.minmodeRPu = minmodeRPu;
        this.maximumloadcurrent = maximumloadcurrent;
        this.remark = remark;
        this.company = company;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubstationbegin() {
        return this.substationbegin;
    }

    public void setSubstationbegin(String substationbegin) {
        this.substationbegin = substationbegin;
    }

    public String getSubstationend() {
        return this.substationend;
    }

    public void setSubstationend(String substationend) {
        this.substationend = substationend;
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

    public Float getMaxmodeX0() {
        return this.maxmodeX0;
    }

    public void setMaxmodeX0(Float maxmodeX0) {
        this.maxmodeX0 = maxmodeX0;
    }

    public Float getMaxmodeX() {
        return this.maxmodeX;
    }

    public void setMaxmodeX(Float maxmodeX) {
        this.maxmodeX = maxmodeX;
    }

    public Float getMinmodeX0() {
        return this.minmodeX0;
    }

    public void setMinmodeX0(Float minmodeX0) {
        this.minmodeX0 = minmodeX0;
    }

    public Float getMinmodeX() {
        return this.minmodeX;
    }

    public void setMinmodeX(Float minmodeX) {
        this.minmodeX = minmodeX;
    }

    public Float getMaxmodeR0() {
        return this.maxmodeR0;
    }

    public void setMaxmodeR0(Float maxmodeR0) {
        this.maxmodeR0 = maxmodeR0;
    }

    public Float getMaxmodeR() {
        return this.maxmodeR;
    }

    public void setMaxmodeR(Float maxmodeR) {
        this.maxmodeR = maxmodeR;
    }

    public Float getMinmodeR0() {
        return this.minmodeR0;
    }

    public void setMinmodeR0(Float minmodeR0) {
        this.minmodeR0 = minmodeR0;
    }

    public Float getMinmodeR() {
        return this.minmodeR;
    }

    public void setMinmodeR(Float minmodeR) {
        this.minmodeR = minmodeR;
    }

    public Float getMaxmodeX0Pu() {
        return this.maxmodeX0Pu;
    }

    public void setMaxmodeX0Pu(Float maxmodeX0Pu) {
        this.maxmodeX0Pu = maxmodeX0Pu;
    }

    public Float getMaxmodeXPu() {
        return this.maxmodeXPu;
    }

    public void setMaxmodeXPu(Float maxmodeXPu) {
        this.maxmodeXPu = maxmodeXPu;
    }

    public Float getMinmodeX0Pu() {
        return this.minmodeX0Pu;
    }

    public void setMinmodeX0Pu(Float minmodeX0Pu) {
        this.minmodeX0Pu = minmodeX0Pu;
    }

    public Float getMinmodeXPu() {
        return this.minmodeXPu;
    }

    public void setMinmodeXPu(Float minmodeXPu) {
        this.minmodeXPu = minmodeXPu;
    }

    public Float getMaxmodeR0Pu() {
        return this.maxmodeR0Pu;
    }

    public void setMaxmodeR0Pu(Float maxmodeR0Pu) {
        this.maxmodeR0Pu = maxmodeR0Pu;
    }

    public Float getMaxmodeRPu() {
        return this.maxmodeRPu;
    }

    public void setMaxmodeRPu(Float maxmodeRPu) {
        this.maxmodeRPu = maxmodeRPu;
    }

    public Float getMinmodeR0Pu() {
        return this.minmodeR0Pu;
    }

    public void setMinmodeR0Pu(Float minmodeR0Pu) {
        this.minmodeR0Pu = minmodeR0Pu;
    }

    public Float getMinmodeRPu() {
        return this.minmodeRPu;
    }

    public void setMinmodeRPu(Float minmodeRPu) {
        this.minmodeRPu = minmodeRPu;
    }

    public Float getMaximumloadcurrent() {
        return this.maximumloadcurrent;
    }

    public void setMaximumloadcurrent(Float maximumloadcurrent) {
        this.maximumloadcurrent = maximumloadcurrent;
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