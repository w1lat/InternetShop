package com.AlephAlliance.model;

import org.springframework.context.annotation.Bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Vitalii on 08.09.2015.
 */

@Entity
@Table(name = "phones")
public class IPhone extends GeneratedIdentifierEntity{

    @Column(name = "memory", length = 5, nullable = false)
    private String memory;
    @Column(name = "color", length = 20, nullable = false)
    private String color;
    @Column(name = "cond", length = 20, nullable = false)
    private String condition;
    @Column(name = "model", length = 5, nullable = false)
    private String model;

    public IPhone() {
    }

    public IPhone(String memory, String color, String condition, String model) {
        this.memory = memory;
        this.color = color;
        this.condition = condition;
        this.model = model;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "IPhone{" +
                "memory='" + memory + '\'' +
                ", color='" + color + '\'' +
                ", condition='" + condition + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
