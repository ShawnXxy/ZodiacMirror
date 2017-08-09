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
    long Zid;
    int zodiacId;
    String zodiacName;
}
