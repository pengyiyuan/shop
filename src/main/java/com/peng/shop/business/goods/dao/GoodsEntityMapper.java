package com.peng.shop.business.goods.dao;

import com.peng.shop.business.goods.entity.GoodsEntity;
import com.peng.shop.business.goods.entity.GoodsEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated Sat Nov 14 17:45:49 CST 2020
     */
    long countByExample(GoodsEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated Sat Nov 14 17:45:49 CST 2020
     */
    int deleteByExample(GoodsEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated Sat Nov 14 17:45:49 CST 2020
     */
    int deleteByPrimaryKey(Long goodsId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated Sat Nov 14 17:45:49 CST 2020
     */
    int insert(GoodsEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated Sat Nov 14 17:45:49 CST 2020
     */
    int insertSelective(GoodsEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated Sat Nov 14 17:45:49 CST 2020
     */
    List<GoodsEntity> selectByExample(GoodsEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated Sat Nov 14 17:45:49 CST 2020
     */
    GoodsEntity selectByPrimaryKey(Long goodsId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated Sat Nov 14 17:45:49 CST 2020
     */
    int updateByExampleSelective(@Param("record") GoodsEntity record, @Param("example") GoodsEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated Sat Nov 14 17:45:49 CST 2020
     */
    int updateByExample(@Param("record") GoodsEntity record, @Param("example") GoodsEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated Sat Nov 14 17:45:49 CST 2020
     */
    int updateByPrimaryKeySelective(GoodsEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated Sat Nov 14 17:45:49 CST 2020
     */
    int updateByPrimaryKey(GoodsEntity record);
}