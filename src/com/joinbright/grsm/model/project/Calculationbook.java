package com.joinbright.grsm.model.project;

/**
 * Calculationbook entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Calculationbook extends com.joinbright.grsm.model.BaseModel
        implements java.io.Serializable {

    // Fields

    private Integer type;
    private String branchid;
    private String prolocation;
    private String date1;
    private String equipment;
    private String branchtype;
    private String substation;
    private String name;
    private String content;
    private String noticecontent;
    private String company;
    private Integer booktype;

    // Constructors

    /** default constructor */
    public Calculationbook() {
    }

    

    public Calculationbook(Integer type, String branchid, String prolocation,
            String date1, String equipment, String branchtype,
            String substation, String name, String content,
            String noticecontent, String company, Integer booktype) {
        super();
        this.type = type;
        this.branchid = branchid;
        this.prolocation = prolocation;
        this.date1 = date1;
        this.equipment = equipment;
        this.branchtype = branchtype;
        this.substation = substation;
        this.name = name;
        this.content = content;
        this.noticecontent = noticecontent;
        this.company = company;
        this.booktype = booktype;
    }



    public Integer getType() {
        return type;
    }



    public void setType(Integer type) {
        this.type = type;
    }



    public String getBranchid() {
        return branchid;
    }



    public void setBranchid(String branchid) {
        this.branchid = branchid;
    }



    public String getProlocation() {
        return prolocation;
    }



    public void setProlocation(String prolocation) {
        this.prolocation = prolocation;
    }



    public String getDate1() {
        return date1;
    }



    public void setDate1(String date1) {
        this.date1 = date1;
    }



    public String getEquipment() {
        return equipment;
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

    public String getSubstation() {
        return this.substation;
    }

    public void setSubstation(String substation) {
        this.substation = substation;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getNoticecontent() {
        return this.noticecontent;
    }

    public void setNoticecontent(String noticecontent) {
        this.noticecontent = noticecontent;
    }

    public String getCompany() {
        return this.company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Integer getBooktype() {
        return this.booktype;
    }

    public void setBooktype(Integer booktype) {
        this.booktype = booktype;
    }

}