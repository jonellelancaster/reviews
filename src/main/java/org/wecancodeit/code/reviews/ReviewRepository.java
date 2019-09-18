package org.wecancodeit.code.reviews;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ReviewRepository {
	
	private Map<Long, Review> reviewList = new HashMap<>();
	private Review reviewOne = new Review(1L, "reviewtitle", "image", "catagory", "content");

	public ReviewRepository(Review... reviews) {
		for (Review review : reviews) {
			reviewList.putIfAbsent(review.getId(), review);
		}
	}

	public Review findOneReview(long id) {
		return reviewList.get(id);
	}

	public Collection<Review> findAllReviews() {
		return reviewList.values();
	}

}
