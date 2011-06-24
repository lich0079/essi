package com.joinbright.grsm.model.project;

/**
 * Substation entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Substation extends com.joinbright.grsm.model.BaseModel implements
        java.io.Serializable {

    // Fields

    private String substationname;
    private Subarea subarea;
    private String index1;
    private String description;
    private Short type;
    private Float highestvoltage;
    private String sdn;
    private String databaseversion;
    private String olddatabaseversion;
    private Short checkstatus;
    private String checkoutuser;
    private String editDate;
    private Integer sort;
    private String remark1;
    private String remark2;
    private Integer stationtype;

    // Constructors

    /** default constructor */
    public Substation() {
    }

    /** minimal constructor */
    public Substation(String substationname) {
        this.substationname = substationname;
    }

    /** full constructor */
    public Substation(String substationname, Subarea subarea, String index1,
            String description, Short type, Float highestvoltage, String sdn,
            String databaseversion, String olddatabaseversion,
            Short checkstatus, String checkoutuser, String editDate,
            Integer sort, String remark1, String remark2, Integer stationtype) {
        this.substationname = substationname;
        this.subarea = subarea;
        this.index1 = index1;
        this.description = description;
        this.type = type;
        this.highestvoltage = highestvoltage;
        this.sdn = sdn;
        this.databaseversion = databaseversion;
        this.olddatabaseversion = olddatabaseversion;
        this.checkstatus = checkstatus;
        this.checkoutuser = checkoutuser;
        this.editDate = editDate;
        this.sort = sort;
        this.remark1 = remark1;
        this.remark2 = remark2;
        this.stationtype = stationtype;
    }

    // Property accessors

    public String getSubstationname() {
        return this.substationname;
    }

    public void setSubstationname(String substationname) {
        this.substationname = substationname;
    }

    public Subarea getSubarea() {
        return this.subarea;
    }

    public void setSubarea(Subarea subarea) {
        this.subarea = subarea;
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

    public Float getHighestvoltage() {
        return this.highestvoltage;
    }

    public void setHighestvoltage(Float highestvoltage) {
        this.highestvoltage = highestvoltage;
    }

    public String getSdn() {
        return this.sdn;
    }

    public void setSdn(String sdn) {
        this.sdn = sdn;
    }

    public String getDatabaseversion() {
        return this.databaseversion;
    }

    public void setDatabaseversion(String databaseversion) {
        this.databaseversion = databaseversion;
    }

    public String getOlddatabaseversion() {
        return this.olddatabaseversion;
    }

    public void setOlddatabaseversion(String olddatabaseversion) {
        this.olddatabaseversion = olddatabaseversion;
    }

    public Short getCheckstatus() {
        return this.checkstatus;
    }

    public void setCheckstatus(Short checkstatus) {
        this.checkstatus = checkstatus;
    }

    public String getCheckoutuser() {
        return this.checkoutuser;
    }

    public void setCheckoutuser(String checkoutuser) {
        this.checkoutuser = checkoutuser;
    }

    public String getEditDate() {
        return this.editDate;
    }

    public void setEditDate(String editDate) {
        this.editDate = editDate;
    }

    public Integer getSort() {
        return this.sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getRemark1() {
        return this.remark1;
    }

    public void setRemark1(String remark1) {
        this.remark1 = remark1;
    }

    public String getRemark2() {
        return this.remark2;
    }

    public void setRemark2(String remark2) {
        this.remark2 = remark2;
    }

    public Integer getStationtype() {
        return this.stationtype;
    }

    public void setStationtype(Integer stationtype) {
        this.stationtype = stationtype;
    }

}