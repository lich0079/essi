package com.joinbright.grsm.model.base;

/**
 * Systemsetting entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Systemsetting extends com.joinbright.grsm.model.BaseModel
        implements java.io.Serializable {

    // Fields

    private String name;
    private Short index1;
    private Short type;
    private String value1;
    private String description;

    // Constructors

    /** default constructor */
    public Systemsetting() {
    }

    /** minimal constructor */
    public Systemsetting(String name) {
        this.name = name;
    }

    /** full constructor */
    public Systemsetting(String name, Short index1, Short type, String value1,
            String description) {
        this.name = name;
        this.index1 = index1;
        this.type = type;
        this.value1 = value1;
        this.description = description;
    }

    // Property accessors

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Short getIndex1() {
        return this.index1;
    }

    public void setIndex1(Short index1) {
        this.index1 = index1;
    }

    public Short getType() {
        return this.type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public String getValue1() {
        return this.value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}