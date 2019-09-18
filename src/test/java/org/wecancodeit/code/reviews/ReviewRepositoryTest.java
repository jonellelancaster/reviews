package org.wecancodeit.code.reviews;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;

import java.util.Collection;

import javax.annotation.Resource;

import org.junit.Test;

public class ReviewRepositoryTest {

@Resource
private ReviewRepository underTest;

private Review reviewOne= new Review(1L, "reviewtitle", "image", "catagory", "content");
private Review reviewTwo= new Review(2L, "reviewtitle", "image", "catagory", "content");

@Test
public void shouldFindOneReviewbyId() {
	underTest = new ReviewRepository(reviewOne);
	Review foundReview =underTest.findOneReview(1L);
	assertThat(foundReview, is(reviewOne));
}
@Test
public void shouldFindReviewTwoById() {
	underTest = new ReviewRepository(reviewTwo);
	Review foundReview =underTest.findOneReview(2L);
	assertThat(foundReview, is(reviewTwo));
}
@Test
public void shouldFindAllReviews() {
	underTest=new ReviewRepository(reviewOne, reviewTwo);
	Collection<Review> foundReviews=underTest.findAllReviews();
	assertThat(foundReviews, containsInAnyOrder(reviewOne, reviewTwo));
}

	
	
	
	
	
	
	
	
	
	
}
