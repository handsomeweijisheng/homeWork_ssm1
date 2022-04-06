package com.wjs.service.impl;

import com.wjs.dao.TypeDao;
import com.wjs.pojo.Type;
import com.wjs.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wjs
 * @create 2022-03-01 16:01
 */

@Service
public class TypeServiceImpl implements TypeService {
    @Autowired
    private TypeDao typeDao;
    @Override
    public List<Type> findAll() {
        return typeDao.findAll();
    }
}
