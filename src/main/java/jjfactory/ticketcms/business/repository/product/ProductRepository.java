package jjfactory.ticketcms.business.repository.product;

import jjfactory.ticketcms.business.domain.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
