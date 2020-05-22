package com.model.realizetype;

public class Citation implements Cloneable {
    private String name;
    private String info;
    private String college;

    public Citation(String name,String info,String college){
        this.name = name;
        this.info = info;
        this.college = college;
        System.out.println("奖状创建成功");
    }

    public void display(){
        System.out.println(name+info+college);
    }

    public Object clone() throws CloneNotSupportedException {
        System.out.println("奖状拷贝成功");
        return (Citation)super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }
}
