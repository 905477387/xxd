package com.xxd.mappers;

import com.xxd.models.XxdCGoodsSku;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface XxdCGoodsSkuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_c_goods_sku
     *
     * @mbggenerated
     */
    @Delete({
        "delete from xxd_c_goods_sku",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_c_goods_sku
     *
     * @mbggenerated
     */
    @Insert({
        "insert into xxd_c_goods_sku (id, num, ",
        "good_id, money)",
        "values (#{id,jdbcType=INTEGER}, #{num,jdbcType=INTEGER}, ",
        "#{goodId,jdbcType=VARCHAR}, #{money,jdbcType=REAL})"
    })
    int insert(XxdCGoodsSku record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_c_goods_sku
     *
     * @mbggenerated
     */
    @InsertProvider(type=XxdCGoodsSkuSqlProvider.class, method="insertSelective")
    int insertSelective(XxdCGoodsSku record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_c_goods_sku
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "id, num, good_id, money",
        "from xxd_c_goods_sku",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="num", property="num", jdbcType=JdbcType.INTEGER),
        @Result(column="good_id", property="goodId", jdbcType=JdbcType.VARCHAR),
        @Result(column="money", property="money", jdbcType=JdbcType.REAL)
    })
    XxdCGoodsSku selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_c_goods_sku
     *
     * @mbggenerated
     */
    @UpdateProvider(type=XxdCGoodsSkuSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(XxdCGoodsSku record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_c_goods_sku
     *
     * @mbggenerated
     */
    @Update({
        "update xxd_c_goods_sku",
        "set num = #{num,jdbcType=INTEGER},",
          "good_id = #{goodId,jdbcType=VARCHAR},",
          "money = #{money,jdbcType=REAL}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(XxdCGoodsSku record);
}