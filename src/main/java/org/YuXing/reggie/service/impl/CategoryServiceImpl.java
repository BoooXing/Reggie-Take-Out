package org.YuXing.reggie.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.YuXing.reggie.common.CustomException;
import org.YuXing.reggie.entity.Category;
import org.YuXing.reggie.entity.Dish;
import org.YuXing.reggie.entity.Setmeal;
import org.YuXing.reggie.mapper.CategoryMapper;
import org.YuXing.reggie.service.CategoryService;
import org.YuXing.reggie.service.DishService;
import org.YuXing.reggie.service.SetmealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author BoooXing
 * @create 2023/2/10 - 10:41
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

    @Autowired
    private DishService dishService;

    @Autowired
    private SetmealService setmealService;

    @Override
    public void remove(Long id) {
        LambdaQueryWrapper<Dish> dishLambdaQueryWrapper = new LambdaQueryWrapper<>();
        //添加查询条件，根据分类ID进行查询
        dishLambdaQueryWrapper.eq(Dish::getCategoryId, id);
        int count1 = dishService.count(dishLambdaQueryWrapper);

        //查询当前分类是否关联了菜品，如果已经关联，抛出一个业务异常
        if (count1 > 0){
            throw new CustomException("当前分类下关联了菜品，不能删除");
        }

        LambdaQueryWrapper<Setmeal> setmealLambdaQueryWrapper = new LambdaQueryWrapper<>();
        setmealLambdaQueryWrapper.eq(Setmeal::getCategoryId, id);
        int count2 = setmealService.count(setmealLambdaQueryWrapper);

        //查询当前分类是否关联了套餐，如果已经关联，抛出一个业务异常
        if (count2 > 0){
            throw new CustomException("当前分类下关联了分类，不能删除");
        }
        //正常删除
        super.removeById(id);
    }
}
