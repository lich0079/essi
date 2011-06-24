package com.joinbright.grsm.model.project;

/**
 * Powertransformer entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Powertransformer extends com.joinbright.grsm.model.BaseModel
        implements java.io.Serializable {

    // Fields

    private String id;
    private String name;
    private String substation;
    private String description;
    private String factory;
    private String model;
    private Short type;
    private Float HVoltagelevel;
    private Float MVoltagelevel;
    private Float LVoltagelevel;
    private Float FVoltagelevel;
    private Float HRatedkv;
    private Float MRatedkv;
    private Float LRatedkv;
    private Float FRatedkv;
    private Float HRatedmva;
    private Float MRatedmva;
    private Float LRatedmva;
    private String HConnectiontype;
    private String MConnectiontype;
    private String LConnectiontype;
    private String FConnectiontype;
    private Short junctionclock;
    private Float HMLeakageimpedance;
    private Float HLLeakageimpedance;
    private Float MLLeakageimpedance;
    private Float halfimpedance;
    private Float allimpedance;
    private Float splitimpedance;
    private Float splitfactor;
    private Float xa;
    private Float xb;
    private Float xc;
    private String x0cal;
    private Float x0a;
    private Float x0b;
    private Float x0c;
    private Float x0d;
    private Float HMLoss;
    private Float HLLoss;
    private Float MLLoss;
    private Float maxloss;
    private Float noloadloss;
    private Float noloadcurrentpercent;
    private Float losstype;
    private Float x1x0ratio;
    private Integer xcalculationtype;
    private Integer x0calculationtype;
    private Short thinkofu1conversion;
    private Short thinkofu0conversion;
    private Float HRPu;
    private Float MRPu;
    private Float LRPu;
    private Float HR0Pu;
    private Float MR0Pu;
    private Float LR0Pu;
    private Float HXPu;
    private Float MXPu;
    private Float LXPu;
    private Float HX0Pu;
    private Float MX0Pu;
    private Float LX0Pu;
    private Float FX0Pu;
    private Float gchPu;
    private Float bchPu;
    private Float HEarthR0;
    private Float MEarthR0;
    private Float LEarthR0;
    private Float HEarthX0;
    private Float MEarthX0;
    private Float LEarthX0;
    private String adjustvoltagetype;
    private String tranfcoolingtype;
    private String ironcoreframe;
    private Short thinkofoverhaul;
    private Float HTabdelta;
    private Float MTabdelta;
    private Short HTabposition;
    private Short MTabposition;
    private Short HTabmaximumnum;
    private Short MTabmaximumnum;
    private Short HTabminimumnum;
    private Short MTabminimumnum;
    private Float HTabratedkv;
    private Float MTabratedkv;
    private Float LTabratedkv;
    private Float HMaximumkv;
    private Float HMinimumkv;
    private Float MMaximumkv;
    private Float MMinimumkv;
    private Float HRatio;
    private Float MRatio;
    private Float LRatio;
    private Float HMaximumratio;
    private Float HMinimumratio;
    private Float MMaximumratio;
    private Float MMinimumratio;
    private Float LMaximumratio;
    private Float LMinimumratio;
    private Float HOpfratio;
    private Float MOpfratio;
    private Float HBasecurrent;
    private Float MBasecurrent;
    private Float LBasecurrent;
    private String remark;
    private String company;

    // Constructors

    /** default constructor */
    public Powertransformer() {
    }


    // Property accessors

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Float getHVoltagelevel() {
        return this.HVoltagelevel;
    }

    public void setHVoltagelevel(Float HVoltagelevel) {
        this.HVoltagelevel = HVoltagelevel;
    }

    public Float getMVoltagelevel() {
        return this.MVoltagelevel;
    }

    public void setMVoltagelevel(Float MVoltagelevel) {
        this.MVoltagelevel = MVoltagelevel;
    }

    public Float getLVoltagelevel() {
        return this.LVoltagelevel;
    }

    public void setLVoltagelevel(Float LVoltagelevel) {
        this.LVoltagelevel = LVoltagelevel;
    }

    public Float getFVoltagelevel() {
        return this.FVoltagelevel;
    }

    public void setFVoltagelevel(Float FVoltagelevel) {
        this.FVoltagelevel = FVoltagelevel;
    }

    public Float getHRatedkv() {
        return this.HRatedkv;
    }

    public void setHRatedkv(Float HRatedkv) {
        this.HRatedkv = HRatedkv;
    }

    public Float getMRatedkv() {
        return this.MRatedkv;
    }

    public void setMRatedkv(Float MRatedkv) {
        this.MRatedkv = MRatedkv;
    }

    public Float getLRatedkv() {
        return this.LRatedkv;
    }

    public void setLRatedkv(Float LRatedkv) {
        this.LRatedkv = LRatedkv;
    }

    public Float getFRatedkv() {
        return this.FRatedkv;
    }

    public void setFRatedkv(Float FRatedkv) {
        this.FRatedkv = FRatedkv;
    }

    public Float getHRatedmva() {
        return this.HRatedmva;
    }

    public void setHRatedmva(Float HRatedmva) {
        this.HRatedmva = HRatedmva;
    }

    public Float getMRatedmva() {
        return this.MRatedmva;
    }

    public void setMRatedmva(Float MRatedmva) {
        this.MRatedmva = MRatedmva;
    }

    public Float getLRatedmva() {
        return this.LRatedmva;
    }

    public void setLRatedmva(Float LRatedmva) {
        this.LRatedmva = LRatedmva;
    }

    public String getHConnectiontype() {
        return this.HConnectiontype;
    }

    public void setHConnectiontype(String HConnectiontype) {
        this.HConnectiontype = HConnectiontype;
    }

    public String getMConnectiontype() {
        return this.MConnectiontype;
    }

    public void setMConnectiontype(String MConnectiontype) {
        this.MConnectiontype = MConnectiontype;
    }

    public String getLConnectiontype() {
        return this.LConnectiontype;
    }

    public void setLConnectiontype(String LConnectiontype) {
        this.LConnectiontype = LConnectiontype;
    }

    public String getFConnectiontype() {
        return this.FConnectiontype;
    }

    public void setFConnectiontype(String FConnectiontype) {
        this.FConnectiontype = FConnectiontype;
    }

    public Short getJunctionclock() {
        return this.junctionclock;
    }

    public void setJunctionclock(Short junctionclock) {
        this.junctionclock = junctionclock;
    }

    public Float getHMLeakageimpedance() {
        return this.HMLeakageimpedance;
    }

    public void setHMLeakageimpedance(Float HMLeakageimpedance) {
        this.HMLeakageimpedance = HMLeakageimpedance;
    }

    public Float getHLLeakageimpedance() {
        return this.HLLeakageimpedance;
    }

    public void setHLLeakageimpedance(Float HLLeakageimpedance) {
        this.HLLeakageimpedance = HLLeakageimpedance;
    }

    public Float getMLLeakageimpedance() {
        return this.MLLeakageimpedance;
    }

    public void setMLLeakageimpedance(Float MLLeakageimpedance) {
        this.MLLeakageimpedance = MLLeakageimpedance;
    }

    public Float getHalfimpedance() {
        return this.halfimpedance;
    }

    public void setHalfimpedance(Float halfimpedance) {
        this.halfimpedance = halfimpedance;
    }

    public Float getAllimpedance() {
        return this.allimpedance;
    }

    public void setAllimpedance(Float allimpedance) {
        this.allimpedance = allimpedance;
    }

    public Float getSplitimpedance() {
        return this.splitimpedance;
    }

    public void setSplitimpedance(Float splitimpedance) {
        this.splitimpedance = splitimpedance;
    }

    public Float getSplitfactor() {
        return this.splitfactor;
    }

    public void setSplitfactor(Float splitfactor) {
        this.splitfactor = splitfactor;
    }

    public Float getXa() {
        return this.xa;
    }

    public void setXa(Float xa) {
        this.xa = xa;
    }

    public Float getXb() {
        return this.xb;
    }

    public void setXb(Float xb) {
        this.xb = xb;
    }

    public Float getXc() {
        return this.xc;
    }

    public void setXc(Float xc) {
        this.xc = xc;
    }

    public String getX0cal() {
        return this.x0cal;
    }

    public void setX0cal(String x0cal) {
        this.x0cal = x0cal;
    }

    public Float getX0a() {
        return this.x0a;
    }

    public void setX0a(Float x0a) {
        this.x0a = x0a;
    }

    public Float getX0b() {
        return this.x0b;
    }

    public void setX0b(Float x0b) {
        this.x0b = x0b;
    }

    public Float getX0c() {
        return this.x0c;
    }

    public void setX0c(Float x0c) {
        this.x0c = x0c;
    }

    public Float getX0d() {
        return this.x0d;
    }

    public void setX0d(Float x0d) {
        this.x0d = x0d;
    }

    public Float getHMLoss() {
        return this.HMLoss;
    }

    public void setHMLoss(Float HMLoss) {
        this.HMLoss = HMLoss;
    }

    public Float getHLLoss() {
        return this.HLLoss;
    }

    public void setHLLoss(Float HLLoss) {
        this.HLLoss = HLLoss;
    }

    public Float getMLLoss() {
        return this.MLLoss;
    }

    public void setMLLoss(Float MLLoss) {
        this.MLLoss = MLLoss;
    }

    public Float getMaxloss() {
        return this.maxloss;
    }

    public void setMaxloss(Float maxloss) {
        this.maxloss = maxloss;
    }

    public Float getNoloadloss() {
        return this.noloadloss;
    }

    public void setNoloadloss(Float noloadloss) {
        this.noloadloss = noloadloss;
    }

    public Float getNoloadcurrentpercent() {
        return this.noloadcurrentpercent;
    }

    public void setNoloadcurrentpercent(Float noloadcurrentpercent) {
        this.noloadcurrentpercent = noloadcurrentpercent;
    }

    public Float getLosstype() {
        return this.losstype;
    }

    public void setLosstype(Float losstype) {
        this.losstype = losstype;
    }

    public Float getX1x0ratio() {
        return this.x1x0ratio;
    }

    public void setX1x0ratio(Float x1x0ratio) {
        this.x1x0ratio = x1x0ratio;
    }

    public Integer getXcalculationtype() {
        return this.xcalculationtype;
    }

    public void setXcalculationtype(Integer xcalculationtype) {
        this.xcalculationtype = xcalculationtype;
    }

    public Integer getX0calculationtype() {
        return this.x0calculationtype;
    }

    public void setX0calculationtype(Integer x0calculationtype) {
        this.x0calculationtype = x0calculationtype;
    }

    public Short getThinkofu1conversion() {
        return this.thinkofu1conversion;
    }

    public void setThinkofu1conversion(Short thinkofu1conversion) {
        this.thinkofu1conversion = thinkofu1conversion;
    }

    public Short getThinkofu0conversion() {
        return this.thinkofu0conversion;
    }

    public void setThinkofu0conversion(Short thinkofu0conversion) {
        this.thinkofu0conversion = thinkofu0conversion;
    }

    public Float getHRPu() {
        return this.HRPu;
    }

    public void setHRPu(Float HRPu) {
        this.HRPu = HRPu;
    }

    public Float getMRPu() {
        return this.MRPu;
    }

    public void setMRPu(Float MRPu) {
        this.MRPu = MRPu;
    }

    public Float getLRPu() {
        return this.LRPu;
    }

    public void setLRPu(Float LRPu) {
        this.LRPu = LRPu;
    }

    public Float getHR0Pu() {
        return this.HR0Pu;
    }

    public void setHR0Pu(Float HR0Pu) {
        this.HR0Pu = HR0Pu;
    }

    public Float getMR0Pu() {
        return this.MR0Pu;
    }

    public void setMR0Pu(Float MR0Pu) {
        this.MR0Pu = MR0Pu;
    }

    public Float getLR0Pu() {
        return this.LR0Pu;
    }

    public void setLR0Pu(Float LR0Pu) {
        this.LR0Pu = LR0Pu;
    }

    public Float getHXPu() {
        return this.HXPu;
    }

    public void setHXPu(Float HXPu) {
        this.HXPu = HXPu;
    }

    public Float getMXPu() {
        return this.MXPu;
    }

    public void setMXPu(Float MXPu) {
        this.MXPu = MXPu;
    }

    public Float getLXPu() {
        return this.LXPu;
    }

    public void setLXPu(Float LXPu) {
        this.LXPu = LXPu;
    }

    public Float getHX0Pu() {
        return this.HX0Pu;
    }

    public void setHX0Pu(Float HX0Pu) {
        this.HX0Pu = HX0Pu;
    }

    public Float getMX0Pu() {
        return this.MX0Pu;
    }

    public void setMX0Pu(Float MX0Pu) {
        this.MX0Pu = MX0Pu;
    }

    public Float getLX0Pu() {
        return this.LX0Pu;
    }

    public void setLX0Pu(Float LX0Pu) {
        this.LX0Pu = LX0Pu;
    }

    public Float getFX0Pu() {
        return this.FX0Pu;
    }

    public void setFX0Pu(Float FX0Pu) {
        this.FX0Pu = FX0Pu;
    }

    public Float getGchPu() {
        return this.gchPu;
    }

    public void setGchPu(Float gchPu) {
        this.gchPu = gchPu;
    }

    public Float getBchPu() {
        return this.bchPu;
    }

    public void setBchPu(Float bchPu) {
        this.bchPu = bchPu;
    }

    public Float getHEarthR0() {
        return this.HEarthR0;
    }

    public void setHEarthR0(Float HEarthR0) {
        this.HEarthR0 = HEarthR0;
    }

    public Float getMEarthR0() {
        return this.MEarthR0;
    }

    public void setMEarthR0(Float MEarthR0) {
        this.MEarthR0 = MEarthR0;
    }

    public Float getLEarthR0() {
        return this.LEarthR0;
    }

    public void setLEarthR0(Float LEarthR0) {
        this.LEarthR0 = LEarthR0;
    }

    public Float getHEarthX0() {
        return this.HEarthX0;
    }

    public void setHEarthX0(Float HEarthX0) {
        this.HEarthX0 = HEarthX0;
    }

    public Float getMEarthX0() {
        return this.MEarthX0;
    }

    public void setMEarthX0(Float MEarthX0) {
        this.MEarthX0 = MEarthX0;
    }

    public Float getLEarthX0() {
        return this.LEarthX0;
    }

    public void setLEarthX0(Float LEarthX0) {
        this.LEarthX0 = LEarthX0;
    }

    public String getAdjustvoltagetype() {
        return this.adjustvoltagetype;
    }

    public void setAdjustvoltagetype(String adjustvoltagetype) {
        this.adjustvoltagetype = adjustvoltagetype;
    }

    public String getTranfcoolingtype() {
        return this.tranfcoolingtype;
    }

    public void setTranfcoolingtype(String tranfcoolingtype) {
        this.tranfcoolingtype = tranfcoolingtype;
    }

    public String getIroncoreframe() {
        return this.ironcoreframe;
    }

    public void setIroncoreframe(String ironcoreframe) {
        this.ironcoreframe = ironcoreframe;
    }

    public Short getThinkofoverhaul() {
        return this.thinkofoverhaul;
    }

    public void setThinkofoverhaul(Short thinkofoverhaul) {
        this.thinkofoverhaul = thinkofoverhaul;
    }

    public Float getHTabdelta() {
        return this.HTabdelta;
    }

    public void setHTabdelta(Float HTabdelta) {
        this.HTabdelta = HTabdelta;
    }

    public Float getMTabdelta() {
        return this.MTabdelta;
    }

    public void setMTabdelta(Float MTabdelta) {
        this.MTabdelta = MTabdelta;
    }

    public Short getHTabposition() {
        return this.HTabposition;
    }

    public void setHTabposition(Short HTabposition) {
        this.HTabposition = HTabposition;
    }

    public Short getMTabposition() {
        return this.MTabposition;
    }

    public void setMTabposition(Short MTabposition) {
        this.MTabposition = MTabposition;
    }

    public Short getHTabmaximumnum() {
        return this.HTabmaximumnum;
    }

    public void setHTabmaximumnum(Short HTabmaximumnum) {
        this.HTabmaximumnum = HTabmaximumnum;
    }

    public Short getMTabmaximumnum() {
        return this.MTabmaximumnum;
    }

    public void setMTabmaximumnum(Short MTabmaximumnum) {
        this.MTabmaximumnum = MTabmaximumnum;
    }

    public Short getHTabminimumnum() {
        return this.HTabminimumnum;
    }

    public void setHTabminimumnum(Short HTabminimumnum) {
        this.HTabminimumnum = HTabminimumnum;
    }

    public Short getMTabminimumnum() {
        return this.MTabminimumnum;
    }

    public void setMTabminimumnum(Short MTabminimumnum) {
        this.MTabminimumnum = MTabminimumnum;
    }

    public Float getHTabratedkv() {
        return this.HTabratedkv;
    }

    public void setHTabratedkv(Float HTabratedkv) {
        this.HTabratedkv = HTabratedkv;
    }

    public Float getMTabratedkv() {
        return this.MTabratedkv;
    }

    public void setMTabratedkv(Float MTabratedkv) {
        this.MTabratedkv = MTabratedkv;
    }

    public Float getLTabratedkv() {
        return this.LTabratedkv;
    }

    public void setLTabratedkv(Float LTabratedkv) {
        this.LTabratedkv = LTabratedkv;
    }

    public Float getHMaximumkv() {
        return this.HMaximumkv;
    }

    public void setHMaximumkv(Float HMaximumkv) {
        this.HMaximumkv = HMaximumkv;
    }

    public Float getHMinimumkv() {
        return this.HMinimumkv;
    }

    public void setHMinimumkv(Float HMinimumkv) {
        this.HMinimumkv = HMinimumkv;
    }

    public Float getMMaximumkv() {
        return this.MMaximumkv;
    }

    public void setMMaximumkv(Float MMaximumkv) {
        this.MMaximumkv = MMaximumkv;
    }

    public Float getMMinimumkv() {
        return this.MMinimumkv;
    }

    public void setMMinimumkv(Float MMinimumkv) {
        this.MMinimumkv = MMinimumkv;
    }

    public Float getHRatio() {
        return this.HRatio;
    }

    public void setHRatio(Float HRatio) {
        this.HRatio = HRatio;
    }

    public Float getMRatio() {
        return this.MRatio;
    }

    public void setMRatio(Float MRatio) {
        this.MRatio = MRatio;
    }

    public Float getLRatio() {
        return this.LRatio;
    }

    public void setLRatio(Float LRatio) {
        this.LRatio = LRatio;
    }

    public Float getHMaximumratio() {
        return this.HMaximumratio;
    }

    public void setHMaximumratio(Float HMaximumratio) {
        this.HMaximumratio = HMaximumratio;
    }

    public Float getHMinimumratio() {
        return this.HMinimumratio;
    }

    public void setHMinimumratio(Float HMinimumratio) {
        this.HMinimumratio = HMinimumratio;
    }

    public Float getMMaximumratio() {
        return this.MMaximumratio;
    }

    public void setMMaximumratio(Float MMaximumratio) {
        this.MMaximumratio = MMaximumratio;
    }

    public Float getMMinimumratio() {
        return this.MMinimumratio;
    }

    public void setMMinimumratio(Float MMinimumratio) {
        this.MMinimumratio = MMinimumratio;
    }

    public Float getLMaximumratio() {
        return this.LMaximumratio;
    }

    public void setLMaximumratio(Float LMaximumratio) {
        this.LMaximumratio = LMaximumratio;
    }

    public Float getLMinimumratio() {
        return this.LMinimumratio;
    }

    public void setLMinimumratio(Float LMinimumratio) {
        this.LMinimumratio = LMinimumratio;
    }

    public Float getHOpfratio() {
        return this.HOpfratio;
    }

    public void setHOpfratio(Float HOpfratio) {
        this.HOpfratio = HOpfratio;
    }

    public Float getMOpfratio() {
        return this.MOpfratio;
    }

    public void setMOpfratio(Float MOpfratio) {
        this.MOpfratio = MOpfratio;
    }

    public Float getHBasecurrent() {
        return this.HBasecurrent;
    }

    public void setHBasecurrent(Float HBasecurrent) {
        this.HBasecurrent = HBasecurrent;
    }

    public Float getMBasecurrent() {
        return this.MBasecurrent;
    }

    public void setMBasecurrent(Float MBasecurrent) {
        this.MBasecurrent = MBasecurrent;
    }

    public Float getLBasecurrent() {
        return this.LBasecurrent;
    }

    public void setLBasecurrent(Float LBasecurrent) {
        this.LBasecurrent = LBasecurrent;
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