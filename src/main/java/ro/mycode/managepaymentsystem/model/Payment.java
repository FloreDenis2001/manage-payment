package ro.mycode.managepaymentsystem.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="Payment")
@Table(name="payment")


public class Payment implements Comparable<Payment>{

    @GeneratedValue( strategy = GenerationType.AUTO)
    @Id

    private long id;
    private long customer_id;
    private LocalDateTime date;
    private double amount;
    private String description;

    @Override
    public String toString(){
        String text="Id: "+this.id+"\n";
        text+="Customer Id : "+this.customer_id+"\n";
        text+="Date : "+this.date+"\n";
        text+="Amount : "+this.amount+"\n";
        text+="Description : "+this.description+"\n";

        return text;
    }
    @Override
    public boolean equals(Object o){
        Payment m=(Payment) o;
        return m.getDescription().compareTo(this.getDescription())==0;
    }


    @Override
    public int compareTo(Payment o) {
        if(this.getAmount()>o.getAmount()){
            return 1;
        }else if(this.getAmount()<o.getAmount()){
            return -1;
        }else {
            return 0;
        }
    }
}
