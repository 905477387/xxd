package com.xxd.mappers;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import com.xxd.models.XxdIntegrationFreeze;

public class XxdIntegrationFreezeSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_integration_freeze
     *
     * @mbggenerated
     */
    public String insertSelective(XxdIntegrationFreeze record) {
        BEGIN();
        INSERT_INTO("xxd_integration_freeze");
        
        if (record.getId() != null) {
            VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getBuyUid() != null) {
            VALUES("buy_uid", "#{buyUid,jdbcType=INTEGER}");
        }
        
        if (record.getFreezeType() != null) {
            VALUES("freeze_type", "#{freezeType,jdbcType=SMALLINT}");
        }
        
        if (record.getTime() != null) {
            VALUES("time", "#{time,jdbcType=VARCHAR}");
        }
        
        if (record.getTimes() != null) {
            VALUES("times", "#{times,jdbcType=VARCHAR}");
        }
        
        if (record.getIntegration() != null) {
            VALUES("integration", "#{integration,jdbcType=DECIMAL}");
        }
        
        if (record.getUid() != null) {
            VALUES("uid", "#{uid,jdbcType=INTEGER}");
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_integration_freeze
     *
     * @mbggenerated
     */
    public String updateByPrimaryKeySelective(XxdIntegrationFreeze record) {
        BEGIN();
        UPDATE("xxd_integration_freeze");
        
        if (record.getBuyUid() != null) {
            SET("buy_uid = #{buyUid,jdbcType=INTEGER}");
        }
        
        if (record.getFreezeType() != null) {
            SET("freeze_type = #{freezeType,jdbcType=SMALLINT}");
        }
        
        if (record.getTime() != null) {
            SET("time = #{time,jdbcType=VARCHAR}");
        }
        
        if (record.getTimes() != null) {
            SET("times = #{times,jdbcType=VARCHAR}");
        }
        
        if (record.getIntegration() != null) {
            SET("integration = #{integration,jdbcType=DECIMAL}");
        }
        
        if (record.getUid() != null) {
            SET("uid = #{uid,jdbcType=INTEGER}");
        }
        
        WHERE("id = #{id,jdbcType=INTEGER}");
        
        return SQL();
    }
}