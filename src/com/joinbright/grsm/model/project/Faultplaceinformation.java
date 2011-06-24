package com.joinbright.grsm.model.project;

/**
 * Faultplaceinformation entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Faultplaceinformation extends com.joinbright.grsm.model.BaseModel
        implements java.io.Serializable {

    // Fields

    private Short index1;
    private String runway;
    private String substation;
    private String faultpoint;
    private String faulttype;
    private Short calculationtype;
    private Integer faultnumber;
    private Integer faultindex;
    private String faultinformation;
    private Float calculationtime;
    private Float currentaR;
    private Float currentaI;
    private Float currentbR;
    private Float currentbI;
    private Float currentcR;
    private Float currentcI;
    private Float voltageaR;
    private Float voltageaI;
    private Float voltagebR;
    private Float voltagebI;
    private Float voltagecR;
    private Float voltagecI;
    private Float current1R;
    private Float current1I;
    private Float current2R;
    private Float current2I;
    private Float current0R;
    private Float current0I;
    private Float voltage1R;
    private Float voltage1I;
    private Float voltage2R;
    private Float voltage2I;
    private Float voltage0R;
    private Float voltage0I;
    private Float currentaRPu;
    private Float currentaIPu;
    private Float currentbRPu;
    private Float currentbIPu;
    private Float currentcRPu;
    private Float currentcIPu;
    private Float voltageaRPu;
    private Float voltageaIPu;
    private Float voltagebRPu;
    private Float voltagebIPu;
    private Float voltagecRPu;
    private Float voltagecIPu;
    private Float current1RPu;
    private Float current1IPu;
    private Float current2RPu;
    private Float current2IPu;
    private Float current0RPu;
    private Float current0IPu;
    private Float voltage1RPu;
    private Float voltage1IPu;
    private Float voltage2RPu;
    private Float voltage2IPu;
    private Float voltage0RPu;
    private Float voltage0IPu;
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
    private String date1;
    private String time1;

    // Constructors

    /** default constructor */
    public Faultplaceinformation() {
    }

    /** minimal constructor */
    public Faultplaceinformation(Short index1) {
        this.index1 = index1;
    }

    /** full constructor */
    public Faultplaceinformation(Short index1, String runway,
            String substation, String faultpoint, String faulttype,
            Short calculationtype, Integer faultnumber, Integer faultindex,
            String faultinformation, Float calculationtime, Float currentaR,
            Float currentaI, Float currentbR, Float currentbI, Float currentcR,
            Float currentcI, Float voltageaR, Float voltageaI, Float voltagebR,
            Float voltagebI, Float voltagecR, Float voltagecI, Float current1R,
            Float current1I, Float current2R, Float current2I, Float current0R,
            Float current0I, Float voltage1R, Float voltage1I, Float voltage2R,
            Float voltage2I, Float voltage0R, Float voltage0I,
            Float currentaRPu, Float currentaIPu, Float currentbRPu,
            Float currentbIPu, Float currentcRPu, Float currentcIPu,
            Float voltageaRPu, Float voltageaIPu, Float voltagebRPu,
            Float voltagebIPu, Float voltagecRPu, Float voltagecIPu,
            Float current1RPu, Float current1IPu, Float current2RPu,
            Float current2IPu, Float current0RPu, Float current0IPu,
            Float voltage1RPu, Float voltage1IPu, Float voltage2RPu,
            Float voltage2IPu, Float voltage0RPu, Float voltage0IPu,
            Float impedance1R, Float impedance1I, Float impedance2R,
            Float impedance2I, Float impedance0R, Float impedance0I,
            Float impedance1RPu, Float impedance1IPu, Float impedance2RPu,
            Float impedance2IPu, Float impedance0RPu, Float impedance0IPu,
            String date1, String time1) {
        this.index1 = index1;
        this.runway = runway;
        this.substation = substation;
        this.faultpoint = faultpoint;
        this.faulttype = faulttype;
        this.calculationtype = calculationtype;
        this.faultnumber = faultnumber;
        this.faultindex = faultindex;
        this.faultinformation = faultinformation;
        this.calculationtime = calculationtime;
        this.currentaR = currentaR;
        this.currentaI = currentaI;
        this.currentbR = currentbR;
        this.currentbI = currentbI;
        this.currentcR = currentcR;
        this.currentcI = currentcI;
        this.voltageaR = voltageaR;
        this.voltageaI = voltageaI;
        this.voltagebR = voltagebR;
        this.voltagebI = voltagebI;
        this.voltagecR = voltagecR;
        this.voltagecI = voltagecI;
        this.current1R = current1R;
        this.current1I = current1I;
        this.current2R = current2R;
        this.current2I = current2I;
        this.current0R = current0R;
        this.current0I = current0I;
        this.voltage1R = voltage1R;
        this.voltage1I = voltage1I;
        this.voltage2R = voltage2R;
        this.voltage2I = voltage2I;
        this.voltage0R = voltage0R;
        this.voltage0I = voltage0I;
        this.currentaRPu = currentaRPu;
        this.currentaIPu = currentaIPu;
        this.currentbRPu = currentbRPu;
        this.currentbIPu = currentbIPu;
        this.currentcRPu = currentcRPu;
        this.currentcIPu = currentcIPu;
        this.voltageaRPu = voltageaRPu;
        this.voltageaIPu = voltageaIPu;
        this.voltagebRPu = voltagebRPu;
        this.voltagebIPu = voltagebIPu;
        this.voltagecRPu = voltagecRPu;
        this.voltagecIPu = voltagecIPu;
        this.current1RPu = current1RPu;
        this.current1IPu = current1IPu;
        this.current2RPu = current2RPu;
        this.current2IPu = current2IPu;
        this.current0RPu = current0RPu;
        this.current0IPu = current0IPu;
        this.voltage1RPu = voltage1RPu;
        this.voltage1IPu = voltage1IPu;
        this.voltage2RPu = voltage2RPu;
        this.voltage2IPu = voltage2IPu;
        this.voltage0RPu = voltage0RPu;
        this.voltage0IPu = voltage0IPu;
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
        this.date1 = date1;
        this.time1 = time1;
    }

    // Property accessors

    public Short getIndex1() {
        return this.index1;
    }

    public void setIndex1(Short index1) {
        this.index1 = index1;
    }

    public String getRunway() {
        return this.runway;
    }

    public void setRunway(String runway) {
        this.runway = runway;
    }

    public String getSubstation() {
        return this.substation;
    }

    public void setSubstation(String substation) {
        this.substation = substation;
    }

    public String getFaultpoint() {
        return this.faultpoint;
    }

    public void setFaultpoint(String faultpoint) {
        this.faultpoint = faultpoint;
    }

    public String getFaulttype() {
        return this.faulttype;
    }

    public void setFaulttype(String faulttype) {
        this.faulttype = faulttype;
    }

    public Short getCalculationtype() {
        return this.calculationtype;
    }

    public void setCalculationtype(Short calculationtype) {
        this.calculationtype = calculationtype;
    }

    public Integer getFaultnumber() {
        return this.faultnumber;
    }

    public void setFaultnumber(Integer faultnumber) {
        this.faultnumber = faultnumber;
    }

    public Integer getFaultindex() {
        return this.faultindex;
    }

    public void setFaultindex(Integer faultindex) {
        this.faultindex = faultindex;
    }

    public String getFaultinformation() {
        return this.faultinformation;
    }

    public void setFaultinformation(String faultinformation) {
        this.faultinformation = faultinformation;
    }

    public Float getCalculationtime() {
        return this.calculationtime;
    }

    public void setCalculationtime(Float calculationtime) {
        this.calculationtime = calculationtime;
    }

    public Float getCurrentaR() {
        return this.currentaR;
    }

    public void setCurrentaR(Float currentaR) {
        this.currentaR = currentaR;
    }

    public Float getCurrentaI() {
        return this.currentaI;
    }

    public void setCurrentaI(Float currentaI) {
        this.currentaI = currentaI;
    }

    public Float getCurrentbR() {
        return this.currentbR;
    }

    public void setCurrentbR(Float currentbR) {
        this.currentbR = currentbR;
    }

    public Float getCurrentbI() {
        return this.currentbI;
    }

    public void setCurrentbI(Float currentbI) {
        this.currentbI = currentbI;
    }

    public Float getCurrentcR() {
        return this.currentcR;
    }

    public void setCurrentcR(Float currentcR) {
        this.currentcR = currentcR;
    }

    public Float getCurrentcI() {
        return this.currentcI;
    }

    public void setCurrentcI(Float currentcI) {
        this.currentcI = currentcI;
    }

    public Float getVoltageaR() {
        return this.voltageaR;
    }

    public void setVoltageaR(Float voltageaR) {
        this.voltageaR = voltageaR;
    }

    public Float getVoltageaI() {
        return this.voltageaI;
    }

    public void setVoltageaI(Float voltageaI) {
        this.voltageaI = voltageaI;
    }

    public Float getVoltagebR() {
        return this.voltagebR;
    }

    public void setVoltagebR(Float voltagebR) {
        this.voltagebR = voltagebR;
    }

    public Float getVoltagebI() {
        return this.voltagebI;
    }

    public void setVoltagebI(Float voltagebI) {
        this.voltagebI = voltagebI;
    }

    public Float getVoltagecR() {
        return this.voltagecR;
    }

    public void setVoltagecR(Float voltagecR) {
        this.voltagecR = voltagecR;
    }

    public Float getVoltagecI() {
        return this.voltagecI;
    }

    public void setVoltagecI(Float voltagecI) {
        this.voltagecI = voltagecI;
    }

    public Float getCurrent1R() {
        return this.current1R;
    }

    public void setCurrent1R(Float current1R) {
        this.current1R = current1R;
    }

    public Float getCurrent1I() {
        return this.current1I;
    }

    public void setCurrent1I(Float current1I) {
        this.current1I = current1I;
    }

    public Float getCurrent2R() {
        return this.current2R;
    }

    public void setCurrent2R(Float current2R) {
        this.current2R = current2R;
    }

    public Float getCurrent2I() {
        return this.current2I;
    }

    public void setCurrent2I(Float current2I) {
        this.current2I = current2I;
    }

    public Float getCurrent0R() {
        return this.current0R;
    }

    public void setCurrent0R(Float current0R) {
        this.current0R = current0R;
    }

    public Float getCurrent0I() {
        return this.current0I;
    }

    public void setCurrent0I(Float current0I) {
        this.current0I = current0I;
    }

    public Float getVoltage1R() {
        return this.voltage1R;
    }

    public void setVoltage1R(Float voltage1R) {
        this.voltage1R = voltage1R;
    }

    public Float getVoltage1I() {
        return this.voltage1I;
    }

    public void setVoltage1I(Float voltage1I) {
        this.voltage1I = voltage1I;
    }

    public Float getVoltage2R() {
        return this.voltage2R;
    }

    public void setVoltage2R(Float voltage2R) {
        this.voltage2R = voltage2R;
    }

    public Float getVoltage2I() {
        return this.voltage2I;
    }

    public void setVoltage2I(Float voltage2I) {
        this.voltage2I = voltage2I;
    }

    public Float getVoltage0R() {
        return this.voltage0R;
    }

    public void setVoltage0R(Float voltage0R) {
        this.voltage0R = voltage0R;
    }

    public Float getVoltage0I() {
        return this.voltage0I;
    }

    public void setVoltage0I(Float voltage0I) {
        this.voltage0I = voltage0I;
    }

    public Float getCurrentaRPu() {
        return this.currentaRPu;
    }

    public void setCurrentaRPu(Float currentaRPu) {
        this.currentaRPu = currentaRPu;
    }

    public Float getCurrentaIPu() {
        return this.currentaIPu;
    }

    public void setCurrentaIPu(Float currentaIPu) {
        this.currentaIPu = currentaIPu;
    }

    public Float getCurrentbRPu() {
        return this.currentbRPu;
    }

    public void setCurrentbRPu(Float currentbRPu) {
        this.currentbRPu = currentbRPu;
    }

    public Float getCurrentbIPu() {
        return this.currentbIPu;
    }

    public void setCurrentbIPu(Float currentbIPu) {
        this.currentbIPu = currentbIPu;
    }

    public Float getCurrentcRPu() {
        return this.currentcRPu;
    }

    public void setCurrentcRPu(Float currentcRPu) {
        this.currentcRPu = currentcRPu;
    }

    public Float getCurrentcIPu() {
        return this.currentcIPu;
    }

    public void setCurrentcIPu(Float currentcIPu) {
        this.currentcIPu = currentcIPu;
    }

    public Float getVoltageaRPu() {
        return this.voltageaRPu;
    }

    public void setVoltageaRPu(Float voltageaRPu) {
        this.voltageaRPu = voltageaRPu;
    }

    public Float getVoltageaIPu() {
        return this.voltageaIPu;
    }

    public void setVoltageaIPu(Float voltageaIPu) {
        this.voltageaIPu = voltageaIPu;
    }

    public Float getVoltagebRPu() {
        return this.voltagebRPu;
    }

    public void setVoltagebRPu(Float voltagebRPu) {
        this.voltagebRPu = voltagebRPu;
    }

    public Float getVoltagebIPu() {
        return this.voltagebIPu;
    }

    public void setVoltagebIPu(Float voltagebIPu) {
        this.voltagebIPu = voltagebIPu;
    }

    public Float getVoltagecRPu() {
        return this.voltagecRPu;
    }

    public void setVoltagecRPu(Float voltagecRPu) {
        this.voltagecRPu = voltagecRPu;
    }

    public Float getVoltagecIPu() {
        return this.voltagecIPu;
    }

    public void setVoltagecIPu(Float voltagecIPu) {
        this.voltagecIPu = voltagecIPu;
    }

    public Float getCurrent1RPu() {
        return this.current1RPu;
    }

    public void setCurrent1RPu(Float current1RPu) {
        this.current1RPu = current1RPu;
    }

    public Float getCurrent1IPu() {
        return this.current1IPu;
    }

    public void setCurrent1IPu(Float current1IPu) {
        this.current1IPu = current1IPu;
    }

    public Float getCurrent2RPu() {
        return this.current2RPu;
    }

    public void setCurrent2RPu(Float current2RPu) {
        this.current2RPu = current2RPu;
    }

    public Float getCurrent2IPu() {
        return this.current2IPu;
    }

    public void setCurrent2IPu(Float current2IPu) {
        this.current2IPu = current2IPu;
    }

    public Float getCurrent0RPu() {
        return this.current0RPu;
    }

    public void setCurrent0RPu(Float current0RPu) {
        this.current0RPu = current0RPu;
    }

    public Float getCurrent0IPu() {
        return this.current0IPu;
    }

    public void setCurrent0IPu(Float current0IPu) {
        this.current0IPu = current0IPu;
    }

    public Float getVoltage1RPu() {
        return this.voltage1RPu;
    }

    public void setVoltage1RPu(Float voltage1RPu) {
        this.voltage1RPu = voltage1RPu;
    }

    public Float getVoltage1IPu() {
        return this.voltage1IPu;
    }

    public void setVoltage1IPu(Float voltage1IPu) {
        this.voltage1IPu = voltage1IPu;
    }

    public Float getVoltage2RPu() {
        return this.voltage2RPu;
    }

    public void setVoltage2RPu(Float voltage2RPu) {
        this.voltage2RPu = voltage2RPu;
    }

    public Float getVoltage2IPu() {
        return this.voltage2IPu;
    }

    public void setVoltage2IPu(Float voltage2IPu) {
        this.voltage2IPu = voltage2IPu;
    }

    public Float getVoltage0RPu() {
        return this.voltage0RPu;
    }

    public void setVoltage0RPu(Float voltage0RPu) {
        this.voltage0RPu = voltage0RPu;
    }

    public Float getVoltage0IPu() {
        return this.voltage0IPu;
    }

    public void setVoltage0IPu(Float voltage0IPu) {
        this.voltage0IPu = voltage0IPu;
    }

    public Float getImpedance1R() {
        return this.impedance1R;
    }

    public void setImpedance1R(Float impedance1R) {
        this.impedance1R = impedance1R;
    }

    public Float getImpedance1I() {
        return this.impedance1I;
    }

    public void setImpedance1I(Float impedance1I) {
        this.impedance1I = impedance1I;
    }

    public Float getImpedance2R() {
        return this.impedance2R;
    }

    public void setImpedance2R(Float impedance2R) {
        this.impedance2R = impedance2R;
    }

    public Float getImpedance2I() {
        return this.impedance2I;
    }

    public void setImpedance2I(Float impedance2I) {
        this.impedance2I = impedance2I;
    }

    public Float getImpedance0R() {
        return this.impedance0R;
    }

    public void setImpedance0R(Float impedance0R) {
        this.impedance0R = impedance0R;
    }

    public Float getImpedance0I() {
        return this.impedance0I;
    }

    public void setImpedance0I(Float impedance0I) {
        this.impedance0I = impedance0I;
    }

    public Float getImpedance1RPu() {
        return this.impedance1RPu;
    }

    public void setImpedance1RPu(Float impedance1RPu) {
        this.impedance1RPu = impedance1RPu;
    }

    public Float getImpedance1IPu() {
        return this.impedance1IPu;
    }

    public void setImpedance1IPu(Float impedance1IPu) {
        this.impedance1IPu = impedance1IPu;
    }

    public Float getImpedance2RPu() {
        return this.impedance2RPu;
    }

    public void setImpedance2RPu(Float impedance2RPu) {
        this.impedance2RPu = impedance2RPu;
    }

    public Float getImpedance2IPu() {
        return this.impedance2IPu;
    }

    public void setImpedance2IPu(Float impedance2IPu) {
        this.impedance2IPu = impedance2IPu;
    }

    public Float getImpedance0RPu() {
        return this.impedance0RPu;
    }

    public void setImpedance0RPu(Float impedance0RPu) {
        this.impedance0RPu = impedance0RPu;
    }

    public Float getImpedance0IPu() {
        return this.impedance0IPu;
    }

    public void setImpedance0IPu(Float impedance0IPu) {
        this.impedance0IPu = impedance0IPu;
    }

    public String getDate1() {
        return this.date1;
    }

    public void setDate1(String date1) {
        this.date1 = date1;
    }

    public String getTime1() {
        return this.time1;
    }

    public void setTime1(String time1) {
        this.time1 = time1;
    }

}