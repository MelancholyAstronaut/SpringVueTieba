package com.tieba.service;

import com.tieba.bean.Hottie;

import java.util.List;

/**
 * 首页展示的热门帖子(Hottie)表服务接口
 *
 * @author makejava
 * @since 2020-10-23 16:33:17
 */
public interface HottieService {
    List<Hottie> queryHotTie();
}