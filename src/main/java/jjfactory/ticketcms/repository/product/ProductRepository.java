package jjfactory.ticketcms.repository.product;

import jjfactory.ticketcms.domain.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
