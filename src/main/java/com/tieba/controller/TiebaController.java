package com.tieba.controller;

import com.alibaba.fastjson.JSON;
import com.tieba.bean.Tieba;
import com.tieba.service.TiebaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

/**
 * (Tieba)表控制层
 *
 * @author makejava
 * @since 2020-10-20 14:33:30
 */
@RestController
@RequestMapping("tieba")
public class TiebaController {
    /**
     * 服务对象
     */
    @Resource
    private TiebaService tiebaService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Tieba selectOne(String id) {
        return this.tiebaService.queryById(id);
    }

    @GetMapping("/getAllTieba")
    public Object getAllTieba() {

        return JSON.toJSON(this.tiebaService.queryAllByLimit(0, 2));
    }

    @GetMapping("/hotba")
    public Object hotba() {
        List<Tieba> list = this.tiebaService.queryAllByLimit(0, 100);
        Collections.shuffle(list);
        return JSON.toJSON(list);
    }
}