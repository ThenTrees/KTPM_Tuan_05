package com.thentrees.adapter;

public class XmlToJsonAdapter implements DataConverter {
    private final XmlService xmlService;

    public XmlToJsonAdapter(XmlService xmlService) {
        this.xmlService = xmlService;
    }
    @Override
    public String convert(String xmlData) throws Exception {
        return xmlService.convertToJson(xmlData);
    }
}
