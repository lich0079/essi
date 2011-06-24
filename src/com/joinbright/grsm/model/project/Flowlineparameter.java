package com.joinbright.grsm.model.project;

/**
 * Flowlineparameter entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Flowlineparameter extends com.joinbright.grsm.model.BaseModel
        implements java.io.Serializable {

    // Fields

    private Short index1;
    private String runway;
    private String id;
    private Short type;
    private Short nodebegin;
    private Short nodeend;
    private String busbegin;
    private String busend;
    private Short breakerstatebegin;
    private Short breakerstateend;
    private Short overloadstate;
    private Float RPu;
    private Float XPu;
    private Float bchPu;
    private Float maximumtransmissionpowerPu;
    private Float maximumloadcurrentPu;
    private Float flowmwPu;
    private Float flowmvarPu;
    private Float flowmwlossPu;
    private Float flowmvarlossPu;
    private Short flowoverloadstate;
    private Float opfmwPu;
    private Float opfmvarPu;
    private Float opfmwlossPu;
    private Float opfmvarlossPu;
    private Short opfoverloadstate;

    // Constructors

    /** default constructor */
    public Flowlineparameter() {
    }

    public Short getIndex1() {
        return index1;
    }

    public void setIndex1(Short index1) {
        this.index1 = index1;
    }

    public String getRunway() {
        return runway;
    }

    public void setRunway(String runway) {
        this.runway = runway;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public Short getNodebegin() {
        return nodebegin;
    }

    public void setNodebegin(Short nodebegin) {
        this.nodebegin = nodebegin;
    }

    public Short getNodeend() {
        return nodeend;
    }

    public void setNodeend(Short nodeend) {
        this.nodeend = nodeend;
    }

    public String getBusbegin() {
        return busbegin;
    }

    public void setBusbegin(String busbegin) {
        this.busbegin = busbegin;
    }

    public String getBusend() {
        return busend;
    }

    public void setBusend(String busend) {
        this.busend = busend;
    }

    public Short getBreakerstatebegin() {
        return breakerstatebegin;
    }

    public void setBreakerstatebegin(Short breakerstatebegin) {
        this.breakerstatebegin = breakerstatebegin;
    }

    public Short getBreakerstateend() {
        return breakerstateend;
    }

    public void setBreakerstateend(Short breakerstateend) {
        this.breakerstateend = breakerstateend;
    }

    public Short getOverloadstate() {
        return overloadstate;
    }

    public void setOverloadstate(Short overloadstate) {
        this.overloadstate = overloadstate;
    }

    public Float getRPu() {
        return RPu;
    }

    public void setRPu(Float pu) {
        RPu = pu;
    }

    public Float getXPu() {
        return XPu;
    }

    public void setXPu(Float pu) {
        XPu = pu;
    }

    public Float getBchPu() {
        return bchPu;
    }

    public void setBchPu(Float bchPu) {
        this.bchPu = bchPu;
    }

    public Float getMaximumtransmissionpowerPu() {
        return maximumtransmissionpowerPu;
    }

    public void setMaximumtransmissionpowerPu(Float maximumtransmissionpowerPu) {
        this.maximumtransmissionpowerPu = maximumtransmissionpowerPu;
    }

    public Float getMaximumloadcurrentPu() {
        return maximumloadcurrentPu;
    }

    public void setMaximumloadcurrentPu(Float maximumloadcurrentPu) {
        this.maximumloadcurrentPu = maximumloadcurrentPu;
    }

    public Float getFlowmwPu() {
        return flowmwPu;
    }

    public void setFlowmwPu(Float flowmwPu) {
        this.flowmwPu = flowmwPu;
    }

    public Float getFlowmvarPu() {
        return flowmvarPu;
    }

    public void setFlowmvarPu(Float flowmvarPu) {
        this.flowmvarPu = flowmvarPu;
    }

    public Float getFlowmwlossPu() {
        return flowmwlossPu;
    }

    public void setFlowmwlossPu(Float flowmwlossPu) {
        this.flowmwlossPu = flowmwlossPu;
    }

    public Float getFlowmvarlossPu() {
        return flowmvarlossPu;
    }

    public void setFlowmvarlossPu(Float flowmvarlossPu) {
        this.flowmvarlossPu = flowmvarlossPu;
    }

    public Short getFlowoverloadstate() {
        return flowoverloadstate;
    }

    public void setFlowoverloadstate(Short flowoverloadstate) {
        this.flowoverloadstate = flowoverloadstate;
    }

    public Float getOpfmwPu() {
        return opfmwPu;
    }

    public void setOpfmwPu(Float opfmwPu) {
        this.opfmwPu = opfmwPu;
    }

    public Float getOpfmvarPu() {
        return opfmvarPu;
    }

    public void setOpfmvarPu(Float opfmvarPu) {
        this.opfmvarPu = opfmvarPu;
    }

    public Float getOpfmwlossPu() {
        return opfmwlossPu;
    }

    public void setOpfmwlossPu(Float opfmwlossPu) {
        this.opfmwlossPu = opfmwlossPu;
    }

    public Float getOpfmvarlossPu() {
        return opfmvarlossPu;
    }

    public void setOpfmvarlossPu(Float opfmvarlossPu) {
        this.opfmvarlossPu = opfmvarlossPu;
    }

    public Short getOpfoverloadstate() {
        return opfoverloadstate;
    }

    public void setOpfoverloadstate(Short opfoverloadstate) {
        this.opfoverloadstate = opfoverloadstate;
    }

    public Flowlineparameter(Short index1, String runway, String id,
            Short type, Short nodebegin, Short nodeend, String busbegin,
            String busend, Short breakerstatebegin, Short breakerstateend,
            Short overloadstate, Float pu, Float pu2, Float bchPu,
            Float maximumtransmissionpowerPu, Float maximumloadcurrentPu,
            Float flowmwPu, Float flowmvarPu, Float flowmwlossPu,
            Float flowmvarlossPu, Short flowoverloadstate, Float opfmwPu,
            Float opfmvarPu, Float opfmwlossPu, Float opfmvarlossPu,
            Short opfoverloadstate) {
        super();
        this.index1 = index1;
        this.runway = runway;
        this.id = id;
        this.type = type;
        this.nodebegin = nodebegin;
        this.nodeend = nodeend;
        this.busbegin = busbegin;
        this.busend = busend;
        this.breakerstatebegin = breakerstatebegin;
        this.breakerstateend = breakerstateend;
        this.overloadstate = overloadstate;
        RPu = pu;
        XPu = pu2;
        this.bchPu = bchPu;
        this.maximumtransmissionpowerPu = maximumtransmissionpowerPu;
        this.maximumloadcurrentPu = maximumloadcurrentPu;
        this.flowmwPu = flowmwPu;
        this.flowmvarPu = flowmvarPu;
        this.flowmwlossPu = flowmwlossPu;
        this.flowmvarlossPu = flowmvarlossPu;
        this.flowoverloadstate = flowoverloadstate;
        this.opfmwPu = opfmwPu;
        this.opfmvarPu = opfmvarPu;
        this.opfmwlossPu = opfmwlossPu;
        this.opfmvarlossPu = opfmvarlossPu;
        this.opfoverloadstate = opfoverloadstate;
    }


}