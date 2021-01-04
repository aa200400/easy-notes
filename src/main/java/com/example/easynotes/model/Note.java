package com.example.easynotes.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "Item_tbl")
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String title;

    private String image;

    @Enumerated(EnumType.ORDINAL)
    private Type type;

    private String subtype;

    private boolean recycle;

    @Enumerated(EnumType.ORDINAL)
    private Condition cond;

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) { this.title = title; }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public boolean isRecycle() {
        return recycle;
    }

    public void setRecycle(boolean recycle) {
        this.recycle = recycle;
    }

    public Condition getCondition() {
        return cond;
    }

    public void setCondition(Condition condition) {
        this.cond = cond;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    enum Condition {
        Excellent, Good, Oily, Soiled
    }

    enum Type {
        Paper, Plastic, Glass, Metal, Hazardous, Unacceptable
    }
}
