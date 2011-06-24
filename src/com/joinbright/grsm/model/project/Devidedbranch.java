package com.joinbright.grsm.model.project;

/**
 * Devidedbranch entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Devidedbranch extends com.joinbright.grsm.model.BaseModel
        implements java.io.Serializable {

    // Fields

    private String branchid;
    private String type;

    // Constructors

    /** default constructor */
    public Devidedbranch() {
    }

    /** minimal constructor */
    public Devidedbranch(String branchid) {
        this.branchid = branchid;
    }

    /** full constructor */
    public Devidedbranch(String branchid, String type) {
        this.branchid = branchid;
        this.type = type;
    }

    // Property accessors

    public String getBranchid() {
        return this.branchid;
    }

    public void setBranchid(String branchid) {
        this.branchid = branchid;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

}