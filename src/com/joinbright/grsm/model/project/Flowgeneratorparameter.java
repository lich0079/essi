package com.joinbright.grsm.model.project;

/**
 * Flowgeneratorparameter entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Flowgeneratorparameter extends com.joinbright.grsm.model.BaseModel
        implements java.io.Serializable {

    // Fields

    private String runway;
    private Short nodeid;
    private String busid;
    private Float maximumgeneratormwPu;
    private Float minimumgeneratormwPu;
    private Float maximumgeneratormvarPu;
    private Float minimumgeneratormvarPu;
    private Float economicparametera;
    private Float economicparameterb;
    private Float economicparameterc;

    // Constructors

    /** default constructor */
    public Flowgeneratorparameter() {
    }

    public String getRunway() {
        return runway;
    }

    public void setRunway(String runway) {
        this.runway = runway;
    }

    public Short getNodeid() {
        return nodeid;
    }

    public void setNodeid(Short nodeid) {
        this.nodeid = nodeid;
    }

    public String getBusid() {
        return busid;
    }

    public void setBusid(String busid) {
        this.busid = busid;
    }

    public Float getMaximumgeneratormwPu() {
        return maximumgeneratormwPu;
    }

    public void setMaximumgeneratormwPu(Float maximumgeneratormwPu) {
        this.maximumgeneratormwPu = maximumgeneratormwPu;
    }

    public Float getMinimumgeneratormwPu() {
        return minimumgeneratormwPu;
    }

    public void setMinimumgeneratormwPu(Float minimumgeneratormwPu) {
        this.minimumgeneratormwPu = minimumgeneratormwPu;
    }

    public Float getMaximumgeneratormvarPu() {
        return maximumgeneratormvarPu;
    }

    public void setMaximumgeneratormvarPu(Float maximumgeneratormvarPu) {
        this.maximumgeneratormvarPu = maximumgeneratormvarPu;
    }

    public Float getMinimumgeneratormvarPu() {
        return minimumgeneratormvarPu;
    }

    public void setMinimumgeneratormvarPu(Float minimumgeneratormvarPu) {
        this.minimumgeneratormvarPu = minimumgeneratormvarPu;
    }

    public Float getEconomicparametera() {
        return economicparametera;
    }

    public void setEconomicparametera(Float economicparametera) {
        this.economicparametera = economicparametera;
    }

    public Float getEconomicparameterb() {
        return economicparameterb;
    }

    public void setEconomicparameterb(Float economicparameterb) {
        this.economicparameterb = economicparameterb;
    }

    public Float getEconomicparameterc() {
        return economicparameterc;
    }

    public void setEconomicparameterc(Float economicparameterc) {
        this.economicparameterc = economicparameterc;
    }

    public Flowgeneratorparameter(String runway, Short nodeid, String busid,
            Float maximumgeneratormwPu, Float minimumgeneratormwPu,
            Float maximumgeneratormvarPu, Float minimumgeneratormvarPu,
            Float economicparametera, Float economicparameterb,
            Float economicparameterc) {
        super();
        this.runway = runway;
        this.nodeid = nodeid;
        this.busid = busid;
        this.maximumgeneratormwPu = maximumgeneratormwPu;
        this.minimumgeneratormwPu = minimumgeneratormwPu;
        this.maximumgeneratormvarPu = maximumgeneratormvarPu;
        this.minimumgeneratormvarPu = minimumgeneratormvarPu;
        this.economicparametera = economicparametera;
        this.economicparameterb = economicparameterb;
        this.economicparameterc = economicparameterc;
    }


}