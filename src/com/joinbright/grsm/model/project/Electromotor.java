package com.joinbright.grsm.model.project;

/**
 * Electromotor entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Electromotor extends com.joinbright.grsm.model.BaseModel implements
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
    private Float rateda;
    private Float ratedkw;
    private Float ratedpowerfactor;
    private Float ratedkva;
    private Short autostartup;
    private Float startupmultiple;
    private Short connectiontype;
    private Float startuptime;
    private Float allowblocktime;
    private Float basecurrent;
    private String remark;
    private String company;

    // Constructors

    /** default constructor */
    public Electromotor() {
    }


    // Property accessors

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Electromotor(String id, String name, String substation,
            String description, String factory, String model, Short type,
            Float voltagelevel, Float ratedkv, Float rateda, Float ratedkw,
            Float ratedpowerfactor, Float ratedkva, Short autostartup,
            Float startupmultiple, Short connectiontype, Float startuptime,
            Float allowblocktime, Float basecurrent, String remark,
            String company) {
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
        this.rateda = rateda;
        this.ratedkw = ratedkw;
        this.ratedpowerfactor = ratedpowerfactor;
        this.ratedkva = ratedkva;
        this.autostartup = autostartup;
        this.startupmultiple = startupmultiple;
        this.connectiontype = connectiontype;
        this.startuptime = startuptime;
        this.allowblocktime = allowblocktime;
        this.basecurrent = basecurrent;
        this.remark = remark;
        this.company = company;
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

    public Float getRateda() {
        return this.rateda;
    }

    public void setRateda(Float rateda) {
        this.rateda = rateda;
    }

    public Float getRatedkw() {
        return this.ratedkw;
    }

    public void setRatedkw(Float ratedkw) {
        this.ratedkw = ratedkw;
    }

    public Float getRatedpowerfactor() {
        return this.ratedpowerfactor;
    }

    public void setRatedpowerfactor(Float ratedpowerfactor) {
        this.ratedpowerfactor = ratedpowerfactor;
    }

    public Float getRatedkva() {
        return this.ratedkva;
    }

    public void setRatedkva(Float ratedkva) {
        this.ratedkva = ratedkva;
    }

    public Short getAutostartup() {
        return this.autostartup;
    }

    public void setAutostartup(Short autostartup) {
        this.autostartup = autostartup;
    }

    public Float getStartupmultiple() {
        return this.startupmultiple;
    }

    public void setStartupmultiple(Float startupmultiple) {
        this.startupmultiple = startupmultiple;
    }

    public Short getConnectiontype() {
        return this.connectiontype;
    }

    public void setConnectiontype(Short connectiontype) {
        this.connectiontype = connectiontype;
    }

    public Float getStartuptime() {
        return this.startuptime;
    }

    public void setStartuptime(Float startuptime) {
        this.startuptime = startuptime;
    }

    public Float getAllowblocktime() {
        return this.allowblocktime;
    }

    public void setAllowblocktime(Float allowblocktime) {
        this.allowblocktime = allowblocktime;
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

}