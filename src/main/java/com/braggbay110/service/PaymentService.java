package com.braggbay110.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.braggbay110.domain.Payment;
import com.braggbay110.dto.PaymentDTO;
import com.braggbay110.dto.PaymentSearchDTO;
import com.braggbay110.dto.PaymentPageDTO;
import com.braggbay110.dto.PaymentConvertCriteriaDTO;
import com.braggbay110.service.GenericService;
import com.braggbay110.dto.common.RequestDTO;
import com.braggbay110.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface PaymentService extends GenericService<Payment, Integer> {

	List<Payment> findAll();

	ResultDTO addPayment(PaymentDTO paymentDTO, RequestDTO requestDTO);

	ResultDTO updatePayment(PaymentDTO paymentDTO, RequestDTO requestDTO);

    Page<Payment> getAllPayments(Pageable pageable);

    Page<Payment> getAllPayments(Specification<Payment> spec, Pageable pageable);

	ResponseEntity<PaymentPageDTO> getPayments(PaymentSearchDTO paymentSearchDTO);
	
	List<PaymentDTO> convertPaymentsToPaymentDTOs(List<Payment> payments, PaymentConvertCriteriaDTO convertCriteria);

	PaymentDTO getPaymentDTOById(Integer paymentId);







}





