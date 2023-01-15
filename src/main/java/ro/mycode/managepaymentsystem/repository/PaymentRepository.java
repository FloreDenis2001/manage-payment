package ro.mycode.managepaymentsystem.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.mycode.managepaymentsystem.model.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment,Long> {
}
