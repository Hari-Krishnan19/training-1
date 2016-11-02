package com.htcinc.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by peris on 10/19/16.
 */
@Entity
@Table(name="Holdings_t",schema ="training")
public class Holdings {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="holdings_id")
    public Integer id;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="holdings_id")
    private List<Item> item;

    @Column(name="holdings_content")
    private String content;


    public void setId(Integer id) {
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
