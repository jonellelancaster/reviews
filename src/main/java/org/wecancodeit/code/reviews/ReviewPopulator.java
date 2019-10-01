package org.wecancodeit.code.reviews;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ReviewPopulator implements CommandLineRunner {

	private Logger log = LoggerFactory.getLogger(ReviewPopulator.class);

	@Resource
	private ReviewRepository repository;

	@Override
	public void run(String... args) throws Exception {

		repository.save(
				new Review("The Premier School: Pickerington", "/images/tps.png", "Infant-K & AfterSchool", "Great Place"));
		repository.save(
				new Review("La Petit Academy: Pickerington", "/images/lpa.bmp", "Infant-K & AfterSchool", "Not So Great Place"));

		log.info("Reviews found with findAll():");
		log.info("-------------------------------");
		for (Review review : repository.findAll()) {
			log.info(review.toString());
		}
		log.info("");

	}
}
