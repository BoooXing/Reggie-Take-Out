package org.YuXing.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.YuXing.reggie.entity.Category;

/**
 * @author BoooXing
 * @create 2023/2/10 - 10:40
 */
public interface CategoryService extends IService<Category> {
    public void remove(Long id);

}
