package com.joinbright.grsm.model.base;

/**
 * Color entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Color extends com.joinbright.grsm.model.BaseModel implements
        java.io.Serializable {

    // Fields

    private String type;
    private Integer color;
    private Integer defaultcolor;

    // Constructors

    /** default constructor */
    public Color() {
    }

    /** minimal constructor */
    public Color(String type) {
        this.type = type;
    }

    /** full constructor */
    public Color(String type, Integer color, Integer defaultcolor) {
        this.type = type;
        this.color = color;
        this.defaultcolor = defaultcolor;
    }

    // Property accessors

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getColor() {
        return this.color;
    }

    public void setColor(Integer color) {
        this.color = color;
    }

    public Integer getDefaultcolor() {
        return this.defaultcolor;
    }

    public void setDefaultcolor(Integer defaultcolor) {
        this.defaultcolor = defaultcolor;
    }

}