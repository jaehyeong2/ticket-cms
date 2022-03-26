package jjfactory.ticketcms.repository.category;

import jjfactory.ticketcms.domain.admin.Admin;
import jjfactory.ticketcms.domain.category.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
