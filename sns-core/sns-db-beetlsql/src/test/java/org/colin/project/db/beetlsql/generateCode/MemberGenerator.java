package org.colin.project.db.beetlsql.generateCode;

import org.beetl.sql.core.SQLManager;
import org.colin.project.db.beetlsql.config.BasicSpringTestConfig;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by joker on 2018/12/23.
 */
public class MemberGenerator extends BasicSpringTestConfig{
    @Autowired
    SQLManager sqlManager;

    private String member_table="tbl_member";
    private String member_address_table="tbl_member_address_info";
    private String member_contact_table="tbl_member_contact_info";
    private String member_attach_table="tbl_member_attach_info";
    private String member_fans_table="tbl_member_fans";
    private String member_honer_table="tbl_member_honer_info";
    private String member_level_table="tbl_member_level";
    private String member_login_table="tbl_member_login_info";
    private String member_registertion_table="tbl_member_registion_info";
    private String member_token_table="tbl_member_token";

    @Test
    public void generateMemberPoCode() throws Exception {
       sqlManager.genPojoCode(member_table,"org.colin.project.db.beetlsql.po",BasicGeneratorUtils.getGenConfig());
    }

    @Test
    public void generateMemberAddressInfoPoCode() throws Exception {
        sqlManager.genPojoCode(member_address_table,"org.colin.project.db.beetlsql.po",BasicGeneratorUtils.getGenConfig());
    }
    @Test
    public void generateMemberContactPoCode() throws Exception {
        sqlManager.genPojoCode(member_contact_table,"org.colin.project.db.beetlsql.po",BasicGeneratorUtils.getGenConfig());
    }
    @Test
    public void generateMemberAttachPoCode() throws Exception {
        sqlManager.genPojoCode(member_attach_table,"org.colin.project.db.beetlsql.po",BasicGeneratorUtils.getGenConfig());
    }
    @Test
    public void generateMemberFansPoCode() throws Exception {
        sqlManager.genPojoCode(member_fans_table,"org.colin.project.db.beetlsql.po",BasicGeneratorUtils.getGenConfig());
    }
    @Test
    public void generateMemberHonerPoCode() throws Exception {
        sqlManager.genPojoCode(member_honer_table,"org.colin.project.db.beetlsql.po",BasicGeneratorUtils.getGenConfig());
    }
    @Test
    public void generateMemberLevelPoCode() throws Exception {
        sqlManager.genPojoCode(member_level_table,"org.colin.project.db.beetlsql.po",BasicGeneratorUtils.getGenConfig());
    }
    @Test
    public void generateMemberLoginPoCode() throws Exception {
        sqlManager.genPojoCode(member_login_table,"org.colin.project.db.beetlsql.po",BasicGeneratorUtils.getGenConfig());
    }
    @Test
    public void generateMemberRegistionPoCode() throws Exception {
        sqlManager.genPojoCode(member_registertion_table,"org.colin.project.db.beetlsql.po",BasicGeneratorUtils.getGenConfig());
    }
    @Test
    public void generateMemberTokenPoCode() throws Exception {
        sqlManager.genPojoCode(member_token_table,"org.colin.project.db.beetlsql.po",BasicGeneratorUtils.getGenConfig());
    }
}
