package ro.mycode.managepaymentsystem.service;

import org.springframework.stereotype.Service;
import ro.mycode.managepaymentsystem.model.Payment;
import ro.mycode.managepaymentsystem.repository.PaymentRepository;

import java.util.List;

@Service
public class PaymentService {

    private PaymentRepository paymentRepository;

    public PaymentService (PaymentRepository paymentRepository){
        this.paymentRepository=paymentRepository;
    }

    public List<Payment> getAllPayments(){
        return paymentRepository.findAll();
    }
}
