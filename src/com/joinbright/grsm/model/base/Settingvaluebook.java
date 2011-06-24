package com.joinbright.grsm.model.base;

/**
 * Settingvaluebook entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Settingvaluebook extends com.joinbright.grsm.model.BaseModel
        implements java.io.Serializable {

    // Fields

    private Integer id;
    private String index1;
    private String name;
    private Integer status;
    private String equipment;
    private String branchtype;
    private String branchid;
    private String prolocation;
    private String substation;
    private String settingdate;
    private String content;
    private String calculationbook;
    private String calculator;
    private String company;
    private Integer flowlevel;
    private Integer index2;

    // Constructors

    /** default constructor */
    public Settingvaluebook() {
    }

    /** minimal constructor */
    public Settingvaluebook(Integer id, String index1, Integer status) {
        this.id = id;
        this.index1 = index1;
        this.status = status;
    }

    /** full constructor */
    public Settingvaluebook(Integer id, String index1, String name,
            Integer status, String equipment, String branchtype,
            String branchid, String prolocation, String substation,
            String settingdate, String content, String calculationbook,
            String calculator, String company, Integer flowlevel, Integer index2) {
        this.id = id;
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
        this.calculationbook = calculationbook;
        this.calculator = calculator;
        this.company = company;
        this.flowlevel = flowlevel;
        this.index2 = index2;
    }

    // Property accessors

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
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

    public String getCalculationbook() {
        return this.calculationbook;
    }

    public void setCalculationbook(String calculationbook) {
        this.calculationbook = calculationbook;
    }

    public String getCalculator() {
        return this.calculator;
    }

    public void setCalculator(String calculator) {
        this.calculator = calculator;
    }

    public String getCompany() {
        return this.company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Integer getFlowlevel() {
        return this.flowlevel;
    }

    public void setFlowlevel(Integer flowlevel) {
        this.flowlevel = flowlevel;
    }

    public Integer getIndex2() {
        return this.index2;
    }

    public void setIndex2(Integer index2) {
        this.index2 = index2;
    }

}