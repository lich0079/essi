package com.joinbright.grsm.model.base;

/**
 * Cableparameter entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Cableparameter extends com.joinbright.grsm.model.BaseModel
        implements java.io.Serializable {

    // Fields
    private String model;
    private Short cablenum;
    private String laymode;
    private String ratedkv;
    
    private Float RUnit;
    private Float XUnit;
    private Float r0Unit;
    private Float x0Unit;
    private Float maximumloadcurrent;
    private Float bchUnit;

    // Constructors

    /** default constructor */
    public Cableparameter() {
    }




    public Cableparameter(String model, Short cablenum, String laymode,
            String ratedkv, Float unit, Float unit2, Float unit3, Float unit4,
            Float maximumloadcurrent, Float bchUnit) {
        super();
        this.model = model;
        this.cablenum = cablenum;
        this.laymode = laymode;
        this.ratedkv = ratedkv;
        RUnit = unit;
        XUnit = unit2;
        r0Unit = unit3;
        x0Unit = unit4;
        this.maximumloadcurrent = maximumloadcurrent;
        this.bchUnit = bchUnit;
    }




    public String getModel() {
        return model;
    }


    public void setModel(String model) {
        this.model = model;
    }


    public Short getCablenum() {
        return cablenum;
    }


    public void setCablenum(Short cablenum) {
        this.cablenum = cablenum;
    }


    public String getLaymode() {
        return laymode;
    }


    public void setLaymode(String laymode) {
        this.laymode = laymode;
    }


    public String getRatedkv() {
        return ratedkv;
    }


    public void setRatedkv(String ratedkv) {
        this.ratedkv = ratedkv;
    }


    public Float getRUnit() {
        return this.RUnit;
    }

    public void setRUnit(Float RUnit) {
        this.RUnit = RUnit;
    }

    public Float getXUnit() {
        return this.XUnit;
    }

    public void setXUnit(Float XUnit) {
        this.XUnit = XUnit;
    }

    public Float getR0Unit() {
        return this.r0Unit;
    }

    public void setR0Unit(Float r0Unit) {
        this.r0Unit = r0Unit;
    }

    public Float getX0Unit() {
        return this.x0Unit;
    }

    public void setX0Unit(Float x0Unit) {
        this.x0Unit = x0Unit;
    }

    public Float getMaximumloadcurrent() {
        return this.maximumloadcurrent;
    }

    public void setMaximumloadcurrent(Float maximumloadcurrent) {
        this.maximumloadcurrent = maximumloadcurrent;
    }

    public Float getBchUnit() {
        return this.bchUnit;
    }

    public void setBchUnit(Float bchUnit) {
        this.bchUnit = bchUnit;
    }

}