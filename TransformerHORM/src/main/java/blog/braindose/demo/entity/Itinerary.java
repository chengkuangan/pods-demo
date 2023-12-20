package blog.braindose.demo.entity;

import java.util.Date;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity(name = "itinerary")
public class Itinerary extends PanacheEntityBase{

    @Id
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    public long id;
    @Column(nullable=false, length=6)
    public String pnr;
    @Column(nullable=false, length=255)
    public String boardPoint;
    @Column(nullable=false, length=255)
    public String boardPointTerminal;
    @Column(nullable=false, length=255)
    public String bookingClass;
    @Column(nullable=false, length=255)
    public String companyCode;
    @Column(nullable=true, length=255)
    public String dayChangeIndicator;
    @Column(nullable=false, length=255)
    public String daysOfOperation;
    public int elemRefTattooNum;
    @Column(nullable=false, length=255)
    public String elemRefTattooType;
    @Column(nullable=false, length=255)
    public String etIndicator;
    @Column(nullable=false, length=255)
    public String extAirlineCode1;
    @Column(nullable=false, length=255)
    public String flightType;
    @Column(nullable=false, length=255)
    public String inventoryDataCabinCode;
    @Column(nullable=false, length=255)
    public String inventoryDataPosInvClassification;
    @Column(nullable=false, length=255)
    public String inventoryDataPosInvCompanyID;
    @Column(nullable=false, length=255)
    public String inventoryDataPosInvCountryCode;
    @Column(nullable=false, length=255)
    public String inventoryDataSubClassNum;
    @Column(nullable=false, length=255)
    public String itinPosDetailsCityCode;
    @Column(nullable=false, length=255)
    public String itinPosDetailsCompanyId;
    @Column(nullable=false, length=255)
    public String itinPosDetailsCountryCode;
    @Column(nullable=false, length=255)
    public String itinPosDetailsSourceofBooking;
    @Column(nullable=false, length=255)
    public String offPoint;
    @Column(nullable=false, length=255)
    public String offPointTerminal;
    @Column(nullable=false, length=255)
    public String originalStatusCode1;
    @Column(nullable=false, length=255)
    public String originalStatusCode2;
    public String quantity;
    @Column(nullable=false, length=255)
    public String selectionLevelOfAccessOption;
    @Column(nullable=false, length=255)
    public String statusCode;
    public int yieldDataGroupAdjustedYieldAmount;
    public int yieldDataGroupBidPriceAmount;
    public int yieldDataGroupEffectiveYieldAmount;
    @Column(nullable=false, length=255)
    public String yieldDataGroupTripDestination;
    @Column(nullable=false, length=255)
    public String yieldDataGroupTripOrigin;
    public int yieldDataGroupYieldAmount;
    @Column(nullable=false, length=255)
    public String yieldDataGroupYieldClassOfService;
    @Column(nullable=false, length=255)
    public String yieldDataGroupYieldDestination;
    @Column(nullable=false, length=255)
    public String yieldDataGroupYieldOrigin;
    @Column(nullable=false, length=255)
    public String aircraftType;
    @Column(nullable=false, length=255)
    public String elemType;
    @Column(nullable=false, length=255)
    public String extAirlineRecordLocator1;
    @Column(nullable=false, length=255)
    public String flightNum;
    @Column(nullable=false, length=255)
    public String bookingCreationDateTime;
    public Date endDateTime;
    public Date startDateTime;
    @Column(nullable=false, length=255)
    public String itinPosDetailsOfficeID;
    @Column(nullable=false, length=255)
    public String itinPosDetailsIataCode;
    
    @OneToOne(optional=false, mappedBy = "itinerary")
    public Booking booking;
}
