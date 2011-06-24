package com.joinbright.grsm.model.project;

/**
 * Systeminformation entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Systeminformation extends com.joinbright.grsm.model.BaseModel
        implements java.io.Serializable {

    // Fields

    private Short branchcurrentextremumfinished;
    private Short braningfactorfinished;
    private Short nodeimpedancefinished;
    private String databaseversion;
    private String protectionversion;
    private String tranprotectionversion;
    private Short modifyinfo;
    private String sdn;
    private String xml;
    private String modifydate;
    private Short checkstatus;
    private String checkoutuser;
    private Short innerSubareaFlag;

    // Constructors

    /** default constructor */
    public Systeminformation() {
    }

    /** minimal constructor */
    public Systeminformation(Short branchcurrentextremumfinished) {
        this.branchcurrentextremumfinished = branchcurrentextremumfinished;
    }

    /** full constructor */
    public Systeminformation(Short branchcurrentextremumfinished,
            Short braningfactorfinished, Short nodeimpedancefinished,
            String databaseversion, String protectionversion,
            String tranprotectionversion, Short modifyinfo, String sdn,
            String xml, String modifydate, Short checkstatus,
            String checkoutuser, Short innerSubareaFlag) {
        this.branchcurrentextremumfinished = branchcurrentextremumfinished;
        this.braningfactorfinished = braningfactorfinished;
        this.nodeimpedancefinished = nodeimpedancefinished;
        this.databaseversion = databaseversion;
        this.protectionversion = protectionversion;
        this.tranprotectionversion = tranprotectionversion;
        this.modifyinfo = modifyinfo;
        this.sdn = sdn;
        this.xml = xml;
        this.modifydate = modifydate;
        this.checkstatus = checkstatus;
        this.checkoutuser = checkoutuser;
        this.innerSubareaFlag = innerSubareaFlag;
    }

    // Property accessors

    public Short getBranchcurrentextremumfinished() {
        return this.branchcurrentextremumfinished;
    }

    public void setBranchcurrentextremumfinished(
            Short branchcurrentextremumfinished) {
        this.branchcurrentextremumfinished = branchcurrentextremumfinished;
    }

    public Short getBraningfactorfinished() {
        return this.braningfactorfinished;
    }

    public void setBraningfactorfinished(Short braningfactorfinished) {
        this.braningfactorfinished = braningfactorfinished;
    }

    public Short getNodeimpedancefinished() {
        return this.nodeimpedancefinished;
    }

    public void setNodeimpedancefinished(Short nodeimpedancefinished) {
        this.nodeimpedancefinished = nodeimpedancefinished;
    }

    public String getDatabaseversion() {
        return this.databaseversion;
    }

    public void setDatabaseversion(String databaseversion) {
        this.databaseversion = databaseversion;
    }

    public String getProtectionversion() {
        return this.protectionversion;
    }

    public void setProtectionversion(String protectionversion) {
        this.protectionversion = protectionversion;
    }

    public String getTranprotectionversion() {
        return this.tranprotectionversion;
    }

    public void setTranprotectionversion(String tranprotectionversion) {
        this.tranprotectionversion = tranprotectionversion;
    }

    public Short getModifyinfo() {
        return this.modifyinfo;
    }

    public void setModifyinfo(Short modifyinfo) {
        this.modifyinfo = modifyinfo;
    }

    public String getSdn() {
        return this.sdn;
    }

    public void setSdn(String sdn) {
        this.sdn = sdn;
    }

    public String getXml() {
        return this.xml;
    }

    public void setXml(String xml) {
        this.xml = xml;
    }

    public String getModifydate() {
        return this.modifydate;
    }

    public void setModifydate(String modifydate) {
        this.modifydate = modifydate;
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

    public Short getInnerSubareaFlag() {
        return this.innerSubareaFlag;
    }

    public void setInnerSubareaFlag(Short innerSubareaFlag) {
        this.innerSubareaFlag = innerSubareaFlag;
    }

}