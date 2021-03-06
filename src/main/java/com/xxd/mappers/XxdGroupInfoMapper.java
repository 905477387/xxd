package com.xxd.mappers;

import com.xxd.models.XxdGroupInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface XxdGroupInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_group_info
     *
     * @mbggenerated
     */
    @Delete({
        "delete from xxd_group_info",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_group_info
     *
     * @mbggenerated
     */
    @Insert({
        "insert into xxd_group_info (id, uid, ",
        "no, buy_order_id, ",
        "photo, into_time, ",
        "is_head, sta)",
        "values (#{id,jdbcType=INTEGER}, #{uid,jdbcType=INTEGER}, ",
        "#{no,jdbcType=VARCHAR}, #{buyOrderId,jdbcType=INTEGER}, ",
        "#{photo,jdbcType=VARCHAR}, #{intoTime,jdbcType=VARCHAR}, ",
        "#{isHead,jdbcType=VARCHAR}, #{sta,jdbcType=SMALLINT})"
    })
    int insert(XxdGroupInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_group_info
     *
     * @mbggenerated
     */
    @InsertProvider(type=XxdGroupInfoSqlProvider.class, method="insertSelective")
    int insertSelective(XxdGroupInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_group_info
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "id, uid, no, buy_order_id, photo, into_time, is_head, sta",
        "from xxd_group_info",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="uid", property="uid", jdbcType=JdbcType.INTEGER),
        @Result(column="no", property="no", jdbcType=JdbcType.VARCHAR),
        @Result(column="buy_order_id", property="buyOrderId", jdbcType=JdbcType.INTEGER),
        @Result(column="photo", property="photo", jdbcType=JdbcType.VARCHAR),
        @Result(column="into_time", property="intoTime", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_head", property="isHead", jdbcType=JdbcType.VARCHAR),
        @Result(column="sta", property="sta", jdbcType=JdbcType.SMALLINT)
    })
    XxdGroupInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_group_info
     *
     * @mbggenerated
     */
    @UpdateProvider(type=XxdGroupInfoSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(XxdGroupInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_group_info
     *
     * @mbggenerated
     */
    @Update({
        "update xxd_group_info",
        "set uid = #{uid,jdbcType=INTEGER},",
          "no = #{no,jdbcType=VARCHAR},",
          "buy_order_id = #{buyOrderId,jdbcType=INTEGER},",
          "photo = #{photo,jdbcType=VARCHAR},",
          "into_time = #{intoTime,jdbcType=VARCHAR},",
          "is_head = #{isHead,jdbcType=VARCHAR},",
          "sta = #{sta,jdbcType=SMALLINT}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(XxdGroupInfo record);
}