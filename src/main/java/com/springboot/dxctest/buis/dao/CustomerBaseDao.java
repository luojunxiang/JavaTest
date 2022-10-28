package com.springboot.dxctest.buis.dao;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.springboot.dxctest.buis.CustomerBaseEntity;

/**
 * customer base
 *
 * @author lzb
 * @since 1.0.0 2022-10-25
 */
@Mapper
public interface CustomerBaseDao extends BaseDao<CustomerBaseEntity> {

    Long find(String userMobile);
	
}
