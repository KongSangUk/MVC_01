package com.hello.servlet.web.frontcontroller.v4.controller;


import com.hello.servlet.bomain.member.Member;
import com.hello.servlet.bomain.member.MemberRepository;
import com.hello.servlet.web.frontcontroller.v4.ControllerV4;

import java.util.List;
import java.util.Map;

public class MemberListControllerV4 implements ControllerV4 {

    private final MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    public String process(Map<String, String> paramMap, Map<String, Object> model) {
        List<Member> members = memberRepository.findAll();

        model.put("members", members);
        return "members";
    }
}
