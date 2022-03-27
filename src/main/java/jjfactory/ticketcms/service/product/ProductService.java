package jjfactory.ticketcms.service.product;

import jjfactory.ticketcms.domain.product.Product;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ProductService {
    Product findById(Long id);
    List<Product> findAll();
    void save(Product product);
    void deleteByID(Long id);
}
