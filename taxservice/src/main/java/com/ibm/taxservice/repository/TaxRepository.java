package com.ibm.taxservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm.taxservice.entity.Tax;

@Repository
public interface TaxRepository extends JpaRepository<Tax, Long> {

}
