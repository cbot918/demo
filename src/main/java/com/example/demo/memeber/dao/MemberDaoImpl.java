package com.example.demo.memeber.dao;


import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class MemberDaoImpl implements MemberDao {

    private final MemberRepository memberRepository;

    public MemberDaoImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void createMember(MemberEntity memberEntity) {
        memberRepository.save(memberEntity);
    }
}
