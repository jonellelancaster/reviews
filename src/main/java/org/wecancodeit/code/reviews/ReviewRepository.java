package org.wecancodeit.code.reviews;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.wecancodeit.code.reviews.Review;




@Repository
public interface ReviewRepository extends CrudRepository<Review, Long>{
}

