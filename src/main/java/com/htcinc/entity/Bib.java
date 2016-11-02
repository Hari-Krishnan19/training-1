package com.htcinc.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by peris on 10/19/16.
 */
@Entity
@Table(name="bib_t",schema ="training")
public class Bib {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="bib_id")
    private Integer id;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="bibs_id")
    private List<Holdings> holdings;

    @Column(name="bibs_content")
    private String content;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setHoldings(List<Holdings> holdings) {
        this.holdings = holdings;
    }

    public List<Holdings> getHoldings() {
        return holdings;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
