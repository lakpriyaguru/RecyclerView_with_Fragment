package com.example.recyclerview;

public class datamodel {

    String header;

    public datamodel(String header, String desc) {
        this.header = header;
        this.desc = desc;
    }

    String desc;

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
