package com.cakeandcupcakes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cakeandcupcakes.model.Category;
import com.cakeandcupcakes.model.Sub_Category;
import com.cakeandcupcakes.model.Supplier;
import com.cakeandcupcakes.service.CategoryService;
import com.cakeandcupcakes.service.Sub_CategoryService;


@Controller
public class Sub_CategoryController {
  @Autowired(required=true)
  private Sub_CategoryService sub_categoryService;
  @Autowired(required=true)
  private CategoryService categoryService;
	
  @RequestMapping(value = "/onLoad", method = RequestMethod.GET)
	public String onLoad(Model model) {
		System.out.println("onLoad");
		model.addAttribute("sub_category", new Sub_Category());
		model.addAttribute("sub_categoryList", this.sub_categoryService.list());
		return "/Home";
	}
	@RequestMapping(value = "/sub_categories",method = RequestMethod.GET)
	public String listSub_Categories(Model model) {
		model.addAttribute("sub_category", new Sub_Category());
		model.addAttribute("category", new Category());
		model.addAttribute("categoryList", this.categoryService.list());
		model.addAttribute("sub_categoryList", this.sub_categoryService.list());
		return "sub_category";
	}
	
	@RequestMapping(value= "/sub_category/add")
	public String addSub_Category(@ModelAttribute("sub_category") Sub_Category sub_category){
		Category category = categoryService.getByName(sub_category.getCategory().getName());
		categoryService.saveOrUpdate(category); 
		sub_categoryService.saveOrUpdate(sub_category);
		
		sub_category.setCategory(category);
		sub_category.setId(category.getId());
		sub_categoryService.saveOrUpdate(sub_category);
		return "redirect:/sub_categories";
		
	}
	@RequestMapping("sub_category/remove/{id}")
    public String deleteSub_Category(@PathVariable("id") String id,ModelMap model) throws Exception{
		
       try {
		sub_categoryService.delete(id);
		model.addAttribute("message","Successfully Added");
	} catch (Exception e) {
		model.addAttribute("message",e.getMessage());
		e.printStackTrace();
	}
       //redirectAttrs.addFlashAttribute(arg0, arg1)
        return "redirect:/sub_categories";
    }
 
    @RequestMapping("sub_category/edit/{id}")
    public String editSub_Category(@PathVariable("id") String id, Model model){
    	System.out.println("editSub_Category");
        model.addAttribute("sub_category", this.sub_categoryService.get(id));
        model.addAttribute("listSub_Categories", this.sub_categoryService.list());
        return "sub_category";
    }
    
    
}