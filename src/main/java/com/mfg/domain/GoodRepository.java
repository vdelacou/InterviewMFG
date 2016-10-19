package com.mfg.domain;

import com.mfg.domain.Good;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="/good")
public interface GoodRepository extends CrudRepository<Good, String> {

}