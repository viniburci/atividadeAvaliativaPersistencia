package com.example.demo;

import java.util.Objects;
import java.util.UUID;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseEntity {
    
    @Id
    private String id;


    public BaseEntity() {
        super();
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof BaseEntity)) {
            return false;
        }
        BaseEntity baseEntity = (BaseEntity) o;
        return Objects.equals(id, BaseEntity.id);
    }

    @Override
    public int hashCode(){
        return Objects.hashCode(id);
    }
}
