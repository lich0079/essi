package com.joinbright.grsm.model.project;

/**
 * Powersupplysystem entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Powersupplysystem extends com.joinbright.grsm.model.BaseModel
        implements java.io.Serializable {

    // Fields

    private Integer id;
    private String name;
    private String buildtime;
    private Integer psamodelid;
    private Integer sourcenode;
    private String psrange;
    private String pspath;
    private String looppath;
    private String usedsources;

    // Constructors

    /** default constructor */
    public Powersupplysystem() {
    }

    /** minimal constructor */
    public Powersupplysystem(Integer id) {
        this.id = id;
    }

    /** full constructor */
    public Powersupplysystem(Integer id, String name, String buildtime,
            Integer psamodelid, Integer sourcenode, String psrange,
            String pspath, String looppath, String usedsources) {
        this.id = id;
        this.name = name;
        this.buildtime = buildtime;
        this.psamodelid = psamodelid;
        this.sourcenode = sourcenode;
        this.psrange = psrange;
        this.pspath = pspath;
        this.looppath = looppath;
        this.usedsources = usedsources;
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

    public Integer getPsamodelid() {
        return this.psamodelid;
    }

    public void setPsamodelid(Integer psamodelid) {
        this.psamodelid = psamodelid;
    }

    public Integer getSourcenode() {
        return this.sourcenode;
    }

    public void setSourcenode(Integer sourcenode) {
        this.sourcenode = sourcenode;
    }

    public String getPsrange() {
        return this.psrange;
    }

    public void setPsrange(String psrange) {
        this.psrange = psrange;
    }

    public String getPspath() {
        return this.pspath;
    }

    public void setPspath(String pspath) {
        this.pspath = pspath;
    }

    public String getLooppath() {
        return this.looppath;
    }

    public void setLooppath(String looppath) {
        this.looppath = looppath;
    }

    public String getUsedsources() {
        return this.usedsources;
    }

    public void setUsedsources(String usedsources) {
        this.usedsources = usedsources;
    }

}