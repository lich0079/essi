package com.joinbright.grsm.model.project;

/**
 * Branchnode entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Branchnode extends com.joinbright.grsm.model.BaseModel implements
        java.io.Serializable {

    // Fields

    private String id;
    private Integer type;
    private Integer prolocation;
    private Integer node;
    private Integer status;
    private String tablename;
    private String breaker;
    private String bus;

    // Constructors

    /** default constructor */
    public Branchnode() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getProlocation() {
        return prolocation;
    }

    public void setProlocation(Integer prolocation) {
        this.prolocation = prolocation;
    }

    public Integer getNode() {
        return node;
    }

    public void setNode(Integer node) {
        this.node = node;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getTablename() {
        return tablename;
    }

    public void setTablename(String tablename) {
        this.tablename = tablename;
    }

    public String getBreaker() {
        return breaker;
    }

    public void setBreaker(String breaker) {
        this.breaker = breaker;
    }

    public String getBus() {
        return bus;
    }

    public void setBus(String bus) {
        this.bus = bus;
    }

    public Branchnode(String id, Integer type, Integer prolocation,
            Integer node, Integer status, String tablename, String breaker,
            String bus) {
        super();
        this.id = id;
        this.type = type;
        this.prolocation = prolocation;
        this.node = node;
        this.status = status;
        this.tablename = tablename;
        this.breaker = breaker;
        this.bus = bus;
    }


}