package tz.go.qksoftz.productservice.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import tz.go.qksoftz.productservice.entity.Product;
import tz.go.qksoftz.productservice.repository.ProductRepository;

@Service
@Transactional
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public void addProduct(Product product) {
        productRepository.save(product);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
    public Product getProduct(Integer id) {
        return productRepository.findById(id).get();
    }
    public void  deleteProduct(Integer id) {
        productRepository.deleteById(id);
    }
    public void  updateProduct(Integer id,Product product) {
        Product product1=productRepository.findById(id).get();
        product1.setName(product.getName());
    }

}

