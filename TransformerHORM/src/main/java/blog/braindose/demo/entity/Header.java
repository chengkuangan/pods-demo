package blog.braindose.demo.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonBackReference;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity(name = "header")
public class Header extends PanacheEntityBase{
    
    @Id
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    public long id;
    @Column(nullable=false, length=6)
    public String pnr;
    public int currentEnvelopeNum;
    public int numEnvelopesSent;
    public int numPaxInPNR;
    @Column(nullable=false, length=255)
    public String bookingChannel;
    @Column(nullable=false, length=255)
    public String creationPosDetailsCityCode;
    @Column(nullable=false, length=255)
    public String creationPosDetailsCompanyId;
    @Column(nullable=false, length=255)
    public String creationPosDetailsCountryCode;
    @Column(nullable=false, length=255)
    public String creationPosDetailsIataCode;
    @Column(nullable=false, length=255)
    public String creationPosDetailsOfficeID1;
    @Column(nullable=false, length=255)
    public String creationPosDetailsSourceOfBooking;
    @Column(nullable=false, length=255)
    public String lastUpdatorAgentSine1;
    @Column(nullable=false, length=255)
    public String lastUpdatorOfficeID1;
    @Column(nullable=false, length=255)
    public String lastUpdatorReceivedFromInfo;
    @Column(nullable=false, length=255)
    public String ownerPosDetailsCityCode;
    @Column(nullable=false, length=255)
    public String ownerPosDetailsCompanyId;
    @Column(nullable=false, length=255)
    public String ownerPosDetailsCountryCode;
    @Column(nullable=false, length=255)
    public String ownerPosDetailsIataCode;
    @Column(nullable=false, length=255)
    public String ownerPosDetailsOfficeID1;
    @Column(nullable=false, length=255)
    public String ownerPosDetailsSourceOfBooking;
    @Column(nullable=false, length=255)
    public String responsibleAgentId;
    @Column(nullable=false, length=255)
    public String responsibleOfficeID;
    @Column(nullable=false, length=255)
    public String responsibleTypeOfPnrElement;
    @Column(nullable=false, length=255)
    public String secondRpAgentSignature;
    @Column(nullable=false, length=255)
    public String secondRpCreationOfficeId;
    @Column(nullable=false, length=255)
    public String secondRpCreatorIataCode;
    public Date secondRpPnrCreationDateTime;
    @Column(nullable=false, length=255)
    public String updatorPosDetailsCityCode;
    @Column(nullable=false, length=255)
    public String updatorPosDetailsCompanyId;
    @Column(nullable=false, length=255)
    public String updatorPosDetailsCountryCode;
    @Column(nullable=false, length=255)
    public String updatorPosDetailsIataCode;
    @Column(nullable=false, length=255)
    public String updatorPosDetailsOfficeID1;
    @Column(nullable=false, length=255)
    public String updatorPosDetailsSourceOfBooking;

    @OneToOne(optional=false, mappedBy = "header")
    public Booking booking;
    
}
