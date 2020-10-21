package com.tieba.service;


import com.tieba.bean.Tieba;

import java.util.List;

/**
 * (Tieba)表服务接口
 *
 * @author makejava
 * @since 2020-10-20 14:33:27
 */
public interface TiebaService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Tieba queryById(String id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Tieba> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tieba 实例对象
     * @return 实例对象
     */
    Tieba insert(Tieba tieba);

    /**
     * 修改数据
     *
     * @param tieba 实例对象
     * @return 实例对象
     */
    Tieba update(Tieba tieba);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(String id);

}