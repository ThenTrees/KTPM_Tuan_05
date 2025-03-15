package com.thentrees;

import com.thentrees.adapter.DataConverter;
import com.thentrees.adapter.JsonToXmlAdapter;
import com.thentrees.adapter.XmlService;
import com.thentrees.adapter.XmlToJsonAdapter;

public class Main {
    public static void main(String[] args) {
        try {
            XmlService xmlService = new XmlService();

            // Adapter chuyển từ XML -> JSON
            DataConverter xmlToJsonAdapter = new XmlToJsonAdapter(xmlService);
            String xmlData = "<data><value>Hello Adapter</value></data>";
            System.out.println("XML to JSON: " + xmlToJsonAdapter.convert(xmlData));

            // Adapter chuyển từ JSON -> XML
            DataConverter jsonToXmlAdapter = new JsonToXmlAdapter(xmlService);
            String jsonData = "{\"value\":\"Hello Adapter\"}";
            System.out.println("JSON to XML: " + jsonToXmlAdapter.convert(jsonData));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}