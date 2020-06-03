package com.zhou.dao;

import com.zhou.entity.Demo;
import com.zhou.hbase.HBaseDaoUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author guoyichao
 * @Descriptions:
 * @Date: Created in 2018/3/21
 */
@Component("demoDao")
public class DemoDao {

    @Autowired
    private HBaseDaoUtil hBaseDaoUtil;

    /**
     * @Descripton:
     * @Author guoyichao
     * @param demo
     * @Date: 2020/6/3
     */

    public void save(Demo demo) {
        hBaseDaoUtil.save(demo);
    }

    /**
     * @Descripton:
     * @Author guoyichao
     * @param demo
     * @param id
     * @Date: 2020/6/3
     */
    public List<Demo> getById(Demo demo, String id) {
        return hBaseDaoUtil.get(demo, id);
    }
}
