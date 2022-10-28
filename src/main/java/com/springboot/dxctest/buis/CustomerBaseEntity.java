package com.springboot.dxctest.buis;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * customer base
 *
 * @author lzb
 * @since 1.0.0 2022-10-25
 */
@Data
@EqualsAndHashCode(callSuper=false)
@TableName("customer_base")
public class CustomerBaseEntity extends BaseEntity {
	private static final long serialVersionUID = 1L;

    /**
     * user mobile
     */
	private String userMobile;
    /**
     * login error times
     */
	private Integer loginErrorTimes;
    /**
     * last login time
     */
	private Date lastLoginTime;
    /**
     * updater
     */
	@TableField(fill = FieldFill.INSERT_UPDATE)
	private Long updater;
    /**
     * update date
     */
	@TableField(fill = FieldFill.INSERT_UPDATE)
	private Date updateDate;
    /**
     * delete flag
     */
	@TableLogic(value = "N", delval = "Y")
	private String deleteFlag;
}
