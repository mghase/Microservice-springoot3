package tz.go.qksoftz.productservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tz.go.qksoftz.productservice.entity.Product;
import tz.go.qksoftz.productservice.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("/product")
    public String  addProduct(@RequestBody Product product)
    {
        productService.addProduct(product);
        return "Added";
    }
    @GetMapping("/product/{id}")
    public Product getProduct(@PathVariable("id") Integer id) {
        return productService.getProduct(id);

    }
    @GetMapping("/product")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();

    }

    @PutMapping("/product/{id}")
    public String updateProduct(@PathVariable("id") Integer id,@RequestBody Product product) {
        productService.updateProduct(id,product);
        return "updated";

    }
    @DeleteMapping("/product/{id}")
    public String deleteProduct(@PathVariable("id") Integer id) {
        productService.deleteProduct(id);
        return "deleted";

    }

}
