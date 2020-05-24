package com.model.realizetype.realizetype_manager;

import java.util.HashMap;

public class ProtoTypeManager {
    private HashMap<String,Shape> hashMap = new HashMap<String, Shape>();

    public ProtoTypeManager(){
        hashMap.put("Circle",new Circle());
        hashMap.put("Square",new Square());
    }

    public void addShape(String key,Shape obj){
        hashMap.put(key,obj);
    }

    public Shape getShape(String key){
        Shape shape = hashMap.get(key);
        return (Shape) shape.clone();
    }
}
