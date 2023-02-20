package org.YuXing.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.YuXing.reggie.entity.OrderDetail;
import org.YuXing.reggie.mapper.OrdersDetailMapper;
import org.YuXing.reggie.service.OrdersDetailService;
import org.YuXing.reggie.service.OrdersService;
import org.springframework.stereotype.Service;

/**
 * @author BoooXing
 * @create 2023/2/17 - 18:42
 */
@Service
public class OrdersDetailServiceImpl extends ServiceImpl<OrdersDetailMapper, OrderDetail> implements OrdersDetailService{
}
