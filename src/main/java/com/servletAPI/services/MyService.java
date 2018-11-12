package com.servletAPI.services;

import com.google.inject.ImplementedBy;
import com.servletAPI.serviceimpl.MyServiceImpl;

@ImplementedBy(MyServiceImpl.class)
public interface MyService {
    String sayHello();
}
