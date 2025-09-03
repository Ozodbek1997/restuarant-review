package com.pm.restuarant.repos;

import com.pm.restuarant.domain.entities.Restuarant;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RestuarantRepository extends ElasticsearchRepository<Restuarant, String> {

    //todo: Custom queries if needed

}
