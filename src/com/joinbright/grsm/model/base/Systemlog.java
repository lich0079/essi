package com.joinbright.grsm.model.base;

/**
 * Systemlog entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Systemlog extends com.joinbright.grsm.model.BaseModel implements
        java.io.Serializable {

    // Fields

    private String username;
    private String filename;
    private String operationdate;
    private String operationtime;
    private String type;
    private String decription;

    // Constructors

    /** default constructor */
    public Systemlog() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getOperationdate() {
        return operationdate;
    }

    public void setOperationdate(String operationdate) {
        this.operationdate = operationdate;
    }

    public String getOperationtime() {
        return operationtime;
    }

    public void setOperationtime(String operationtime) {
        this.operationtime = operationtime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

    public Systemlog(String username, String filename, String operationdate,
            String operationtime, String type, String decription) {
        super();
        this.username = username;
        this.filename = filename;
        this.operationdate = operationdate;
        this.operationtime = operationtime;
        this.type = type;
        this.decription = decription;
    }


}