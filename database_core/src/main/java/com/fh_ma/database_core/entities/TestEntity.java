package com.fh_ma.database_core.entities;

@jakarta.persistence.Entity
public class TestEntity extends Entity {
    private String name;

    public TestEntity(String name) {
        this.name = name;
    }

    public TestEntity() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
