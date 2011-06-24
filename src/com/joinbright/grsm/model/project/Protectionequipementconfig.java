package com.joinbright.grsm.model.project;

/**
 * Protectionequipementconfig entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Protectionequipementconfig extends
        com.joinbright.grsm.model.BaseModel implements java.io.Serializable {

    // Fields

    private Integer index1;
    private String branchid;
    private String substation;
    private Integer branchprolocation;
    private String branchtype;
    private String branchsubtype;
    private String equipment;
    private String breakerid;
    private String prolocation;
    private Integer voltagelevel;
    private String factoryno;
    private String madedate;
    private String rundate;
    private String overhualdate;
    private String repairdate;
    private String overhaulcycle;
    private String repaircycle;
    private String controlfield;
    private String maintransformer;
    private String planttransformer;
    private String planttransformer2;
    private String excitationtransformer;
    private String equipmentXmlFile;

    // Constructors

    /** default constructor */
    public Protectionequipementconfig() {
    }


    // Property accessors

    public Integer getIndex1() {
        return this.index1;
    }

    public void setIndex1(Integer index1) {
        this.index1 = index1;
    }


    public Protectionequipementconfig(Integer index1, String branchid,
            String substation, Integer branchprolocation, String branchtype,
            String branchsubtype, String equipment, String breakerid,
            String prolocation, Integer voltagelevel, String factoryno,
            String madedate, String rundate, String overhualdate,
            String repairdate, String overhaulcycle, String repaircycle,
            String controlfield, String maintransformer,
            String planttransformer, String planttransformer2,
            String excitationtransformer, String equipmentXmlFile) {
        super();
        this.index1 = index1;
        this.branchid = branchid;
        this.substation = substation;
        this.branchprolocation = branchprolocation;
        this.branchtype = branchtype;
        this.branchsubtype = branchsubtype;
        this.equipment = equipment;
        this.breakerid = breakerid;
        this.prolocation = prolocation;
        this.voltagelevel = voltagelevel;
        this.factoryno = factoryno;
        this.madedate = madedate;
        this.rundate = rundate;
        this.overhualdate = overhualdate;
        this.repairdate = repairdate;
        this.overhaulcycle = overhaulcycle;
        this.repaircycle = repaircycle;
        this.controlfield = controlfield;
        this.maintransformer = maintransformer;
        this.planttransformer = planttransformer;
        this.planttransformer2 = planttransformer2;
        this.excitationtransformer = excitationtransformer;
        this.equipmentXmlFile = equipmentXmlFile;
    }


    public String getBranchid() {
        return branchid;
    }


    public void setBranchid(String branchid) {
        this.branchid = branchid;
    }


    public String getSubstation() {
        return this.substation;
    }

    public void setSubstation(String substation) {
        this.substation = substation;
    }

    public Integer getBranchprolocation() {
        return this.branchprolocation;
    }

    public void setBranchprolocation(Integer branchprolocation) {
        this.branchprolocation = branchprolocation;
    }

    public String getBranchtype() {
        return this.branchtype;
    }

    public void setBranchtype(String branchtype) {
        this.branchtype = branchtype;
    }

    public String getBranchsubtype() {
        return this.branchsubtype;
    }

    public void setBranchsubtype(String branchsubtype) {
        this.branchsubtype = branchsubtype;
    }

    public String getEquipment() {
        return this.equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public String getBreakerid() {
        return this.breakerid;
    }

    public void setBreakerid(String breakerid) {
        this.breakerid = breakerid;
    }

    public String getProlocation() {
        return this.prolocation;
    }

    public void setProlocation(String prolocation) {
        this.prolocation = prolocation;
    }

    public Integer getVoltagelevel() {
        return this.voltagelevel;
    }

    public void setVoltagelevel(Integer voltagelevel) {
        this.voltagelevel = voltagelevel;
    }

    public String getFactoryno() {
        return this.factoryno;
    }

    public void setFactoryno(String factoryno) {
        this.factoryno = factoryno;
    }

    public String getMadedate() {
        return this.madedate;
    }

    public void setMadedate(String madedate) {
        this.madedate = madedate;
    }

    public String getRundate() {
        return this.rundate;
    }

    public void setRundate(String rundate) {
        this.rundate = rundate;
    }

    public String getOverhualdate() {
        return this.overhualdate;
    }

    public void setOverhualdate(String overhualdate) {
        this.overhualdate = overhualdate;
    }

    public String getRepairdate() {
        return this.repairdate;
    }

    public void setRepairdate(String repairdate) {
        this.repairdate = repairdate;
    }

    public String getOverhaulcycle() {
        return this.overhaulcycle;
    }

    public void setOverhaulcycle(String overhaulcycle) {
        this.overhaulcycle = overhaulcycle;
    }

    public String getRepaircycle() {
        return this.repaircycle;
    }

    public void setRepaircycle(String repaircycle) {
        this.repaircycle = repaircycle;
    }

    public String getControlfield() {
        return this.controlfield;
    }

    public void setControlfield(String controlfield) {
        this.controlfield = controlfield;
    }

    public String getMaintransformer() {
        return this.maintransformer;
    }

    public void setMaintransformer(String maintransformer) {
        this.maintransformer = maintransformer;
    }

    public String getPlanttransformer() {
        return this.planttransformer;
    }

    public void setPlanttransformer(String planttransformer) {
        this.planttransformer = planttransformer;
    }

    public String getPlanttransformer2() {
        return this.planttransformer2;
    }

    public void setPlanttransformer2(String planttransformer2) {
        this.planttransformer2 = planttransformer2;
    }

    public String getExcitationtransformer() {
        return this.excitationtransformer;
    }

    public void setExcitationtransformer(String excitationtransformer) {
        this.excitationtransformer = excitationtransformer;
    }

    public String getEquipmentXmlFile() {
        return this.equipmentXmlFile;
    }

    public void setEquipmentXmlFile(String equipmentXmlFile) {
        this.equipmentXmlFile = equipmentXmlFile;
    }

}