package gift.repository;

import gift.model.Member;
import gift.model.Product;
import gift.model.Wish;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WishRepository extends JpaRepository<Wish, Long> {

    Page<Wish> findByMember(Member member, Pageable pageable);
    void deleteByMemberAndProduct(Member member, Product product);
}
