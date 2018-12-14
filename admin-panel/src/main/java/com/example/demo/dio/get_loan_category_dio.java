package com.example.demo.dio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dio.inter.get_category_dio_interface;
import com.example.demo.dio.inter.get_loan_category_dio_interface;
import com.example.demo.entity.bank_master;
import com.example.demo.entity.category_master;
import com.example.demo.entity.loan_subcategory;

@Service
@Transactional
public class get_loan_category_dio implements get_loan_category_dio_interface {

	@Autowired
	EntityManager em;
	

	@Override
	public List<category_master> get_loan_cat() {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<loan_subcategory> cq = cb.createQuery(loan_subcategory.class);
		Root<loan_subcategory> from = cq.from(loan_subcategory.class);
		cq.select(from);
		Query q = em.createQuery(cq);
		return q.getResultList();
	}

	@Override
	public List<bank_master> get_bank() {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<bank_master> cq = cb.createQuery(bank_master.class);
		Root<bank_master> from = cq.from(bank_master.class);
		cq.select(from);
		Query q = em.createQuery(cq);
		return q.getResultList();
	}
}
