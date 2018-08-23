package com.hds.article.service;

import com.hds.article.apiModel.ArticleRequest;
import com.hds.article.model.Article;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by admin on 2018/8/16.
 */
@FeignClient("blog-article")
public interface ArticleService {

    @RequestMapping(value = "/getArticleById",method = RequestMethod.POST)
    @ResponseBody
    Article getArticleById(@RequestBody ArticleRequest request);


}
