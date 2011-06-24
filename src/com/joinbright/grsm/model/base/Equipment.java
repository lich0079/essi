package com.joinbright.grsm.model.base;

/**
 * Equipment entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Equipment extends com.joinbright.grsm.model.BaseModel implements
        java.io.Serializable {

    // Fields

    private Integer index1;
    private String equipment;
    private String equipmenttype;
    private String branchtype;
    private String factory;
    private String prototypename;
    private String prototype;
    private Integer machinenum;
    private String cpunum;
    private String xmldata;

    // Constructors

    /** default constructor */
    public Equipment() {
    }

    /** minimal constructor */
    public Equipment(Integer index1) {
        this.index1 = index1;
    }

    /** full constructor */
    public Equipment(Integer index1, String equipment, String equipmenttype,
            String branchtype, String factory, String prototypename,
            String prototype, Integer machinenum, String cpunum, String xmldata) {
        this.index1 = index1;
        this.equipment = equipment;
        this.equipmenttype = equipmenttype;
        this.branchtype = branchtype;
        this.factory = factory;
        this.prototypename = prototypename;
        this.prototype = prototype;
        this.machinenum = machinenum;
        this.cpunum = cpunum;
        this.xmldata = xmldata;
    }

    // Property accessors

    public Integer getIndex1() {
        return this.index1;
    }

    public void setIndex1(Integer index1) {
        this.index1 = index1;
    }

    public String getEquipment() {
        return this.equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public String getEquipmenttype() {
        return this.equipmenttype;
    }

    public void setEquipmenttype(String equipmenttype) {
        this.equipmenttype = equipmenttype;
    }

    public String getBranchtype() {
        return this.branchtype;
    }

    public void setBranchtype(String branchtype) {
        this.branchtype = branchtype;
    }

    public String getFactory() {
        return this.factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    public String getPrototypename() {
        return this.prototypename;
    }

    public void setPrototypename(String prototypename) {
        this.prototypename = prototypename;
    }

    public String getPrototype() {
        return this.prototype;
    }

    public void setPrototype(String prototype) {
        this.prototype = prototype;
    }

    public Integer getMachinenum() {
        return this.machinenum;
    }

    public void setMachinenum(Integer machinenum) {
        this.machinenum = machinenum;
    }

    public String getCpunum() {
        return this.cpunum;
    }

    public void setCpunum(String cpunum) {
        this.cpunum = cpunum;
    }

    public String getXmldata() {
        return this.xmldata;
    }

    public void setXmldata(String xmldata) {
        this.xmldata = xmldata;
    }

}