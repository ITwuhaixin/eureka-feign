package com.whx.springcloud;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="eureka-service", fallback=HelloServiceHystric.class)
public interface HelloService {
	
	@RequestMapping(value="/hi",method=RequestMethod.GET)
	public String hello(@RequestParam(value="name") String name) ;
}
