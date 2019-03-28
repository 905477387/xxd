package com.xxd.mappers;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import com.xxd.models.XxdCGoodsSku;

public class XxdCGoodsSkuSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_c_goods_sku
     *
     * @mbggenerated
     */
    public String insertSelective(XxdCGoodsSku record) {
        BEGIN();
        INSERT_INTO("xxd_c_goods_sku");
        
        if (record.getId() != null) {
            VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getNum() != null) {
            VALUES("num", "#{num,jdbcType=INTEGER}");
        }
        
        if (record.getGoodId() != null) {
            VALUES("good_id", "#{goodId,jdbcType=VARCHAR}");
        }
        
        if (record.getMoney() != null) {
            VALUES("money", "#{money,jdbcType=REAL}");
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_c_goods_sku
     *
     * @mbggenerated
     */
    public String updateByPrimaryKeySelective(XxdCGoodsSku record) {
        BEGIN();
        UPDATE("xxd_c_goods_sku");
        
        if (record.getNum() != null) {
            SET("num = #{num,jdbcType=INTEGER}");
        }
        
        if (record.getGoodId() != null) {
            SET("good_id = #{goodId,jdbcType=VARCHAR}");
        }
        
        if (record.getMoney() != null) {
            SET("money = #{money,jdbcType=REAL}");
        }
        
        WHERE("id = #{id,jdbcType=INTEGER}");
        
        return SQL();
    }
}