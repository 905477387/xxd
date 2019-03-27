package com.xxd.mappers;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import com.xxd.models.XxdGoodsClass;

public class XxdGoodsClassSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_goods_class
     *
     * @mbggenerated
     */
    public String insertSelective(XxdGoodsClass record) {
        BEGIN();
        INSERT_INTO("xxd_goods_class");
        
        if (record.getId() != null) {
            VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getName() != null) {
            VALUES("name", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getParentId() != null) {
            VALUES("parent_id", "#{parentId,jdbcType=INTEGER}");
        }
        
        if (record.getLevel() != null) {
            VALUES("level", "#{level,jdbcType=SMALLINT}");
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_goods_class
     *
     * @mbggenerated
     */
    public String updateByPrimaryKeySelective(XxdGoodsClass record) {
        BEGIN();
        UPDATE("xxd_goods_class");
        
        if (record.getName() != null) {
            SET("name = #{name,jdbcType=VARCHAR}");
        }
        
        if (record.getParentId() != null) {
            SET("parent_id = #{parentId,jdbcType=INTEGER}");
        }
        
        if (record.getLevel() != null) {
            SET("level = #{level,jdbcType=SMALLINT}");
        }
        
        WHERE("id = #{id,jdbcType=INTEGER}");
        
        return SQL();
    }
}