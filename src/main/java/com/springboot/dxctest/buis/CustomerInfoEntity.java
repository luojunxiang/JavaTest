package  com.springboot.dxctest.buis;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * ${comments}
 *
 * @author lzb
 * @since 1.0.0 2022-10-24
 */
@Data
@EqualsAndHashCode(callSuper=false)
@TableName("customer_info")
public class CustomerInfoEntity extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * $column.comments
     */
    private Long id;
    /**
     * $column.comments
     */
    private String userName;
    /**
     * $column.comments
     */
    private String userMobile;
    /**
     * $column.comments
     */
    private Integer userEntType;
    /**
     * $column.comments
     */
    private Integer userManType;
    /**
     * $column.comments
     */
    private Integer vehicleOwner;
    /**
     * $column.comments
     */
    private String vehicleProvince;
    /**
     * $column.comments
     */
    private String vehicleCity;
    /**
     * $column.comments
     */
    private String vehicleDistrict;
    /**
     * $column.comments
     */
    private String userEmail;
    /**
     * $column.comments
     */
    private Integer vehicleCert;
    /**
     * $column.comments
     */
    private String deregistLocation;
    /**
     * $column.comments
     */
   /* private Date createDate;
    *//**
     * $column.comments
     *//*
    private Long creator;*/
    /**
     * $column.comments
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateDate;
    /**
     * $column.comments
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Long updater;
    /**
     * $column.comments
     */
    @TableLogic(value = "N", delval = "Y")
    private String deleteFlag;
}
