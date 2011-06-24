package com.joinbright.grsm.model.project;

import java.util.HashSet;
import java.util.Set;

/**
 * Multipointequivalencecase entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Multipointequivalencecase extends
        com.joinbright.grsm.model.BaseModel implements java.io.Serializable {

    // Fields

    private Integer caseid;
    private String casename;
    private String runwaycode;
    private String runwaydescription;
    private Set multipointequivalencecalresults = new HashSet(0);
    private Set meboundaryconditions = new HashSet(0);

    // Constructors

    /** default constructor */
    public Multipointequivalencecase() {
    }

    /** minimal constructor */
    public Multipointequivalencecase(Integer caseid) {
        this.caseid = caseid;
    }

    /** full constructor */
    public Multipointequivalencecase(Integer caseid, String casename,
            String runwaycode, String runwaydescription,
            Set multipointequivalencecalresults, Set meboundaryconditions) {
        this.caseid = caseid;
        this.casename = casename;
        this.runwaycode = runwaycode;
        this.runwaydescription = runwaydescription;
        this.multipointequivalencecalresults = multipointequivalencecalresults;
        this.meboundaryconditions = meboundaryconditions;
    }

    // Property accessors

    public Integer getCaseid() {
        return this.caseid;
    }

    public void setCaseid(Integer caseid) {
        this.caseid = caseid;
    }

    public String getCasename() {
        return this.casename;
    }

    public void setCasename(String casename) {
        this.casename = casename;
    }

    public String getRunwaycode() {
        return this.runwaycode;
    }

    public void setRunwaycode(String runwaycode) {
        this.runwaycode = runwaycode;
    }

    public String getRunwaydescription() {
        return this.runwaydescription;
    }

    public void setRunwaydescription(String runwaydescription) {
        this.runwaydescription = runwaydescription;
    }

    public Set getMultipointequivalencecalresults() {
        return this.multipointequivalencecalresults;
    }

    public void setMultipointequivalencecalresults(
            Set multipointequivalencecalresults) {
        this.multipointequivalencecalresults = multipointequivalencecalresults;
    }

    public Set getMeboundaryconditions() {
        return this.meboundaryconditions;
    }

    public void setMeboundaryconditions(Set meboundaryconditions) {
        this.meboundaryconditions = meboundaryconditions;
    }

}