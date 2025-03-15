```aiignore
+-------------------+        +-------------------+
| DataConverter    |◄-------| XmlToJsonAdapter  |
|-------------------|        |-------------------|
| convert(String)  |        | convert(String)   |
+-------------------+        | xmlService: XmlService |
                             +-------------------+
                                      ▲
                                      |
                      +---------------------------+
                      | XmlService                 |
                      |---------------------------|
                      | convertToXml(String)      |
                      | convertToJson(String)     |
                      +---------------------------+


```