package com.joinbright.grsm.model.project;

import java.util.HashSet;
import java.util.Set;

/**
 * Subarea entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Subarea extends com.joinbright.grsm.model.BaseModel implements
        java.io.Serializable {

    // Fields

    private String subareaname;
    private Company company;
    private String index1;
    private String description;
    private Short type;
    private Integer sort;
    private Set substations = new HashSet(0);

    // Constructors

    /** default constructor */
    public Subarea() {
    }

    /** minimal constructor */
    public Subarea(String subareaname) {
        this.subareaname = subareaname;
    }

    /** full constructor */
    public Subarea(String subareaname, Company company, String index1,
            String description, Short type, Integer sort, Set substations) {
        this.subareaname = subareaname;
        this.company = company;
        this.index1 = index1;
        this.description = description;
        this.type = type;
        this.sort = sort;
        this.substations = substations;
    }

    // Property accessors

    public String getSubareaname() {
        return this.subareaname;
    }

    public void setSubareaname(String subareaname) {
        this.subareaname = subareaname;
    }

    public Company getCompany() {
        return this.company;
    }

    public void setCompany(Company company) {
        this.company = company;
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

    public Short getType() {
        return this.type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public Integer getSort() {
        return this.sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Set getSubstations() {
        return this.substations;
    }

    public void setSubstations(Set substations) {
        this.substations = substations;
    }

}