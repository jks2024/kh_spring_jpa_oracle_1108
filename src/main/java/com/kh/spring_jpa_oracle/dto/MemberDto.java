package com.kh.spring_jpa_oracle.dto;

import lombok.Data;

@Data
public class MemberDto {
    private String id;
    private String pwd;
    private String name;
    private String addr;
    private String email;
    private String register;
}
