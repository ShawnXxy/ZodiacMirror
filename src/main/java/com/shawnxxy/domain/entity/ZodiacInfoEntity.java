package com.shawnxxy.domain.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // 使用@Entity注解来使ZodiacInfoEntity作为实体被管理，同时也会在mysql中生成对应ZodiacInfoEntity的表
@Table(name = "ZodiacInfo")
public class ZodiacInfoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long zid;
    int zodiacId;
    String zodiacName;
    /**
     * 
     * 1: year 2: week 3: today 4: tomorrow 5: month
     * 
     */
    int infoType;
    String date;
    String summary;
    String money;
    String career;
    String love;
    String health;
    String job;
    String preSummary;
    String star;
    String color;
    int number;

    public long getZid() {
        return zid;
    }

    public void setZid(long zid) {
        this.zid = zid;
    }

    public int getZodiacId() {
        return zodiacId;
    }

    public void setZodiacId(int zodiacId) {
        this.zodiacId = zodiacId;
    }

    public String getZodiacName() {
        return zodiacName;
    }

    public void setZodiacName(String zodiacName) {
        this.zodiacName = zodiacName;
    }

    public int getInfoType() {
        return infoType;
    }

    public void setInfoType(int infoType) {
        this.infoType = infoType;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public String getLove() {
        return love;
    }

    public void setLove(String love) {
        this.love = love;
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getPreSummary() {
        return preSummary;
    }

    public void setPreSummary(String preSummary) {
        this.preSummary = preSummary;
    }

    public String getStar() {
        return star;
    }

    public void setStar(String star) {
        this.star = star;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

}
