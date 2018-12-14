package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.activity.get_category_activity;
import com.example.demo.activity.get_loan_category_activity;
import com.example.demo.entity.bank_master;
import com.example.demo.entity.category_master;
import com.example.demo.service.inter.get_category_service_interface;
import com.example.demo.service.inter.get_loan_category_service_interface;

@Service
public class get_loan_category_service implements get_loan_category_service_interface {

	@Autowired
	get_loan_category_activity cat;
	

	@Override
	public List<category_master> get_loan_cat() {
		// TODO Auto-generated method stub
		return cat.get_loan_cat();
	}

	@Override
	public List<bank_master> get_bank() {
		// TODO Auto-generated method stub
		return cat.get_bank();
	}

	
}
