package com.tieba.service.impl;

import com.tieba.bean.Hottie;
import com.tieba.dao.HottieDao;
import com.tieba.service.HottieService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 首页展示的热门帖子(Hottie)表服务实现类
 *
 * @author makejava
 * @since 2020-10-23 16:33:17
 */
@Service("hottieService")
public class HottieServiceImpl implements HottieService {
    @Resource
    private HottieDao hottieDao;

    @Override
    public List<Hottie> queryHotTie() {
        return this.hottieDao.queryHotTie();
    }
}