package org.wecancodeit.code.reviews;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.wecancodeit.code.reviews.ReviewService;
@Controller
public class ReviewController {
	
	@Resource
	private ReviewService reviewRepo;

	@GetMapping("/show-reviews")
	public String showAllReviews(Model model) {
		model.addAttribute("reviews", reviewRepo.getReviews());
		return "reviews-template";
	}

//	@GetMapping("/show-review")
//	public String findReview(@RequestParam Long id, Model model) {
//		model.addAttribute("reviewModel", this.findOneReview(id));
//		return "review-template";
//
//	}
//
//	private Object findOneReview(Long id) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
