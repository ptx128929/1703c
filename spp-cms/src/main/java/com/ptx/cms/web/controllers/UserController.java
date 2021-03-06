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
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ptx.cms.core.Page;
import com.ptx.cms.domain.Article;
import com.ptx.cms.domain.Category;
import com.ptx.cms.domain.Channel;
import com.ptx.cms.domain.User;
import com.ptx.cms.service.ArticleService;
import com.ptx.cms.service.UserService;
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
	
	@Autowired
	UserService userService;
	
	@RequestMapping({"/", "/index", "/home"})
	public String home(){
		return "user-space/home";
	}
	
	@RequestMapping({"/profile"})
	public String profile(){
		
		return "user-space/profile";
	}
	
	@RequestMapping("/blogs")
	public String blogs(Model model,HttpSession session,@RequestParam(value="page",defaultValue="1")Integer page){
		Article article =new Article();
		User user=(User) session.getAttribute(Constant.LOGIN_USER);
		article.setAuthor(user);
		
		List<Article> articles=articleService.queryAll(article);
		PageHelper.startPage(page,3);
		PageInfo<Article> pageInfo = new PageInfo<Article>(articles,3);
		String pagelist = PageHelpUtil.page("blogs", pageInfo, null);
		model.addAttribute("blogs", articles);
		model.addAttribute("pageList", pagelist);
		return "user-space/blog_list";
		
	}
	@RequestMapping("/blog/edit")
	public String edit(Integer id, Model model){
		Article article = articleService.selectByPrimaryKey(id);
		model.addAttribute("blog", article);
		return "user-space/blog_edit";
		
	}
	
	@RequestMapping("/blog/save")
	public String save(Article article,MultipartFile file,HttpServletRequest request){
		String upload = FileUploadUtil.upload(request, file);
		if (!upload.equals("")) {
			article.setPicture(upload);
		}
		
		if (article.getId() !=null) {
			articleService.updateBykey(article);
		}else{
			article.setHits(0);
			article.setHot(true);
			article.setStatus(1);
			article.setDeleted(false);
			article.setCreated(new Date());
			User user = (User) request.getSession().getAttribute(Constant.LOGIN_USER);
			articleService.save(article);
		}
		return "redirect:/my/blogs";
		
	}
	@RequestMapping("/blog/remove")
	@ResponseBody
	public Integer remove(Integer id, Model model){
		System.out.println(id);
		Integer sunn=articleService.remove(id);
		System.out.println(sunn);
		return sunn;
	}
	
	//用户信息完善
	@RequestMapping("/user/save")
	public String usersave(User user,Model model){
		System.out.println(user);
		userService.updateByid(user);
		return "redirect:/my/userinfo";
		
	}
	//查询用户信息
	@RequestMapping("/userinfo")
	public String userinfo(HttpServletRequest request,Model model){
		User  user =(User) request.getSession().getAttribute(Constant.LOGIN_USER);
		User us=userService.selectById(user.getId());
		System.out.println(us);
		return "user-space/useredit";
		
	}
	
	@RequestMapping("/profile/avatar")
	public String avatar(ModelMap map,HttpServletRequest request){
		User user = (User) request.getSession().getAttribute(Constant.LOGIN_USER);
		map.put("user", user);
		return "user-space/avatar";
		
	}
	@RequestMapping("/avater/addavater")
	public String addavater(User user,MultipartFile file,HttpServletRequest request,ModelMap map,HttpSession session){
	
		System.out.println(user.getId());
		String upload = FileUploadUtil.upload(request, file);
		if (!upload.equals("")) {
			user.setAvater(upload);
			userService.updateAvater(user);
			User user2 = userService.get(user.getId());
			System.out.println(user2);
			request.getSession().setAttribute(Constant.LOGIN_USER, user2);
			map.put("msg", "上传成功");
		}
		
		return "user-space/avatar";
		
	}
}
