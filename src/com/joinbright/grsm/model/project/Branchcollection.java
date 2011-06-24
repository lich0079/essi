package com.joinbright.grsm.model.project;

/**
 * Branchcollection entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Branchcollection extends com.joinbright.grsm.model.BaseModel
        implements java.io.Serializable {

    // Fields

    private String runway;
    private Integer index1;
    private String substation;
    private Integer type;
    private Short subtype;
    private Integer nodebegin;
    private Integer nodeend;
    private Integer nodethird;
    private String busbegin;
    private String busend;
    private String busthird;
    private String breakerbegin;
    private String breakerend;
    private String breakerthird;
    private Float voltagesourceR;
    private Float voltagesourceI;
    private Float RPu;
    private Float XPu;
    private Float r2Pu;
    private Float x2Pu;
    private Float r0Pu;
    private Float x0Pu;
    private Float MRPu;
    private Float MXPu;
    private Float MR2Pu;
    private Float MX2Pu;
    private Float MR0Pu;
    private Float MX0Pu;
    private Float LRPu;
    private Float LXPu;
    private Float LR2Pu;
    private Float LX2Pu;
    private Float LR0Pu;
    private Float LX0Pu;

    // Constructors

    /** default constructor */
    public Branchcollection() {
    }




    public String getRunway() {
        return runway;
    }


    public void setRunway(String runway) {
        this.runway = runway;
    }


    public Branchcollection(String runway, Integer index1, String substation,
            Integer type, Short subtype, Integer nodebegin, Integer nodeend,
            Integer nodethird, String busbegin, String busend, String busthird,
            String breakerbegin, String breakerend, String breakerthird,
            Float voltagesourceR, Float voltagesourceI, Float pu, Float pu2,
            Float pu3, Float pu4, Float pu5, Float pu6, Float pu7, Float pu8,
            Float pu9, Float pu10, Float pu11, Float pu12, Float pu13,
            Float pu14, Float pu15, Float pu16, Float pu17, Float pu18) {
        super();
        this.runway = runway;
        this.index1 = index1;
        this.substation = substation;
        this.type = type;
        this.subtype = subtype;
        this.nodebegin = nodebegin;
        this.nodeend = nodeend;
        this.nodethird = nodethird;
        this.busbegin = busbegin;
        this.busend = busend;
        this.busthird = busthird;
        this.breakerbegin = breakerbegin;
        this.breakerend = breakerend;
        this.breakerthird = breakerthird;
        this.voltagesourceR = voltagesourceR;
        this.voltagesourceI = voltagesourceI;
        RPu = pu;
        XPu = pu2;
        r2Pu = pu3;
        x2Pu = pu4;
        r0Pu = pu5;
        x0Pu = pu6;
        MRPu = pu7;
        MXPu = pu8;
        MR2Pu = pu9;
        MX2Pu = pu10;
        MR0Pu = pu11;
        MX0Pu = pu12;
        LRPu = pu13;
        LXPu = pu14;
        LR2Pu = pu15;
        LX2Pu = pu16;
        LR0Pu = pu17;
        LX0Pu = pu18;
    }




    public Integer getIndex1() {
        return this.index1;
    }

    public void setIndex1(Integer index1) {
        this.index1 = index1;
    }

    public String getSubstation() {
        return this.substation;
    }

    public void setSubstation(String substation) {
        this.substation = substation;
    }

    public Integer getType() {
        return this.type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Short getSubtype() {
        return this.subtype;
    }

    public void setSubtype(Short subtype) {
        this.subtype = subtype;
    }

    public Integer getNodebegin() {
        return this.nodebegin;
    }

    public void setNodebegin(Integer nodebegin) {
        this.nodebegin = nodebegin;
    }

    public Integer getNodeend() {
        return this.nodeend;
    }

    public void setNodeend(Integer nodeend) {
        this.nodeend = nodeend;
    }

    public Integer getNodethird() {
        return this.nodethird;
    }

    public void setNodethird(Integer nodethird) {
        this.nodethird = nodethird;
    }

    public String getBusbegin() {
        return this.busbegin;
    }

    public void setBusbegin(String busbegin) {
        this.busbegin = busbegin;
    }

    public String getBusend() {
        return this.busend;
    }

    public void setBusend(String busend) {
        this.busend = busend;
    }

    public String getBusthird() {
        return this.busthird;
    }

    public void setBusthird(String busthird) {
        this.busthird = busthird;
    }

    public String getBreakerbegin() {
        return this.breakerbegin;
    }

    public void setBreakerbegin(String breakerbegin) {
        this.breakerbegin = breakerbegin;
    }

    public String getBreakerend() {
        return this.breakerend;
    }

    public void setBreakerend(String breakerend) {
        this.breakerend = breakerend;
    }

    public String getBreakerthird() {
        return this.breakerthird;
    }

    public void setBreakerthird(String breakerthird) {
        this.breakerthird = breakerthird;
    }

    public Float getVoltagesourceR() {
        return this.voltagesourceR;
    }

    public void setVoltagesourceR(Float voltagesourceR) {
        this.voltagesourceR = voltagesourceR;
    }

    public Float getVoltagesourceI() {
        return this.voltagesourceI;
    }

    public void setVoltagesourceI(Float voltagesourceI) {
        this.voltagesourceI = voltagesourceI;
    }

    public Float getRPu() {
        return this.RPu;
    }

    public void setRPu(Float RPu) {
        this.RPu = RPu;
    }

    public Float getXPu() {
        return this.XPu;
    }

    public void setXPu(Float XPu) {
        this.XPu = XPu;
    }

    public Float getR2Pu() {
        return this.r2Pu;
    }

    public void setR2Pu(Float r2Pu) {
        this.r2Pu = r2Pu;
    }

    public Float getX2Pu() {
        return this.x2Pu;
    }

    public void setX2Pu(Float x2Pu) {
        this.x2Pu = x2Pu;
    }

    public Float getR0Pu() {
        return this.r0Pu;
    }

    public void setR0Pu(Float r0Pu) {
        this.r0Pu = r0Pu;
    }

    public Float getX0Pu() {
        return this.x0Pu;
    }

    public void setX0Pu(Float x0Pu) {
        this.x0Pu = x0Pu;
    }

    public Float getMRPu() {
        return this.MRPu;
    }

    public void setMRPu(Float MRPu) {
        this.MRPu = MRPu;
    }

    public Float getMXPu() {
        return this.MXPu;
    }

    public void setMXPu(Float MXPu) {
        this.MXPu = MXPu;
    }

    public Float getMR2Pu() {
        return this.MR2Pu;
    }

    public void setMR2Pu(Float MR2Pu) {
        this.MR2Pu = MR2Pu;
    }

    public Float getMX2Pu() {
        return this.MX2Pu;
    }

    public void setMX2Pu(Float MX2Pu) {
        this.MX2Pu = MX2Pu;
    }

    public Float getMR0Pu() {
        return this.MR0Pu;
    }

    public void setMR0Pu(Float MR0Pu) {
        this.MR0Pu = MR0Pu;
    }

    public Float getMX0Pu() {
        return this.MX0Pu;
    }

    public void setMX0Pu(Float MX0Pu) {
        this.MX0Pu = MX0Pu;
    }

    public Float getLRPu() {
        return this.LRPu;
    }

    public void setLRPu(Float LRPu) {
        this.LRPu = LRPu;
    }

    public Float getLXPu() {
        return this.LXPu;
    }

    public void setLXPu(Float LXPu) {
        this.LXPu = LXPu;
    }

    public Float getLR2Pu() {
        return this.LR2Pu;
    }

    public void setLR2Pu(Float LR2Pu) {
        this.LR2Pu = LR2Pu;
    }

    public Float getLX2Pu() {
        return this.LX2Pu;
    }

    public void setLX2Pu(Float LX2Pu) {
        this.LX2Pu = LX2Pu;
    }

    public Float getLR0Pu() {
        return this.LR0Pu;
    }

    public void setLR0Pu(Float LR0Pu) {
        this.LR0Pu = LR0Pu;
    }

    public Float getLX0Pu() {
        return this.LX0Pu;
    }

    public void setLX0Pu(Float LX0Pu) {
        this.LX0Pu = LX0Pu;
    }

}