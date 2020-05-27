package com.model.adapter;

public class ObjectAdapter implements Target {
    private Adapter adapter;

    public ObjectAdapter(Adapter adapter){
        this.adapter = adapter;
    }

    @Override
    public void request() {
        adapter.specificRequest();
    }
}
