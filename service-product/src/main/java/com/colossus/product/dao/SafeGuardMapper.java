package com.colossus.product.dao;

import com.colossus.product.model.SafeGuard;

public interface SafeGuardMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table safe_guard
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table safe_guard
     *
     * @mbg.generated
     */
    int insert(SafeGuard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table safe_guard
     *
     * @mbg.generated
     */
    int insertSelective(SafeGuard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table safe_guard
     *
     * @mbg.generated
     */
    SafeGuard selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table safe_guard
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(SafeGuard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table safe_guard
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SafeGuard record);
}