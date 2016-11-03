package com.htcinc.entity;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

/**
 * Created by harikrishnanv on 25/10/16.
 */
public class Subfields {

    private String code;
    private String desc;

    public void setCode(String code) {
        this.code = code;
    }

    @XmlAttribute(name="code")
    public String getCode() {
        return code;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @XmlValue
    public String getDesc() {
        return desc;
    }
}
