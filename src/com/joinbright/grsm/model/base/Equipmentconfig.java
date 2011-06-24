package com.joinbright.grsm.model.base;

/**
 * Equipmentconfig entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Equipmentconfig extends com.joinbright.grsm.model.BaseModel
        implements java.io.Serializable {

    // Fields

    private String equipementindex;
    private String machineindex;
    private String cpuindex;
    private Integer protectionid;

    // Constructors

    /** default constructor */
    public Equipmentconfig() {
    }

    public String getEquipementindex() {
        return equipementindex;
    }

    public void setEquipementindex(String equipementindex) {
        this.equipementindex = equipementindex;
    }

    public String getMachineindex() {
        return machineindex;
    }

    public void setMachineindex(String machineindex) {
        this.machineindex = machineindex;
    }

    public String getCpuindex() {
        return cpuindex;
    }

    public void setCpuindex(String cpuindex) {
        this.cpuindex = cpuindex;
    }

    public Integer getProtectionid() {
        return protectionid;
    }

    public void setProtectionid(Integer protectionid) {
        this.protectionid = protectionid;
    }

    public Equipmentconfig(String equipementindex, String machineindex,
            String cpuindex, Integer protectionid) {
        super();
        this.equipementindex = equipementindex;
        this.machineindex = machineindex;
        this.cpuindex = cpuindex;
        this.protectionid = protectionid;
    }


}