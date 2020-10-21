package com.tieba.service.impl;


import com.tieba.bean.Tieba;
import com.tieba.dao.TiebaDao;
import com.tieba.service.TiebaService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Tieba)表服务实现类
 *
 * @author makejava
 * @since 2020-10-20 14:33:28
 */
@Service("tiebaService")
public class TiebaServiceImpl implements TiebaService {
    @Resource
    private TiebaDao tiebaDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Tieba queryById(String id) {
        return this.tiebaDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Tieba> queryAllByLimit(int offset, int limit) {
        return this.tiebaDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tieba 实例对象
     * @return 实例对象
     */
    @Override
    public Tieba insert(Tieba tieba) {
        this.tiebaDao.insert(tieba);
        return tieba;
    }

    /**
     * 修改数据
     *
     * @param tieba 实例对象
     * @return 实例对象
     */
    @Override
    public Tieba update(Tieba tieba) {
        this.tiebaDao.update(tieba);
        return this.queryById(tieba.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.tiebaDao.deleteById(id) > 0;
    }
}