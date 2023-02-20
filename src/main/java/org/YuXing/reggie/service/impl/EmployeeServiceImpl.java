package org.YuXing.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.YuXing.reggie.entity.Employee;
import org.YuXing.reggie.mapper.EmployeeMapper;
import org.YuXing.reggie.service.EmployeeService;
import org.springframework.stereotype.Service;

/**
 * @author BoooXing
 * @create 2023/2/7 - 15:27
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
}
