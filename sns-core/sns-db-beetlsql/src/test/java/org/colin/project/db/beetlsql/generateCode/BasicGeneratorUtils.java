package org.colin.project.db.beetlsql.generateCode;

import org.beetl.sql.ext.gen.GenConfig;

/**
 * Created by joker on 2018/12/23.
 */
public class BasicGeneratorUtils {

    /**
     *
     * @return
     */
    public static GenConfig getGenConfig(){
        GenConfig genConfig=new GenConfig();
        genConfig.setIgnorePrefix("tbl");
        genConfig.setImplSerializable(true);
        return genConfig;
    }
}
