package com.joinbright.grsm.model.project;

/**
 * Branningfactoruser entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Branningfactoruser extends com.joinbright.grsm.model.BaseModel
        implements java.io.Serializable {

    // Fields

    private Integer index1;
    private String runway;
    private String substation;
    private String branchid;
    private Short prolocation;
    private String branchidanother;
    private Short prolocationanother;
    private String overhaulbranchid;
    private String modedescription;
    private Integer valuetype;
    private Integer valuestatus;

    // Constructors

    /** default constructor */
    public Branningfactoruser() {
    }

    /** minimal constructor */
    public Branningfactoruser(Integer index1, String runway, String branchid,
            String branchidanother, Integer valuetype, Integer valuestatus) {
        this.index1 = index1;
        this.runway = runway;
        this.branchid = branchid;
        this.branchidanother = branchidanother;
        this.valuetype = valuetype;
        this.valuestatus = valuestatus;
    }

    /** full constructor */
    public Branningfactoruser(Integer index1, String runway, String substation,
            String branchid, Short prolocation, String branchidanother,
            Short prolocationanother, String overhaulbranchid,
            String modedescription, Integer valuetype, Integer valuestatus) {
        this.index1 = index1;
        this.runway = runway;
        this.substation = substation;
        this.branchid = branchid;
        this.prolocation = prolocation;
        this.branchidanother = branchidanother;
        this.prolocationanother = prolocationanother;
        this.overhaulbranchid = overhaulbranchid;
        this.modedescription = modedescription;
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

    public String getBranchidanother() {
        return this.branchidanother;
    }

    public void setBranchidanother(String branchidanother) {
        this.branchidanother = branchidanother;
    }

    public Short getProlocationanother() {
        return this.prolocationanother;
    }

    public void setProlocationanother(Short prolocationanother) {
        this.prolocationanother = prolocationanother;
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