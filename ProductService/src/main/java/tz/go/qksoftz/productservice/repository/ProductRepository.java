package tz.go.qksoftz.productservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tz.go.qksoftz.productservice.entity.Product;

@Repository
public interface ProductRepository  extends JpaRepository<Product,Integer> {
    // save, findById(), findAll,deleteById,...

}
