package cl.duoc.formativa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.duoc.formativa.model.Product;
import cl.duoc.formativa.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }
    public List<Product> getallProducts(){
        return productRepository.findAll();
    }
    public Optional<Product> getProductById(Long id){
        return productRepository.findByid(id);
    }
    

}
