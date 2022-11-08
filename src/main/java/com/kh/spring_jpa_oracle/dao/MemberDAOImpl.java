package com.kh.spring_jpa_oracle.dao;

import com.kh.spring_jpa_oracle.repository.MemberRepo;
import org.springframework.stereotype.Component;

@Component
public class MemberDAOImpl implements MemberDAO{

    private MemberRepo memberRepo;

    public MemberDAOImpl(MemberRepo memberRepo) {
        this.memberRepo = memberRepo;
    }
}
