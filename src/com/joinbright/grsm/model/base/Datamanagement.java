package com.joinbright.grsm.model.base;

/**
 * Datamanagement entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Datamanagement extends com.joinbright.grsm.model.BaseModel
        implements java.io.Serializable {

    // Fields

    private Short id;
    private String nodename;
    private Short havechildnodes;
    private String fathernode;
    private Short moveflag;
    private Short deleteflag;
    private String imagename;
    private Short valuesource;
    private String sqlsentence;
    private String visiblecontent;
    private Short version;

    // Constructors

    /** default constructor */
    public Datamanagement() {
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getNodename() {
        return nodename;
    }

    public void setNodename(String nodename) {
        this.nodename = nodename;
    }

    public Short getHavechildnodes() {
        return havechildnodes;
    }

    public void setHavechildnodes(Short havechildnodes) {
        this.havechildnodes = havechildnodes;
    }

    public String getFathernode() {
        return fathernode;
    }

    public void setFathernode(String fathernode) {
        this.fathernode = fathernode;
    }

    public Short getMoveflag() {
        return moveflag;
    }

    public void setMoveflag(Short moveflag) {
        this.moveflag = moveflag;
    }

    public Short getDeleteflag() {
        return deleteflag;
    }

    public void setDeleteflag(Short deleteflag) {
        this.deleteflag = deleteflag;
    }

    public String getImagename() {
        return imagename;
    }

    public void setImagename(String imagename) {
        this.imagename = imagename;
    }

    public Short getValuesource() {
        return valuesource;
    }

    public void setValuesource(Short valuesource) {
        this.valuesource = valuesource;
    }

    public String getSqlsentence() {
        return sqlsentence;
    }

    public void setSqlsentence(String sqlsentence) {
        this.sqlsentence = sqlsentence;
    }

    public String getVisiblecontent() {
        return visiblecontent;
    }

    public void setVisiblecontent(String visiblecontent) {
        this.visiblecontent = visiblecontent;
    }

    public Short getVersion() {
        return version;
    }

    public void setVersion(Short version) {
        this.version = version;
    }

    public Datamanagement(Short id, String nodename, Short havechildnodes,
            String fathernode, Short moveflag, Short deleteflag,
            String imagename, Short valuesource, String sqlsentence,
            String visiblecontent, Short version) {
        super();
        this.id = id;
        this.nodename = nodename;
        this.havechildnodes = havechildnodes;
        this.fathernode = fathernode;
        this.moveflag = moveflag;
        this.deleteflag = deleteflag;
        this.imagename = imagename;
        this.valuesource = valuesource;
        this.sqlsentence = sqlsentence;
        this.visiblecontent = visiblecontent;
        this.version = version;
    }


}