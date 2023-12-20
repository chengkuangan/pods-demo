package blog.braindose.demo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class SimpleBooking {

    private String pnr;
    private int currentEnvelopeNum;
    private int numEnvelopesSent;
    private int numPaxInPNR;
    private String amadeusCompanyID;
    private String amadeusRecordLocator;
    private String bookingChannel;
    private String creationPosDetailsCityCode;
    private String creationPosDetailsCompanyId;
    private String creationPosDetailsCountryCode;
    private String creationPosDetailsIataCode;
    private String creationPosDetailsOfficeID1;
    private String creationPosDetailsSourceOfBooking;
    private String lastUpdatorAgentSine1;
    private String lastUpdatorOfficeID1;
    private String lastUpdatorReceivedFromInfo;
    private String ownerPosDetailsCityCode;
    private String ownerPosDetailsCompanyId;
    private String ownerPosDetailsCountryCode;
    private String ownerPosDetailsIataCode;
    private String ownerPosDetailsOfficeID1;
    private String ownerPosDetailsSourceOfBooking;
    private String pnrPurgeDate;
    private String queueingOfficeId;
    private String reservationAmadeusCompanyID;
    private String reservationAmadeusRecordLocator;
    private String reservationControlType;
    private Date reservationLastEOTDateTime;
    private String responsibleAgentId;
    private String responsibleOfficeID;
    private String responsibleTypeOfPnrElement;
    private String secondRpAgentSignature;
    private String secondRpCreationOfficeId;
    private String secondRpCreatorIataCode;
    private Date secondRpPnrCreationDateTime;
    private String updatorPosDetailsCityCode;
    private String updatorPosDetailsCompanyId;
    private String updatorPosDetailsCountryCode;
    private String updatorPosDetailsIataCode;
    private String updatorPosDetailsOfficeID1;
    private String updatorPosDetailsSourceOfBooking;

    private String boardPoint;
    private String boardPointTerminal;
    private String bookingClass;
    private String companyCode;
    private String dayChangeIndicator;
    private String daysOfOperation;
    private int elemRefTattooNum;
    private String elemRefTattooType;
    private String etIndicator;
    private String extAirlineCode1;
    private String flightType;
    private String inventoryDataCabinCode;
    private String inventoryDataPosInvClassification;
    private String inventoryDataPosInvCompanyID;
    private String inventoryDataPosInvCountryCode;
    private String inventoryDataSubClassNum;
    private String itinPosDetailsCityCode;
    private String itinPosDetailsCompanyId;
    private String itinPosDetailsCountryCode;
    private String itinPosDetailsSourceofBooking;
    private String offPoint;
    private String offPointTerminal;
    private String originalStatusCode1;
    private String originalStatusCode2;
    private int quantity;
    private String selectionLevelOfAccessOption;
    private String statusCode;
    private int yieldDataGroupAdjustedYieldAmount;
    private int yieldDataGroupBidPriceAmount;
    private int yieldDataGroupEffectiveYieldAmount;
    private String yieldDataGroupTripDestination;
    private String yieldDataGroupTripOrigin;
    private int yieldDataGroupYieldAmount;
    private String yieldDataGroupYieldClassOfService;
    private String yieldDataGroupYieldDestination;
    private String yieldDataGroupYieldOrigin;
    private String aircraftType;
    private String elemType;
    private String extAirlineRecordLocator1;
    private String flightNum;
    private String bookingCreationDateTime;
    private Date endDateTime;
    private Date startDateTime;
    private String itinPosDetailsOfficeID;
    private String itinPosDetailsIataCode;

    private int passengerElemRefTattooNum;
    private String passengerElemRefTattooType;
    private String passengerElemType;
    private int paxCount;
    private String paxType;
    private String infantType;
    private String isTravellingWithInfant;
    private String dateOfBirth;
    private String paxTitle;
    private String firstName;
    private String firstNameOriginal;
    private String infantFirstName;
    private String infantSurName;
    private String paxSurName;

    private int couponDetailsGroupBaggageExcessAmount;
    private String couponDetailsGroupBaggageExcessCurrency;
    private String couponDetailsGroupFeeOwnerCode;
    private String documentDetailsIssueIdentifiers;
    private String documentDetailsIssueIndicators;
    private double documentDetailsTotalFareAmount;
    private String documentDetailsTotalFareCurrency;
    private String manualIndicatorStatus;
    private String officeAmId;
    private String passengerTattoosType;
    private String passengerTattoosValue;
    private String pricingRecordReferenceType;
    private String pricingRecordUniqueReference;
    private String couponDetailsGroupBaggageQuantityCode;
    private String couponDetailsGroupBaggageUnitQualifier;
    private Date creationDateTime;
    private String officeName;

    private List<Map<String, Object>> activityReports = new ArrayList<>(); 
    
    public SimpleBooking() {
    }

    public SimpleBooking(
            String pnr,
            int currentEnvelopeNum,
            int numEnvelopesSent,
            int numPaxInPNR,
            String bookingChannel,
            String creationPosDetailsCityCode,
            String creationPosDetailsCompanyId,
            String creationPosDetailsCountryCode,
            String creationPosDetailsIataCode,
            String creationPosDetailsOfficeID1,
            String creationPosDetailsSourceOfBooking,
            String lastUpdatorAgentSine1,
            String lastUpdatorOfficeID1,
            String lastUpdatorReceivedFromInfo,
            String ownerPosDetailsCityCode,
            String ownerPosDetailsCompanyId,
            String ownerPosDetailsCountryCode,
            String ownerPosDetailsIataCode,
            String ownerPosDetailsOfficeID1,
            String ownerPosDetailsSourceOfBooking,
            String pnrPurgeDate,
            String queueingOfficeId,
            String reservationAmadeusCompanyID,
            String reservationAmadeusRecordLocator,
            String reservationControlType,
            Date reservationLastEOTDateTime,
            String responsibleAgentId,
            String responsibleOfficeID,
            String responsibleTypeOfPnrElement,
            String secondRpAgentSignature,
            String secondRpCreationOfficeId,
            String secondRpCreatorIataCode,
            Date secondRpPnrCreationDateTime,
            String updatorPosDetailsCityCode,
            String updatorPosDetailsCompanyId,
            String updatorPosDetailsCountryCode,
            String updatorPosDetailsIataCode,
            String updatorPosDetailsOfficeID1,
            String updatorPosDetailsSourceOfBooking,
            String boardPoint,
            String boardPointTerminal,
            String bookingClass,
            String companyCode,
            String dayChangeIndicator,
            String daysOfOperation,
            int elemRefTattooNum,
            String elemRefTattooType,
            String etIndicator,
            String extAirlineCode1,
            String flightType,
            String inventoryDataCabinCode,
            String inventoryDataPosInvClassification,
            String inventoryDataPosInvCompanyID,
            String inventoryDataPosInvCountryCode,
            String inventoryDataSubClassNum,
            String itinPosDetailsCityCode,
            String itinPosDetailsCompanyId,
            String itinPosDetailsCountryCode,
            String itinPosDetailsSourceofBooking,
            String offPoint,
            String offPointTerminal,
            String originalStatusCode1,
            String originalStatusCode2,
            int quantity,
            String selectionLevelOfAccessOption,
            String statusCode,
            int yieldDataGroupAdjustedYieldAmount,
            int yieldDataGroupBidPriceAmount,
            int yieldDataGroupEffectiveYieldAmount,
            String yieldDataGroupTripDestination,
            String yieldDataGroupTripOrigin,
            int yieldDataGroupYieldAmount,
            String yieldDataGroupYieldClassOfService,
            String yieldDataGroupYieldDestination,
            String yieldDataGroupYieldOrigin,
            String aircraftType,
            String elemType,
            String extAirlineRecordLocator1,
            String flightNum,
            String bookingCreationDateTime,
            Date endDateTime,
            Date startDateTime,
            String itinPosDetailsOfficeID,
            String itinPosDetailsIataCode,
            int passengerElemRefTattooNum,
            String passengerElemRefTattooType,
            String passengerElemType,
            int paxCount,
            String paxType,
            String infantType,
            String isTravellingWithInfant,
            String dateOfBirth,
            String paxTitle,
            String firstName,
            String firstNameOriginal,
            String infantFirstName,
            String infantSurName,
            String paxSurName,
            int couponDetailsGroupBaggageExcessAmount,
            String couponDetailsGroupBaggageExcessCurrency,
            String couponDetailsGroupFeeOwnerCode,
            String documentDetailsIssueIdentifiers,
            String documentDetailsIssueIndicators,
            double documentDetailsTotalFareAmount,
            String documentDetailsTotalFareCurrency,
            String manualIndicatorStatus,
            String officeAmId,
            String passengerTattoosType,
            String passengerTattoosValue,
            String pricingRecordReferenceType,
            String pricingRecordUniqueReference,
            String couponDetailsGroupBaggageQuantityCode,
            String couponDetailsGroupBaggageUnitQualifier,
            Date creationDateTime,
            String officeName) {

        this.pnr = pnr;
        this.currentEnvelopeNum = currentEnvelopeNum;
        this.numEnvelopesSent = numEnvelopesSent;
        this.numPaxInPNR = numPaxInPNR;
        this.bookingChannel = bookingChannel;
        this.creationPosDetailsCityCode = creationPosDetailsCityCode;
        this.creationPosDetailsCompanyId = creationPosDetailsCompanyId;
        this.creationPosDetailsCountryCode = creationPosDetailsCountryCode;
        this.creationPosDetailsIataCode = creationPosDetailsIataCode;
        this.creationPosDetailsOfficeID1 = creationPosDetailsOfficeID1;
        this.creationPosDetailsSourceOfBooking = creationPosDetailsSourceOfBooking;
        this.lastUpdatorAgentSine1 = lastUpdatorAgentSine1;
        this.lastUpdatorOfficeID1 = lastUpdatorOfficeID1;
        this.lastUpdatorReceivedFromInfo = lastUpdatorReceivedFromInfo;
        this.ownerPosDetailsCityCode = ownerPosDetailsCityCode;
        this.ownerPosDetailsCompanyId = ownerPosDetailsCompanyId;
        this.ownerPosDetailsCountryCode = ownerPosDetailsCountryCode;
        this.ownerPosDetailsIataCode = ownerPosDetailsIataCode;
        this.ownerPosDetailsOfficeID1 = ownerPosDetailsOfficeID1;
        this.ownerPosDetailsSourceOfBooking = ownerPosDetailsSourceOfBooking;
        this.pnrPurgeDate = pnrPurgeDate;
        this.queueingOfficeId = queueingOfficeId;
        this.reservationAmadeusCompanyID = reservationAmadeusCompanyID;
        this.reservationAmadeusRecordLocator = reservationAmadeusRecordLocator;
        this.reservationControlType = reservationControlType;
        this.reservationLastEOTDateTime = reservationLastEOTDateTime;
        this.responsibleAgentId = responsibleAgentId;
        this.responsibleOfficeID = responsibleOfficeID;
        this.responsibleTypeOfPnrElement = responsibleTypeOfPnrElement;
        this.secondRpAgentSignature = secondRpAgentSignature;
        this.secondRpCreationOfficeId = secondRpCreationOfficeId;
        this.secondRpCreatorIataCode = secondRpCreatorIataCode;
        this.secondRpPnrCreationDateTime = secondRpPnrCreationDateTime;
        this.updatorPosDetailsCityCode = updatorPosDetailsCityCode;
        this.updatorPosDetailsCompanyId = updatorPosDetailsCompanyId;
        this.updatorPosDetailsCountryCode = updatorPosDetailsCountryCode;
        this.updatorPosDetailsIataCode = updatorPosDetailsIataCode;
        this.updatorPosDetailsOfficeID1 = updatorPosDetailsOfficeID1;
        this.updatorPosDetailsSourceOfBooking = updatorPosDetailsSourceOfBooking;
        this.boardPoint = boardPoint;
        this.boardPointTerminal = boardPointTerminal;
        this.bookingClass = bookingClass;
        this.companyCode = companyCode;
        this.dayChangeIndicator = dayChangeIndicator;
        this.daysOfOperation = daysOfOperation;
        this.elemRefTattooNum = elemRefTattooNum;
        this.elemRefTattooType = elemRefTattooType;
        this.etIndicator = etIndicator;
        this.extAirlineCode1 = extAirlineCode1;
        this.flightType = flightType;
        this.inventoryDataCabinCode = inventoryDataCabinCode;
        this.inventoryDataPosInvClassification = inventoryDataPosInvClassification;
        this.inventoryDataPosInvCompanyID = inventoryDataPosInvCompanyID;
        this.inventoryDataPosInvCountryCode = inventoryDataPosInvCountryCode;
        this.inventoryDataSubClassNum = inventoryDataSubClassNum;
        this.itinPosDetailsCityCode = itinPosDetailsCityCode;
        this.itinPosDetailsCompanyId = itinPosDetailsCompanyId;
        this.itinPosDetailsCountryCode = itinPosDetailsCountryCode;
        this.itinPosDetailsSourceofBooking = itinPosDetailsSourceofBooking;
        this.offPoint = offPoint;
        this.offPointTerminal = offPointTerminal;
        this.originalStatusCode1 = originalStatusCode1;
        this.originalStatusCode2 = originalStatusCode2;
        this.quantity = quantity;
        this.selectionLevelOfAccessOption = selectionLevelOfAccessOption;
        this.statusCode = statusCode;
        this.yieldDataGroupAdjustedYieldAmount = yieldDataGroupAdjustedYieldAmount;
        this.yieldDataGroupBidPriceAmount = yieldDataGroupBidPriceAmount;
        this.yieldDataGroupEffectiveYieldAmount = yieldDataGroupEffectiveYieldAmount;
        this.yieldDataGroupTripDestination = yieldDataGroupTripDestination;
        this.yieldDataGroupTripOrigin = yieldDataGroupTripOrigin;
        this.yieldDataGroupYieldAmount = yieldDataGroupYieldAmount;
        this.yieldDataGroupYieldClassOfService = yieldDataGroupYieldClassOfService;
        this.yieldDataGroupYieldDestination = yieldDataGroupYieldDestination;
        this.yieldDataGroupYieldOrigin = yieldDataGroupYieldOrigin;
        this.aircraftType = aircraftType;
        this.elemType = elemType;
        this.extAirlineRecordLocator1 = extAirlineRecordLocator1;
        this.flightNum = flightNum;
        this.bookingCreationDateTime = bookingCreationDateTime;
        this.endDateTime = endDateTime;
        this.startDateTime = startDateTime;
        this.itinPosDetailsOfficeID = itinPosDetailsOfficeID;
        this.itinPosDetailsIataCode = itinPosDetailsIataCode;
        this.passengerElemRefTattooNum = passengerElemRefTattooNum;
        this.passengerElemRefTattooType = passengerElemRefTattooType;
        this.passengerElemType = passengerElemType;
        this.paxCount = paxCount;
        this.paxType = paxType;
        this.infantType = infantType;
        this.isTravellingWithInfant = isTravellingWithInfant;
        this.dateOfBirth = dateOfBirth;
        this.paxTitle = paxTitle;
        this.firstName = firstName;
        this.firstNameOriginal = firstNameOriginal;
        this.infantFirstName = infantFirstName;
        this.infantSurName = infantSurName;
        this.paxSurName = paxSurName;

        this.couponDetailsGroupBaggageExcessAmount = couponDetailsGroupBaggageExcessAmount;
        this.couponDetailsGroupBaggageExcessCurrency = couponDetailsGroupBaggageExcessCurrency;
        this.couponDetailsGroupFeeOwnerCode = couponDetailsGroupFeeOwnerCode;
        this.documentDetailsIssueIdentifiers = documentDetailsIssueIdentifiers;
        this.documentDetailsIssueIndicators = documentDetailsIssueIndicators;
        this.documentDetailsTotalFareAmount = documentDetailsTotalFareAmount;
        this.documentDetailsTotalFareCurrency = documentDetailsTotalFareCurrency;
        this.manualIndicatorStatus = manualIndicatorStatus;
        this.officeAmId = officeAmId;
        this.passengerTattoosType = passengerTattoosType;
        this.passengerTattoosValue = passengerTattoosValue;
        this.pricingRecordReferenceType = pricingRecordReferenceType;
        this.pricingRecordUniqueReference = pricingRecordUniqueReference;
        this.couponDetailsGroupBaggageQuantityCode = couponDetailsGroupBaggageQuantityCode;
        this.couponDetailsGroupBaggageUnitQualifier = couponDetailsGroupBaggageUnitQualifier;
        this.creationDateTime = creationDateTime;
        this.officeName = officeName;
    }

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public int getCurrentEnvelopeNum() {
        return currentEnvelopeNum;
    }

    public void setCurrentEnvelopeNum(int currentEnvelopeNum) {
        this.currentEnvelopeNum = currentEnvelopeNum;
    }

    public int getNumEnvelopesSent() {
        return numEnvelopesSent;
    }

    public void setNumEnvelopesSent(int numEnvelopesSent) {
        this.numEnvelopesSent = numEnvelopesSent;
    }

    public int getNumPaxInPNR() {
        return numPaxInPNR;
    }

    public void setNumPaxInPNR(int numPaxInPNR) {
        this.numPaxInPNR = numPaxInPNR;
    }

    public String getAmadeusCompanyID() {
        return amadeusCompanyID;
    }

    public void setAmadeusCompanyID(String amadeusCompanyID) {
        this.amadeusCompanyID = amadeusCompanyID;
    }

    public String getAmadeusRecordLocator() {
        return amadeusRecordLocator;
    }

    public void setAmadeusRecordLocator(String amadeusRecordLocator) {
        this.amadeusRecordLocator = amadeusRecordLocator;
    }

    public String getBookingChannel() {
        return bookingChannel;
    }

    public void setBookingChannel(String bookingChannel) {
        this.bookingChannel = bookingChannel;
    }

    public String getCreationPosDetailsCityCode() {
        return creationPosDetailsCityCode;
    }

    public void setCreationPosDetailsCityCode(String creationPosDetailsCityCode) {
        this.creationPosDetailsCityCode = creationPosDetailsCityCode;
    }

    public String getCreationPosDetailsCompanyId() {
        return creationPosDetailsCompanyId;
    }

    public void setCreationPosDetailsCompanyId(String creationPosDetailsCompanyId) {
        this.creationPosDetailsCompanyId = creationPosDetailsCompanyId;
    }

    public String getCreationPosDetailsCountryCode() {
        return creationPosDetailsCountryCode;
    }

    public void setCreationPosDetailsCountryCode(String creationPosDetailsCountryCode) {
        this.creationPosDetailsCountryCode = creationPosDetailsCountryCode;
    }

    public String getCreationPosDetailsIataCode() {
        return creationPosDetailsIataCode;
    }

    public void setCreationPosDetailsIataCode(String creationPosDetailsIataCode) {
        this.creationPosDetailsIataCode = creationPosDetailsIataCode;
    }

    public String getCreationPosDetailsOfficeID1() {
        return creationPosDetailsOfficeID1;
    }

    public void setCreationPosDetailsOfficeID1(String creationPosDetailsOfficeID1) {
        this.creationPosDetailsOfficeID1 = creationPosDetailsOfficeID1;
    }

    public String getCreationPosDetailsSourceOfBooking() {
        return creationPosDetailsSourceOfBooking;
    }

    public void setCreationPosDetailsSourceOfBooking(String creationPosDetailsSourceOfBooking) {
        this.creationPosDetailsSourceOfBooking = creationPosDetailsSourceOfBooking;
    }

    public String getLastUpdatorAgentSine1() {
        return lastUpdatorAgentSine1;
    }

    public void setLastUpdatorAgentSine1(String lastUpdatorAgentSine1) {
        this.lastUpdatorAgentSine1 = lastUpdatorAgentSine1;
    }

    public String getLastUpdatorOfficeID1() {
        return lastUpdatorOfficeID1;
    }

    public void setLastUpdatorOfficeID1(String lastUpdatorOfficeID1) {
        this.lastUpdatorOfficeID1 = lastUpdatorOfficeID1;
    }

    public String getLastUpdatorReceivedFromInfo() {
        return lastUpdatorReceivedFromInfo;
    }

    public void setLastUpdatorReceivedFromInfo(String lastUpdatorReceivedFromInfo) {
        this.lastUpdatorReceivedFromInfo = lastUpdatorReceivedFromInfo;
    }

    public String getOwnerPosDetailsCityCode() {
        return ownerPosDetailsCityCode;
    }

    public void setOwnerPosDetailsCityCode(String ownerPosDetailsCityCode) {
        this.ownerPosDetailsCityCode = ownerPosDetailsCityCode;
    }

    public String getOwnerPosDetailsCompanyId() {
        return ownerPosDetailsCompanyId;
    }

    public void setOwnerPosDetailsCompanyId(String ownerPosDetailsCompanyId) {
        this.ownerPosDetailsCompanyId = ownerPosDetailsCompanyId;
    }

    public String getOwnerPosDetailsCountryCode() {
        return ownerPosDetailsCountryCode;
    }

    public void setOwnerPosDetailsCountryCode(String ownerPosDetailsCountryCode) {
        this.ownerPosDetailsCountryCode = ownerPosDetailsCountryCode;
    }

    public String getOwnerPosDetailsIataCode() {
        return ownerPosDetailsIataCode;
    }

    public void setOwnerPosDetailsIataCode(String ownerPosDetailsIataCode) {
        this.ownerPosDetailsIataCode = ownerPosDetailsIataCode;
    }

    public String getOwnerPosDetailsOfficeID1() {
        return ownerPosDetailsOfficeID1;
    }

    public void setOwnerPosDetailsOfficeID1(String ownerPosDetailsOfficeID1) {
        this.ownerPosDetailsOfficeID1 = ownerPosDetailsOfficeID1;
    }

    public String getOwnerPosDetailsSourceOfBooking() {
        return ownerPosDetailsSourceOfBooking;
    }

    public void setOwnerPosDetailsSourceOfBooking(String ownerPosDetailsSourceOfBooking) {
        this.ownerPosDetailsSourceOfBooking = ownerPosDetailsSourceOfBooking;
    }

    public String getPnrPurgeDate() {
        return pnrPurgeDate;
    }

    public void setPnrPurgeDate(String pnrPurgeDate) {
        this.pnrPurgeDate = pnrPurgeDate;
    }

    public String getQueueingOfficeId() {
        return queueingOfficeId;
    }

    public void setQueueingOfficeId(String queueingOfficeId) {
        this.queueingOfficeId = queueingOfficeId;
    }

    public String getReservationAmadeusCompanyID() {
        return reservationAmadeusCompanyID;
    }

    public void setReservationAmadeusCompanyID(String reservationAmadeusCompanyID) {
        this.reservationAmadeusCompanyID = reservationAmadeusCompanyID;
    }

    public String getReservationAmadeusRecordLocator() {
        return reservationAmadeusRecordLocator;
    }

    public void setReservationAmadeusRecordLocator(String reservationAmadeusRecordLocator) {
        this.reservationAmadeusRecordLocator = reservationAmadeusRecordLocator;
    }

    public String getReservationControlType() {
        return reservationControlType;
    }

    public void setReservationControlType(String reservationControlType) {
        this.reservationControlType = reservationControlType;
    }

    public Date getReservationLastEOTDateTime() {
        return reservationLastEOTDateTime;
    }

    public void setReservationLastEOTDateTime(Date reservationLastEOTDateTime) {
        this.reservationLastEOTDateTime = reservationLastEOTDateTime;
    }

    public String getResponsibleAgentId() {
        return responsibleAgentId;
    }

    public void setResponsibleAgentId(String responsibleAgentId) {
        this.responsibleAgentId = responsibleAgentId;
    }

    public String getResponsibleOfficeID() {
        return responsibleOfficeID;
    }

    public void setResponsibleOfficeID(String responsibleOfficeID) {
        this.responsibleOfficeID = responsibleOfficeID;
    }

    public String getResponsibleTypeOfPnrElement() {
        return responsibleTypeOfPnrElement;
    }

    public void setResponsibleTypeOfPnrElement(String responsibleTypeOfPnrElement) {
        this.responsibleTypeOfPnrElement = responsibleTypeOfPnrElement;
    }

    public String getSecondRpAgentSignature() {
        return secondRpAgentSignature;
    }

    public void setSecondRpAgentSignature(String secondRpAgentSignature) {
        this.secondRpAgentSignature = secondRpAgentSignature;
    }

    public String getSecondRpCreationOfficeId() {
        return secondRpCreationOfficeId;
    }

    public void setSecondRpCreationOfficeId(String secondRpCreationOfficeId) {
        this.secondRpCreationOfficeId = secondRpCreationOfficeId;
    }

    public String getSecondRpCreatorIataCode() {
        return secondRpCreatorIataCode;
    }

    public void setSecondRpCreatorIataCode(String secondRpCreatorIataCode) {
        this.secondRpCreatorIataCode = secondRpCreatorIataCode;
    }

    public Date getSecondRpPnrCreationDateTime() {
        return secondRpPnrCreationDateTime;
    }

    public void setSecondRpPnrCreationDateTime(Date secondRpPnrCreationDateTime) {
        this.secondRpPnrCreationDateTime = secondRpPnrCreationDateTime;
    }

    public String getUpdatorPosDetailsCityCode() {
        return updatorPosDetailsCityCode;
    }

    public void setUpdatorPosDetailsCityCode(String updatorPosDetailsCityCode) {
        this.updatorPosDetailsCityCode = updatorPosDetailsCityCode;
    }

    public String getUpdatorPosDetailsCompanyId() {
        return updatorPosDetailsCompanyId;
    }

    public void setUpdatorPosDetailsCompanyId(String updatorPosDetailsCompanyId) {
        this.updatorPosDetailsCompanyId = updatorPosDetailsCompanyId;
    }

    public String getUpdatorPosDetailsCountryCode() {
        return updatorPosDetailsCountryCode;
    }

    public void setUpdatorPosDetailsCountryCode(String updatorPosDetailsCountryCode) {
        this.updatorPosDetailsCountryCode = updatorPosDetailsCountryCode;
    }

    public String getUpdatorPosDetailsIataCode() {
        return updatorPosDetailsIataCode;
    }

    public void setUpdatorPosDetailsIataCode(String updatorPosDetailsIataCode) {
        this.updatorPosDetailsIataCode = updatorPosDetailsIataCode;
    }

    public String getUpdatorPosDetailsOfficeID1() {
        return updatorPosDetailsOfficeID1;
    }

    public void setUpdatorPosDetailsOfficeID1(String updatorPosDetailsOfficeID1) {
        this.updatorPosDetailsOfficeID1 = updatorPosDetailsOfficeID1;
    }

    public String getUpdatorPosDetailsSourceOfBooking() {
        return updatorPosDetailsSourceOfBooking;
    }

    public void setUpdatorPosDetailsSourceOfBooking(String updatorPosDetailsSourceOfBooking) {
        this.updatorPosDetailsSourceOfBooking = updatorPosDetailsSourceOfBooking;
    }

    public String getBoardPoint() {
        return boardPoint;
    }

    public void setBoardPoint(String boardPoint) {
        this.boardPoint = boardPoint;
    }

    public String getBoardPointTerminal() {
        return boardPointTerminal;
    }

    public void setBoardPointTerminal(String boardPointTerminal) {
        this.boardPointTerminal = boardPointTerminal;
    }

    public String getBookingClass() {
        return bookingClass;
    }

    public void setBookingClass(String bookingClass) {
        this.bookingClass = bookingClass;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getDayChangeIndicator() {
        return dayChangeIndicator;
    }

    public void setDayChangeIndicator(String dayChangeIndicator) {
        this.dayChangeIndicator = dayChangeIndicator;
    }

    public String getDaysOfOperation() {
        return daysOfOperation;
    }

    public void setDaysOfOperation(String daysOfOperation) {
        this.daysOfOperation = daysOfOperation;
    }

    public int getElemRefTattooNum() {
        return elemRefTattooNum;
    }

    public void setElemRefTattooNum(int elemRefTattooNum) {
        this.elemRefTattooNum = elemRefTattooNum;
    }

    public String getElemRefTattooType() {
        return elemRefTattooType;
    }

    public void setElemRefTattooType(String elemRefTattooType) {
        this.elemRefTattooType = elemRefTattooType;
    }

    public String getEtIndicator() {
        return etIndicator;
    }

    public void setEtIndicator(String etIndicator) {
        this.etIndicator = etIndicator;
    }

    public String getExtAirlineCode1() {
        return extAirlineCode1;
    }

    public void setExtAirlineCode1(String extAirlineCode1) {
        this.extAirlineCode1 = extAirlineCode1;
    }

    public String getFlightType() {
        return flightType;
    }

    public void setFlightType(String flightType) {
        this.flightType = flightType;
    }

    public String getInventoryDataCabinCode() {
        return inventoryDataCabinCode;
    }

    public void setInventoryDataCabinCode(String inventoryDataCabinCode) {
        this.inventoryDataCabinCode = inventoryDataCabinCode;
    }

    public String getInventoryDataPosInvClassification() {
        return inventoryDataPosInvClassification;
    }

    public void setInventoryDataPosInvClassification(String inventoryDataPosInvClassification) {
        this.inventoryDataPosInvClassification = inventoryDataPosInvClassification;
    }

    public String getInventoryDataPosInvCompanyID() {
        return inventoryDataPosInvCompanyID;
    }

    public void setInventoryDataPosInvCompanyID(String inventoryDataPosInvCompanyID) {
        this.inventoryDataPosInvCompanyID = inventoryDataPosInvCompanyID;
    }

    public String getInventoryDataPosInvCountryCode() {
        return inventoryDataPosInvCountryCode;
    }

    public void setInventoryDataPosInvCountryCode(String inventoryDataPosInvCountryCode) {
        this.inventoryDataPosInvCountryCode = inventoryDataPosInvCountryCode;
    }

    public String getInventoryDataSubClassNum() {
        return inventoryDataSubClassNum;
    }

    public void setInventoryDataSubClassNum(String inventoryDataSubClassNum) {
        this.inventoryDataSubClassNum = inventoryDataSubClassNum;
    }

    public String getItinPosDetailsCityCode() {
        return itinPosDetailsCityCode;
    }

    public void setItinPosDetailsCityCode(String itinPosDetailsCityCode) {
        this.itinPosDetailsCityCode = itinPosDetailsCityCode;
    }

    public String getItinPosDetailsCompanyId() {
        return itinPosDetailsCompanyId;
    }

    public void setItinPosDetailsCompanyId(String itinPosDetailsCompanyId) {
        this.itinPosDetailsCompanyId = itinPosDetailsCompanyId;
    }

    public String getItinPosDetailsCountryCode() {
        return itinPosDetailsCountryCode;
    }

    public void setItinPosDetailsCountryCode(String itinPosDetailsCountryCode) {
        this.itinPosDetailsCountryCode = itinPosDetailsCountryCode;
    }

    public String getItinPosDetailsSourceofBooking() {
        return itinPosDetailsSourceofBooking;
    }

    public void setItinPosDetailsSourceofBooking(String itinPosDetailsSourceofBooking) {
        this.itinPosDetailsSourceofBooking = itinPosDetailsSourceofBooking;
    }

    public String getOffPoint() {
        return offPoint;
    }

    public void setOffPoint(String offPoint) {
        this.offPoint = offPoint;
    }

    public String getOffPointTerminal() {
        return offPointTerminal;
    }

    public void setOffPointTerminal(String offPointTerminal) {
        this.offPointTerminal = offPointTerminal;
    }

    public String getOriginalStatusCode1() {
        return originalStatusCode1;
    }

    public void setOriginalStatusCode1(String originalStatusCode1) {
        this.originalStatusCode1 = originalStatusCode1;
    }

    public String getOriginalStatusCode2() {
        return originalStatusCode2;
    }

    public void setOriginalStatusCode2(String originalStatusCode2) {
        this.originalStatusCode2 = originalStatusCode2;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getSelectionLevelOfAccessOption() {
        return selectionLevelOfAccessOption;
    }

    public void setSelectionLevelOfAccessOption(String selectionLevelOfAccessOption) {
        this.selectionLevelOfAccessOption = selectionLevelOfAccessOption;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public int getYieldDataGroupAdjustedYieldAmount() {
        return yieldDataGroupAdjustedYieldAmount;
    }

    public void setYieldDataGroupAdjustedYieldAmount(int yieldDataGroupAdjustedYieldAmount) {
        this.yieldDataGroupAdjustedYieldAmount = yieldDataGroupAdjustedYieldAmount;
    }

    public int getYieldDataGroupBidPriceAmount() {
        return yieldDataGroupBidPriceAmount;
    }

    public void setYieldDataGroupBidPriceAmount(int yieldDataGroupBidPriceAmount) {
        this.yieldDataGroupBidPriceAmount = yieldDataGroupBidPriceAmount;
    }

    public int getYieldDataGroupEffectiveYieldAmount() {
        return yieldDataGroupEffectiveYieldAmount;
    }

    public void setYieldDataGroupEffectiveYieldAmount(int yieldDataGroupEffectiveYieldAmount) {
        this.yieldDataGroupEffectiveYieldAmount = yieldDataGroupEffectiveYieldAmount;
    }

    public String getYieldDataGroupTripDestination() {
        return yieldDataGroupTripDestination;
    }

    public void setYieldDataGroupTripDestination(String yieldDataGroupTripDestination) {
        this.yieldDataGroupTripDestination = yieldDataGroupTripDestination;
    }

    public String getYieldDataGroupTripOrigin() {
        return yieldDataGroupTripOrigin;
    }

    public void setYieldDataGroupTripOrigin(String yieldDataGroupTripOrigin) {
        this.yieldDataGroupTripOrigin = yieldDataGroupTripOrigin;
    }

    public int getYieldDataGroupYieldAmount() {
        return yieldDataGroupYieldAmount;
    }

    public void setYieldDataGroupYieldAmount(int yieldDataGroupYieldAmount) {
        this.yieldDataGroupYieldAmount = yieldDataGroupYieldAmount;
    }

    public String getYieldDataGroupYieldClassOfService() {
        return yieldDataGroupYieldClassOfService;
    }

    public void setYieldDataGroupYieldClassOfService(String yieldDataGroupYieldClassOfService) {
        this.yieldDataGroupYieldClassOfService = yieldDataGroupYieldClassOfService;
    }

    public String getYieldDataGroupYieldDestination() {
        return yieldDataGroupYieldDestination;
    }

    public void setYieldDataGroupYieldDestination(String yieldDataGroupYieldDestination) {
        this.yieldDataGroupYieldDestination = yieldDataGroupYieldDestination;
    }

    public String getYieldDataGroupYieldOrigin() {
        return yieldDataGroupYieldOrigin;
    }

    public void setYieldDataGroupYieldOrigin(String yieldDataGroupYieldOrigin) {
        this.yieldDataGroupYieldOrigin = yieldDataGroupYieldOrigin;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public String getElemType() {
        return elemType;
    }

    public void setElemType(String elemType) {
        this.elemType = elemType;
    }

    public String getExtAirlineRecordLocator1() {
        return extAirlineRecordLocator1;
    }

    public void setExtAirlineRecordLocator1(String extAirlineRecordLocator1) {
        this.extAirlineRecordLocator1 = extAirlineRecordLocator1;
    }

    public String getFlightNum() {
        return flightNum;
    }

    public void setFlightNum(String flightNum) {
        this.flightNum = flightNum;
    }

    public String getBookingCreationDateTime() {
        return bookingCreationDateTime;
    }

    public void setBookingCreationDateTime(String bookingCreationDateTime) {
        this.bookingCreationDateTime = bookingCreationDateTime;
    }

    public Date getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(Date endDateTime) {
        this.endDateTime = endDateTime;
    }

    public Date getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(Date startDateTime) {
        this.startDateTime = startDateTime;
    }

    public String getItinPosDetailsOfficeID() {
        return itinPosDetailsOfficeID;
    }

    public void setItinPosDetailsOfficeID(String itinPosDetailsOfficeID) {
        this.itinPosDetailsOfficeID = itinPosDetailsOfficeID;
    }

    public String getItinPosDetailsIataCode() {
        return itinPosDetailsIataCode;
    }

    public void setItinPosDetailsIataCode(String itinPosDetailsIataCode) {
        this.itinPosDetailsIataCode = itinPosDetailsIataCode;
    }

    public int getPassengerElemRefTattooNum() {
        return passengerElemRefTattooNum;
    }

    public void setPassengerElemRefTattooNum(int passengerElemRefTattooNum) {
        this.passengerElemRefTattooNum = passengerElemRefTattooNum;
    }

    public String getPassengerElemRefTattooType() {
        return passengerElemRefTattooType;
    }

    public void setPassengerElemRefTattooType(String passengerElemRefTattooType) {
        this.passengerElemRefTattooType = passengerElemRefTattooType;
    }

    public String getPassengerElemType() {
        return passengerElemType;
    }

    public void setPassengerElemType(String passengerElemType) {
        this.passengerElemType = passengerElemType;
    }

    public int getPaxCount() {
        return paxCount;
    }

    public void setPaxCount(int paxCount) {
        this.paxCount = paxCount;
    }

    public String getPaxType() {
        return paxType;
    }

    public void setPaxType(String paxType) {
        this.paxType = paxType;
    }

    public String getInfantType() {
        return infantType;
    }

    public void setInfantType(String infantType) {
        this.infantType = infantType;
    }

    public String getIsTravellingWithInfant() {
        return isTravellingWithInfant;
    }

    public void setIsTravellingWithInfant(String isTravellingWithInfant) {
        this.isTravellingWithInfant = isTravellingWithInfant;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPaxTitle() {
        return paxTitle;
    }

    public void setPaxTitle(String paxTitle) {
        this.paxTitle = paxTitle;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstNameOriginal() {
        return firstNameOriginal;
    }

    public void setFirstNameOriginal(String firstNameOriginal) {
        this.firstNameOriginal = firstNameOriginal;
    }

    public String getInfantFirstName() {
        return infantFirstName;
    }

    public void setInfantFirstName(String infantFirstName) {
        this.infantFirstName = infantFirstName;
    }

    public String getInfantSurName() {
        return infantSurName;
    }

    public void setInfantSurName(String infantSurName) {
        this.infantSurName = infantSurName;
    }

    public String getPaxSurName() {
        return paxSurName;
    }

    public void setPaxSurName(String paxSurName) {
        this.paxSurName = paxSurName;
    }

    public int getCouponDetailsGroupBaggageExcessAmount() {
        return couponDetailsGroupBaggageExcessAmount;
    }

    public void setCouponDetailsGroupBaggageExcessAmount(int couponDetailsGroupBaggageExcessAmount) {
        this.couponDetailsGroupBaggageExcessAmount = couponDetailsGroupBaggageExcessAmount;
    }

    public String getCouponDetailsGroupBaggageExcessCurrency() {
        return couponDetailsGroupBaggageExcessCurrency;
    }

    public void setCouponDetailsGroupBaggageExcessCurrency(String couponDetailsGroupBaggageExcessCurrency) {
        this.couponDetailsGroupBaggageExcessCurrency = couponDetailsGroupBaggageExcessCurrency;
    }

    public String getCouponDetailsGroupFeeOwnerCode() {
        return couponDetailsGroupFeeOwnerCode;
    }

    public void setCouponDetailsGroupFeeOwnerCode(String couponDetailsGroupFeeOwnerCode) {
        this.couponDetailsGroupFeeOwnerCode = couponDetailsGroupFeeOwnerCode;
    }

    public String getDocumentDetailsIssueIdentifiers() {
        return documentDetailsIssueIdentifiers;
    }

    public void setDocumentDetailsIssueIdentifiers(String documentDetailsIssueIdentifiers) {
        this.documentDetailsIssueIdentifiers = documentDetailsIssueIdentifiers;
    }

    public String getDocumentDetailsIssueIndicators() {
        return documentDetailsIssueIndicators;
    }

    public void setDocumentDetailsIssueIndicators(String documentDetailsIssueIndicators) {
        this.documentDetailsIssueIndicators = documentDetailsIssueIndicators;
    }

    public double getDocumentDetailsTotalFareAmount() {
        return documentDetailsTotalFareAmount;
    }

    public void setDocumentDetailsTotalFareAmount(double documentDetailsTotalFareAmount) {
        this.documentDetailsTotalFareAmount = documentDetailsTotalFareAmount;
    }

    public String getDocumentDetailsTotalFareCurrency() {
        return documentDetailsTotalFareCurrency;
    }

    public void setDocumentDetailsTotalFareCurrency(String documentDetailsTotalFareCurrency) {
        this.documentDetailsTotalFareCurrency = documentDetailsTotalFareCurrency;
    }

    public String getManualIndicatorStatus() {
        return manualIndicatorStatus;
    }

    public void setManualIndicatorStatus(String manualIndicatorStatus) {
        this.manualIndicatorStatus = manualIndicatorStatus;
    }

    public String getOfficeAmId() {
        return officeAmId;
    }

    public void setOfficeAmId(String officeAmId) {
        this.officeAmId = officeAmId;
    }

    public String getPassengerTattoosType() {
        return passengerTattoosType;
    }

    public void setPassengerTattoosType(String passengerTattoosType) {
        this.passengerTattoosType = passengerTattoosType;
    }

    public String getPassengerTattoosValue() {
        return passengerTattoosValue;
    }

    public void setPassengerTattoosValue(String passengerTattoosValue) {
        this.passengerTattoosValue = passengerTattoosValue;
    }

    public String getPricingRecordReferenceType() {
        return pricingRecordReferenceType;
    }

    public void setPricingRecordReferenceType(String pricingRecordReferenceType) {
        this.pricingRecordReferenceType = pricingRecordReferenceType;
    }

    public String getPricingRecordUniqueReference() {
        return pricingRecordUniqueReference;
    }

    public void setPricingRecordUniqueReference(String pricingRecordUniqueReference) {
        this.pricingRecordUniqueReference = pricingRecordUniqueReference;
    }

    public String getCouponDetailsGroupBaggageQuantityCode() {
        return couponDetailsGroupBaggageQuantityCode;
    }

    public void setCouponDetailsGroupBaggageQuantityCode(String couponDetailsGroupBaggageQuantityCode) {
        this.couponDetailsGroupBaggageQuantityCode = couponDetailsGroupBaggageQuantityCode;
    }

    public String getCouponDetailsGroupBaggageUnitQualifier() {
        return couponDetailsGroupBaggageUnitQualifier;
    }

    public void setCouponDetailsGroupBaggageUnitQualifier(String couponDetailsGroupBaggageUnitQualifier) {
        this.couponDetailsGroupBaggageUnitQualifier = couponDetailsGroupBaggageUnitQualifier;
    }

    public Date getCreationDateTime() {
        return creationDateTime;
    }

    public void setCreationDateTime(Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    public String getOfficeName() {
        return officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    public List<Map<String, Object>> getActivityReports() {
        return activityReports;
    }

    public void setActivityReports(List<Map<String, Object>> activityReports) {
        this.activityReports = activityReports;
    }

    

}
