/**
 * 
 */
package com.ptx.cms.service.impl;

import java.util.LinkedHashMap;
import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ptx.cms.core.Page;
import com.ptx.cms.dao.ArticleMapper;
import com.ptx.cms.domain.Article;
import com.ptx.cms.domain.Category;
import com.ptx.cms.domain.Channel;
import com.ptx.cms.service.ArticleService;

/**
 * 说明:
 * 
 * @author howsun ->[howsun.zhang@gmail.com]
 * @version 1.0
 *
 * 2019年4月21日 下午9:06:07
 */
@Service
@Transactional
public class ArticleServiceImpl implements ArticleService {

	@Resource
	ArticleMapper articleMapper;

	@Override
	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
	public List<Article> gets(Article conditions, Page page, LinkedHashMap<String, Boolean> orders) {
		List<Article> articles = articleMapper.selects(conditions, orders, page);
		if(page != null && page.getPageCount() == 0){
			int totalCount = articleMapper.count(conditions);
			page.setTotalCount(totalCount);
		}
		return articles;
	}

	@Override
	public void increaseHit(Integer id) {
		// TODO Auto-generated method stub
		articleMapper.increaseHit(id);
	}

	@Override
	public Article selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return articleMapper.selectByPrimaryKey(id);
	

	}

	@Override
	public List<Article> queryAll(Article article) {
		// TODO Auto-generated method stub
		return articleMapper.queryAll(article);
	}

	@Override
	public void updateBykey(Article article) {
		// TODO Auto-generated method stub
		articleMapper.updateBykey(article);
	}

	@Override
	public void save(Article article) {
		// TODO Auto-generated method stub
		articleMapper.save(article);
	}

	@Override
	public Integer remove(Integer id) {
		// TODO Auto-generated method stub
		return articleMapper.remove(id);
	}

	
}
