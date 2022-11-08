package com.kh.spring_jpa_oracle.service;

public interface MemberService {
    boolean isRegCheck(String id);
    boolean memberRegister(String is, String pwd);

}
