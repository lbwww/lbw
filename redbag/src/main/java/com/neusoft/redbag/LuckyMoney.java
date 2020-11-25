package com.neusoft.redbag;

import lombok.Data;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity


public class LuckyMoney {
    @Id
    @GeneratedValue
    private Integer id;


    private BigDecimal money;


    private String producer;


    private String conumer;
    public LuckyMoney(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getConumer() {
        return conumer;
    }

    public void setConumer(String conumer) {
        this.conumer = conumer;
    }
}
