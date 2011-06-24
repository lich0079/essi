package com.joinbright.grsm.model.project;

/**
 * Synchronousmachine entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Synchronousmachine extends com.joinbright.grsm.model.BaseModel
        implements java.io.Serializable {

    // Fields

    private String id;
    private String name;
    private String substation;
    private String description;
    private String factory;
    private String model;
    private Short type;
    private Float voltagelevel;
    private Short thinkofu0conversion;
    private Float ratedmva;
    private Float ratedmw;
    private Float ratedpowerfactor;
    private Float ratedkv;
    private Float voltageamplitude;
    private Float voltageangle;
    private Short earthed;
    private Float r;
    private Float r2;
    private Float r0;
    private Float x;
    private Float x2;
    private Float x0;
    private Float xdirectsync;
    private Float xdirecttrans;
    private Float xquadsync;
    private Float xquadtrans;
    private Float xquadsubtrans;
    private Float RPu;
    private Float r2Pu;
    private Float r0Pu;
    private Float XPu;
    private Float x2Pu;
    private Float x0Pu;
    private Float xdirecttransPu;
    private Float xdirectsyncPu;
    private Float xquadsyncPu;
    private Float xquadtransPu;
    private Float xquadsubtransPu;
    private Float statorrateda;
    private String statorconnectiontype;
    private Short statorcoolingtype;
    private Float rotorratedv;
    private Float rotorrateda;
    private Float noloadexcitationratedkv;
    private Float noloadexcitationrateda;
    private Short rotorpolenum;
    private String rotorexcitationtype;
    private Short rotorcoolingtype;
    private Float rotorexcitationmultiple;
    private Float turninertiajyma;
    private Float turninertiajf;
    private String adjustexcitationtype;
    private Float timeta;
    private Float timetd1;
    private Float timetd2;
    private Float maximumgeneratormw;
    private Float minimumgeneratormw;
    private Float maximumgeneratormvar;
    private Float minimumgeneratormvar;
    private Float generatormw;
    private Float generatormvar;
    private Float economicparametera;
    private Float economicparameterb;
    private Float economicparameterc;
    private Float basecurrent;
    private String remark;
    private String company;

    // Constructors

    /** default constructor */
    public Synchronousmachine() {
    }


    // Property accessors

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public Synchronousmachine(String id, String name, String substation,
            String description, String factory, String model, Short type,
            Float voltagelevel, Short thinkofu0conversion, Float ratedmva,
            Float ratedmw, Float ratedpowerfactor, Float ratedkv,
            Float voltageamplitude, Float voltageangle, Short earthed, Float r,
            Float r2, Float r0, Float x, Float x2, Float x0, Float xdirectsync,
            Float xdirecttrans, Float xquadsync, Float xquadtrans,
            Float xquadsubtrans, Float pu, Float pu2, Float pu3, Float pu4,
            Float pu5, Float pu6, Float xdirecttransPu, Float xdirectsyncPu,
            Float xquadsyncPu, Float xquadtransPu, Float xquadsubtransPu,
            Float statorrateda, String statorconnectiontype,
            Short statorcoolingtype, Float rotorratedv, Float rotorrateda,
            Float noloadexcitationratedkv, Float noloadexcitationrateda,
            Short rotorpolenum, String rotorexcitationtype,
            Short rotorcoolingtype, Float rotorexcitationmultiple,
            Float turninertiajyma, Float turninertiajf,
            String adjustexcitationtype, Float timeta, Float timetd1,
            Float timetd2, Float maximumgeneratormw, Float minimumgeneratormw,
            Float maximumgeneratormvar, Float minimumgeneratormvar,
            Float generatormw, Float generatormvar, Float economicparametera,
            Float economicparameterb, Float economicparameterc,
            Float basecurrent, String remark, String company) {
        super();
        this.id = id;
        this.name = name;
        this.substation = substation;
        this.description = description;
        this.factory = factory;
        this.model = model;
        this.type = type;
        this.voltagelevel = voltagelevel;
        this.thinkofu0conversion = thinkofu0conversion;
        this.ratedmva = ratedmva;
        this.ratedmw = ratedmw;
        this.ratedpowerfactor = ratedpowerfactor;
        this.ratedkv = ratedkv;
        this.voltageamplitude = voltageamplitude;
        this.voltageangle = voltageangle;
        this.earthed = earthed;
        this.r = r;
        this.r2 = r2;
        this.r0 = r0;
        this.x = x;
        this.x2 = x2;
        this.x0 = x0;
        this.xdirectsync = xdirectsync;
        this.xdirecttrans = xdirecttrans;
        this.xquadsync = xquadsync;
        this.xquadtrans = xquadtrans;
        this.xquadsubtrans = xquadsubtrans;
        RPu = pu;
        r2Pu = pu2;
        r0Pu = pu3;
        XPu = pu4;
        x2Pu = pu5;
        x0Pu = pu6;
        this.xdirecttransPu = xdirecttransPu;
        this.xdirectsyncPu = xdirectsyncPu;
        this.xquadsyncPu = xquadsyncPu;
        this.xquadtransPu = xquadtransPu;
        this.xquadsubtransPu = xquadsubtransPu;
        this.statorrateda = statorrateda;
        this.statorconnectiontype = statorconnectiontype;
        this.statorcoolingtype = statorcoolingtype;
        this.rotorratedv = rotorratedv;
        this.rotorrateda = rotorrateda;
        this.noloadexcitationratedkv = noloadexcitationratedkv;
        this.noloadexcitationrateda = noloadexcitationrateda;
        this.rotorpolenum = rotorpolenum;
        this.rotorexcitationtype = rotorexcitationtype;
        this.rotorcoolingtype = rotorcoolingtype;
        this.rotorexcitationmultiple = rotorexcitationmultiple;
        this.turninertiajyma = turninertiajyma;
        this.turninertiajf = turninertiajf;
        this.adjustexcitationtype = adjustexcitationtype;
        this.timeta = timeta;
        this.timetd1 = timetd1;
        this.timetd2 = timetd2;
        this.maximumgeneratormw = maximumgeneratormw;
        this.minimumgeneratormw = minimumgeneratormw;
        this.maximumgeneratormvar = maximumgeneratormvar;
        this.minimumgeneratormvar = minimumgeneratormvar;
        this.generatormw = generatormw;
        this.generatormvar = generatormvar;
        this.economicparametera = economicparametera;
        this.economicparameterb = economicparameterb;
        this.economicparameterc = economicparameterc;
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

    public Short getThinkofu0conversion() {
        return this.thinkofu0conversion;
    }

    public void setThinkofu0conversion(Short thinkofu0conversion) {
        this.thinkofu0conversion = thinkofu0conversion;
    }

    public Float getRatedmva() {
        return this.ratedmva;
    }

    public void setRatedmva(Float ratedmva) {
        this.ratedmva = ratedmva;
    }

    public Float getRatedmw() {
        return this.ratedmw;
    }

    public void setRatedmw(Float ratedmw) {
        this.ratedmw = ratedmw;
    }

    public Float getRatedpowerfactor() {
        return this.ratedpowerfactor;
    }

    public void setRatedpowerfactor(Float ratedpowerfactor) {
        this.ratedpowerfactor = ratedpowerfactor;
    }

    public Float getRatedkv() {
        return this.ratedkv;
    }

    public void setRatedkv(Float ratedkv) {
        this.ratedkv = ratedkv;
    }

    public Float getVoltageamplitude() {
        return this.voltageamplitude;
    }

    public void setVoltageamplitude(Float voltageamplitude) {
        this.voltageamplitude = voltageamplitude;
    }

    public Float getVoltageangle() {
        return this.voltageangle;
    }

    public void setVoltageangle(Float voltageangle) {
        this.voltageangle = voltageangle;
    }

    public Short getEarthed() {
        return this.earthed;
    }

    public void setEarthed(Short earthed) {
        this.earthed = earthed;
    }

    public Float getR() {
        return this.r;
    }

    public void setR(Float r) {
        this.r = r;
    }

    public Float getR2() {
        return this.r2;
    }

    public void setR2(Float r2) {
        this.r2 = r2;
    }

    public Float getR0() {
        return this.r0;
    }

    public void setR0(Float r0) {
        this.r0 = r0;
    }

    public Float getX() {
        return this.x;
    }

    public void setX(Float x) {
        this.x = x;
    }

    public Float getX2() {
        return this.x2;
    }

    public void setX2(Float x2) {
        this.x2 = x2;
    }

    public Float getX0() {
        return this.x0;
    }

    public void setX0(Float x0) {
        this.x0 = x0;
    }

    public Float getXdirectsync() {
        return this.xdirectsync;
    }

    public void setXdirectsync(Float xdirectsync) {
        this.xdirectsync = xdirectsync;
    }

    public Float getXdirecttrans() {
        return this.xdirecttrans;
    }

    public void setXdirecttrans(Float xdirecttrans) {
        this.xdirecttrans = xdirecttrans;
    }

    public Float getXquadsync() {
        return this.xquadsync;
    }

    public void setXquadsync(Float xquadsync) {
        this.xquadsync = xquadsync;
    }

    public Float getXquadtrans() {
        return this.xquadtrans;
    }

    public void setXquadtrans(Float xquadtrans) {
        this.xquadtrans = xquadtrans;
    }

    public Float getXquadsubtrans() {
        return this.xquadsubtrans;
    }

    public void setXquadsubtrans(Float xquadsubtrans) {
        this.xquadsubtrans = xquadsubtrans;
    }

    public Float getRPu() {
        return this.RPu;
    }

    public void setRPu(Float RPu) {
        this.RPu = RPu;
    }

    public Float getR2Pu() {
        return this.r2Pu;
    }

    public void setR2Pu(Float r2Pu) {
        this.r2Pu = r2Pu;
    }

    public Float getR0Pu() {
        return this.r0Pu;
    }

    public void setR0Pu(Float r0Pu) {
        this.r0Pu = r0Pu;
    }

    public Float getXPu() {
        return this.XPu;
    }

    public void setXPu(Float XPu) {
        this.XPu = XPu;
    }

    public Float getX2Pu() {
        return this.x2Pu;
    }

    public void setX2Pu(Float x2Pu) {
        this.x2Pu = x2Pu;
    }

    public Float getX0Pu() {
        return this.x0Pu;
    }

    public void setX0Pu(Float x0Pu) {
        this.x0Pu = x0Pu;
    }

    public Float getXdirecttransPu() {
        return this.xdirecttransPu;
    }

    public void setXdirecttransPu(Float xdirecttransPu) {
        this.xdirecttransPu = xdirecttransPu;
    }

    public Float getXdirectsyncPu() {
        return this.xdirectsyncPu;
    }

    public void setXdirectsyncPu(Float xdirectsyncPu) {
        this.xdirectsyncPu = xdirectsyncPu;
    }

    public Float getXquadsyncPu() {
        return this.xquadsyncPu;
    }

    public void setXquadsyncPu(Float xquadsyncPu) {
        this.xquadsyncPu = xquadsyncPu;
    }

    public Float getXquadtransPu() {
        return this.xquadtransPu;
    }

    public void setXquadtransPu(Float xquadtransPu) {
        this.xquadtransPu = xquadtransPu;
    }

    public Float getXquadsubtransPu() {
        return this.xquadsubtransPu;
    }

    public void setXquadsubtransPu(Float xquadsubtransPu) {
        this.xquadsubtransPu = xquadsubtransPu;
    }

    public Float getStatorrateda() {
        return this.statorrateda;
    }

    public void setStatorrateda(Float statorrateda) {
        this.statorrateda = statorrateda;
    }

    public String getStatorconnectiontype() {
        return this.statorconnectiontype;
    }

    public void setStatorconnectiontype(String statorconnectiontype) {
        this.statorconnectiontype = statorconnectiontype;
    }

    public Short getStatorcoolingtype() {
        return this.statorcoolingtype;
    }

    public void setStatorcoolingtype(Short statorcoolingtype) {
        this.statorcoolingtype = statorcoolingtype;
    }

    public Float getRotorratedv() {
        return this.rotorratedv;
    }

    public void setRotorratedv(Float rotorratedv) {
        this.rotorratedv = rotorratedv;
    }

    public Float getRotorrateda() {
        return this.rotorrateda;
    }

    public void setRotorrateda(Float rotorrateda) {
        this.rotorrateda = rotorrateda;
    }

    public Float getNoloadexcitationratedkv() {
        return this.noloadexcitationratedkv;
    }

    public void setNoloadexcitationratedkv(Float noloadexcitationratedkv) {
        this.noloadexcitationratedkv = noloadexcitationratedkv;
    }

    public Float getNoloadexcitationrateda() {
        return this.noloadexcitationrateda;
    }

    public void setNoloadexcitationrateda(Float noloadexcitationrateda) {
        this.noloadexcitationrateda = noloadexcitationrateda;
    }

    public Short getRotorpolenum() {
        return this.rotorpolenum;
    }

    public void setRotorpolenum(Short rotorpolenum) {
        this.rotorpolenum = rotorpolenum;
    }

    public String getRotorexcitationtype() {
        return this.rotorexcitationtype;
    }

    public void setRotorexcitationtype(String rotorexcitationtype) {
        this.rotorexcitationtype = rotorexcitationtype;
    }

    public Short getRotorcoolingtype() {
        return this.rotorcoolingtype;
    }

    public void setRotorcoolingtype(Short rotorcoolingtype) {
        this.rotorcoolingtype = rotorcoolingtype;
    }

    public Float getRotorexcitationmultiple() {
        return this.rotorexcitationmultiple;
    }

    public void setRotorexcitationmultiple(Float rotorexcitationmultiple) {
        this.rotorexcitationmultiple = rotorexcitationmultiple;
    }

    public Float getTurninertiajyma() {
        return this.turninertiajyma;
    }

    public void setTurninertiajyma(Float turninertiajyma) {
        this.turninertiajyma = turninertiajyma;
    }

    public Float getTurninertiajf() {
        return this.turninertiajf;
    }

    public void setTurninertiajf(Float turninertiajf) {
        this.turninertiajf = turninertiajf;
    }

    public String getAdjustexcitationtype() {
        return this.adjustexcitationtype;
    }

    public void setAdjustexcitationtype(String adjustexcitationtype) {
        this.adjustexcitationtype = adjustexcitationtype;
    }

    public Float getTimeta() {
        return this.timeta;
    }

    public void setTimeta(Float timeta) {
        this.timeta = timeta;
    }

    public Float getTimetd1() {
        return this.timetd1;
    }

    public void setTimetd1(Float timetd1) {
        this.timetd1 = timetd1;
    }

    public Float getTimetd2() {
        return this.timetd2;
    }

    public void setTimetd2(Float timetd2) {
        this.timetd2 = timetd2;
    }

    public Float getMaximumgeneratormw() {
        return this.maximumgeneratormw;
    }

    public void setMaximumgeneratormw(Float maximumgeneratormw) {
        this.maximumgeneratormw = maximumgeneratormw;
    }

    public Float getMinimumgeneratormw() {
        return this.minimumgeneratormw;
    }

    public void setMinimumgeneratormw(Float minimumgeneratormw) {
        this.minimumgeneratormw = minimumgeneratormw;
    }

    public Float getMaximumgeneratormvar() {
        return this.maximumgeneratormvar;
    }

    public void setMaximumgeneratormvar(Float maximumgeneratormvar) {
        this.maximumgeneratormvar = maximumgeneratormvar;
    }

    public Float getMinimumgeneratormvar() {
        return this.minimumgeneratormvar;
    }

    public void setMinimumgeneratormvar(Float minimumgeneratormvar) {
        this.minimumgeneratormvar = minimumgeneratormvar;
    }

    public Float getGeneratormw() {
        return this.generatormw;
    }

    public void setGeneratormw(Float generatormw) {
        this.generatormw = generatormw;
    }

    public Float getGeneratormvar() {
        return this.generatormvar;
    }

    public void setGeneratormvar(Float generatormvar) {
        this.generatormvar = generatormvar;
    }

    public Float getEconomicparametera() {
        return this.economicparametera;
    }

    public void setEconomicparametera(Float economicparametera) {
        this.economicparametera = economicparametera;
    }

    public Float getEconomicparameterb() {
        return this.economicparameterb;
    }

    public void setEconomicparameterb(Float economicparameterb) {
        this.economicparameterb = economicparameterb;
    }

    public Float getEconomicparameterc() {
        return this.economicparameterc;
    }

    public void setEconomicparameterc(Float economicparameterc) {
        this.economicparameterc = economicparameterc;
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