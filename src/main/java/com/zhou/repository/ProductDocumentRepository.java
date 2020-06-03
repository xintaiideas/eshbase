package com.zhou.repository;

import com.zhou.document.ProductDocument;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

/**
 * @Author guoyichao
 * @version 0.1
 * @date 2018/12/13 17:35
 */
@Component
public interface ProductDocumentRepository extends ElasticsearchRepository<ProductDocument,String> {
}
