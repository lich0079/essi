package com.joinbright.grsm.model.project;

/**
 * Branchcurrentextremumuser entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Branchcurrentextremumuser extends
        com.joinbright.grsm.model.BaseModel implements java.io.Serializable {

    // Fields

    private Integer index1;
    private String runway;
    private String substation;
    private String branchid;
    private Short prolocation;
    private String faultid;
    private String faultprolocation;
    private String overhaulbranchid;
    private String modedescription;
    private Short calculationtype;
    private Integer valuetype;
    private Integer valuestatus;

    // Constructors

    /** default constructor */
    public Branchcurrentextremumuser() {
    }

    /** minimal constructor */
    public Branchcurrentextremumuser(Integer index1, String runway,
            String branchid, Short prolocation, Integer valuetype,
            Integer valuestatus) {
        this.index1 = index1;
        this.runway = runway;
        this.branchid = branchid;
        this.prolocation = prolocation;
        this.valuetype = valuetype;
        this.valuestatus = valuestatus;
    }

    /** full constructor */
    public Branchcurrentextremumuser(Integer index1, String runway,
            String substation, String branchid, Short prolocation,
            String faultid, String faultprolocation, String overhaulbranchid,
            String modedescription, Short calculationtype, Integer valuetype,
            Integer valuestatus) {
        this.index1 = index1;
        this.runway = runway;
        this.substation = substation;
        this.branchid = branchid;
        this.prolocation = prolocation;
        this.faultid = faultid;
        this.faultprolocation = faultprolocation;
        this.overhaulbranchid = overhaulbranchid;
        this.modedescription = modedescription;
        this.calculationtype = calculationtype;
        this.valuetype = valuetype;
        this.valuestatus = valuestatus;
    }

    // Property accessors

    public Integer getIndex1() {
        return this.index1;
    }

    public void setIndex1(Integer index1) {
        this.index1 = index1;
    }

    public String getRunway() {
        return this.runway;
    }

    public void setRunway(String runway) {
        this.runway = runway;
    }

    public String getSubstation() {
        return this.substation;
    }

    public void setSubstation(String substation) {
        this.substation = substation;
    }

    public String getBranchid() {
        return this.branchid;
    }

    public void setBranchid(String branchid) {
        this.branchid = branchid;
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

    public Integer getValuetype() {
        return this.valuetype;
    }

    public void setValuetype(Integer valuetype) {
        this.valuetype = valuetype;
    }

    public Integer getValuestatus() {
        return this.valuestatus;
    }

    public void setValuestatus(Integer valuestatus) {
        this.valuestatus = valuestatus;
    }

}