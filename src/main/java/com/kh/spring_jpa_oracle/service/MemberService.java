package com.kh.spring_jpa_oracle.service;

import com.kh.spring_jpa_oracle.entity.MemberEntity;

import java.util.List;

public interface MemberService {
    // 회원 가입 여부 확인
    boolean isMemberName(String id);
    // 회원 가입
    boolean memberRegister();
    // 전체 회원 조회
    List<MemberEntity> memberList();

}
