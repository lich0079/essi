package com.joinbright.grsm.model.project;

/**
 * Flownodeparameter entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Flownodeparameter extends com.joinbright.grsm.model.BaseModel
        implements java.io.Serializable {

    // Fields

    private String runway;
    private Short nodeid;
    private String busid;
    private Short type;
    private Float voltagelevel;
    private Float voltageamplitudePu;
    private Float voltageanglePu;
    private Float maximumvoltageamplitudePu;
    private Float minimumvoltageamplitudePu;
    private Float generatormwPu;
    private Float generatormvarPu;
    private Float loadmwPu;
    private Float loadmvarPu;
    private Float constantpowerloadmwPu;
    private Float constantpowerloadmvarPu;
    private Float constantcurrentloadmwPu;
    private Float constantcurrentloadmvarPu;
    private Float constantimpedanceloadmwPu;
    private Float constantimpedanceloadmvarPu;
    private Float compensatormvarPu;
    private Float maximumcompensatormvarPu;
    private Float minimumcompensatormvarPu;
    private Float flowvoltageamplitudePu;
    private Float flowvoltageanglePu;
    private Float flowgeneratormwPu;
    private Float flowgeneratormvarPu;
    private Float flowloadmwPu;
    private Float flowloadmvarPu;
    private Short flowoverloadstate;
    private Float opfvoltageamplitudePu;
    private Float opfvoltageanglePu;
    private Float opfgeneratormwPu;
    private Float opfgeneratormvarPu;
    private Float opfloadmwPu;
    private Float opfloadmvarPu;
    private Float opfcompensatormvarPu;
    private Short opfoverloadstate;

    // Constructors

    /** default constructor */
    public Flownodeparameter() {
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

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public Float getVoltagelevel() {
        return voltagelevel;
    }

    public void setVoltagelevel(Float voltagelevel) {
        this.voltagelevel = voltagelevel;
    }

    public Float getVoltageamplitudePu() {
        return voltageamplitudePu;
    }

    public void setVoltageamplitudePu(Float voltageamplitudePu) {
        this.voltageamplitudePu = voltageamplitudePu;
    }

    public Float getVoltageanglePu() {
        return voltageanglePu;
    }

    public void setVoltageanglePu(Float voltageanglePu) {
        this.voltageanglePu = voltageanglePu;
    }

    public Float getMaximumvoltageamplitudePu() {
        return maximumvoltageamplitudePu;
    }

    public void setMaximumvoltageamplitudePu(Float maximumvoltageamplitudePu) {
        this.maximumvoltageamplitudePu = maximumvoltageamplitudePu;
    }

    public Float getMinimumvoltageamplitudePu() {
        return minimumvoltageamplitudePu;
    }

    public void setMinimumvoltageamplitudePu(Float minimumvoltageamplitudePu) {
        this.minimumvoltageamplitudePu = minimumvoltageamplitudePu;
    }

    public Float getGeneratormwPu() {
        return generatormwPu;
    }

    public void setGeneratormwPu(Float generatormwPu) {
        this.generatormwPu = generatormwPu;
    }

    public Float getGeneratormvarPu() {
        return generatormvarPu;
    }

    public void setGeneratormvarPu(Float generatormvarPu) {
        this.generatormvarPu = generatormvarPu;
    }

    public Float getLoadmwPu() {
        return loadmwPu;
    }

    public void setLoadmwPu(Float loadmwPu) {
        this.loadmwPu = loadmwPu;
    }

    public Float getLoadmvarPu() {
        return loadmvarPu;
    }

    public void setLoadmvarPu(Float loadmvarPu) {
        this.loadmvarPu = loadmvarPu;
    }

    public Float getConstantpowerloadmwPu() {
        return constantpowerloadmwPu;
    }

    public void setConstantpowerloadmwPu(Float constantpowerloadmwPu) {
        this.constantpowerloadmwPu = constantpowerloadmwPu;
    }

    public Float getConstantpowerloadmvarPu() {
        return constantpowerloadmvarPu;
    }

    public void setConstantpowerloadmvarPu(Float constantpowerloadmvarPu) {
        this.constantpowerloadmvarPu = constantpowerloadmvarPu;
    }

    public Float getConstantcurrentloadmwPu() {
        return constantcurrentloadmwPu;
    }

    public void setConstantcurrentloadmwPu(Float constantcurrentloadmwPu) {
        this.constantcurrentloadmwPu = constantcurrentloadmwPu;
    }

    public Float getConstantcurrentloadmvarPu() {
        return constantcurrentloadmvarPu;
    }

    public void setConstantcurrentloadmvarPu(Float constantcurrentloadmvarPu) {
        this.constantcurrentloadmvarPu = constantcurrentloadmvarPu;
    }

    public Float getConstantimpedanceloadmwPu() {
        return constantimpedanceloadmwPu;
    }

    public void setConstantimpedanceloadmwPu(Float constantimpedanceloadmwPu) {
        this.constantimpedanceloadmwPu = constantimpedanceloadmwPu;
    }

    public Float getConstantimpedanceloadmvarPu() {
        return constantimpedanceloadmvarPu;
    }

    public void setConstantimpedanceloadmvarPu(Float constantimpedanceloadmvarPu) {
        this.constantimpedanceloadmvarPu = constantimpedanceloadmvarPu;
    }

    public Float getCompensatormvarPu() {
        return compensatormvarPu;
    }

    public void setCompensatormvarPu(Float compensatormvarPu) {
        this.compensatormvarPu = compensatormvarPu;
    }

    public Float getMaximumcompensatormvarPu() {
        return maximumcompensatormvarPu;
    }

    public void setMaximumcompensatormvarPu(Float maximumcompensatormvarPu) {
        this.maximumcompensatormvarPu = maximumcompensatormvarPu;
    }

    public Float getMinimumcompensatormvarPu() {
        return minimumcompensatormvarPu;
    }

    public void setMinimumcompensatormvarPu(Float minimumcompensatormvarPu) {
        this.minimumcompensatormvarPu = minimumcompensatormvarPu;
    }

    public Float getFlowvoltageamplitudePu() {
        return flowvoltageamplitudePu;
    }

    public void setFlowvoltageamplitudePu(Float flowvoltageamplitudePu) {
        this.flowvoltageamplitudePu = flowvoltageamplitudePu;
    }

    public Float getFlowvoltageanglePu() {
        return flowvoltageanglePu;
    }

    public void setFlowvoltageanglePu(Float flowvoltageanglePu) {
        this.flowvoltageanglePu = flowvoltageanglePu;
    }

    public Float getFlowgeneratormwPu() {
        return flowgeneratormwPu;
    }

    public void setFlowgeneratormwPu(Float flowgeneratormwPu) {
        this.flowgeneratormwPu = flowgeneratormwPu;
    }

    public Float getFlowgeneratormvarPu() {
        return flowgeneratormvarPu;
    }

    public void setFlowgeneratormvarPu(Float flowgeneratormvarPu) {
        this.flowgeneratormvarPu = flowgeneratormvarPu;
    }

    public Float getFlowloadmwPu() {
        return flowloadmwPu;
    }

    public void setFlowloadmwPu(Float flowloadmwPu) {
        this.flowloadmwPu = flowloadmwPu;
    }

    public Float getFlowloadmvarPu() {
        return flowloadmvarPu;
    }

    public void setFlowloadmvarPu(Float flowloadmvarPu) {
        this.flowloadmvarPu = flowloadmvarPu;
    }

    public Short getFlowoverloadstate() {
        return flowoverloadstate;
    }

    public void setFlowoverloadstate(Short flowoverloadstate) {
        this.flowoverloadstate = flowoverloadstate;
    }

    public Float getOpfvoltageamplitudePu() {
        return opfvoltageamplitudePu;
    }

    public void setOpfvoltageamplitudePu(Float opfvoltageamplitudePu) {
        this.opfvoltageamplitudePu = opfvoltageamplitudePu;
    }

    public Float getOpfvoltageanglePu() {
        return opfvoltageanglePu;
    }

    public void setOpfvoltageanglePu(Float opfvoltageanglePu) {
        this.opfvoltageanglePu = opfvoltageanglePu;
    }

    public Float getOpfgeneratormwPu() {
        return opfgeneratormwPu;
    }

    public void setOpfgeneratormwPu(Float opfgeneratormwPu) {
        this.opfgeneratormwPu = opfgeneratormwPu;
    }

    public Float getOpfgeneratormvarPu() {
        return opfgeneratormvarPu;
    }

    public void setOpfgeneratormvarPu(Float opfgeneratormvarPu) {
        this.opfgeneratormvarPu = opfgeneratormvarPu;
    }

    public Float getOpfloadmwPu() {
        return opfloadmwPu;
    }

    public void setOpfloadmwPu(Float opfloadmwPu) {
        this.opfloadmwPu = opfloadmwPu;
    }

    public Float getOpfloadmvarPu() {
        return opfloadmvarPu;
    }

    public void setOpfloadmvarPu(Float opfloadmvarPu) {
        this.opfloadmvarPu = opfloadmvarPu;
    }

    public Float getOpfcompensatormvarPu() {
        return opfcompensatormvarPu;
    }

    public void setOpfcompensatormvarPu(Float opfcompensatormvarPu) {
        this.opfcompensatormvarPu = opfcompensatormvarPu;
    }

    public Short getOpfoverloadstate() {
        return opfoverloadstate;
    }

    public void setOpfoverloadstate(Short opfoverloadstate) {
        this.opfoverloadstate = opfoverloadstate;
    }

    public Flownodeparameter(String runway, Short nodeid, String busid,
            Short type, Float voltagelevel, Float voltageamplitudePu,
            Float voltageanglePu, Float maximumvoltageamplitudePu,
            Float minimumvoltageamplitudePu, Float generatormwPu,
            Float generatormvarPu, Float loadmwPu, Float loadmvarPu,
            Float constantpowerloadmwPu, Float constantpowerloadmvarPu,
            Float constantcurrentloadmwPu, Float constantcurrentloadmvarPu,
            Float constantimpedanceloadmwPu, Float constantimpedanceloadmvarPu,
            Float compensatormvarPu, Float maximumcompensatormvarPu,
            Float minimumcompensatormvarPu, Float flowvoltageamplitudePu,
            Float flowvoltageanglePu, Float flowgeneratormwPu,
            Float flowgeneratormvarPu, Float flowloadmwPu,
            Float flowloadmvarPu, Short flowoverloadstate,
            Float opfvoltageamplitudePu, Float opfvoltageanglePu,
            Float opfgeneratormwPu, Float opfgeneratormvarPu,
            Float opfloadmwPu, Float opfloadmvarPu, Float opfcompensatormvarPu,
            Short opfoverloadstate) {
        super();
        this.runway = runway;
        this.nodeid = nodeid;
        this.busid = busid;
        this.type = type;
        this.voltagelevel = voltagelevel;
        this.voltageamplitudePu = voltageamplitudePu;
        this.voltageanglePu = voltageanglePu;
        this.maximumvoltageamplitudePu = maximumvoltageamplitudePu;
        this.minimumvoltageamplitudePu = minimumvoltageamplitudePu;
        this.generatormwPu = generatormwPu;
        this.generatormvarPu = generatormvarPu;
        this.loadmwPu = loadmwPu;
        this.loadmvarPu = loadmvarPu;
        this.constantpowerloadmwPu = constantpowerloadmwPu;
        this.constantpowerloadmvarPu = constantpowerloadmvarPu;
        this.constantcurrentloadmwPu = constantcurrentloadmwPu;
        this.constantcurrentloadmvarPu = constantcurrentloadmvarPu;
        this.constantimpedanceloadmwPu = constantimpedanceloadmwPu;
        this.constantimpedanceloadmvarPu = constantimpedanceloadmvarPu;
        this.compensatormvarPu = compensatormvarPu;
        this.maximumcompensatormvarPu = maximumcompensatormvarPu;
        this.minimumcompensatormvarPu = minimumcompensatormvarPu;
        this.flowvoltageamplitudePu = flowvoltageamplitudePu;
        this.flowvoltageanglePu = flowvoltageanglePu;
        this.flowgeneratormwPu = flowgeneratormwPu;
        this.flowgeneratormvarPu = flowgeneratormvarPu;
        this.flowloadmwPu = flowloadmwPu;
        this.flowloadmvarPu = flowloadmvarPu;
        this.flowoverloadstate = flowoverloadstate;
        this.opfvoltageamplitudePu = opfvoltageamplitudePu;
        this.opfvoltageanglePu = opfvoltageanglePu;
        this.opfgeneratormwPu = opfgeneratormwPu;
        this.opfgeneratormvarPu = opfgeneratormvarPu;
        this.opfloadmwPu = opfloadmwPu;
        this.opfloadmvarPu = opfloadmvarPu;
        this.opfcompensatormvarPu = opfcompensatormvarPu;
        this.opfoverloadstate = opfoverloadstate;
    }


}