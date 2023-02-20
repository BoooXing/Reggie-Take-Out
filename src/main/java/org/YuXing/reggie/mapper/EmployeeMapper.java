package org.YuXing.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.YuXing.reggie.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author BoooXing
 * @create 2023/2/7 - 15:25
 */

@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
}
