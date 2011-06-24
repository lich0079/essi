package com.joinbright.grsm.model.project;

/**
 * Capacitor entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Capacitor extends com.joinbright.grsm.model.BaseModel implements
        java.io.Serializable {

    // Fields

    private String id;
    private String name;
    private String substation;
    private String description;
    private String factory;
    private String model;
    private Short type;
    private Float voltagelevel;
    private Float ratedkv;
    private Float ratedkvar;
    private Float capacitanceuf;
    private Float inductanceml;
    private Short connectiontype;
    private Short n;
    private Short m;
    private Short NSingle;
    private Integer MSingle;
    private String unitType;
    private Float unitRatedkvar;
    private Float unitCapacitance;
    private Float unitRatedkv;
    private String ptModel;
    private String ptRatio;
    private Float ptRatedkva;
    private Float ptRatedkv;
    private Float maximumkvar;
    private Float minimumkvar;
    private Short adjusttype;
    private Short groupnum;
    private String groupCapacity;
    private Float basecurrent;
    private String remark;
    private String company;
    private Float ratioofreactance;

    // Constructors

    /** default constructor */
    public Capacitor() {
    }


    // Property accessors

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Capacitor(String id, String name, String substation,
            String description, String factory, String model, Short type,
            Float voltagelevel, Float ratedkv, Float ratedkvar,
            Float capacitanceuf, Float inductanceml, Short connectiontype,
            Short n, Short m, Short single, Integer single2, String unitType,
            Float unitRatedkvar, Float unitCapacitance, Float unitRatedkv,
            String ptModel, String ptRatio, Float ptRatedkva, Float ptRatedkv,
            Float maximumkvar, Float minimumkvar, Short adjusttype,
            Short groupnum, String groupCapacity, Float basecurrent,
            String remark, String company, Float ratioofreactance) {
        super();
        this.id = id;
        this.name = name;
        this.substation = substation;
        this.description = description;
        this.factory = factory;
        this.model = model;
        this.type = type;
        this.voltagelevel = voltagelevel;
        this.ratedkv = ratedkv;
        this.ratedkvar = ratedkvar;
        this.capacitanceuf = capacitanceuf;
        this.inductanceml = inductanceml;
        this.connectiontype = connectiontype;
        this.n = n;
        this.m = m;
        NSingle = single;
        MSingle = single2;
        this.unitType = unitType;
        this.unitRatedkvar = unitRatedkvar;
        this.unitCapacitance = unitCapacitance;
        this.unitRatedkv = unitRatedkv;
        this.ptModel = ptModel;
        this.ptRatio = ptRatio;
        this.ptRatedkva = ptRatedkva;
        this.ptRatedkv = ptRatedkv;
        this.maximumkvar = maximumkvar;
        this.minimumkvar = minimumkvar;
        this.adjusttype = adjusttype;
        this.groupnum = groupnum;
        this.groupCapacity = groupCapacity;
        this.basecurrent = basecurrent;
        this.remark = remark;
        this.company = company;
        this.ratioofreactance = ratioofreactance;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubstation() {
        return this.substation;
    }

    public void setSubstation(String substation) {
        this.substation = substation;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFactory() {
        return this.factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Short getType() {
        return this.type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public Float getVoltagelevel() {
        return this.voltagelevel;
    }

    public void setVoltagelevel(Float voltagelevel) {
        this.voltagelevel = voltagelevel;
    }

    public Float getRatedkv() {
        return this.ratedkv;
    }

    public void setRatedkv(Float ratedkv) {
        this.ratedkv = ratedkv;
    }

    public Float getRatedkvar() {
        return this.ratedkvar;
    }

    public void setRatedkvar(Float ratedkvar) {
        this.ratedkvar = ratedkvar;
    }

    public Float getCapacitanceuf() {
        return this.capacitanceuf;
    }

    public void setCapacitanceuf(Float capacitanceuf) {
        this.capacitanceuf = capacitanceuf;
    }

    public Float getInductanceml() {
        return this.inductanceml;
    }

    public void setInductanceml(Float inductanceml) {
        this.inductanceml = inductanceml;
    }

    public Short getConnectiontype() {
        return this.connectiontype;
    }

    public void setConnectiontype(Short connectiontype) {
        this.connectiontype = connectiontype;
    }

    public Short getN() {
        return this.n;
    }

    public void setN(Short n) {
        this.n = n;
    }

    public Short getM() {
        return this.m;
    }

    public void setM(Short m) {
        this.m = m;
    }

    public Short getNSingle() {
        return this.NSingle;
    }

    public void setNSingle(Short NSingle) {
        this.NSingle = NSingle;
    }

    public Integer getMSingle() {
        return this.MSingle;
    }

    public void setMSingle(Integer MSingle) {
        this.MSingle = MSingle;
    }

    public String getUnitType() {
        return this.unitType;
    }

    public void setUnitType(String unitType) {
        this.unitType = unitType;
    }

    public Float getUnitRatedkvar() {
        return this.unitRatedkvar;
    }

    public void setUnitRatedkvar(Float unitRatedkvar) {
        this.unitRatedkvar = unitRatedkvar;
    }

    public Float getUnitCapacitance() {
        return this.unitCapacitance;
    }

    public void setUnitCapacitance(Float unitCapacitance) {
        this.unitCapacitance = unitCapacitance;
    }

    public Float getUnitRatedkv() {
        return this.unitRatedkv;
    }

    public void setUnitRatedkv(Float unitRatedkv) {
        this.unitRatedkv = unitRatedkv;
    }

    public String getPtModel() {
        return this.ptModel;
    }

    public void setPtModel(String ptModel) {
        this.ptModel = ptModel;
    }

    public String getPtRatio() {
        return this.ptRatio;
    }

    public void setPtRatio(String ptRatio) {
        this.ptRatio = ptRatio;
    }

    public Float getPtRatedkva() {
        return this.ptRatedkva;
    }

    public void setPtRatedkva(Float ptRatedkva) {
        this.ptRatedkva = ptRatedkva;
    }

    public Float getPtRatedkv() {
        return this.ptRatedkv;
    }

    public void setPtRatedkv(Float ptRatedkv) {
        this.ptRatedkv = ptRatedkv;
    }

    public Float getMaximumkvar() {
        return this.maximumkvar;
    }

    public void setMaximumkvar(Float maximumkvar) {
        this.maximumkvar = maximumkvar;
    }

    public Float getMinimumkvar() {
        return this.minimumkvar;
    }

    public void setMinimumkvar(Float minimumkvar) {
        this.minimumkvar = minimumkvar;
    }

    public Short getAdjusttype() {
        return this.adjusttype;
    }

    public void setAdjusttype(Short adjusttype) {
        this.adjusttype = adjusttype;
    }

    public Short getGroupnum() {
        return this.groupnum;
    }

    public void setGroupnum(Short groupnum) {
        this.groupnum = groupnum;
    }

    public String getGroupCapacity() {
        return this.groupCapacity;
    }

    public void setGroupCapacity(String groupCapacity) {
        this.groupCapacity = groupCapacity;
    }

    public Float getBasecurrent() {
        return this.basecurrent;
    }

    public void setBasecurrent(Float basecurrent) {
        this.basecurrent = basecurrent;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCompany() {
        return this.company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Float getRatioofreactance() {
        return this.ratioofreactance;
    }

    public void setRatioofreactance(Float ratioofreactance) {
        this.ratioofreactance = ratioofreactance;
    }

}