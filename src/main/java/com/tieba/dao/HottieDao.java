package com.tieba.dao;

import com.tieba.bean.Hottie;

import java.util.List;

/**
 * 首页展示的热门帖子(Hottie)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-23 16:33:15
 */
public interface HottieDao {
    /**
     * 查询热门帖子
     * @return 热门
     */
    List<Hottie> queryHotTie();
}