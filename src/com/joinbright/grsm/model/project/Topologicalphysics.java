package com.joinbright.grsm.model.project;

/**
 * Topologicalphysics entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Topologicalphysics extends com.joinbright.grsm.model.BaseModel
        implements java.io.Serializable {

    // Fields

    private String branchid;
    private Float index1;
    private String runway;
    private String substation;
    private Float type;
    private Float nodebegin;
    private Float nodeend;
    private Float nodethird;
    private Float neutralpoint;

    // Constructors

    /** default constructor */
    public Topologicalphysics() {
    }


    // Property accessors

    public String getBranchid() {
        return this.branchid;
    }

    public void setBranchid(String branchid) {
        this.branchid = branchid;
    }

    public Float getIndex1() {
        return this.index1;
    }

    public void setIndex1(Float index1) {
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

    public Float getType() {
        return this.type;
    }

    public void setType(Float type) {
        this.type = type;
    }

    public Float getNodebegin() {
        return this.nodebegin;
    }

    public void setNodebegin(Float nodebegin) {
        this.nodebegin = nodebegin;
    }

    public Float getNodeend() {
        return this.nodeend;
    }

    public void setNodeend(Float nodeend) {
        this.nodeend = nodeend;
    }

    public Float getNodethird() {
        return this.nodethird;
    }

    public void setNodethird(Float nodethird) {
        this.nodethird = nodethird;
    }

    public Float getNeutralpoint() {
        return this.neutralpoint;
    }

    public void setNeutralpoint(Float neutralpoint) {
        this.neutralpoint = neutralpoint;
    }

}