package com.joinbright.grsm.model.base;

/**
 * Calculationsymbol entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Calculationsymbol extends com.joinbright.grsm.model.BaseModel
        implements java.io.Serializable {

    // Fields

    private Integer id;
    private Short index1;
    private String name;
    private String description;
    private Short dimension;
    private Integer display;
    private Integer realcheck;
    private Short complexcheck;
    private Short type;
    private Integer forecolor;
    private Integer backcolor;
    private Short systemtype;
    private String remark;

    // Constructors

    /** default constructor */
    public Calculationsymbol() {
    }

    /** minimal constructor */
    public Calculationsymbol(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    /** full constructor */
    public Calculationsymbol(Integer id, Short index1, String name,
            String description, Short dimension, Integer display,
            Integer realcheck, Short complexcheck, Short type,
            Integer forecolor, Integer backcolor, Short systemtype,
            String remark) {
        this.id = id;
        this.index1 = index1;
        this.name = name;
        this.description = description;
        this.dimension = dimension;
        this.display = display;
        this.realcheck = realcheck;
        this.complexcheck = complexcheck;
        this.type = type;
        this.forecolor = forecolor;
        this.backcolor = backcolor;
        this.systemtype = systemtype;
        this.remark = remark;
    }

    // Property accessors

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Short getIndex1() {
        return this.index1;
    }

    public void setIndex1(Short index1) {
        this.index1 = index1;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Short getDimension() {
        return this.dimension;
    }

    public void setDimension(Short dimension) {
        this.dimension = dimension;
    }

    public Integer getDisplay() {
        return this.display;
    }

    public void setDisplay(Integer display) {
        this.display = display;
    }

    public Integer getRealcheck() {
        return this.realcheck;
    }

    public void setRealcheck(Integer realcheck) {
        this.realcheck = realcheck;
    }

    public Short getComplexcheck() {
        return this.complexcheck;
    }

    public void setComplexcheck(Short complexcheck) {
        this.complexcheck = complexcheck;
    }

    public Short getType() {
        return this.type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public Integer getForecolor() {
        return this.forecolor;
    }

    public void setForecolor(Integer forecolor) {
        this.forecolor = forecolor;
    }

    public Integer getBackcolor() {
        return this.backcolor;
    }

    public void setBackcolor(Integer backcolor) {
        this.backcolor = backcolor;
    }

    public Short getSystemtype() {
        return this.systemtype;
    }

    public void setSystemtype(Short systemtype) {
        this.systemtype = systemtype;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}