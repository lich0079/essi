package com.joinbright.grsm.model.base;

/**
 * Managementselectlist entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Managementselectlist extends com.joinbright.grsm.model.BaseModel
        implements java.io.Serializable {

    // Fields

    private String username;
    private String tablename;
    private String listname;

    // Constructors

    /** default constructor */
    public Managementselectlist() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTablename() {
        return tablename;
    }

    public void setTablename(String tablename) {
        this.tablename = tablename;
    }

    public String getListname() {
        return listname;
    }

    public void setListname(String listname) {
        this.listname = listname;
    }

    public Managementselectlist(String username, String tablename,
            String listname) {
        super();
        this.username = username;
        this.tablename = tablename;
        this.listname = listname;
    }


}