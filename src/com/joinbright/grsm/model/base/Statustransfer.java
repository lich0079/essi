package com.joinbright.grsm.model.base;

/**
 * Statustransfer entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Statustransfer extends com.joinbright.grsm.model.BaseModel
        implements java.io.Serializable {

    // Fields

    private String id;
    private Integer transferindex;
    private String statusoperator;
    private Integer statusbegin;
    private Integer statusend;
    private String statustransferdate;
    private String statustransfermemo;

    // Constructors

    /** default constructor */
    public Statustransfer() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getTransferindex() {
        return transferindex;
    }

    public void setTransferindex(Integer transferindex) {
        this.transferindex = transferindex;
    }

    public String getStatusoperator() {
        return statusoperator;
    }

    public void setStatusoperator(String statusoperator) {
        this.statusoperator = statusoperator;
    }

    public Integer getStatusbegin() {
        return statusbegin;
    }

    public void setStatusbegin(Integer statusbegin) {
        this.statusbegin = statusbegin;
    }

    public Integer getStatusend() {
        return statusend;
    }

    public void setStatusend(Integer statusend) {
        this.statusend = statusend;
    }

    public String getStatustransferdate() {
        return statustransferdate;
    }

    public void setStatustransferdate(String statustransferdate) {
        this.statustransferdate = statustransferdate;
    }

    public String getStatustransfermemo() {
        return statustransfermemo;
    }

    public void setStatustransfermemo(String statustransfermemo) {
        this.statustransfermemo = statustransfermemo;
    }

    public Statustransfer(String id, Integer transferindex,
            String statusoperator, Integer statusbegin, Integer statusend,
            String statustransferdate, String statustransfermemo) {
        super();
        this.id = id;
        this.transferindex = transferindex;
        this.statusoperator = statusoperator;
        this.statusbegin = statusbegin;
        this.statusend = statusend;
        this.statustransferdate = statustransferdate;
        this.statustransfermemo = statustransfermemo;
    }


}