package com.kh.spring_jpa_oracle.controller;

import com.kh.spring_jpa_oracle.entity.MemberEntity;
import com.kh.spring_jpa_oracle.repository.MemberRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MemberController {
    // 여기서 단순한 CRUD는 직접 Repository로 접근하고 복잡한건 Service 로직 구현 하는게 좋을 듯
    private MemberRepo repo;
    public MemberController(MemberRepo repo) {
        this.repo = repo;
    }
    // 회원 가입
    @PutMapping("/member")
    public MemberEntity putMember(MemberEntity memberEntity) {
        return repo.save(memberEntity);
    }
    // 회원 정보 수정
    @PostMapping("/member")
    public MemberEntity postMember(MemberEntity memberEntity) {
        return repo.save(memberEntity);
    }
    // 회원 삭제
    @DeleteMapping("/member")
    public void deleteMember(Long id) {
        repo.deleteById(id);
    }
    // 전체 조회
    @GetMapping("/member/list")
    public List<MemberEntity> getMember() {
        return repo.findAll();
    }

    // 제공하지 않는 API 만들기 : 이름으로 조회
    @GetMapping("/member/name")
    public List<MemberEntity> getMember(String name) {
        return repo.findByName(name);
    }








}