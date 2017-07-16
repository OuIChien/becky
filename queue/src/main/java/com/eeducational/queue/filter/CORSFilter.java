package com.eeducational.queue.filter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * Enabling CORS support  - Access-Control-Allow-Origin
 * Created by OuYiJian on 2017/5/7.
 */
public class CORSFilter implements Filter {

    private static final Log LOG = LogFactory.getLog(CORSFilter.class);

    public String allowOrigin = "*";

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        HttpServletResponse httpServletResponse = (HttpServletResponse) response;

        httpServletResponse.addHeader("Access-Control-Allow-Origin", allowOrigin);

        // CORS "pre-flight" request
        httpServletResponse.addHeader("Access-Control-Allow-Methods", "GET, POST, OPTIONS, PUT, HEAD, DELETE");
        httpServletResponse.addHeader("Access-Control-Allow-Headers", "Content-Type, Authorization, X-Requested-With, Cache-Control, Accept, Origin, X-Session-ID");
        // response.addHeader("Access-Control-Max-Age", "1");
        httpServletResponse.addHeader("Access-Control-Allow-Credentials", "true");

        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
