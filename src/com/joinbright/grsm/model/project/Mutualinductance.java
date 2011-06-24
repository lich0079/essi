package com.joinbright.grsm.model.project;

/**
 * Mutualinductance entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Mutualinductance extends com.joinbright.grsm.model.BaseModel
        implements java.io.Serializable {

    // Fields

    private String lineprolocation;
    private String anotherlineid;
    private String anotherlinenameprolocation;
    private Float mutualinductance;
    private Float mutualinductancePu;
    private String remark;
    private String lineid;

    // Constructors

    public Mutualinductance(String lineprolocation, String anotherlineid,
            String anotherlinenameprolocation, Float mutualinductance,
            Float mutualinductancePu, String remark, String lineid) {
        super();
        this.lineprolocation = lineprolocation;
        this.anotherlineid = anotherlineid;
        this.anotherlinenameprolocation = anotherlinenameprolocation;
        this.mutualinductance = mutualinductance;
        this.mutualinductancePu = mutualinductancePu;
        this.remark = remark;
        this.lineid = lineid;
    }


    /** default constructor */
    public Mutualinductance() {
    }


    public String getLineprolocation() {
        return lineprolocation;
    }


    public void setLineprolocation(String lineprolocation) {
        this.lineprolocation = lineprolocation;
    }


    public String getAnotherlineid() {
        return anotherlineid;
    }


    public void setAnotherlineid(String anotherlineid) {
        this.anotherlineid = anotherlineid;
    }


    public String getAnotherlinenameprolocation() {
        return anotherlinenameprolocation;
    }


    public void setAnotherlinenameprolocation(String anotherlinenameprolocation) {
        this.anotherlinenameprolocation = anotherlinenameprolocation;
    }


    public Float getMutualinductance() {
        return mutualinductance;
    }


    public void setMutualinductance(Float mutualinductance) {
        this.mutualinductance = mutualinductance;
    }


    public Float getMutualinductancePu() {
        return mutualinductancePu;
    }


    public void setMutualinductancePu(Float mutualinductancePu) {
        this.mutualinductancePu = mutualinductancePu;
    }


    public String getRemark() {
        return remark;
    }


    public void setRemark(String remark) {
        this.remark = remark;
    }


    public String getLineid() {
        return lineid;
    }


    public void setLineid(String lineid) {
        this.lineid = lineid;
    }

}