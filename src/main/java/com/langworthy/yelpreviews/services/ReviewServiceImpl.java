package com.langworthy.yelpreviews.services;

import com.langworthy.yelpreviews.adapters.YelpReviewAdapter;
import com.langworthy.yelpreviews.models.YelpReviewList;
import com.langworthy.yelpreviews.models.YelpReview;
import com.langworthy.yelpreviews.providers.ReviewProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ReviewServiceImpl implements ReviewService {

    private static final Logger logger = LoggerFactory.getLogger(ReviewServiceImpl.class);

    @Value("${yelp.api.key}")
    private String apiKey;

    private static final String YELP_API_BASE_URL = "https://api.yelp.com/v3/businesses";

    @Override
    public List<ReviewProvider> fetchReviewList() {
        String id = "glA-11fLZeEYtA5Iec757Q";
        Optional<URI> optionalUri = Optional.empty();

        try {
            optionalUri = Optional.of(new URL(YELP_API_BASE_URL + "/" + id + "/reviews").toURI());
        } catch (MalformedURLException e) {
            logger.error(e.getMessage());
        } catch (URISyntaxException e) {
            logger.error(e.getMessage());
        }
        URI uri = optionalUri.orElseThrow();

        ResponseEntity<YelpReviewList> apiResponse = callApiService(uri);

        YelpReviewList yelpReviewListResponse = apiResponse.getBody();

        List<YelpReview> yelpReviewList = yelpReviewListResponse.getReviews();

        List<ReviewProvider> reviewProviderList = new ArrayList<>();

        yelpReviewList.forEach(yelpReview -> {
            reviewProviderList.add(new YelpReviewAdapter(
                    yelpReview.getId(),
                    yelpReview.getUser().getName(),
                    yelpReview.getUser().getImage_url(),
                    "",
                    yelpReview.getRating(),
                    yelpReview.getText()
            ));
        });
        return reviewProviderList;
    }

    private ResponseEntity<YelpReviewList> callApiService(URI uri) {

        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(apiKey);

        RequestEntity<?> requestEntity = RequestEntity
                .get(uri)
                .accept(MediaType.APPLICATION_JSON)
                .headers(headers)
                .build();

        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.exchange(requestEntity, YelpReviewList.class);
    }
}
