package com.joinbright.grsm.model.base;

/**
 * Electricvariabledictionary entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Electricvariabledictionary extends
        com.joinbright.grsm.model.BaseModel implements java.io.Serializable {

    // Fields

    private Integer id;
    private Float sortindex;
    private String branchtype;
    private Short type;
    private String description;
    private String selectsentence;
    private String wheresentence;
    private String orderby;
    private String keyword;

    // Constructors

    /** default constructor */
    public Electricvariabledictionary() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getSortindex() {
        return sortindex;
    }

    public void setSortindex(Float sortindex) {
        this.sortindex = sortindex;
    }

    public String getBranchtype() {
        return branchtype;
    }

    public void setBranchtype(String branchtype) {
        this.branchtype = branchtype;
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSelectsentence() {
        return selectsentence;
    }

    public void setSelectsentence(String selectsentence) {
        this.selectsentence = selectsentence;
    }

    public String getWheresentence() {
        return wheresentence;
    }

    public void setWheresentence(String wheresentence) {
        this.wheresentence = wheresentence;
    }

    public String getOrderby() {
        return orderby;
    }

    public void setOrderby(String orderby) {
        this.orderby = orderby;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Electricvariabledictionary(Integer id, Float sortindex,
            String branchtype, Short type, String description,
            String selectsentence, String wheresentence, String orderby,
            String keyword) {
        super();
        this.id = id;
        this.sortindex = sortindex;
        this.branchtype = branchtype;
        this.type = type;
        this.description = description;
        this.selectsentence = selectsentence;
        this.wheresentence = wheresentence;
        this.orderby = orderby;
        this.keyword = keyword;
    }


}