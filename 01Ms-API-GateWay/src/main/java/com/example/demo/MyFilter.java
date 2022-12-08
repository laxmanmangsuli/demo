package com.example.demo;



import java.util.List;
import java.util.Set;

import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;


import ch.qos.logback.classic.Logger;
import reactor.core.publisher.Mono;
@Component
public class MyFilter implements GlobalFilter {
	
	private Logger logger = (Logger) LoggerFactory.getLogger(MyFilter.class);
	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
	logger.info("MyPreFilter :: filter () method executed...");
	// Accessing HTTP Request information
	ServerHttpRequest request = (ServerHttpRequest) exchange.getRequest();
	org.springframework.http.HttpHeaders headers = request.getHeaders();
	Set<String> keySet = headers.keySet();
	keySet.forEach(key -> {
	List<String> values = headers.get(key);
	System.out.println(key +" :: "+values);
	});
	return chain.filter(exchange);
	}
	
	

	

}
