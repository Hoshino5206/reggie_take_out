package com.hoshino.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hoshino.reggie.mapper.AddressBookMapper;
import com.hoshino.reggie.entity.AddressBook;
import com.hoshino.reggie.service.AddressBookService;
import org.springframework.stereotype.Service;

@Service
public class AddressBookServiceImpl extends ServiceImpl<AddressBookMapper, AddressBook> implements AddressBookService {

}
