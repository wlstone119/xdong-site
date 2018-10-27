package com.xdong.crawler.common;

/**
 * @description 爬虫参数传递时使用
 * @author stone
 * @date 2017年4月11日
 */
public class ParamVo {

	private String domainUrl;
	
	private Long urlKey;

	private String url;

	private int begin;

	private int end;
	
	private String searchKey;

	public String getSearchKey() {
		return searchKey;
	}

	public void setSearchKey(String searchKey) {
		this.searchKey = searchKey;
	}

	public String getDomainUrl() {
		return domainUrl;
	}

	public void setDomainUrl(String domainUrl) {
		this.domainUrl = domainUrl;
	}

	public Long getUrlKey() {
		return urlKey;
	}

	public void setUrlKey(Long urlKey) {
		this.urlKey = urlKey;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getBegin() {
		return begin;
	}

	public void setBegin(int begin) {
		this.begin = begin;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

}
