package org.YuXing.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.YuXing.reggie.entity.Orders;

/**
 * @author BoooXing
 * @create 2023/2/17 - 18:39
 */
public interface OrdersService extends IService<Orders> {

    public void submit(Orders orders);
}
