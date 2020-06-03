
package com.zhou.schedule;

import com.alibaba.fastjson.JSON;
import com.zhou.document.ProductDocument;
import com.zhou.document.ProductDocumentBuilder;
import com.zhou.entity.Person;
import com.zhou.entity.PersonBuilder;
import com.zhou.hbase.HBaseDaoUtil;
import com.zhou.repository.PersonDocumentRepository;
import com.zhou.repository.ProductDocumentRepository;
import com.zhou.service.EsSearchService;
import org.apache.ibatis.session.SqlSessionFactory;
import org.elasticsearch.index.query.QueryStringQueryBuilder;
import org.elasticsearch.search.sort.SortBuilders;
import org.elasticsearch.search.sort.SortOrder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.DeleteQuery;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Component
@EnableScheduling
///
//生成测试数据


public class SaticScheduleTask{

    @Autowired
    private HBaseDaoUtil hBaseDaoUtil;
    @Resource
    SqlSessionFactory sqlSessionFactory;
    //3.添加定时任务

    @Resource
    private ElasticsearchTemplate elasticsearchTemplate;
    @Resource
    private PersonDocumentRepository personDocumentRepository;
    @Resource
    private ScheduleServiceImpl scheduleServiceImpl;

    private Logger log = LoggerFactory.getLogger(getClass());

    //3.添加定时任务
//    @Scheduled(cron = "0/1 * * * * ?")
    //user索引
    public void afterPropertiesSet(){

            while (true) {
//                scheduleServiceImpl.save();
            }


    }
//    @Scheduled(cron = "0/1 * * * * ?")
    //生成user
    public void generUser(){

        while (true) {
//            scheduleServiceImpl.generUser();
        }


    }




}