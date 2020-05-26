package com.model.main;

import com.model.abstractFactory.Animal;
import com.model.abstractFactory.Farm;
import com.model.abstractFactory.Plant;
import com.model.builder.Decorator;
import com.model.builder.Parlour;
import com.model.builder.ProjectManager;
import com.model.factory.AbstractFactory;
import com.model.factory.Product;
import com.model.utils.ReadXML;

public class Main {
    public static void main(String[] args) {
        Decorator decorator;
        decorator = (Decorator) ReadXML.getObject();
        ProjectManager projectManager = new ProjectManager(decorator);
        Parlour p = projectManager.decorate();
        p.show();
    }
}
