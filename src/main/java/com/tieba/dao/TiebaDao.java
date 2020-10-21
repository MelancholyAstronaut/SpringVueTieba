package com.tieba.dao;


import com.tieba.bean.Tieba;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Tieba)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-20 14:33:25
 */
public interface TiebaDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Tieba queryById(String id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Tieba> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tieba 实例对象
     * @return 对象列表
     */
    List<Tieba> queryAll(Tieba tieba);

    /**
     * 新增数据
     *
     * @param tieba 实例对象
     * @return 影响行数
     */
    int insert(Tieba tieba);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Tieba> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Tieba> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Tieba> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Tieba> entities);

    /**
     * 修改数据
     *
     * @param tieba 实例对象
     * @return 影响行数
     */
    int update(Tieba tieba);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(String id);

}