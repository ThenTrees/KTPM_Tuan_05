package com.thentrees.adapter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class XmlService {
    private final XmlMapper xmlMapper = new XmlMapper();
    private final ObjectMapper objectMapper = new ObjectMapper();

    // Chuyển đổi từ Object sang XML
    public String convertToXml(String jsonData) throws Exception {
        DataXML dataObject = objectMapper.readValue(jsonData, DataXML.class);
        return xmlMapper.writeValueAsString(dataObject);
    }

    // Chuyển đổi từ XML sang JSON
    public String convertToJson(String xmlData) throws Exception {
        DataXML dataObject = xmlMapper.readValue(xmlData, DataXML.class);
        return objectMapper.writeValueAsString(dataObject);
    }
}
