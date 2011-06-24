package com.joinbright.grsm.model.project;

/**
 * Equipementconfig entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Equipementconfig extends com.joinbright.grsm.model.BaseModel
        implements java.io.Serializable {

    // Fields

    private Integer index1;
    private String branchid;
    private Short prolocation;
    private String equipment;

    // Constructors

    /** default constructor */
    public Equipementconfig() {
    }

    /** minimal constructor */
    public Equipementconfig(Integer index1) {
        this.index1 = index1;
    }

    /** full constructor */
    public Equipementconfig(Integer index1, String branchid, Short prolocation,
            String equipment) {
        this.index1 = index1;
        this.branchid = branchid;
        this.prolocation = prolocation;
        this.equipment = equipment;
    }

    // Property accessors

    public Integer getIndex1() {
        return this.index1;
    }

    public void setIndex1(Integer index1) {
        this.index1 = index1;
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

    public String getEquipment() {
        return this.equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

}