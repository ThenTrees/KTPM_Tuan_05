package com.thentrees.adapter;

public class JsonToXmlAdapter implements DataConverter {
    private final XmlService xmlService;

    public JsonToXmlAdapter(XmlService xmlService) {
        this.xmlService = xmlService;
    }

    @Override
    public String convert(String jsonData) throws Exception {
        return xmlService.convertToXml(jsonData);
    }
}
