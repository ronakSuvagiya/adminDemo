package com.example.demo.service.inter;

import java.util.List;

import com.example.demo.entity.bank_master;
import com.example.demo.entity.category_master;

public interface get_loan_category_service_interface {
	List<category_master> get_loan_cat();
	List<bank_master> get_bank();
}
