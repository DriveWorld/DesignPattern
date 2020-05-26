package com.model.builder;

public class ProjectManager {
    private Decorator builder;

    public ProjectManager(Decorator builder){
        this.builder = builder;
    }

    public Parlour decorate(){
        builder.buildWall();
        builder.buildTV();
        builder.buildSofa();
        return builder.getResult();
    }
}
