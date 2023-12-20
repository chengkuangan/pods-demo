package blog.braindose.demo.entity;

import java.util.Date;
import java.util.List;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity(name = "booking")
public class Booking extends PanacheEntityBase{
    
    @Id
    @Column(nullable=false, length=6)
    public String pnr;
    @Column(nullable=false, length=255)
    public String pnrPurgeDate;
    @Column(nullable=false, length=255)
    public String queueingOfficeId;
    @Column(nullable=false, length=255)
    public String reservationAmadeusCompanyID;
    @Column(nullable=false, length=255)
    public String reservationAmadeusRecordLocator;
    @Column(nullable=false, length=255)
    public String reservationControlType;
    public Date reservationLastEOTDateTime;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="header_id", referencedColumnName = "id")
    public Header header;

    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn(name="itinerary_id", referencedColumnName = "id")
    public Itinerary itinerary;

    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn(name="passenger_id", referencedColumnName = "id")
    public Passenger passenger;

    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn(name="pricing_id", referencedColumnName = "id")
    public Pricing pricing;

    //@OneToMany (cascade = CascadeType.ALL, mappedBy = "pnr")
    //@JoinColumn(name="pnr")
    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="pnr", referencedColumnName="pnr")
    public List<ActivityReport> activityReports;

    
}
