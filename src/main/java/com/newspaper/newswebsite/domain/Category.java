package com.newspaper.newswebsite.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "category")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Category {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long category_id;
    private String type;

    @ManyToMany(mappedBy = "category", cascade = { CascadeType.ALL })
    private Set<News> news = new HashSet<News>();


    public long getId() {
        return category_id;
    }

    public void setId(long id) {
        this.category_id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Category{" +
                "category_id=" + category_id +
                ", type='" + type + '\'' +
                '}';
    }
}
