package com.hoshino.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hoshino.reggie.entity.OrderDetail;
import com.hoshino.reggie.mapper.OrderDetailMapper;
import com.hoshino.reggie.service.OrderDetailService;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {

}