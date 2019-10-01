package org.wecancodeit.code.reviews;

import java.util.Collection;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.wecancodeit.code.reviews.Review;
import org.wecancodeit.code.reviews.ReviewRepository;

@Service
public class ReviewService {

	
@Resource
private ReviewRepository reviewRepo;

public Collection<Review> getReviews(){
	return(Collection<Review>)this.reviewRepo.findAll();
	
			
	}
}

	
	
	

