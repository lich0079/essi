package com.joinbright.grsm.model.project;

/**
 * Flowtransformerparameter entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Flowtransformerparameter extends
        com.joinbright.grsm.model.BaseModel implements java.io.Serializable {

    // Fields

    private String runway;
    private Short id;
    private String name;
    private Short type;
    private Short nodebegin;
    private Short nodeend;
    private Short breakerstatebegin;
    private Short breakerstateend;
    private Float RPu;
    private Float XPu;
    private Float gchPu;
    private Float bchPu;
    private Float ratio;
    private Float maximumratio;
    private Float minimumratio;
    private Float ratedmvaPu;
    private Float ratedaPu;
    private Float flowmwPu;
    private Float flowmvarPu;
    private Float flowmwlossPu;
    private Float flowmvarlossPu;
    private Short flowoverloadstate;
    private Float opfdratio;
    private Float opfmwPu;
    private Float opfmvarPu;
    private Float opfmwlossPu;
    private Float opfmvarlossPu;
    private Short opfoverloadstate;

    // Constructors

    /** default constructor */
    public Flowtransformerparameter() {
    }

    public String getRunway() {
        return runway;
    }

    public void setRunway(String runway) {
        this.runway = runway;
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Float getGchPu() {
        return gchPu;
    }

    public void setGchPu(Float gchPu) {
        this.gchPu = gchPu;
    }

    public Float getBchPu() {
        return bchPu;
    }

    public void setBchPu(Float bchPu) {
        this.bchPu = bchPu;
    }

    public Float getRatio() {
        return ratio;
    }

    public void setRatio(Float ratio) {
        this.ratio = ratio;
    }

    public Float getMaximumratio() {
        return maximumratio;
    }

    public void setMaximumratio(Float maximumratio) {
        this.maximumratio = maximumratio;
    }

    public Float getMinimumratio() {
        return minimumratio;
    }

    public void setMinimumratio(Float minimumratio) {
        this.minimumratio = minimumratio;
    }

    public Float getRatedmvaPu() {
        return ratedmvaPu;
    }

    public void setRatedmvaPu(Float ratedmvaPu) {
        this.ratedmvaPu = ratedmvaPu;
    }

    public Float getRatedaPu() {
        return ratedaPu;
    }

    public void setRatedaPu(Float ratedaPu) {
        this.ratedaPu = ratedaPu;
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

    public Float getOpfdratio() {
        return opfdratio;
    }

    public void setOpfdratio(Float opfdratio) {
        this.opfdratio = opfdratio;
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

    public Flowtransformerparameter(String runway, Short id, String name,
            Short type, Short nodebegin, Short nodeend,
            Short breakerstatebegin, Short breakerstateend, Float pu,
            Float pu2, Float gchPu, Float bchPu, Float ratio,
            Float maximumratio, Float minimumratio, Float ratedmvaPu,
            Float ratedaPu, Float flowmwPu, Float flowmvarPu,
            Float flowmwlossPu, Float flowmvarlossPu, Short flowoverloadstate,
            Float opfdratio, Float opfmwPu, Float opfmvarPu, Float opfmwlossPu,
            Float opfmvarlossPu, Short opfoverloadstate) {
        super();
        this.runway = runway;
        this.id = id;
        this.name = name;
        this.type = type;
        this.nodebegin = nodebegin;
        this.nodeend = nodeend;
        this.breakerstatebegin = breakerstatebegin;
        this.breakerstateend = breakerstateend;
        RPu = pu;
        XPu = pu2;
        this.gchPu = gchPu;
        this.bchPu = bchPu;
        this.ratio = ratio;
        this.maximumratio = maximumratio;
        this.minimumratio = minimumratio;
        this.ratedmvaPu = ratedmvaPu;
        this.ratedaPu = ratedaPu;
        this.flowmwPu = flowmwPu;
        this.flowmvarPu = flowmvarPu;
        this.flowmwlossPu = flowmwlossPu;
        this.flowmvarlossPu = flowmvarlossPu;
        this.flowoverloadstate = flowoverloadstate;
        this.opfdratio = opfdratio;
        this.opfmwPu = opfmwPu;
        this.opfmvarPu = opfmvarPu;
        this.opfmwlossPu = opfmwlossPu;
        this.opfmvarlossPu = opfmvarlossPu;
        this.opfoverloadstate = opfoverloadstate;
    }


}