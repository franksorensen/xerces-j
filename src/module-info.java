module xercesImpl {

    requires java.xml;
    requires java.desktop;
    requires jdk.xml.dom;
    
    requires static xml.resolver;
    requires junit;
    
    exports org.apache.xerces.dom;
    exports org.apache.xerces.jaxp;
    exports org.apache.xerces.jaxp.datatype;
    exports org.apache.xerces.impl.dv;
    exports org.apache.xerces.impl.dv.util;
    exports org.apache.xerces.impl.validation;

    uses javax.xml.parsers.DocumentBuilderFactory;
    uses javax.xml.parsers.SAXParserFactory;
    uses javax.xml.datatype.DatatypeFactory;
    uses javax.xml.validation.SchemaFactory;
    uses javax.xml.stream.XMLEventFactory;
    
    uses org.xml.sax.XMLReader;


    provides javax.xml.parsers.DocumentBuilderFactory with org.apache.xerces.jaxp.DocumentBuilderFactoryImpl;
    provides javax.xml.parsers.SAXParserFactory with org.apache.xerces.jaxp.SAXParserFactoryImpl;
    provides javax.xml.datatype.DatatypeFactory with org.apache.xerces.jaxp.datatype.DatatypeFactoryImpl;
    provides javax.xml.validation.SchemaFactory with org.apache.xerces.jaxp.validation.XMLSchemaFactory;
    provides javax.xml.stream.XMLEventFactory with org.apache.xerces.stax.XMLEventFactoryImpl;
    
    provides org.xml.sax.XMLReader with org.apache.xerces.parsers.SAXParser;
    


}