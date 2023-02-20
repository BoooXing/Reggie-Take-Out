package org.YuXing.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.YuXing.reggie.DTO.DishDto;
import org.YuXing.reggie.entity.Dish;
import org.springframework.stereotype.Service;

/**
 * @author BoooXing
 * @create 2023/2/10 - 12:20
 */

public interface DishService extends IService<Dish> {
    //新增菜品，同时插入菜品对应的口味数据，同时操作dish和dish_flavor两张表
    public void saveWithFlavor(DishDto dishDto);

    public DishDto getByIdWithFlavor(Long id);

    public void updateWithFlavor(DishDto dishDto);
}
