package com.model.builder;

public class Parlour {
    private String wall;
    private String TV;
    private String sofa;

    public void setWall(String wall) {
        this.wall = wall;
    }

    public void setTV(String TV) {
        this.TV = TV;
    }

    public void setSofa(String sofa) {
        this.sofa = sofa;
    }

    public void show(){
        System.out.println("创建完成后的客厅");
        System.out.println(wall+","+sofa+","+TV);
    }
}
