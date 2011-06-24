package com.joinbright.grsm.model.base;

/**
 * Usermanagement entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Usermanagement extends com.joinbright.grsm.model.BaseModel
        implements java.io.Serializable {

    // Fields

    private String username;
    private Integer userlevel;
    private String userpassword;
    private String company;
    private Integer calculation;
    private Integer examination;
    private Integer check1;
    private Integer approve;
    private Integer todraft;
    private Integer totext;
    private Integer toexecution;
    private Integer totrash;
    private Integer deletedraft;
    private Integer deletetext;
    private Integer deleteexecution;
    private Integer deletetrash;
    private Integer faultcalculation;
    private Integer setting;
    private Integer emulation;
    private Integer management;
    private Integer drawing;
    private Integer systemedit;
    private Integer searchtrans;
    private Integer iflogincs;
    private Integer loginstatus;

    // Constructors

    /** default constructor */
    public Usermanagement() {
    }

    /** minimal constructor */
    public Usermanagement(String username) {
        this.username = username;
    }

    /** full constructor */
    public Usermanagement(String username, Integer userlevel,
            String userpassword, String company, Integer calculation,
            Integer examination, Integer check1, Integer approve,
            Integer todraft, Integer totext, Integer toexecution,
            Integer totrash, Integer deletedraft, Integer deletetext,
            Integer deleteexecution, Integer deletetrash,
            Integer faultcalculation, Integer setting, Integer emulation,
            Integer management, Integer drawing, Integer systemedit,
            Integer searchtrans, Integer iflogincs, Integer loginstatus) {
        this.username = username;
        this.userlevel = userlevel;
        this.userpassword = userpassword;
        this.company = company;
        this.calculation = calculation;
        this.examination = examination;
        this.check1 = check1;
        this.approve = approve;
        this.todraft = todraft;
        this.totext = totext;
        this.toexecution = toexecution;
        this.totrash = totrash;
        this.deletedraft = deletedraft;
        this.deletetext = deletetext;
        this.deleteexecution = deleteexecution;
        this.deletetrash = deletetrash;
        this.faultcalculation = faultcalculation;
        this.setting = setting;
        this.emulation = emulation;
        this.management = management;
        this.drawing = drawing;
        this.systemedit = systemedit;
        this.searchtrans = searchtrans;
        this.iflogincs = iflogincs;
        this.loginstatus = loginstatus;
    }

    // Property accessors

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getUserlevel() {
        return this.userlevel;
    }

    public void setUserlevel(Integer userlevel) {
        this.userlevel = userlevel;
    }

    public String getUserpassword() {
        return this.userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    public String getCompany() {
        return this.company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Integer getCalculation() {
        return this.calculation;
    }

    public void setCalculation(Integer calculation) {
        this.calculation = calculation;
    }

    public Integer getExamination() {
        return this.examination;
    }

    public void setExamination(Integer examination) {
        this.examination = examination;
    }

    public Integer getCheck1() {
        return this.check1;
    }

    public void setCheck1(Integer check1) {
        this.check1 = check1;
    }

    public Integer getApprove() {
        return this.approve;
    }

    public void setApprove(Integer approve) {
        this.approve = approve;
    }

    public Integer getTodraft() {
        return this.todraft;
    }

    public void setTodraft(Integer todraft) {
        this.todraft = todraft;
    }

    public Integer getTotext() {
        return this.totext;
    }

    public void setTotext(Integer totext) {
        this.totext = totext;
    }

    public Integer getToexecution() {
        return this.toexecution;
    }

    public void setToexecution(Integer toexecution) {
        this.toexecution = toexecution;
    }

    public Integer getTotrash() {
        return this.totrash;
    }

    public void setTotrash(Integer totrash) {
        this.totrash = totrash;
    }

    public Integer getDeletedraft() {
        return this.deletedraft;
    }

    public void setDeletedraft(Integer deletedraft) {
        this.deletedraft = deletedraft;
    }

    public Integer getDeletetext() {
        return this.deletetext;
    }

    public void setDeletetext(Integer deletetext) {
        this.deletetext = deletetext;
    }

    public Integer getDeleteexecution() {
        return this.deleteexecution;
    }

    public void setDeleteexecution(Integer deleteexecution) {
        this.deleteexecution = deleteexecution;
    }

    public Integer getDeletetrash() {
        return this.deletetrash;
    }

    public void setDeletetrash(Integer deletetrash) {
        this.deletetrash = deletetrash;
    }

    public Integer getFaultcalculation() {
        return this.faultcalculation;
    }

    public void setFaultcalculation(Integer faultcalculation) {
        this.faultcalculation = faultcalculation;
    }

    public Integer getSetting() {
        return this.setting;
    }

    public void setSetting(Integer setting) {
        this.setting = setting;
    }

    public Integer getEmulation() {
        return this.emulation;
    }

    public void setEmulation(Integer emulation) {
        this.emulation = emulation;
    }

    public Integer getManagement() {
        return this.management;
    }

    public void setManagement(Integer management) {
        this.management = management;
    }

    public Integer getDrawing() {
        return this.drawing;
    }

    public void setDrawing(Integer drawing) {
        this.drawing = drawing;
    }

    public Integer getSystemedit() {
        return this.systemedit;
    }

    public void setSystemedit(Integer systemedit) {
        this.systemedit = systemedit;
    }

    public Integer getSearchtrans() {
        return this.searchtrans;
    }

    public void setSearchtrans(Integer searchtrans) {
        this.searchtrans = searchtrans;
    }

    public Integer getIflogincs() {
        return this.iflogincs;
    }

    public void setIflogincs(Integer iflogincs) {
        this.iflogincs = iflogincs;
    }

    public Integer getLoginstatus() {
        return this.loginstatus;
    }

    public void setLoginstatus(Integer loginstatus) {
        this.loginstatus = loginstatus;
    }

}