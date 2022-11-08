package com.kh.spring_jpa_oracle.repository;

import com.kh.spring_jpa_oracle.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepo extends JpaRepository<MemberEntity, Long> {
    List<MemberEntity> findByName(String name);
    List<MemberEntity> findByNameLike(String name); // like '%TEXT%'
//    List<MemberEntity> findByNameLikeOrderByAddressDesc(String name);
//    List<MemberEntity> findByNameOrAddress(String name, String address);
}
