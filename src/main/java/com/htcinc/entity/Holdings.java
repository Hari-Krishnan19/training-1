package com.htcinc.entity;

import java.util.List;

/**
 * Created by peris on 10/19/16.
 */
public class Holdings {
    public Integer id;
    private List<Item> item;
    private String content;

    public void setId(int id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setItem(List<Item> item) {
        this.item = item;
    }

    public List<Item> getItem() {
        return item;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
