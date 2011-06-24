package com.joinbright.grsm.model.project;

/**
 * Dtproperties entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Dtproperties extends com.joinbright.grsm.model.BaseModel implements
        java.io.Serializable {

    // Fields

    private Integer id;
    private String property;
    private Integer objectid;
    private String value;
    private String uvalue;
    private String lvalue;
    private Integer version;

    // Constructors

    /** default constructor */
    public Dtproperties() {
    }

    
    public Dtproperties(Integer id, String property, Integer objectid,
            String value, String uvalue, String lvalue, Integer version) {
        super();
        this.id = id;
        this.property = property;
        this.objectid = objectid;
        this.value = value;
        this.uvalue = uvalue;
        this.lvalue = lvalue;
        this.version = version;
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getProperty() {
        return property;
    }


    public void setProperty(String property) {
        this.property = property;
    }


    public Integer getObjectid() {
        return this.objectid;
    }

    public void setObjectid(Integer objectid) {
        this.objectid = objectid;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getUvalue() {
        return this.uvalue;
    }

    public void setUvalue(String uvalue) {
        this.uvalue = uvalue;
    }

    public String getLvalue() {
        return this.lvalue;
    }

    public void setLvalue(String lvalue) {
        this.lvalue = lvalue;
    }

    public Integer getVersion() {
        return this.version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

}