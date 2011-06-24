package com.joinbright.grsm.model.project;

/**
 * Branchtopology entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Branchtopology extends com.joinbright.grsm.model.BaseModel
        implements java.io.Serializable {

    // Fields

    private String id;
    private Integer index1;
    private String runway;
    private Integer type;
    private Integer noinclass;
    private Integer nodebegin;
    private Integer nodeend;
    private String transfomerconnectionmode;
    private Float voltagesourceRPu;
    private Float voltagesourceIPu;
    private Float RPu;
    private Float XPu;
    private Float r2Pu;
    private Float x2Pu;
    private Float r0Pu;
    private Float x0Pu;

    // Constructors

    /** default constructor */
    public Branchtopology() {
    }

    /** minimal constructor */
    public Branchtopology(String id) {
        this.id = id;
    }

    /** full constructor */
    public Branchtopology(String id, Integer index1, String runway,
            Integer type, Integer noinclass, Integer nodebegin,
            Integer nodeend, String transfomerconnectionmode,
            Float voltagesourceRPu, Float voltagesourceIPu, Float RPu,
            Float XPu, Float r2Pu, Float x2Pu, Float r0Pu, Float x0Pu) {
        this.id = id;
        this.index1 = index1;
        this.runway = runway;
        this.type = type;
        this.noinclass = noinclass;
        this.nodebegin = nodebegin;
        this.nodeend = nodeend;
        this.transfomerconnectionmode = transfomerconnectionmode;
        this.voltagesourceRPu = voltagesourceRPu;
        this.voltagesourceIPu = voltagesourceIPu;
        this.RPu = RPu;
        this.XPu = XPu;
        this.r2Pu = r2Pu;
        this.x2Pu = x2Pu;
        this.r0Pu = r0Pu;
        this.x0Pu = x0Pu;
    }

    // Property accessors

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getIndex1() {
        return this.index1;
    }

    public void setIndex1(Integer index1) {
        this.index1 = index1;
    }

    public String getRunway() {
        return this.runway;
    }

    public void setRunway(String runway) {
        this.runway = runway;
    }

    public Integer getType() {
        return this.type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getNoinclass() {
        return this.noinclass;
    }

    public void setNoinclass(Integer noinclass) {
        this.noinclass = noinclass;
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

    public String getTransfomerconnectionmode() {
        return this.transfomerconnectionmode;
    }

    public void setTransfomerconnectionmode(String transfomerconnectionmode) {
        this.transfomerconnectionmode = transfomerconnectionmode;
    }

    public Float getVoltagesourceRPu() {
        return this.voltagesourceRPu;
    }

    public void setVoltagesourceRPu(Float voltagesourceRPu) {
        this.voltagesourceRPu = voltagesourceRPu;
    }

    public Float getVoltagesourceIPu() {
        return this.voltagesourceIPu;
    }

    public void setVoltagesourceIPu(Float voltagesourceIPu) {
        this.voltagesourceIPu = voltagesourceIPu;
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

}