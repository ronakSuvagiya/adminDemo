package com.example.demo.controler;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.activity.get_loan_category_activity;
import com.example.demo.dio.product_dio;
import com.example.demo.service.product_service;


@Controller
public class ChangeProductCharge_controler {
	
	@Autowired
	product_service product;
	
	@Autowired
	get_loan_category_activity loan_cat;

	@RequestMapping("/ChangeProductCharge")
	private ModelAndView ChangeProductCharge()
	{
		
		ModelAndView model = new ModelAndView("ChangeProductCharge");
		model.addObject("catList", product.getProduct());
		model.addObject("loan_cat",loan_cat.get_loan_cat());
		model.addObject("bank",loan_cat.get_bank());
		return model;
	}
	
	
	@RequestMapping("/ModifyCharge")
	private ModelAndView ModifyCharge(@RequestParam("catId")Integer catId,@RequestParam("charage")Long charage)
	{
	
		int i = product.changeCharge(catId, charage);
		ModelAndView model = ChangeProductCharge();
		model.addObject("result",1);
		return model;
	}
	
	@RequestMapping("/ModifyBankCharge")
	private ModelAndView ModifyBankCharge(@RequestParam("bank")Integer bank ,@RequestParam("catId")Integer catID, @RequestParam("charge")Long charage)
	{
		System.out.println("bank:-"+bank);
		System.out.println("catId:-"+catID);
		System.out.println("charge:-"+charage);
		ModelAndView model = ChangeProductCharge();
		return model;
	}
}
