package se331.lab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se331.lab.entity.Bid;

public interface BidRepository extends JpaRepository<Bid, Long> {

}