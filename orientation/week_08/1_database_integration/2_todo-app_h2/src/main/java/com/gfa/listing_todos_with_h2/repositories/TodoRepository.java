package com.gfa.listing_todos_with_h2.repositories;

import com.gfa.listing_todos_with_h2.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {

}
