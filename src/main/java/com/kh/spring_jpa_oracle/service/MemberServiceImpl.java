package com.kh.spring_jpa_oracle.service;

import com.kh.spring_jpa_oracle.entity.MemberEntity;
import com.kh.spring_jpa_oracle.repository.MemberRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService{

    private MemberRepo memberRepo;

    public MemberServiceImpl(MemberRepo memberRepo) {
        this.memberRepo = memberRepo;
    }

    @Override
    public boolean isMemberName(String name) {
        System.out.println(memberRepo.findByName(name));
        return true;
    }

    @Override
    public boolean memberRegister() {
        return false;
    }

    @Override
    public List<MemberEntity> memberList() {
        return memberRepo.findAll();
    }
}
