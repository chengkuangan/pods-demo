package blog.braindose.demo.processor;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import blog.braindose.demo.model.pnr.Booking;
import blog.braindose.demo.model.pnr.ItineraryInfo;
import blog.braindose.demo.model.pnr.PaxInfo;
import blog.braindose.demo.model.pnr.ProductPricingQuotationRecord;
import blog.braindose.demo.model.pnr.ReservationInfo;
import blog.braindose.demo.service.JsonMapper;

public class DataMappingProcessor implements Processor {

    JsonMapper mapper = new JsonMapper();

    public void process(Exchange exchange) throws Exception {
        Booking booking = (Booking) exchange.getIn().getBody();

        blog.braindose.demo.entity.Booking bookingEntity = new blog.braindose.demo.entity.Booking();
        
        bookingEntity.pnr = booking.getActivePNRimage().getAmadeusId().getReservation().getControlNumber();

        List<ReservationInfo> reservationInfo = booking.getActivePNRimage().getPnrHeader().getReservationInfo();
        
        reservationInfo.forEach(r -> {
            if (r.getAmadeusCompanyID() != null) {
                bookingEntity.reservationAmadeusCompanyID = r.getAmadeusCompanyID();
            }
            if (r.getAmadeusRecordLocator() != null) {
                bookingEntity.reservationAmadeusRecordLocator = r.getAmadeusRecordLocator();
            }
            if (r.getControlType() != null) {
                bookingEntity.reservationControlType = r.getControlType();
            }
            if (r.getLastEOTDateTime() != null) {
                bookingEntity.reservationLastEOTDateTime = r.getLastEOTDateTime();
            }
        });
        
        blog.braindose.demo.entity.Header headerEntity = new blog.braindose.demo.entity.Header();
        bookingEntity.pnrPurgeDate = booking.getActivePNRimage().getPnrHeader().getPnrPurgeDate();
        bookingEntity.queueingOfficeId = booking.getActivePNRimage().getPnrHeader().getSecurityInformation().get(0).getQueueingInformation().getQueueingOfficeId();
        headerEntity.pnr = bookingEntity.pnr;
        headerEntity.currentEnvelopeNum = booking.getActivePNRimage().getPnrHeader().getCurrentEnvelopeNum();
        headerEntity.numEnvelopesSent = booking.getActivePNRimage().getPnrHeader().getNumEnvelopesSent();
        headerEntity.numPaxInPNR = booking.getActivePNRimage().getPnrHeader().getNumPaxInPNR();
        headerEntity.bookingChannel = booking.getActivePNRimage().getPnrHeader().getBookingChannel();
        headerEntity.creationPosDetailsCityCode = booking.getActivePNRimage().getPnrHeader().getCreationPosDetails().getCityCode();
        headerEntity.creationPosDetailsCompanyId = booking.getActivePNRimage().getPnrHeader().getCreationPosDetails().getCompanyId();
        headerEntity.creationPosDetailsCountryCode = booking.getActivePNRimage().getPnrHeader().getCreationPosDetails().getCountryCode();
        headerEntity.creationPosDetailsIataCode = booking.getActivePNRimage().getPnrHeader().getCreationPosDetails().getIataCode();
        headerEntity.creationPosDetailsOfficeID1 = booking.getActivePNRimage().getPnrHeader().getCreationPosDetails().getOfficeID1();
        headerEntity.creationPosDetailsSourceOfBooking = booking.getActivePNRimage().getPnrHeader().getCreationPosDetails().getSourceOfBooking();
        headerEntity.lastUpdatorAgentSine1 = booking.getActivePNRimage().getPnrHeader().getLastUpdatorAgentSine1();
        headerEntity.lastUpdatorOfficeID1 = booking.getActivePNRimage().getPnrHeader().getLastUpdatorOfficeID1();
        headerEntity.lastUpdatorReceivedFromInfo = booking.getActivePNRimage().getPnrHeader().getLastUpdatorReceivedFromInfo();
        headerEntity.ownerPosDetailsCityCode = booking.getActivePNRimage().getPnrHeader().getOwnerPosDetails().getCityCode();
        headerEntity.ownerPosDetailsCompanyId = booking.getActivePNRimage().getPnrHeader().getOwnerPosDetails().getCompanyId();
        headerEntity.ownerPosDetailsCountryCode = booking.getActivePNRimage().getPnrHeader().getOwnerPosDetails().getCountryCode();
        headerEntity.ownerPosDetailsIataCode = booking.getActivePNRimage().getPnrHeader().getOwnerPosDetails().getIataCode();
        headerEntity.ownerPosDetailsOfficeID1 = booking.getActivePNRimage().getPnrHeader().getOwnerPosDetails().getOfficeID1();
        headerEntity.ownerPosDetailsSourceOfBooking = booking.getActivePNRimage().getPnrHeader().getOwnerPosDetails().getSourceOfBooking();
        if (booking.getActivePNRimage().getPnrHeader().getSecurityInformation() != null && booking.getActivePNRimage().getPnrHeader().getSecurityInformation().size() > 0){
            headerEntity.responsibleAgentId = booking.getActivePNRimage().getPnrHeader().getSecurityInformation().get(0).getResponsibilityInformation().getAgentId();
            headerEntity.responsibleOfficeID = booking.getActivePNRimage().getPnrHeader().getSecurityInformation().get(0).getResponsibilityInformation().getResponsibleOfficeID();
            headerEntity.responsibleTypeOfPnrElement = booking.getActivePNRimage().getPnrHeader().getSecurityInformation().get(0).getResponsibilityInformation().getTypeOfPnrElement();
        }
        headerEntity.secondRpAgentSignature = booking.getActivePNRimage().getPnrHeader().getSecurityInformation().get(0).getSecondRpInformation().getAgentSignature();
        headerEntity.secondRpCreationOfficeId = booking.getActivePNRimage().getPnrHeader().getSecurityInformation().get(0).getSecondRpInformation().getCreationOfficeId();
        headerEntity.secondRpCreatorIataCode = booking.getActivePNRimage().getPnrHeader().getSecurityInformation().get(0).getSecondRpInformation().getCreatorIataCode();
        headerEntity.secondRpPnrCreationDateTime = booking.getActivePNRimage().getPnrHeader().getSecurityInformation().get(0).getSecondRpInformation().getPnrCreationDateTime();
        headerEntity.updatorPosDetailsCityCode = booking.getActivePNRimage().getPnrHeader().getUpdatorPosDetails().getCityCode();
        headerEntity.updatorPosDetailsCompanyId = booking.getActivePNRimage().getPnrHeader().getUpdatorPosDetails().getCompanyId();
        headerEntity.updatorPosDetailsCountryCode = booking.getActivePNRimage().getPnrHeader().getUpdatorPosDetails().getCountryCode();
        headerEntity.updatorPosDetailsIataCode = booking.getActivePNRimage().getPnrHeader().getUpdatorPosDetails().getIataCode();
        headerEntity.updatorPosDetailsOfficeID1 = booking.getActivePNRimage().getPnrHeader().getUpdatorPosDetails().getOfficeID1();
        headerEntity.updatorPosDetailsSourceOfBooking = booking.getActivePNRimage().getPnrHeader().getUpdatorPosDetails().getSourceOfBooking();

        bookingEntity.header = headerEntity;

        blog.braindose.demo.entity.Itinerary itineraryEntity = new blog.braindose.demo.entity.Itinerary();

        List<ItineraryInfo> itineraryInfo = booking.getActivePNRimage().getOriginDestinationDetails().getItineraryInfo();
        if (itineraryInfo != null && itineraryInfo.size() > 0){
            itineraryEntity.pnr = bookingEntity.pnr;
            itineraryEntity.boardPoint = itineraryInfo.get(0).getBoardPoint();
            itineraryEntity.boardPointTerminal = itineraryInfo.get(0).getBoardPointTerminal();
            itineraryEntity.bookingClass = itineraryInfo.get(0).getBookingClass();
            itineraryEntity.companyCode = itineraryInfo.get(0).getCompanyCode();
            itineraryEntity.dayChangeIndicator = itineraryInfo.get(0).getDayChangeIndicator();
            itineraryEntity.daysOfOperation = itineraryInfo.get(0).getDaysOfOperation();
            itineraryEntity.elemRefTattooNum = itineraryInfo.get(0).getElemRef().getTattooNum();
            itineraryEntity.elemRefTattooType = itineraryInfo.get(0).getElemRef().getTattooType();
            itineraryEntity.etIndicator = itineraryInfo.get(0).getEtIndicator();
            itineraryEntity.extAirlineCode1 = itineraryInfo.get(0).getExtAirlineCode1();
            itineraryEntity.flightType = itineraryInfo.get(0).getFlightType();
            itineraryEntity.inventoryDataCabinCode = itineraryInfo.get(0).getInventoryData().getCabinCode();
            itineraryEntity.inventoryDataPosInvClassification = itineraryInfo.get(0).getInventoryData().getPosInvClassification();
            itineraryEntity.inventoryDataPosInvCompanyID = itineraryInfo.get(0).getInventoryData().getPosInvCompanyID();
            itineraryEntity.inventoryDataPosInvCountryCode = itineraryInfo.get(0).getInventoryData().getPosInvCountryCode();
            itineraryEntity.inventoryDataSubClassNum = itineraryInfo.get(0).getInventoryData().getSubClassNum();
            itineraryEntity.itinPosDetailsCityCode = itineraryInfo.get(0).getItinPosDetails().getCityCode();
            itineraryEntity.itinPosDetailsCompanyId = itineraryInfo.get(0).getItinPosDetails().getCompanyId();
            itineraryEntity.itinPosDetailsCountryCode = itineraryInfo.get(0).getItinPosDetails().getCountryCode();
            itineraryEntity.itinPosDetailsSourceofBooking = itineraryInfo.get(0).getItinPosDetails().getSourceofBooking();
            itineraryEntity.offPoint = itineraryInfo.get(0).getOffPoint();
            itineraryEntity.offPointTerminal = itineraryInfo.get(0).getOffPointTerminal();
            itineraryEntity.originalStatusCode1 = itineraryInfo.get(0).getOriginalStatusCode1();
            itineraryEntity.originalStatusCode2 = itineraryInfo.get(0).getOriginalStatusCode2();
            itineraryEntity.quantity = itineraryInfo.get(0).getQuantity();
            if (itineraryInfo.get(0).getSelectionDetails().getSelection() != null && itineraryInfo.get(0).getSelectionDetails().getSelection().size() > 0){
                itineraryEntity.selectionLevelOfAccessOption = itineraryInfo.get(0).getSelectionDetails().getSelection().get(0).getLevelOfAccessOption();
            }
            itineraryEntity.statusCode = itineraryInfo.get(0).getStatusCode();
            itineraryEntity.yieldDataGroupAdjustedYieldAmount = itineraryInfo.get(0).getYieldDataGroup().getAdjustedYieldAmount();
            itineraryEntity.yieldDataGroupBidPriceAmount = itineraryInfo.get(0).getYieldDataGroup().getBidPriceAmount();
            itineraryEntity.yieldDataGroupEffectiveYieldAmount = itineraryInfo.get(0).getYieldDataGroup().getEffectiveYieldAmount();
            itineraryEntity.yieldDataGroupTripDestination = itineraryInfo.get(0).getYieldDataGroup().getTripDestination();
            itineraryEntity.yieldDataGroupTripOrigin = itineraryInfo.get(0).getYieldDataGroup().getTripOrigin();
            itineraryEntity.yieldDataGroupYieldAmount = itineraryInfo.get(0).getYieldDataGroup().getYieldAmount();
            itineraryEntity.yieldDataGroupYieldClassOfService = itineraryInfo.get(0).getYieldDataGroup().getYieldClassOfService();
            itineraryEntity.yieldDataGroupYieldDestination = itineraryInfo.get(0).getYieldDataGroup().getYieldDestination();
            itineraryEntity.yieldDataGroupYieldOrigin = itineraryInfo.get(0).getYieldDataGroup().getYieldOrigin();
            itineraryEntity.aircraftType = itineraryInfo.get(0).getAircraftType();
            itineraryEntity.elemType = itineraryInfo.get(0).getElemType();
            itineraryEntity.extAirlineRecordLocator1 = itineraryInfo.get(0).getExtAirlineRecordLocator1();
            itineraryEntity.flightNum = itineraryInfo.get(0).getFlightNum();
            itineraryEntity.bookingCreationDateTime = itineraryInfo.get(0).getBookingCreationDateTime();
            itineraryEntity.endDateTime = itineraryInfo.get(0).getEndDateTime();
            itineraryEntity.startDateTime = itineraryInfo.get(0).getStartDateTime();
            itineraryEntity.itinPosDetailsOfficeID = itineraryInfo.get(0).getItinPosDetails().getOfficeID();
            itineraryEntity.itinPosDetailsIataCode = itineraryInfo.get(0).getItinPosDetails().getIataCode();
            
        }

        bookingEntity.itinerary = itineraryEntity;

        blog.braindose.demo.entity.Passenger passengerEntity = new blog.braindose.demo.entity.Passenger();
        List<PaxInfo> paxInfo = booking.getActivePNRimage().getPaxInfo();
        if (paxInfo != null && paxInfo.size() > 0) {
            passengerEntity.pnr = bookingEntity.pnr;
            passengerEntity.passengerElemRefTattooNum = paxInfo.get(0).getElemRef().getTattooNum();
            passengerEntity.passengerElemRefTattooType = paxInfo.get(0).getElemRef().getTattooType();
            passengerEntity.passengerElemType = paxInfo.get(0).getElemType();
            passengerEntity.paxCount = paxInfo.get(0).getPaxCount();
            passengerEntity.paxType = paxInfo.get(0).getPaxType();
            passengerEntity.infantType = paxInfo.get(0).getInfantType();
            passengerEntity.isTravellingWithInfant = paxInfo.get(0).getIsTravellingWithInfant();
            passengerEntity.dateOfBirth = paxInfo.get(0).getDateOfBirth();
            passengerEntity.paxTitle = paxInfo.get(0).getPaxTitle();
            passengerEntity.firstName = paxInfo.get(0).getFirstName();
            passengerEntity.firstNameOriginal = paxInfo.get(0).getFirstNameOriginal();
            passengerEntity.infantFirstName = paxInfo.get(0).getInfantFirstName();
            passengerEntity.infantSurName = paxInfo.get(0).getInfantSurName();
            passengerEntity.paxSurName = paxInfo.get(0).getPaxSurName();
        }

        bookingEntity.passenger = passengerEntity;

        blog.braindose.demo.entity.Pricing pricingEntity = new blog.braindose.demo.entity.Pricing();
        List<ProductPricingQuotationRecord> productPricingQuotationRecords = booking.getActivePNRimage().getPricingRecordGroup().getProductPricingQuotationRecord();
        
        if (productPricingQuotationRecords != null && productPricingQuotationRecords.size() > 0){
            pricingEntity.pnr = bookingEntity.pnr;
            pricingEntity.couponDetailsGroupBaggageExcessAmount = productPricingQuotationRecords.get(0).getDocumentDetailsGroup().getCouponDetailsGroup().get(0).getBaggageInformation().getExcessBaggageDetails().getAmount();
            pricingEntity.couponDetailsGroupBaggageExcessCurrency = productPricingQuotationRecords.get(0).getDocumentDetailsGroup().getCouponDetailsGroup().get(0).getBaggageInformation().getExcessBaggageDetails().getCurrency();
            pricingEntity.couponDetailsGroupFeeOwnerCode = productPricingQuotationRecords.get(0).getDocumentDetailsGroup().getCouponDetailsGroup().get(0).getFeeOwnerCode();
            pricingEntity.documentDetailsIssueIdentifiers = productPricingQuotationRecords.get(0).getDocumentDetailsGroup().getIssueIdentifiers();
            pricingEntity.documentDetailsIssueIndicators = productPricingQuotationRecords.get(0).getDocumentDetailsGroup().getIssueIndicators();
            pricingEntity.documentDetailsTotalFareAmount = productPricingQuotationRecords.get(0).getDocumentDetailsGroup().getTotalFareAmount();
            pricingEntity.documentDetailsTotalFareCurrency = productPricingQuotationRecords.get(0).getDocumentDetailsGroup().getTotalFareCurrency();
            pricingEntity.manualIndicatorStatus = productPricingQuotationRecords.get(0).getDocumentDetailsGroup().getManualIndicatorStatus();
            pricingEntity.officeAmId = productPricingQuotationRecords.get(0).getDocumentDetailsGroup().getOfficeAmId();
            pricingEntity.passengerTattoosType = productPricingQuotationRecords.get(0).getPassengerTattoos().get(0).getPassengerReference().get(0).getType();
            pricingEntity.passengerTattoosValue = productPricingQuotationRecords.get(0).getPassengerTattoos().get(0).getPassengerReference().get(0).getValue();
            pricingEntity.pricingRecordReferenceType = productPricingQuotationRecords.get(0).getPricingRecordId().getReferenceType();
            pricingEntity.pricingRecordUniqueReference = productPricingQuotationRecords.get(0).getPricingRecordId().getUniqueReference();
            pricingEntity.couponDetailsGroupBaggageQuantityCode = productPricingQuotationRecords.get(0).getDocumentDetailsGroup().getCouponDetailsGroup().get(0).getBaggageInformation().getBaggageDetails().getQuantityCode();
            pricingEntity.couponDetailsGroupBaggageUnitQualifier = productPricingQuotationRecords.get(0).getDocumentDetailsGroup().getCouponDetailsGroup().get(0).getBaggageInformation().getBaggageDetails().getUnitQualifier();
            pricingEntity.creationDateTime = productPricingQuotationRecords.get(0).getDocumentDetailsGroup().getCreationDateTime();
            pricingEntity.officeName = productPricingQuotationRecords.get(0).getDocumentDetailsGroup().getOfficeName();
        }

        bookingEntity.pricing = pricingEntity;

        List<blog.braindose.demo.entity.ActivityReport> activityReports = new ArrayList<>();
            
        booking.getActivityReport().forEach(r -> {
            blog.braindose.demo.entity.ActivityReport activityReport = new blog.braindose.demo.entity.ActivityReport();
            activityReport.pnr = bookingEntity.pnr;
            activityReport.activityType = r.getActivityType();
            activityReport.actionCode = r.getActionCode();
            activityReport.elemType = r.getElemType();
            activityReport.elemRefTattooType = r.getElemRef().getTattooType();
            activityReport.elemRefTattooNum = r.getElemRef().getTattooNum();
            activityReports.add(activityReport);
        });
        bookingEntity.activityReports = activityReports;

        exchange.getMessage().setBody(bookingEntity);
}}
