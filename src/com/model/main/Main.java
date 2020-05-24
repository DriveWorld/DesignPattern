package com.model.main;

import com.model.factory.AbstractFactory;
import com.model.factory.Product;
import com.model.factory.ReadXML1;
import com.model.realizetype.Citation;
import com.model.realizetype.Realizetype;
import com.model.realizetype.realizetype_manager.ProtoTypeManager;
import com.model.realizetype.realizetype_manager.Shape;
import com.model.singleton.singleton_eager.Pig;
import com.model.singleton.singleton_lazy.President;

public class Main {
    public static void main(String[] args) {
        Product product;
        AbstractFactory abstractFactory;
        abstractFactory = (AbstractFactory) ReadXML1.getObject();
        product = abstractFactory.newProduct();
        product.show();
    }
}
