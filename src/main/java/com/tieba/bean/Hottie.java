package com.tieba.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 首页展示的热门帖子(Hottie)实体类
 *
 * @author makejava
 * @since 2020-10-23 16:33:14
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hottie implements Serializable {
    private static final long serialVersionUID = -50334000340193947L;

    private Integer id;
    /**
     * 帖子名称
     */
    private String tiezi_name;
    /**
     * 帖子内容
     */
    private String text;
    /**
     * 发帖人
     */
    private String belongName;
    /**
     * 发帖时间
     */
    private Object time;
    /**
     * 贴吧名称
     */
    private Tieba tieba_name;
}