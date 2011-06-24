package com.joinbright.grsm.model.project;

/**
 * Emulationreport entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Emulationreport extends com.joinbright.grsm.model.BaseModel
        implements java.io.Serializable {

    // Fields

    private Integer index1;
    private String runway;
    private String substation;
    private String faultpoint;
    private String faulttype;
    private Short calculationtype;
    private String protection;
    private String faultinformation;
    private String silentbreaker;
    private String report;
    private String date1;
    private String time1;

    // Constructors

    /** default constructor */
    public Emulationreport() {
    }

    public Integer getIndex1() {
        return index1;
    }

    public void setIndex1(Integer index1) {
        this.index1 = index1;
    }

    public String getRunway() {
        return runway;
    }

    public void setRunway(String runway) {
        this.runway = runway;
    }

    public String getSubstation() {
        return substation;
    }

    public void setSubstation(String substation) {
        this.substation = substation;
    }

    public String getFaultpoint() {
        return faultpoint;
    }

    public void setFaultpoint(String faultpoint) {
        this.faultpoint = faultpoint;
    }

    public String getFaulttype() {
        return faulttype;
    }

    public void setFaulttype(String faulttype) {
        this.faulttype = faulttype;
    }

    public Short getCalculationtype() {
        return calculationtype;
    }

    public void setCalculationtype(Short calculationtype) {
        this.calculationtype = calculationtype;
    }

    public String getProtection() {
        return protection;
    }

    public void setProtection(String protection) {
        this.protection = protection;
    }

    public String getFaultinformation() {
        return faultinformation;
    }

    public void setFaultinformation(String faultinformation) {
        this.faultinformation = faultinformation;
    }

    public String getSilentbreaker() {
        return silentbreaker;
    }

    public void setSilentbreaker(String silentbreaker) {
        this.silentbreaker = silentbreaker;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }

    public String getDate1() {
        return date1;
    }

    public void setDate1(String date1) {
        this.date1 = date1;
    }

    public String getTime1() {
        return time1;
    }

    public void setTime1(String time1) {
        this.time1 = time1;
    }

    public Emulationreport(Integer index1, String runway, String substation,
            String faultpoint, String faulttype, Short calculationtype,
            String protection, String faultinformation, String silentbreaker,
            String report, String date1, String time1) {
        super();
        this.index1 = index1;
        this.runway = runway;
        this.substation = substation;
        this.faultpoint = faultpoint;
        this.faulttype = faulttype;
        this.calculationtype = calculationtype;
        this.protection = protection;
        this.faultinformation = faultinformation;
        this.silentbreaker = silentbreaker;
        this.report = report;
        this.date1 = date1;
        this.time1 = time1;
    }


}