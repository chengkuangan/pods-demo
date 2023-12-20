package blog.braindose.demo.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity(name = "passenger")
public class Passenger extends PanacheEntityBase{
    
    @Id
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    public long id;
    @Column(nullable=false, length=6)
    public String pnr;
    public int passengerElemRefTattooNum;
    @Column(nullable=false, length=255)
    public String passengerElemRefTattooType;
    @Column(nullable=false, length=255)
    public String passengerElemType;
    public int paxCount;
    @Column(nullable=false, length=255)
    public String paxType;
    @Column(nullable=false, length=255)
    public String infantType;
    @Column(nullable=false, length=255)
    public String isTravellingWithInfant;
    @Column(nullable=false, length=255)
    public String dateOfBirth;
    @Column(nullable=false, length=255)
    public String paxTitle;
    @Column(nullable=false, length=255)
    public String firstName;
    @Column(nullable=false, length=255)
    public String firstNameOriginal;
    @Column(nullable=false, length=255)
    public String infantFirstName;
    @Column(nullable=false, length=255)
    public String infantSurName;
    @Column(nullable=false, length=255)
    public String paxSurName;

    @OneToOne(optional=false, mappedBy = "passenger")
    public Booking booking;
}
