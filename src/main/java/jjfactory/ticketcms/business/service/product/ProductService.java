package jjfactory.ticketcms.business.service.product;

import jjfactory.ticketcms.business.domain.product.Product;

import java.util.List;

public interface ProductService {
    Product findById(Long id);
    List<Product> findAll();

    Long countProduct();

    void save(Product product);
    void deleteById(Long id);
    void updateById(Long id, Product product);
}
