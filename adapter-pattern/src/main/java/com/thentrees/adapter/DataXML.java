package com.thentrees.adapter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

// Định nghĩa lớp dữ liệu chung cho cả JSON và XML
@JacksonXmlRootElement(localName = "data")
class DataXML {
    @JsonProperty("value")
    private String value;

    // Constructor mặc định bắt buộc cho Jackson
    public DataXML() {}

    public DataXML(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
