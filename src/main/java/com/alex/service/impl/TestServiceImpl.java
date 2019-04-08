package com.alex.service.impl;

import com.alex.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Override
    public String test() {
        return "test";
    }
}
