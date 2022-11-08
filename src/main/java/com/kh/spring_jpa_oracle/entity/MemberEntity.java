package com.kh.spring_jpa_oracle.entity;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "member")
public class MemberEntity {
    @Id
    private String id;
    private String pwd;
    private String name;
    private String addr;
    private String email;
    private String register;
}
