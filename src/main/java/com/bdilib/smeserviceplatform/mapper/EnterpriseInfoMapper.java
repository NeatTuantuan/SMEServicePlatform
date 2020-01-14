package com.bdilib.smeserviceplatform.mapper;

import com.bdilib.smeserviceplatform.dao.EnterpriseInfo;

public interface EnterpriseInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table enterprise_info
     *
     * @mbggenerated Mon Jan 13 19:14:30 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table enterprise_info
     *
     * @mbggenerated Mon Jan 13 19:14:30 CST 2020
     */
    int insert(EnterpriseInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table enterprise_info
     *
     * @mbggenerated Mon Jan 13 19:14:30 CST 2020
     */
    int insertSelective(EnterpriseInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table enterprise_info
     *
     * @mbggenerated Mon Jan 13 19:14:30 CST 2020
     */
    EnterpriseInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table enterprise_info
     *
     * @mbggenerated Mon Jan 13 19:14:30 CST 2020
     */
    int updateByPrimaryKeySelective(EnterpriseInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table enterprise_info
     *
     * @mbggenerated Mon Jan 13 19:14:30 CST 2020
     */
    int updateByPrimaryKeyWithBLOBs(EnterpriseInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table enterprise_info
     *
     * @mbggenerated Mon Jan 13 19:14:30 CST 2020
     */
    int updateByPrimaryKey(EnterpriseInfo record);
}