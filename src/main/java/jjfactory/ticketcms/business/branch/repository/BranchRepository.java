package jjfactory.ticketcms.business.branch.repository;

import jjfactory.ticketcms.business.branch.entity.Branch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BranchRepository extends JpaRepository<Branch,Long> {
}
