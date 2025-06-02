package com.sky.service;

import com.sky.entity.Dish;

import java.util.List;

/**
 * @description：TODO
 * @author： Pyl
 * @create： 2025/6/1 10:37
 */
public interface DishService {

    /**
     * 菜品起售停售
     * @param status
     * @param id
     */
    void startOrStop(Integer status, Long id);

    /**
     * 根据分类id查询菜品
     * @param categoryId
     * @return
     */
    List<Dish> list(Long categoryId);
}
