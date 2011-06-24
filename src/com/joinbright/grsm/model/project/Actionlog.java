package com.joinbright.grsm.model.project;

/**
 * Actionlog entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Actionlog extends com.joinbright.grsm.model.BaseModel implements
        java.io.Serializable {

    // Fields

    private String username;
    private String logcontent;
    private String logtime;
    private String actiontype;
    private String actionobject;
    private String remark;

    // Constructors

    /** default constructor */
    public Actionlog() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLogcontent() {
        return logcontent;
    }

    public void setLogcontent(String logcontent) {
        this.logcontent = logcontent;
    }

    public String getLogtime() {
        return logtime;
    }

    public void setLogtime(String logtime) {
        this.logtime = logtime;
    }

    public String getActiontype() {
        return actiontype;
    }

    public void setActiontype(String actiontype) {
        this.actiontype = actiontype;
    }

    public String getActionobject() {
        return actionobject;
    }

    public void setActionobject(String actionobject) {
        this.actionobject = actionobject;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Actionlog(String username, String logcontent, String logtime,
            String actiontype, String actionobject, String remark) {
        super();
        this.username = username;
        this.logcontent = logcontent;
        this.logtime = logtime;
        this.actiontype = actiontype;
        this.actionobject = actionobject;
        this.remark = remark;
    }


}