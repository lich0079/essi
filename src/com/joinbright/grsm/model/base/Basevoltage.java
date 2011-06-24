package com.joinbright.grsm.model.base;

/**
 * Basevoltage entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Basevoltage extends com.joinbright.grsm.model.BaseModel implements
        java.io.Serializable {

    // Fields

    private Float voltagelevel;
    private Short index1;
    private Float basevoltage;
    private Float defaultvalue;
    private Integer color;
    private Integer defaultcolor;

    // Constructors

    /** default constructor */
    public Basevoltage() {
    }


    /** full constructor */
    public Basevoltage(Float voltagelevel, Short index1, Float basevoltage,
            Float defaultvalue, Integer color, Integer defaultcolor) {
        this.voltagelevel = voltagelevel;
        this.index1 = index1;
        this.basevoltage = basevoltage;
        this.defaultvalue = defaultvalue;
        this.color = color;
        this.defaultcolor = defaultcolor;
    }

    // Property accessors

    public Float getVoltagelevel() {
        return this.voltagelevel;
    }

    public void setVoltagelevel(Float voltagelevel) {
        this.voltagelevel = voltagelevel;
    }

    public Short getIndex1() {
        return this.index1;
    }

    public void setIndex1(Short index1) {
        this.index1 = index1;
    }

    public Float getBasevoltage() {
        return this.basevoltage;
    }

    public void setBasevoltage(Float basevoltage) {
        this.basevoltage = basevoltage;
    }

    public Float getDefaultvalue() {
        return this.defaultvalue;
    }

    public void setDefaultvalue(Float defaultvalue) {
        this.defaultvalue = defaultvalue;
    }

    public Integer getColor() {
        return this.color;
    }

    public void setColor(Integer color) {
        this.color = color;
    }

    public Integer getDefaultcolor() {
        return this.defaultcolor;
    }

    public void setDefaultcolor(Integer defaultcolor) {
        this.defaultcolor = defaultcolor;
    }

}