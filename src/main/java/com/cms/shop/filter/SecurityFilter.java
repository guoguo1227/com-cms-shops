package com.cms.shop.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author : samuel
 * @Description :　权限过滤
 * @Date : 16-11-18
 */
@Service
public class SecurityFilter implements Filter {
    private static final Logger logger = LoggerFactory.getLogger(SecurityFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        logger.info("init filter");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
        Object o  = ((HttpServletRequest) request).getSession().getAttribute("SessionAdminUser");
        //todo　根据需求,简单处理登陆
        String url = req.getRequestURI();

        //登陆请求,放行
        if(url.contains("/user/login.json")){
            chain.doFilter(req, res);
        }else{
            if(o == null){
                res.setContentType("text/html");
                res.sendRedirect(req.getContextPath()+"/error.vm");
            }else{
                chain.doFilter(req,res);
            }
        }

    }

    @Override
    public void destroy() {
        logger.info("destroy filter");
    }
}
