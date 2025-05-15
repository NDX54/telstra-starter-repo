package au.com.telstra.simcardactivator.model;

import javax.persistence.*;

@Entity
public class SimCard {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "iccid")
    private String iccid;

    @Column(name = "customer_email")
    private String customerEmail;

    public SimCard() {
        this.iccid = "";
        this.customerEmail = "";
    }

    public SimCard(String iccid, String customerEmail) {
        this.iccid = iccid;
        this.customerEmail = customerEmail;
    }

    public String getIccid() {
        return iccid;
    }

    public void setIccid(String iccid) {
        this.iccid = iccid;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }
}
