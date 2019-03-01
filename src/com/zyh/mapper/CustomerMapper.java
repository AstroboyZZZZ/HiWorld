package com.zyh.mapper;

import com.zyh.bean.Customer;

public interface CustomerMapper {
    Customer queryCustomerById(Integer id,String name);
}
