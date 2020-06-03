package com.zhou.controller;

import com.zhou.MD5Utils;
import com.zhou.entity.PersonEs;
import com.zhou.entity.PersonHbase;
import com.zhou.hbase.HBaseDaoUtil;
import com.zhou.repository.PersonDocumentRepository;
import com.zhou.service.DemoService;
import com.zhou.service.EsSearchService;
import org.elasticsearch.index.query.QueryStringQueryBuilder;
import org.elasticsearch.search.sort.FieldSortBuilder;
import org.elasticsearch.search.sort.SortBuilders;
import org.elasticsearch.search.sort.SortOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

/**
 * @Author: guoyichao
 * @Descriptions:
 * @Date: Created in 2018/3/21
 */
@RestController
@RequestMapping("/hbase")
public class EsHbaseController {
    @Autowired
    HBaseDaoUtil hBaseDaoUtil;


    @Autowired
    ElasticsearchTemplate elasticsearchTemplate;
    @Autowired
    private DemoService demoService;
    @Autowired
    EsSearchService esSearchService;

    @Autowired
    PersonDocumentRepository personDocumentRepository;


    /**
     * @Descripton: 根据id查询
     * @Author guoyichao
     * @param id
     * @Date: 2020/6/3
     */

//    @GetMapping("/get/{id}")
//    public List<PersonHbase> getBean(@PathVariable String id){
//        try {
//            List<PersonHbase> apples = hBaseDaoUtil.get(new PersonHbase(),id);
//            return apples;
//        } catch (Exception e) {
//            e.printStackTrace();
//
//        }
//        return null;
//    }


    /**
     * 搜索
     * 先通过索引搜索es
     * 然后通过es的rowkey搜索hbase
     * es存放索引字段
     * hbase存放全部字段
     * @param keyword
     * @return
     */
    @RequestMapping("query/{keyword}")
    public HashMap query(@PathVariable String keyword){
        SearchQuery searchQuery = new NativeSearchQueryBuilder()
                .withQuery(new QueryStringQueryBuilder(keyword))
             //.withPageable(new PageRequest(1,20))
                .withSort(SortBuilders.scoreSort().order(SortOrder.DESC))
                // .withSort(new FieldSortBuilder("createTime").order(SortOrder.DESC))
                .build();
       List<PersonEs> personEsList = elasticsearchTemplate.queryForList(searchQuery,PersonEs.class);
        String[]  persons = new String[personEsList.size()];
        for(int i=0;i<personEsList.size();i++){
            persons[i]=MD5Utils.string2MD5(personEsList.get(i).getId());
        }
        HashMap res = new HashMap();
        List<PersonHbase> personHbaseList = hBaseDaoUtil.get(new PersonHbase(),persons);
        res.put("status",200);
        res.put("data",personHbaseList);

        return res;
    }
//    @RequestMapping("delete")
//    public void delete(){
//     //   personDocumentRepository.deleteAll();
//       // hBaseDaoUtil.dropTable("t_person");
//
//    }
}
