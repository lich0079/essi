package com.joinbright.grsm.model.project;

/**
 * Electricload entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Electricload extends com.joinbright.grsm.model.BaseModel implements
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
    private Float loadmw;
    private Float loadmvar;
    private Float powerfactor;
    private Float constantpowerloadmw;
    private Float constantpowerloadmvar;
    private Float constantcurrentloadmw;
    private Float constantcurrentloadmvar;
    private Float constantimpedanceloadmw;
    private Float constantimpedanceloadmvar;
    private Float r;
    private Float r2;
    private Float r0;
    private Float x;
    private Float x2;
    private Float x0;
    private Float RPu;
    private Float r2Pu;
    private Float r0Pu;
    private Float XPu;
    private Float x2Pu;
    private Float x0Pu;
    private String remark;
    private String company;

    // Constructors

    /** default constructor */
    public Electricload() {
    }


    // Property accessors

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public Electricload(String id, String name, String substation,
            String description, String factory, String model, Short type,
            Float voltagelevel, Float ratedkv, Float loadmw, Float loadmvar,
            Float powerfactor, Float constantpowerloadmw,
            Float constantpowerloadmvar, Float constantcurrentloadmw,
            Float constantcurrentloadmvar, Float constantimpedanceloadmw,
            Float constantimpedanceloadmvar, Float r, Float r2, Float r0,
            Float x, Float x2, Float x0, Float pu, Float pu2, Float pu3,
            Float pu4, Float pu5, Float pu6, String remark, String company) {
        super();
        this.id = id;
        this.name = name;
        this.substation = substation;
        this.description = description;
        this.factory = factory;
        this.model = model;
        this.type = type;
        this.voltagelevel = voltagelevel;
        this.ratedkv = ratedkv;
        this.loadmw = loadmw;
        this.loadmvar = loadmvar;
        this.powerfactor = powerfactor;
        this.constantpowerloadmw = constantpowerloadmw;
        this.constantpowerloadmvar = constantpowerloadmvar;
        this.constantcurrentloadmw = constantcurrentloadmw;
        this.constantcurrentloadmvar = constantcurrentloadmvar;
        this.constantimpedanceloadmw = constantimpedanceloadmw;
        this.constantimpedanceloadmvar = constantimpedanceloadmvar;
        this.r = r;
        this.r2 = r2;
        this.r0 = r0;
        this.x = x;
        this.x2 = x2;
        this.x0 = x0;
        RPu = pu;
        r2Pu = pu2;
        r0Pu = pu3;
        XPu = pu4;
        x2Pu = pu5;
        x0Pu = pu6;
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

    public Float getLoadmw() {
        return this.loadmw;
    }

    public void setLoadmw(Float loadmw) {
        this.loadmw = loadmw;
    }

    public Float getLoadmvar() {
        return this.loadmvar;
    }

    public void setLoadmvar(Float loadmvar) {
        this.loadmvar = loadmvar;
    }

    public Float getPowerfactor() {
        return this.powerfactor;
    }

    public void setPowerfactor(Float powerfactor) {
        this.powerfactor = powerfactor;
    }

    public Float getConstantpowerloadmw() {
        return this.constantpowerloadmw;
    }

    public void setConstantpowerloadmw(Float constantpowerloadmw) {
        this.constantpowerloadmw = constantpowerloadmw;
    }

    public Float getConstantpowerloadmvar() {
        return this.constantpowerloadmvar;
    }

    public void setConstantpowerloadmvar(Float constantpowerloadmvar) {
        this.constantpowerloadmvar = constantpowerloadmvar;
    }

    public Float getConstantcurrentloadmw() {
        return this.constantcurrentloadmw;
    }

    public void setConstantcurrentloadmw(Float constantcurrentloadmw) {
        this.constantcurrentloadmw = constantcurrentloadmw;
    }

    public Float getConstantcurrentloadmvar() {
        return this.constantcurrentloadmvar;
    }

    public void setConstantcurrentloadmvar(Float constantcurrentloadmvar) {
        this.constantcurrentloadmvar = constantcurrentloadmvar;
    }

    public Float getConstantimpedanceloadmw() {
        return this.constantimpedanceloadmw;
    }

    public void setConstantimpedanceloadmw(Float constantimpedanceloadmw) {
        this.constantimpedanceloadmw = constantimpedanceloadmw;
    }

    public Float getConstantimpedanceloadmvar() {
        return this.constantimpedanceloadmvar;
    }

    public void setConstantimpedanceloadmvar(Float constantimpedanceloadmvar) {
        this.constantimpedanceloadmvar = constantimpedanceloadmvar;
    }

    public Float getR() {
        return this.r;
    }

    public void setR(Float r) {
        this.r = r;
    }

    public Float getR2() {
        return this.r2;
    }

    public void setR2(Float r2) {
        this.r2 = r2;
    }

    public Float getR0() {
        return this.r0;
    }

    public void setR0(Float r0) {
        this.r0 = r0;
    }

    public Float getX() {
        return this.x;
    }

    public void setX(Float x) {
        this.x = x;
    }

    public Float getX2() {
        return this.x2;
    }

    public void setX2(Float x2) {
        this.x2 = x2;
    }

    public Float getX0() {
        return this.x0;
    }

    public void setX0(Float x0) {
        this.x0 = x0;
    }

    public Float getRPu() {
        return this.RPu;
    }

    public void setRPu(Float RPu) {
        this.RPu = RPu;
    }

    public Float getR2Pu() {
        return this.r2Pu;
    }

    public void setR2Pu(Float r2Pu) {
        this.r2Pu = r2Pu;
    }

    public Float getR0Pu() {
        return this.r0Pu;
    }

    public void setR0Pu(Float r0Pu) {
        this.r0Pu = r0Pu;
    }

    public Float getXPu() {
        return this.XPu;
    }

    public void setXPu(Float XPu) {
        this.XPu = XPu;
    }

    public Float getX2Pu() {
        return this.x2Pu;
    }

    public void setX2Pu(Float x2Pu) {
        this.x2Pu = x2Pu;
    }

    public Float getX0Pu() {
        return this.x0Pu;
    }

    public void setX0Pu(Float x0Pu) {
        this.x0Pu = x0Pu;
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