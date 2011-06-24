package com.joinbright.grsm.model.project;

/**
 * Branchcurrentextremum entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Branchcurrentextremum extends com.joinbright.grsm.model.BaseModel
        implements java.io.Serializable {

    // Fields

    private Integer index1;
    private String runway;
    private String branchid;
    private String substation;
    private Short prolocation;
    private String faultid;
    private String faultprolocation;
    private String overhaulbranchid;
    private Float current1;
    private Float current2;
    private Float current0;
    private Float currenta;
    private String modedescription;
    private Short calculationtype;
    private Float busvoltagea;
    private Float busvoltageaAngle;
    private Float busvoltage2;
    private Float busvoltage2Angle;
    private Float measureimpedancePhase;
    private Float measureimpedanceAnglePhase;
    private Float measureimpedanceEarth;
    private Float measureimpedanceAngleEarth;

    // Constructors

    /** default constructor */
    public Branchcurrentextremum() {
    }

    public Branchcurrentextremum(Integer index1, String runway,
            String branchid, String substation, Short prolocation,
            String faultid, String faultprolocation, String overhaulbranchid,
            Float current1, Float current2, Float current0, Float currenta,
            String modedescription, Short calculationtype, Float busvoltagea,
            Float busvoltageaAngle, Float busvoltage2, Float busvoltage2Angle,
            Float measureimpedancePhase, Float measureimpedanceAnglePhase,
            Float measureimpedanceEarth, Float measureimpedanceAngleEarth) {
        super();
        this.index1 = index1;
        this.runway = runway;
        this.branchid = branchid;
        this.substation = substation;
        this.prolocation = prolocation;
        this.faultid = faultid;
        this.faultprolocation = faultprolocation;
        this.overhaulbranchid = overhaulbranchid;
        this.current1 = current1;
        this.current2 = current2;
        this.current0 = current0;
        this.currenta = currenta;
        this.modedescription = modedescription;
        this.calculationtype = calculationtype;
        this.busvoltagea = busvoltagea;
        this.busvoltageaAngle = busvoltageaAngle;
        this.busvoltage2 = busvoltage2;
        this.busvoltage2Angle = busvoltage2Angle;
        this.measureimpedancePhase = measureimpedancePhase;
        this.measureimpedanceAnglePhase = measureimpedanceAnglePhase;
        this.measureimpedanceEarth = measureimpedanceEarth;
        this.measureimpedanceAngleEarth = measureimpedanceAngleEarth;
    }

    public Integer getIndex1() {
        return index1;
    }

    public void setIndex1(Integer index1) {
        this.index1 = index1;
    }

    public String getRunway() {
        return runway;
    }

    public void setRunway(String runway) {
        this.runway = runway;
    }

    public String getBranchid() {
        return branchid;
    }

    public void setBranchid(String branchid) {
        this.branchid = branchid;
    }

    public String getSubstation() {
        return this.substation;
    }

    public void setSubstation(String substation) {
        this.substation = substation;
    }

    public Short getProlocation() {
        return this.prolocation;
    }

    public void setProlocation(Short prolocation) {
        this.prolocation = prolocation;
    }

    public String getFaultid() {
        return this.faultid;
    }

    public void setFaultid(String faultid) {
        this.faultid = faultid;
    }

    public String getFaultprolocation() {
        return this.faultprolocation;
    }

    public void setFaultprolocation(String faultprolocation) {
        this.faultprolocation = faultprolocation;
    }

    public String getOverhaulbranchid() {
        return this.overhaulbranchid;
    }

    public void setOverhaulbranchid(String overhaulbranchid) {
        this.overhaulbranchid = overhaulbranchid;
    }

    public Float getCurrent1() {
        return this.current1;
    }

    public void setCurrent1(Float current1) {
        this.current1 = current1;
    }

    public Float getCurrent2() {
        return this.current2;
    }

    public void setCurrent2(Float current2) {
        this.current2 = current2;
    }

    public Float getCurrent0() {
        return this.current0;
    }

    public void setCurrent0(Float current0) {
        this.current0 = current0;
    }

    public Float getCurrenta() {
        return this.currenta;
    }

    public void setCurrenta(Float currenta) {
        this.currenta = currenta;
    }

    public String getModedescription() {
        return this.modedescription;
    }

    public void setModedescription(String modedescription) {
        this.modedescription = modedescription;
    }

    public Short getCalculationtype() {
        return this.calculationtype;
    }

    public void setCalculationtype(Short calculationtype) {
        this.calculationtype = calculationtype;
    }

    public Float getBusvoltagea() {
        return this.busvoltagea;
    }

    public void setBusvoltagea(Float busvoltagea) {
        this.busvoltagea = busvoltagea;
    }

    public Float getBusvoltageaAngle() {
        return this.busvoltageaAngle;
    }

    public void setBusvoltageaAngle(Float busvoltageaAngle) {
        this.busvoltageaAngle = busvoltageaAngle;
    }

    public Float getBusvoltage2() {
        return this.busvoltage2;
    }

    public void setBusvoltage2(Float busvoltage2) {
        this.busvoltage2 = busvoltage2;
    }

    public Float getBusvoltage2Angle() {
        return this.busvoltage2Angle;
    }

    public void setBusvoltage2Angle(Float busvoltage2Angle) {
        this.busvoltage2Angle = busvoltage2Angle;
    }

    public Float getMeasureimpedancePhase() {
        return this.measureimpedancePhase;
    }

    public void setMeasureimpedancePhase(Float measureimpedancePhase) {
        this.measureimpedancePhase = measureimpedancePhase;
    }

    public Float getMeasureimpedanceAnglePhase() {
        return this.measureimpedanceAnglePhase;
    }

    public void setMeasureimpedanceAnglePhase(Float measureimpedanceAnglePhase) {
        this.measureimpedanceAnglePhase = measureimpedanceAnglePhase;
    }

    public Float getMeasureimpedanceEarth() {
        return this.measureimpedanceEarth;
    }

    public void setMeasureimpedanceEarth(Float measureimpedanceEarth) {
        this.measureimpedanceEarth = measureimpedanceEarth;
    }

    public Float getMeasureimpedanceAngleEarth() {
        return this.measureimpedanceAngleEarth;
    }

    public void setMeasureimpedanceAngleEarth(Float measureimpedanceAngleEarth) {
        this.measureimpedanceAngleEarth = measureimpedanceAngleEarth;
    }

}