package org.YuXing.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.YuXing.reggie.entity.ShoppingCart;
import org.YuXing.reggie.mapper.ShoppingCartMapper;
import org.YuXing.reggie.service.ShoppingCartService;
import org.springframework.stereotype.Service;

/**
 * @author BoooXing
 * @create 2023/2/17 - 16:46
 */
@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements ShoppingCartService {
}
