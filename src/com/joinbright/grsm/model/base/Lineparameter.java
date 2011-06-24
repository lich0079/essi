package com.joinbright.grsm.model.base;

/**
 * Lineparameter entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Lineparameter extends com.joinbright.grsm.model.BaseModel
        implements java.io.Serializable {

    // Fields

    private String model;
    private Float averagedistance;
    private Float RUnit;
    private Float XUnit;
    private Float r0Unit;
    private Float x0Unit;
    private Float diameter;
    private Float maximumloadcurrent;
    private Float bchUnit;
    private String calculationbook;

    // Constructors

    /** default constructor */
    public Lineparameter() {
    }


    public String getModel() {
        return model;
    }


    public void setModel(String model) {
        this.model = model;
    }


    public Float getAveragedistance() {
        return averagedistance;
    }


    public void setAveragedistance(Float averagedistance) {
        this.averagedistance = averagedistance;
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

    public Lineparameter(String model, Float averagedistance, Float unit,
            Float unit2, Float unit3, Float unit4, Float diameter,
            Float maximumloadcurrent, Float bchUnit, String calculationbook) {
        super();
        this.model = model;
        this.averagedistance = averagedistance;
        RUnit = unit;
        XUnit = unit2;
        r0Unit = unit3;
        x0Unit = unit4;
        this.diameter = diameter;
        this.maximumloadcurrent = maximumloadcurrent;
        this.bchUnit = bchUnit;
        this.calculationbook = calculationbook;
    }


    public Float getX0Unit() {
        return this.x0Unit;
    }

    public void setX0Unit(Float x0Unit) {
        this.x0Unit = x0Unit;
    }

    public Float getDiameter() {
        return this.diameter;
    }

    public void setDiameter(Float diameter) {
        this.diameter = diameter;
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

    public String getCalculationbook() {
        return this.calculationbook;
    }

    public void setCalculationbook(String calculationbook) {
        this.calculationbook = calculationbook;
    }

}