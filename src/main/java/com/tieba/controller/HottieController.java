package com.tieba.controller;

import com.alibaba.fastjson.JSON;
import com.tieba.bean.Hottie;
import com.tieba.service.HottieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 首页展示的热门帖子(Hottie)表控制层
 *
 * @author makejava
 * @since 2020-10-23 16:33:18
 */
@RestController
@RequestMapping("hottie")
public class HottieController {
    /**
     * 服务对象
     */
    @Resource
    private HottieService hottieService;

    /**
     * 通过主键查询单条数据
     *
     * @return 单条数据
     */
    @GetMapping("/getHot")
    public Object hotTie() {
        List<Hottie> list = this.hottieService.queryHotTie();
        System.out.println(JSON.toJSON(list));
        return JSON.toJSON(list);
    }
}