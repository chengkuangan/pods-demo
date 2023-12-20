package blog.braindose.demo.entity;

import java.util.Date;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity(name = "pricing")
public class Pricing extends PanacheEntityBase{
    
    @Id
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    public long id;
    @Column(nullable=false, length=6)
    public String pnr;
    public int couponDetailsGroupBaggageExcessAmount;
    @Column(nullable=false, length=255)
    public String couponDetailsGroupBaggageExcessCurrency;
    @Column(nullable=false, length=255)
    public String couponDetailsGroupFeeOwnerCode;
    @Column(nullable=false, length=255)
    public String documentDetailsIssueIdentifiers;
    @Column(nullable=false, length=255)
    public String documentDetailsIssueIndicators;
    public double documentDetailsTotalFareAmount;
    @Column(nullable=false, length=255)
    public String documentDetailsTotalFareCurrency;
    @Column(nullable=false, length=255)
    public String manualIndicatorStatus;
    @Column(nullable=false, length=255)
    public String officeAmId;
    @Column(nullable=false, length=255)
    public String passengerTattoosType;
    @Column(nullable=false, length=255)
    public String passengerTattoosValue;
    @Column(nullable=false, length=255)
    public String pricingRecordReferenceType;
    @Column(nullable=false, length=255)
    public String pricingRecordUniqueReference;
    @Column(nullable=false, length=255)
    public String couponDetailsGroupBaggageQuantityCode;
    @Column(nullable=false, length=255)
    public String couponDetailsGroupBaggageUnitQualifier;
    public Date creationDateTime;
    @Column(nullable=false, length=255)
    public String officeName;

    @OneToOne(optional=false, mappedBy = "pricing")
    public Booking booking;
}
