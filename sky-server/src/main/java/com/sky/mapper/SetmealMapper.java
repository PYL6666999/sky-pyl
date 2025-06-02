package com.sky.mapper;

import com.sky.entity.Setmeal;
import com.sky.enumeration.OperationType;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @description：TODO
 * @author： Pyl
 * @create： 2025/5/29 13:06
 */
@Mapper
public interface SetmealMapper {

    /**
     * 根据分类id查询套餐的数量
     */
    @Select("select count(id) from setmeal where category_id = #{categoryId}")
    Integer countByCategoryId(Long id);

    /**
     * 根据id修改套餐
     *
     * @param setmeal
     */

    void update(Setmeal setmeal);

    @Mapper
    public interface SetmealDishMapper {
        List<Long> getSetmealIdsByDishIds(List<Long> dishIds);
    }

    /**
     * 新增套餐
     * @param setmeal
     */
    public void insert(Setmeal setmeal);

}
