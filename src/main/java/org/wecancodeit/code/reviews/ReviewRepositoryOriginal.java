package org.wecancodeit.code.reviews;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


import org.springframework.stereotype.Repository;

//@Repository
public class ReviewRepositoryOriginal {

	private Map<Long, Review> reviewList = new HashMap<>();
	private Review reviewOne = new Review(1L, "The Premier School: Pickerington", "/images/tps.png", "Infant-K & AfterSchool", "content");
	private Review reviewTwo = new Review(2L, "La Petit Academy: Pickerington", "/images/lpa.bmp", "Infant-K & AfterSchool", "content");

	public ReviewRepositoryOriginal() {
		reviewList.put(reviewOne.getId(), reviewOne);
		reviewList.put(reviewTwo.getId(), reviewTwo);
	}

	public ReviewRepositoryOriginal(Review... reviews) {
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
