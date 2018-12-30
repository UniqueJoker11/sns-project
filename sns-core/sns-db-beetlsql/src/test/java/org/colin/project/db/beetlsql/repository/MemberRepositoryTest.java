package org.colin.project.db.beetlsql.repository;

import com.alibaba.fastjson.JSON;
import org.colin.project.db.beetlsql.config.BasicSpringTestConfig;
import org.colin.project.db.beetlsql.po.MemberPO;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by joker on 2018/12/23.
 */
public class MemberRepositoryTest extends BasicSpringTestConfig{

    @Autowired
    MemberRepository memberRepository;


    @Test
    public void testGetMemberByPhoneOrEmail(){
        String loginName="admin@jeesns.cn";
        MemberPO memberPO=memberRepository.getMemberByPhoneOrEmail(loginName);
    }
}
