package com.tieba.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2020-10-20 14:45:46
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    private static final long serialVersionUID = 335316261208395795L;

    private Integer id;

    private String name;

    private String password;
}