package com.joinbright.grsm.model.project;

/**
 * Settingvaluebook entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Settingvaluebook extends com.joinbright.grsm.model.BaseModel
        implements java.io.Serializable {

    // Fields

    private String index1;
    private String name;
    private String status;
    private String equipment;
    private String branchtype;
    private String branchid;
    private String prolocation;
    private String substation;
    private String settingdate;
    private String content;
    private String company;

    // Constructors

    /** default constructor */
    public Settingvaluebook() {
    }

    /** minimal constructor */
    public Settingvaluebook(String index1) {
        this.index1 = index1;
    }

    /** full constructor */
    public Settingvaluebook(String index1, String name, String status,
            String equipment, String branchtype, String branchid,
            String prolocation, String substation, String settingdate,
            String content, String company) {
        this.index1 = index1;
        this.name = name;
        this.status = status;
        this.equipment = equipment;
        this.branchtype = branchtype;
        this.branchid = branchid;
        this.prolocation = prolocation;
        this.substation = substation;
        this.settingdate = settingdate;
        this.content = content;
        this.company = company;
    }

    // Property accessors

    public String getIndex1() {
        return this.index1;
    }

    public void setIndex1(String index1) {
        this.index1 = index1;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEquipment() {
        return this.equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public String getBranchtype() {
        return this.branchtype;
    }

    public void setBranchtype(String branchtype) {
        this.branchtype = branchtype;
    }

    public String getBranchid() {
        return this.branchid;
    }

    public void setBranchid(String branchid) {
        this.branchid = branchid;
    }

    public String getProlocation() {
        return this.prolocation;
    }

    public void setProlocation(String prolocation) {
        this.prolocation = prolocation;
    }

    public String getSubstation() {
        return this.substation;
    }

    public void setSubstation(String substation) {
        this.substation = substation;
    }

    public String getSettingdate() {
        return this.settingdate;
    }

    public void setSettingdate(String settingdate) {
        this.settingdate = settingdate;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCompany() {
        return this.company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

}