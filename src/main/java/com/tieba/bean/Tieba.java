package com.tieba.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (Tieba)实体类
 *
 * @author makejava
 * @since 2020-10-20 14:33:23
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tieba implements Serializable {
    private static final long serialVersionUID = -52479186509711144L;
    /**
     * 贴吧每一个id
     */
    private String id;
    /**
     * 贴吧名字
     */
    private String name;
    /**
     * 贴吧描述
     */
    private String desc;
    /**
     * 贴吧人数
     */
    private Integer pNum;
    /**
     * 贴吧帖子数量
     */
    private Integer tNum;
    /**
     * 贴吧图
     */
    private String imgUrl;
    /**
     * 贴吧的链接
     */
    private String url;
}