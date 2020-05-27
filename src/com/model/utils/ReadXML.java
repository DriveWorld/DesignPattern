package com.model.utils;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;

public class ReadXML {
    public static Object getObject(){
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document;
            document = documentBuilder.parse(new File("src/com/model/adapter/config.xml"));
            NodeList nodeList = document.getElementsByTagName("className");
            Node classNode = nodeList.item(0).getFirstChild();
            String cName = "com.model.adapter." + classNode.getNodeValue();
            Class<?> c = Class.forName(cName);
            Object object = c.newInstance();
            return object;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
