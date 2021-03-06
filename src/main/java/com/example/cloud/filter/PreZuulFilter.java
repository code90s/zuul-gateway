package com.example.cloud.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>Pre ZuulFilter</p>
 *
 * @author sxy
 * @date 18-4-3
 * @since 1.0.0
 */
public class PreZuulFilter extends ZuulFilter {
    private static Logger log = LoggerFactory.getLogger(PreZuulFilter.class);

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();

        log.info("this is custom pre filter");
        log.info(String.format("=====%s request to %s======", request.getMethod(), request.getRequestURL().toString()));

        return null;
    }
}
