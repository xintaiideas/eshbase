package com.zhou.repository;

import com.zhou.document.ProductDocument;
import com.zhou.entity.Person;
import com.zhou.entity.PersonEs;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

/**
 * @Author guoyichao
 * @version 0.1
 * @date 2018/12/13 17:35
 */
@Component
public interface PersonDocumentRepository extends ElasticsearchRepository<PersonEs,String> {
}
