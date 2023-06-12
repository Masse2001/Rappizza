package com.rapizza.rapizza.repository;


import com.rapizza.rapizza.model.Size;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SizeRepository extends CrudRepository<Size, String> {
}
