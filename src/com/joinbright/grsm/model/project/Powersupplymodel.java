package com.joinbright.grsm.model.project;

/**
 * Powersupplymodel entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Powersupplymodel extends com.joinbright.grsm.model.BaseModel
        implements java.io.Serializable {

    // Fields

    private Integer id;
    private String name;
    private String buildtime;
    private String nodes;
    private String edges;
    private Integer validflag;

    // Constructors

    /** default constructor */
    public Powersupplymodel() {
    }

    /** minimal constructor */
    public Powersupplymodel(Integer id) {
        this.id = id;
    }

    /** full constructor */
    public Powersupplymodel(Integer id, String name, String buildtime,
            String nodes, String edges, Integer validflag) {
        this.id = id;
        this.name = name;
        this.buildtime = buildtime;
        this.nodes = nodes;
        this.edges = edges;
        this.validflag = validflag;
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

    public String getNodes() {
        return this.nodes;
    }

    public void setNodes(String nodes) {
        this.nodes = nodes;
    }

    public String getEdges() {
        return this.edges;
    }

    public void setEdges(String edges) {
        this.edges = edges;
    }

    public Integer getValidflag() {
        return this.validflag;
    }

    public void setValidflag(Integer validflag) {
        this.validflag = validflag;
    }

}