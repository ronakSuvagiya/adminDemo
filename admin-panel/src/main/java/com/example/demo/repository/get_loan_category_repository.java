package com.example.demo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.dio.get_category_dio;
import com.example.demo.dio.get_loan_category_dio;
import com.example.demo.entity.bank_master;
import com.example.demo.entity.category_master;
import com.example.demo.repository.inter.get_category_repository_interface;
import com.example.demo.repository.inter.get_loan_category_repository_interface;

@Repository
public class get_loan_category_repository implements get_loan_category_repository_interface {

	@Autowired
	get_loan_category_dio category_dio;


	@Override
	public List<category_master> get_loan_cat() {
		// TODO Auto-generated method stub
		return category_dio.get_loan_cat();
	}

	@Override
	public List<bank_master> get_bank() {
		// TODO Auto-generated method stub
		return category_dio.get_bank();
	}
	
	
}
