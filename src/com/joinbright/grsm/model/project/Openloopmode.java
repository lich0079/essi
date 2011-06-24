package com.joinbright.grsm.model.project;

/**
 * Openloopmode entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Openloopmode extends com.joinbright.grsm.model.BaseModel implements
        java.io.Serializable {

    // Fields

    private Integer id;
    private String name;
    private String buildtime;
    private Integer pssystemid;
    private String breakedges;

    // Constructors

    /** default constructor */
    public Openloopmode() {
    }

    /** minimal constructor */
    public Openloopmode(Integer id) {
        this.id = id;
    }

    /** full constructor */
    public Openloopmode(Integer id, String name, String buildtime,
            Integer pssystemid, String breakedges) {
        this.id = id;
        this.name = name;
        this.buildtime = buildtime;
        this.pssystemid = pssystemid;
        this.breakedges = breakedges;
    }

    // Property accessors

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBuildtime() {
        return this.buildtime;
    }

    public void setBuildtime(String buildtime) {
        this.buildtime = buildtime;
    }

    public Integer getPssystemid() {
        return this.pssystemid;
    }

    public void setPssystemid(Integer pssystemid) {
        this.pssystemid = pssystemid;
    }

    public String getBreakedges() {
        return this.breakedges;
    }

    public void setBreakedges(String breakedges) {
        this.breakedges = breakedges;
    }

}