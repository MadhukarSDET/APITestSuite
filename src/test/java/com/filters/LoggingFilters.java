package com.filters;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.restassured.filter.Filter;
import io.restassured.filter.FilterContext;
import io.restassured.response.Response;
import io.restassured.specification.FilterableRequestSpecification;
import io.restassured.specification.FilterableResponseSpecification;

public class LoggingFilters implements Filter {

	private static final Logger logger = LogManager.getLogger(LoggingFilters.class);

	// Here
	// All the request info is avilable with FilterableRequestSpecification
	// once request info is captured then request will be sent to server using
	// next() method call
	// next() method will return Response object which will have all the API
	// response info.
	@Override
	public Response filter(FilterableRequestSpecification request, FilterableResponseSpecification responseSpec,
			FilterContext ctx) {
		request(request);
		Response response = ctx.next(request, responseSpec);
		response(response);
		return response;
	}

	public void request(FilterableRequestSpecification requestSpec) {
		logger.info("BASE URI:" + requestSpec.getBaseUri());
		logger.info("BASE PATH:" + requestSpec.getBasePath());
		logger.info("HEADERS:" + requestSpec.getHeaders());
		logger.info("Get HTTP CALL INFO:" + requestSpec.getHttpClient());
		logger.info("GET CONTENT TYPE:" + requestSpec.getContentType());
		logger.info("GET PORT:" + requestSpec.getMethod());
	}

	public void response(Response response) {
		logger.info("GET STATUS CODE:" + response.getStatusCode());
		logger.info("GET BODY:" + response.getTime());
	}

}
