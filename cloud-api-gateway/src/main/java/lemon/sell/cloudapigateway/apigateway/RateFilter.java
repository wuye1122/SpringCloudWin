package lemon.sell.cloudapigateway.apigateway;

import com.google.common.util.concurrent.RateLimiter;
import com.netflix.loadbalancer.DynamicServerListLoadBalancer;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

//zuul 实现限流的问题
//@Component
public class RateFilter extends ZuulFilter {

    //每秒没有访问多少令牌
    RateLimiter rateLimiter = RateLimiter.create(10);

    @Override
    public String filterType() {
        return null;
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return false;
    }

    @Override
    public Object run()  {
        return null;
    }
}
