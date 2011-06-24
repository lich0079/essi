package com.joinbright.grsm.model.project;

import java.util.HashSet;
import java.util.Set;

/**
 * Company entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Company extends com.joinbright.grsm.model.BaseModel implements
        java.io.Serializable {

    // Fields

    private String companyname;
    private String index1;
    private String description;
    private Integer issuperior;
    private Integer sort;
    private Set subareas = new HashSet(0);

    // Constructors

    /** default constructor */
    public Company() {
    }

    /** minimal constructor */
    public Company(String companyname) {
        this.companyname = companyname;
    }

    /** full constructor */
    public Company(String companyname, String index1, String description,
            Integer issuperior, Integer sort, Set subareas) {
        this.companyname = companyname;
        this.index1 = index1;
        this.description = description;
        this.issuperior = issuperior;
        this.sort = sort;
        this.subareas = subareas;
    }

    // Property accessors

    public String getCompanyname() {
        return this.companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getIndex1() {
        return this.index1;
    }

    public void setIndex1(String index1) {
        this.index1 = index1;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getIssuperior() {
        return this.issuperior;
    }

    public void setIssuperior(Integer issuperior) {
        this.issuperior = issuperior;
    }

    public Integer getSort() {
        return this.sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Set getSubareas() {
        return this.subareas;
    }

    public void setSubareas(Set subareas) {
        this.subareas = subareas;
    }

}