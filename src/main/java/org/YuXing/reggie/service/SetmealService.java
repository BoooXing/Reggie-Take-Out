package org.YuXing.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.YuXing.reggie.DTO.SetmealDto;
import org.YuXing.reggie.entity.Setmeal;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author BoooXing
 * @create 2023/2/10 - 12:20
 */

public interface SetmealService extends IService<Setmeal> {

    public void saveWithDish(SetmealDto setmealDto);

    public void removeWithDish(List<Long> lists);
}
