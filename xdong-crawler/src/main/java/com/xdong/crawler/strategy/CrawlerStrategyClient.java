package com.xdong.crawler.strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.xdong.common.utils.BizException;
import com.xdong.common.utils.SpringUtil;
import com.xdong.crawler.common.ParamVo;
import com.xdong.model.entity.crawler.RpCrawlerUrlDo;
import com.xdong.spi.crawler.IRpCrawlerUrlService;

/**
 * @description 爬虫策略模式执行者
 * @author stone
 * @date 2017年4月11日
 */
@Service
public class CrawlerStrategyClient {

    @Autowired
    private IRpCrawlerUrlService rpCrawlerUrlServiceImpl;

    /**
     * 策略模式执行者帮你自动选择策略进行执行
     * 
     * @param paramVo
     * @throws BizException
     */
    public Object execute(ParamVo paramVo) throws BizException {
        Long urlKey = paramVo.getUrlKey();
        if (urlKey == null || urlKey <= 0) {
            throw BizException.create(String.format("param error: %s", JSON.toJSONString(paramVo)));
        }

        RpCrawlerUrlDo urlDo = rpCrawlerUrlServiceImpl.selectById(urlKey);
        paramVo.setUrl(urlDo.getCrawlerUrl());
        paramVo.setDomainUrl(urlDo.getDomainName());
        CrawlerStrategyInterface strategy = (CrawlerStrategyInterface) SpringUtil.getBeansByName(urlDo.getCrawlerClass());

        return strategy.execute(paramVo);
    }
}
