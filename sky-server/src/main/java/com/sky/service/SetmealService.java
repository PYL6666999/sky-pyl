package com.sky.service;

import com.sky.dto.SetmealDTO;

/**
*@description：TODO
*@author： Pyl
*@create： 2025/6/1 22:39
*/
public interface SetmealService {

    /**
     * 新增套餐，同时需要保存套餐和菜品的关联关系
     * @param setmealDTO
     */
    void saveWithDish(SetmealDTO setmealDTO);
}
