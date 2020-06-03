package com.zhou.service;

import com.zhou.dao.DemoDao;
import com.zhou.entity.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author guoyichao
 * @Descriptions:
 * @Date: Created in 2018/3/21
 */
@Service("demoService")
@Transactional(readOnly = true)
public class DemoService {

    @Autowired
    private DemoDao demoDao;

    /**
     * @Descripton:
     * @Author guoyichao
     * @param demo
     * @Date: 2020/6/3
     */
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void save(Demo demo) {
        demoDao.save(demo);
    }

    /**
     * @Descripton:
     * @Author guoyichao
     * @param demo
     * @param id
     * @Date: 2020/6/3
     */
    @Transactional
    public List<Demo> getById(Demo demo, String id) {
        return demoDao.getById(demo, id);
    }
}
