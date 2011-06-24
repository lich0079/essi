package com.joinbright.grsm.model.project;

/**
 * Branchcurrent entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Branchcurrent extends com.joinbright.grsm.model.BaseModel
        implements java.io.Serializable {

    // Fields

    private Integer index1;
    private String runway;
    private String substation;
    private String branchid;
    private Short prolocation;
    private Float current1R;
    private Float current1I;
    private Float current2R;
    private Float current2I;
    private Float current0R;
    private Float current0I;
    private Float currentaR;
    private Float currentaI;
    private Float currentbR;
    private Float currentbI;
    private Float currentcR;
    private Float currentcI;
    private Float current1RPu;
    private Float current1IPu;
    private Float current2RPu;
    private Float current2IPu;
    private Float current0RPu;
    private Float current0IPu;
    private Float currentaRPu;
    private Float currentaIPu;
    private Float currentbRPu;
    private Float currentbIPu;
    private Float currentcRPu;
    private Float currentcIPu;
    private String faultinformation;
    private Short calculationtype;
    private String date1;
    private String time1;
    private Float calculationtime;

    // Constructors

    /** default constructor */
    public Branchcurrent() {
    }

    /** minimal constructor */
    public Branchcurrent(Integer index1) {
        this.index1 = index1;
    }

    /** full constructor */
    public Branchcurrent(Integer index1, String runway, String substation,
            String branchid, Short prolocation, Float current1R,
            Float current1I, Float current2R, Float current2I, Float current0R,
            Float current0I, Float currentaR, Float currentaI, Float currentbR,
            Float currentbI, Float currentcR, Float currentcI,
            Float current1RPu, Float current1IPu, Float current2RPu,
            Float current2IPu, Float current0RPu, Float current0IPu,
            Float currentaRPu, Float currentaIPu, Float currentbRPu,
            Float currentbIPu, Float currentcRPu, Float currentcIPu,
            String faultinformation, Short calculationtype, String date1,
            String time1, Float calculationtime) {
        this.index1 = index1;
        this.runway = runway;
        this.substation = substation;
        this.branchid = branchid;
        this.prolocation = prolocation;
        this.current1R = current1R;
        this.current1I = current1I;
        this.current2R = current2R;
        this.current2I = current2I;
        this.current0R = current0R;
        this.current0I = current0I;
        this.currentaR = currentaR;
        this.currentaI = currentaI;
        this.currentbR = currentbR;
        this.currentbI = currentbI;
        this.currentcR = currentcR;
        this.currentcI = currentcI;
        this.current1RPu = current1RPu;
        this.current1IPu = current1IPu;
        this.current2RPu = current2RPu;
        this.current2IPu = current2IPu;
        this.current0RPu = current0RPu;
        this.current0IPu = current0IPu;
        this.currentaRPu = currentaRPu;
        this.currentaIPu = currentaIPu;
        this.currentbRPu = currentbRPu;
        this.currentbIPu = currentbIPu;
        this.currentcRPu = currentcRPu;
        this.currentcIPu = currentcIPu;
        this.faultinformation = faultinformation;
        this.calculationtype = calculationtype;
        this.date1 = date1;
        this.time1 = time1;
        this.calculationtime = calculationtime;
    }

    // Property accessors

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

    public String getSubstation() {
        return this.substation;
    }

    public void setSubstation(String substation) {
        this.substation = substation;
    }

    public String getBranchid() {
        return this.branchid;
    }

    public void setBranchid(String branchid) {
        this.branchid = branchid;
    }

    public Short getProlocation() {
        return this.prolocation;
    }

    public void setProlocation(Short prolocation) {
        this.prolocation = prolocation;
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

    public String getFaultinformation() {
        return this.faultinformation;
    }

    public void setFaultinformation(String faultinformation) {
        this.faultinformation = faultinformation;
    }

    public Short getCalculationtype() {
        return this.calculationtype;
    }

    public void setCalculationtype(Short calculationtype) {
        this.calculationtype = calculationtype;
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

    public Float getCalculationtime() {
        return this.calculationtime;
    }

    public void setCalculationtime(Float calculationtime) {
        this.calculationtime = calculationtime;
    }

}