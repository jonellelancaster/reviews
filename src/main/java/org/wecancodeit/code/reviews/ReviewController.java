package org.wecancodeit.code.reviews;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReviewController {
	
	@Resource
	private ReviewRepository reviewRepo;

	@GetMapping("/show-reviews")
	public String findAllReviews(Model model) {
		model.addAttribute("reviewsModel", reviewRepo.findAllReviews());
		return "reviews-template";
	}

	@GetMapping("/show-review")
	public String findReview(Model model) {
		return "review-template";

	}

}
