package com.cds.learn;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by chendongsheng5 on 2017/3/9.
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {

  List<Customer> findBylastName(String lastName);
}
