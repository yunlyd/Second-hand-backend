package com.yunyd.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * 收藏
 * @lyd
 * @date 2024/7/31
 */
@Data
public class Collect implements Serializable {
    /**
     * ID
     */
    private Integer id;

    /**
     * 关联ID
     */
    private Integer fid;

    /**
     * 收藏人ID
     */
    private Integer userId;

    /**
     * 模块
     */
    private String module;

    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 商品图片
     */
    private String goodsImg;

    private static final long serialVersionUID = 1L;
}