package com.joinbright.grsm.model.project;

/**
 * Branningfactor entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Branningfactor extends com.joinbright.grsm.model.BaseModel
        implements java.io.Serializable {

    // Fields

    private Integer index1;
    private String runway;
    private String branchid;
    private String substation;
    private Short prolocation;
    private String branchidanother;
    private Short prolocationanother;
    private String overhaulbranchid;
    private String modedescription;
    private Float branningfactor1;
    private Float branningfactor0;
    private Float branningfactora;

    // Constructors

    /** default constructor */
    public Branningfactor() {
    }


    public Branningfactor(Integer index1, String runway, String branchid,
            String substation, Short prolocation, String branchidanother,
            Short prolocationanother, String overhaulbranchid,
            String modedescription, Float branningfactor1,
            Float branningfactor0, Float branningfactora) {
        super();
        this.index1 = index1;
        this.runway = runway;
        this.branchid = branchid;
        this.substation = substation;
        this.prolocation = prolocation;
        this.branchidanother = branchidanother;
        this.prolocationanother = prolocationanother;
        this.overhaulbranchid = overhaulbranchid;
        this.modedescription = modedescription;
        this.branningfactor1 = branningfactor1;
        this.branningfactor0 = branningfactor0;
        this.branningfactora = branningfactora;
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

    public Float getBranningfactor1() {
        return this.branningfactor1;
    }

    public void setBranningfactor1(Float branningfactor1) {
        this.branningfactor1 = branningfactor1;
    }

    public Float getBranningfactor0() {
        return this.branningfactor0;
    }

    public void setBranningfactor0(Float branningfactor0) {
        this.branningfactor0 = branningfactor0;
    }

    public Float getBranningfactora() {
        return this.branningfactora;
    }

    public void setBranningfactora(Float branningfactora) {
        this.branningfactora = branningfactora;
    }

}