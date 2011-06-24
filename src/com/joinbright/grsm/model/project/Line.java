package com.joinbright.grsm.model.project;

/**
 * Line entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Line extends com.joinbright.grsm.model.BaseModel implements
        java.io.Serializable {

    // Fields

    private String id;
    private String name;
    private String substationbegin;
    private String substationend;
    private String description;
    private String factory;
    private Float voltagelevel;
    private String type;
    private Integer linenum;
    private String length;
    private String model;
    private String averagedistance;
    private String cablecount;
    private String arrangetype;
    private String cableratedkv;
    private String RUnit;
    private String XUnit;
    private String r0Unit;
    private String x0Unit;
    private String bchUnit;
    private String maximumloadcurrentSegment;
    private String RSegment;
    private String XSegment;
    private String r0Segment;
    private String x0Segment;
    private String bchSegment;
    private String RSegmentPu;
    private String XSegmentPu;
    private String r0SegmentPu;
    private String x0SegmentPu;
    private String bchSegmentPu;
    private Float r;
    private Float x;
    private Float r0;
    private Float x0;
    private Float bch;
    private Float RMeasurement;
    private Float XMeasurement;
    private Float r0Measurement;
    private Float x0Measurement;
    private Float bchMeasurement;
    private Float z;
    private Float angle;
    private Float z0;
    private Float angle0;
    private Float RPu;
    private Float XPu;
    private Float r0Pu;
    private Float x0Pu;
    private Float bchPu;
    private Float ZPu;
    private Float anglePu;
    private Float z0Pu;
    private Float angle0Pu;
    private Float maximumloadcurrent;
    private Short issubline;
    private Short thinkofoverhaul;
    private Short sequencedisplaytype;
    private Short overloadstate;
    private Short parametersource;
    private Short valuedisplaytype;
    private Short defaultvalue;
    private Float basecurrent;
    private String remark;
    private String company;

    // Constructors

    /** default constructor */
    public Line() {
    }


    // Property accessors

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public Line(String id, String name, String substationbegin,
            String substationend, String description, String factory,
            Float voltagelevel, String type, Integer linenum, String length,
            String model, String averagedistance, String cablecount,
            String arrangetype, String cableratedkv, String unit, String unit2,
            String unit3, String unit4, String bchUnit,
            String maximumloadcurrentSegment, String segment, String segment2,
            String segment3, String segment4, String bchSegment,
            String segmentPu, String segmentPu2, String segmentPu3,
            String segmentPu4, String bchSegmentPu, Float r, Float x, Float r0,
            Float x0, Float bch, Float measurement, Float measurement2,
            Float measurement3, Float measurement4, Float bchMeasurement,
            Float z, Float angle, Float z0, Float angle0, Float pu, Float pu2,
            Float pu3, Float pu4, Float bchPu, Float pu5, Float anglePu,
            Float pu6, Float angle0Pu, Float maximumloadcurrent,
            Short issubline, Short thinkofoverhaul, Short sequencedisplaytype,
            Short overloadstate, Short parametersource, Short valuedisplaytype,
            Short defaultvalue, Float basecurrent, String remark, String company) {
        super();
        this.id = id;
        this.name = name;
        this.substationbegin = substationbegin;
        this.substationend = substationend;
        this.description = description;
        this.factory = factory;
        this.voltagelevel = voltagelevel;
        this.type = type;
        this.linenum = linenum;
        this.length = length;
        this.model = model;
        this.averagedistance = averagedistance;
        this.cablecount = cablecount;
        this.arrangetype = arrangetype;
        this.cableratedkv = cableratedkv;
        RUnit = unit;
        XUnit = unit2;
        r0Unit = unit3;
        x0Unit = unit4;
        this.bchUnit = bchUnit;
        this.maximumloadcurrentSegment = maximumloadcurrentSegment;
        RSegment = segment;
        XSegment = segment2;
        r0Segment = segment3;
        x0Segment = segment4;
        this.bchSegment = bchSegment;
        RSegmentPu = segmentPu;
        XSegmentPu = segmentPu2;
        r0SegmentPu = segmentPu3;
        x0SegmentPu = segmentPu4;
        this.bchSegmentPu = bchSegmentPu;
        this.r = r;
        this.x = x;
        this.r0 = r0;
        this.x0 = x0;
        this.bch = bch;
        RMeasurement = measurement;
        XMeasurement = measurement2;
        r0Measurement = measurement3;
        x0Measurement = measurement4;
        this.bchMeasurement = bchMeasurement;
        this.z = z;
        this.angle = angle;
        this.z0 = z0;
        this.angle0 = angle0;
        RPu = pu;
        XPu = pu2;
        r0Pu = pu3;
        x0Pu = pu4;
        this.bchPu = bchPu;
        ZPu = pu5;
        this.anglePu = anglePu;
        z0Pu = pu6;
        this.angle0Pu = angle0Pu;
        this.maximumloadcurrent = maximumloadcurrent;
        this.issubline = issubline;
        this.thinkofoverhaul = thinkofoverhaul;
        this.sequencedisplaytype = sequencedisplaytype;
        this.overloadstate = overloadstate;
        this.parametersource = parametersource;
        this.valuedisplaytype = valuedisplaytype;
        this.defaultvalue = defaultvalue;
        this.basecurrent = basecurrent;
        this.remark = remark;
        this.company = company;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubstationbegin() {
        return this.substationbegin;
    }

    public void setSubstationbegin(String substationbegin) {
        this.substationbegin = substationbegin;
    }

    public String getSubstationend() {
        return this.substationend;
    }

    public void setSubstationend(String substationend) {
        this.substationend = substationend;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFactory() {
        return this.factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    public Float getVoltagelevel() {
        return this.voltagelevel;
    }

    public void setVoltagelevel(Float voltagelevel) {
        this.voltagelevel = voltagelevel;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getLinenum() {
        return this.linenum;
    }

    public void setLinenum(Integer linenum) {
        this.linenum = linenum;
    }

    public String getLength() {
        return this.length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getAveragedistance() {
        return this.averagedistance;
    }

    public void setAveragedistance(String averagedistance) {
        this.averagedistance = averagedistance;
    }

    public String getCablecount() {
        return this.cablecount;
    }

    public void setCablecount(String cablecount) {
        this.cablecount = cablecount;
    }

    public String getArrangetype() {
        return this.arrangetype;
    }

    public void setArrangetype(String arrangetype) {
        this.arrangetype = arrangetype;
    }

    public String getCableratedkv() {
        return this.cableratedkv;
    }

    public void setCableratedkv(String cableratedkv) {
        this.cableratedkv = cableratedkv;
    }

    public String getRUnit() {
        return this.RUnit;
    }

    public void setRUnit(String RUnit) {
        this.RUnit = RUnit;
    }

    public String getXUnit() {
        return this.XUnit;
    }

    public void setXUnit(String XUnit) {
        this.XUnit = XUnit;
    }

    public String getR0Unit() {
        return this.r0Unit;
    }

    public void setR0Unit(String r0Unit) {
        this.r0Unit = r0Unit;
    }

    public String getX0Unit() {
        return this.x0Unit;
    }

    public void setX0Unit(String x0Unit) {
        this.x0Unit = x0Unit;
    }

    public String getBchUnit() {
        return this.bchUnit;
    }

    public void setBchUnit(String bchUnit) {
        this.bchUnit = bchUnit;
    }

    public String getMaximumloadcurrentSegment() {
        return this.maximumloadcurrentSegment;
    }

    public void setMaximumloadcurrentSegment(String maximumloadcurrentSegment) {
        this.maximumloadcurrentSegment = maximumloadcurrentSegment;
    }

    public String getRSegment() {
        return this.RSegment;
    }

    public void setRSegment(String RSegment) {
        this.RSegment = RSegment;
    }

    public String getXSegment() {
        return this.XSegment;
    }

    public void setXSegment(String XSegment) {
        this.XSegment = XSegment;
    }

    public String getR0Segment() {
        return this.r0Segment;
    }

    public void setR0Segment(String r0Segment) {
        this.r0Segment = r0Segment;
    }

    public String getX0Segment() {
        return this.x0Segment;
    }

    public void setX0Segment(String x0Segment) {
        this.x0Segment = x0Segment;
    }

    public String getBchSegment() {
        return this.bchSegment;
    }

    public void setBchSegment(String bchSegment) {
        this.bchSegment = bchSegment;
    }

    public String getRSegmentPu() {
        return this.RSegmentPu;
    }

    public void setRSegmentPu(String RSegmentPu) {
        this.RSegmentPu = RSegmentPu;
    }

    public String getXSegmentPu() {
        return this.XSegmentPu;
    }

    public void setXSegmentPu(String XSegmentPu) {
        this.XSegmentPu = XSegmentPu;
    }

    public String getR0SegmentPu() {
        return this.r0SegmentPu;
    }

    public void setR0SegmentPu(String r0SegmentPu) {
        this.r0SegmentPu = r0SegmentPu;
    }

    public String getX0SegmentPu() {
        return this.x0SegmentPu;
    }

    public void setX0SegmentPu(String x0SegmentPu) {
        this.x0SegmentPu = x0SegmentPu;
    }

    public String getBchSegmentPu() {
        return this.bchSegmentPu;
    }

    public void setBchSegmentPu(String bchSegmentPu) {
        this.bchSegmentPu = bchSegmentPu;
    }

    public Float getR() {
        return this.r;
    }

    public void setR(Float r) {
        this.r = r;
    }

    public Float getX() {
        return this.x;
    }

    public void setX(Float x) {
        this.x = x;
    }

    public Float getR0() {
        return this.r0;
    }

    public void setR0(Float r0) {
        this.r0 = r0;
    }

    public Float getX0() {
        return this.x0;
    }

    public void setX0(Float x0) {
        this.x0 = x0;
    }

    public Float getBch() {
        return this.bch;
    }

    public void setBch(Float bch) {
        this.bch = bch;
    }

    public Float getRMeasurement() {
        return this.RMeasurement;
    }

    public void setRMeasurement(Float RMeasurement) {
        this.RMeasurement = RMeasurement;
    }

    public Float getXMeasurement() {
        return this.XMeasurement;
    }

    public void setXMeasurement(Float XMeasurement) {
        this.XMeasurement = XMeasurement;
    }

    public Float getR0Measurement() {
        return this.r0Measurement;
    }

    public void setR0Measurement(Float r0Measurement) {
        this.r0Measurement = r0Measurement;
    }

    public Float getX0Measurement() {
        return this.x0Measurement;
    }

    public void setX0Measurement(Float x0Measurement) {
        this.x0Measurement = x0Measurement;
    }

    public Float getBchMeasurement() {
        return this.bchMeasurement;
    }

    public void setBchMeasurement(Float bchMeasurement) {
        this.bchMeasurement = bchMeasurement;
    }

    public Float getZ() {
        return this.z;
    }

    public void setZ(Float z) {
        this.z = z;
    }

    public Float getAngle() {
        return this.angle;
    }

    public void setAngle(Float angle) {
        this.angle = angle;
    }

    public Float getZ0() {
        return this.z0;
    }

    public void setZ0(Float z0) {
        this.z0 = z0;
    }

    public Float getAngle0() {
        return this.angle0;
    }

    public void setAngle0(Float angle0) {
        this.angle0 = angle0;
    }

    public Float getRPu() {
        return this.RPu;
    }

    public void setRPu(Float RPu) {
        this.RPu = RPu;
    }

    public Float getXPu() {
        return this.XPu;
    }

    public void setXPu(Float XPu) {
        this.XPu = XPu;
    }

    public Float getR0Pu() {
        return this.r0Pu;
    }

    public void setR0Pu(Float r0Pu) {
        this.r0Pu = r0Pu;
    }

    public Float getX0Pu() {
        return this.x0Pu;
    }

    public void setX0Pu(Float x0Pu) {
        this.x0Pu = x0Pu;
    }

    public Float getBchPu() {
        return this.bchPu;
    }

    public void setBchPu(Float bchPu) {
        this.bchPu = bchPu;
    }

    public Float getZPu() {
        return this.ZPu;
    }

    public void setZPu(Float ZPu) {
        this.ZPu = ZPu;
    }

    public Float getAnglePu() {
        return this.anglePu;
    }

    public void setAnglePu(Float anglePu) {
        this.anglePu = anglePu;
    }

    public Float getZ0Pu() {
        return this.z0Pu;
    }

    public void setZ0Pu(Float z0Pu) {
        this.z0Pu = z0Pu;
    }

    public Float getAngle0Pu() {
        return this.angle0Pu;
    }

    public void setAngle0Pu(Float angle0Pu) {
        this.angle0Pu = angle0Pu;
    }

    public Float getMaximumloadcurrent() {
        return this.maximumloadcurrent;
    }

    public void setMaximumloadcurrent(Float maximumloadcurrent) {
        this.maximumloadcurrent = maximumloadcurrent;
    }

    public Short getIssubline() {
        return this.issubline;
    }

    public void setIssubline(Short issubline) {
        this.issubline = issubline;
    }

    public Short getThinkofoverhaul() {
        return this.thinkofoverhaul;
    }

    public void setThinkofoverhaul(Short thinkofoverhaul) {
        this.thinkofoverhaul = thinkofoverhaul;
    }

    public Short getSequencedisplaytype() {
        return this.sequencedisplaytype;
    }

    public void setSequencedisplaytype(Short sequencedisplaytype) {
        this.sequencedisplaytype = sequencedisplaytype;
    }

    public Short getOverloadstate() {
        return this.overloadstate;
    }

    public void setOverloadstate(Short overloadstate) {
        this.overloadstate = overloadstate;
    }

    public Short getParametersource() {
        return this.parametersource;
    }

    public void setParametersource(Short parametersource) {
        this.parametersource = parametersource;
    }

    public Short getValuedisplaytype() {
        return this.valuedisplaytype;
    }

    public void setValuedisplaytype(Short valuedisplaytype) {
        this.valuedisplaytype = valuedisplaytype;
    }

    public Short getDefaultvalue() {
        return this.defaultvalue;
    }

    public void setDefaultvalue(Short defaultvalue) {
        this.defaultvalue = defaultvalue;
    }

    public Float getBasecurrent() {
        return this.basecurrent;
    }

    public void setBasecurrent(Float basecurrent) {
        this.basecurrent = basecurrent;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCompany() {
        return this.company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

}