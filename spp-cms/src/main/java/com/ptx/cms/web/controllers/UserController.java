/**
 * 
 */
package com.ptx.cms.web.controllers;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ptx.cms.core.Page;
import com.ptx.cms.domain.Article;
import com.ptx.cms.domain.Category;
import com.ptx.cms.domain.Channel;
import com.ptx.cms.domain.User;
import com.ptx.cms.service.ArticleService;
import com.ptx.cms.utils.FileUploadUtil;
import com.ptx.cms.utils.PageHelpUtil;
import com.ptx.cms.web.Constant;

/**
 * 说明:
 * 
 * @author howsun ->[howsun.zhang@gmail.com]
 * @version 1.0
 *
 * 2018年1月10日 下午2:40:38
 */
@Controller
@RequestMapping("/my")
public class UserController {

	@Autowired
	ArticleService articleService;
	
	@RequestMapping({"/", "/index", "/home"})
	public String home(){
		return "user-space/home";
	}
	
	@RequestMapping({"/profile"})
	public String profile(){
		return "user-space/profile";
	}
	
	@RequestMapping("/bolgs")
	public String blogs(Model model,HttpSession session,
			@RequestParam(value="page",defaultValue="1")Integer page){
		Article article =new Article();
		User user=(User) session.getAttribute(Constant.LOGIN_USER);
		article.setAuthor(user);
		
		List<Article> articles=articleService.queryAll(article);
		PageHelper.startPage(page,3);
		PageInfo<Article> pageInfo = new PageInfo<Article>(articles,3);
		String pagelist = PageHelpUtil.page("bolgs", pageInfo, null);
		
		model.addAttribute("blogs", articles);
		model.addAttribute("pageList", pagelist);
		return "user-space/bolg_list";
		
	}

}
