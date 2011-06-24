package com.joinbright.grsm.model.project;

/**
 * Busimpedance entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Busimpedance extends com.joinbright.grsm.model.BaseModel implements
        java.io.Serializable {

    // Fields

    private Integer index1;
    private String runway;
    private String substation;
    private String busid;
    private String overhaulbranchid;
    private String calculationtype;
    private Float impedance1R;
    private Float impedance1I;
    private Float impedance2R;
    private Float impedance2I;
    private Float impedance0R;
    private Float impedance0I;
    private Float impedance1RPu;
    private Float impedance1IPu;
    private Float impedance2RPu;
    private Float impedance2IPu;
    private Float impedance0RPu;
    private Float impedance0IPu;
    private Short showstate;

    // Constructors

    /** default constructor */
    public Busimpedance() {
    }

    public Integer getIndex1() {
        return index1;
    }

    public void setIndex1(Integer index1) {
        this.index1 = index1;
    }

    public String getRunway() {
        return runway;
    }

    public void setRunway(String runway) {
        this.runway = runway;
    }

    public String getSubstation() {
        return substation;
    }

    public void setSubstation(String substation) {
        this.substation = substation;
    }

    public String getBusid() {
        return busid;
    }

    public void setBusid(String busid) {
        this.busid = busid;
    }

    public String getOverhaulbranchid() {
        return overhaulbranchid;
    }

    public void setOverhaulbranchid(String overhaulbranchid) {
        this.overhaulbranchid = overhaulbranchid;
    }

    public String getCalculationtype() {
        return calculationtype;
    }

    public void setCalculationtype(String calculationtype) {
        this.calculationtype = calculationtype;
    }

    public Float getImpedance1R() {
        return impedance1R;
    }

    public void setImpedance1R(Float impedance1R) {
        this.impedance1R = impedance1R;
    }

    public Float getImpedance1I() {
        return impedance1I;
    }

    public void setImpedance1I(Float impedance1I) {
        this.impedance1I = impedance1I;
    }

    public Float getImpedance2R() {
        return impedance2R;
    }

    public void setImpedance2R(Float impedance2R) {
        this.impedance2R = impedance2R;
    }

    public Float getImpedance2I() {
        return impedance2I;
    }

    public void setImpedance2I(Float impedance2I) {
        this.impedance2I = impedance2I;
    }

    public Float getImpedance0R() {
        return impedance0R;
    }

    public void setImpedance0R(Float impedance0R) {
        this.impedance0R = impedance0R;
    }

    public Float getImpedance0I() {
        return impedance0I;
    }

    public void setImpedance0I(Float impedance0I) {
        this.impedance0I = impedance0I;
    }

    public Float getImpedance1RPu() {
        return impedance1RPu;
    }

    public void setImpedance1RPu(Float impedance1RPu) {
        this.impedance1RPu = impedance1RPu;
    }

    public Float getImpedance1IPu() {
        return impedance1IPu;
    }

    public void setImpedance1IPu(Float impedance1IPu) {
        this.impedance1IPu = impedance1IPu;
    }

    public Float getImpedance2RPu() {
        return impedance2RPu;
    }

    public void setImpedance2RPu(Float impedance2RPu) {
        this.impedance2RPu = impedance2RPu;
    }

    public Float getImpedance2IPu() {
        return impedance2IPu;
    }

    public void setImpedance2IPu(Float impedance2IPu) {
        this.impedance2IPu = impedance2IPu;
    }

    public Float getImpedance0RPu() {
        return impedance0RPu;
    }

    public void setImpedance0RPu(Float impedance0RPu) {
        this.impedance0RPu = impedance0RPu;
    }

    public Float getImpedance0IPu() {
        return impedance0IPu;
    }

    public void setImpedance0IPu(Float impedance0IPu) {
        this.impedance0IPu = impedance0IPu;
    }

    public Short getShowstate() {
        return showstate;
    }

    public void setShowstate(Short showstate) {
        this.showstate = showstate;
    }

    public Busimpedance(Integer index1, String runway, String substation,
            String busid, String overhaulbranchid, String calculationtype,
            Float impedance1R, Float impedance1I, Float impedance2R,
            Float impedance2I, Float impedance0R, Float impedance0I,
            Float impedance1RPu, Float impedance1IPu, Float impedance2RPu,
            Float impedance2IPu, Float impedance0RPu, Float impedance0IPu,
            Short showstate) {
        super();
        this.index1 = index1;
        this.runway = runway;
        this.substation = substation;
        this.busid = busid;
        this.overhaulbranchid = overhaulbranchid;
        this.calculationtype = calculationtype;
        this.impedance1R = impedance1R;
        this.impedance1I = impedance1I;
        this.impedance2R = impedance2R;
        this.impedance2I = impedance2I;
        this.impedance0R = impedance0R;
        this.impedance0I = impedance0I;
        this.impedance1RPu = impedance1RPu;
        this.impedance1IPu = impedance1IPu;
        this.impedance2RPu = impedance2RPu;
        this.impedance2IPu = impedance2IPu;
        this.impedance0RPu = impedance0RPu;
        this.impedance0IPu = impedance0IPu;
        this.showstate = showstate;
    }


}