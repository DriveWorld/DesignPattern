package com.model.factory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;

public class ReadXML1 {
    public static Object getObject(){
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = documentBuilderFactory.newDocumentBuilder();
            Document document;
            document = builder.parse(new File("src/com/model/factory/config1.xml"));
            NodeList nodeList = document.getElementsByTagName("className");
            Node node = nodeList.item(0).getFirstChild();
            String cName = "com.model.factory."+node.getNodeValue();
            //System.out.println("新对象"+cName);
            Class<?> c = Class.forName(cName);
            Object object = c.newInstance();

            return object;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
