package org.YuXing.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.YuXing.reggie.entity.AddressBook;
import org.YuXing.reggie.mapper.AddressBookMapper;
import org.YuXing.reggie.service.AddressBookService;
import org.springframework.stereotype.Service;

/**
 * @author BoooXing
 * @create 2023/2/15 - 19:39
 */
@Service
public class AddressBookServiceImpl extends ServiceImpl<AddressBookMapper, AddressBook> implements AddressBookService {
}
