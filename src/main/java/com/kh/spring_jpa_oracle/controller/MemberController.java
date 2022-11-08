package com.kh.spring_jpa_oracle.controller;

import com.kh.spring_jpa_oracle.dto.MemberDto;
import com.kh.spring_jpa_oracle.entity.MemberEntity;
import com.kh.spring_jpa_oracle.repository.MemberRepo;
import com.kh.spring_jpa_oracle.service.MemberService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class MemberController {
    private MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    // 전체 회원 정보 조회
    @GetMapping("/member/list")
    public ResponseEntity<List<MemberEntity>> getMemberList() {
        List<MemberEntity> list = memberService.memberList();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    // 이름 회원 조회
    @GetMapping("/member")
    public boolean getMemberName(@RequestParam String name) {
        boolean isReg = memberService.isMemberName(name);
        return true;
    }

//    // 회원 가입
//    @PutMapping("/member")
//    public MemberEntity putMember(MemberEntity memberEntity) {
//        return repo.save(memberEntity);
//    }
//    // 회원 정보 수정
//    @PostMapping("/member")
//    public MemberEntity postMember(MemberEntity memberEntity) {
//        return repo.save(memberEntity);
//    }
//    // 회원 삭제
//    @DeleteMapping("/member")
//    public void deleteMember(Long id) {
//        repo.deleteById(id);
//    }
    // 전체 조회
//    @GetMapping("/member/list")
//    public List<MemberEntity> getMember() {
//        return repo.findAll();
//    }
//
//    // 제공하지 않는 API 만들기 : 이름으로 조회
//    @GetMapping("/member/name")
//    public List<MemberEntity> getMember(String name) {
//        return repo.findByName(name);

}