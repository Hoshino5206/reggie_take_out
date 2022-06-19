package com.hoshino.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hoshino.reggie.dto.SetmealDto;
import com.hoshino.reggie.entity.Setmeal;

import java.util.List;

public interface SetmealService extends IService<Setmeal> {
    /**
     * 新增套餐，同时需要保存套餐和菜品的关联关系
     * @param setmealDto
     */
    public void saveWithDish(SetmealDto setmealDto);

    /**
     * 修改套餐，同时需要修改套餐和菜品的关联关系
     * @param setmealDto
     */
    void updateWithDish(SetmealDto setmealDto);

    /**
     * 删除套餐，同时需要删除套餐和菜品的关联数据
     * @param ids
     */
    public void removeWithDish(List<Long> ids);


}
