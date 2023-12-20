package blog.braindose.demo.service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import blog.braindose.demo.model.SimpleBooking;
import blog.braindose.demo.model.pnr.Booking;
import blog.braindose.demo.model.pnr.ItineraryInfo;
import blog.braindose.demo.model.pnr.PaxInfo;
import blog.braindose.demo.model.pnr.ProductPricingQuotationRecord;
import blog.braindose.demo.model.pnr.ReservationInfo;
import blog.braindose.demo.model.pnr.SecurityInformation;

public class DataMappingProcessor implements Processor {

    String amadeusCompanyID = null, amadeusRecordLocator = null, controlType = null;
    Date lastEOTDateTime = null;
    String queueingOfficeId = null, responsibleAgentId = null, responsibleOfficeId = null, typeOfPnrElement = null,
            agentSignature = null;

    String creationOfficeId = null, creatorIataCode = null;
    Date pnrCreationDateTime = null;
    String boardPoint = null, boardPointTerminal = null, bookingClass = null, companyCode = null,
            dayChangeIndicator = null;
    String daysOfOperation = null, elemRefTattooType = null, etIndicator = null, extAirlineCode1 = null;
    String flightType = null, cabinCode = null, inventoryDataPosInvClassification = null,
            inventoryDataPosInvCompanyID = null;
    String inventoryDataPosInvCountryCode = null, inventoryDataSubClassNum = null;
    String itinPosDetailsCityCode = null, itinPosDetailsCompanyId = null, itinPosDetailsCountryCode = null,
            itinPosDetailsSourceofBooking = null;
    String offPoint = null, offPointTerminal = null, originalStatusCode1 = null, originalStatusCode2 = null;
    String selectionLevelOfAccessOption = null, statusCode = null;
    int tattooNum, quantity, yieldDataGroupAdjustedYieldAmount, yieldDataGroupBidPriceAmount,
            yieldDataGroupEffectiveYieldAmount, yieldDataGroupYieldAmount;
    String yieldDataGroupTripDestination = null, yieldDataGroupTripOrigin = null,
            yieldDataGroupYieldClassOfService = null, yieldDataGroupYieldDestination = null,
            yieldDataGroupYieldOrigin = null;
    String bookingCreationDateTime, aircraftType = null, elemType = null, extAirlineRecordLocator1 = null,
            flightNum = null, itinPosDetailsOfficeID = null, itinPosDetailsIataCode = null;
    Date endDateTime = null, startDateTime = null;
    int passengerElemRefTattooNum;
    String passengerElemRefTattooType = null;
    String passengerElemType = null;
    int paxCount;
    String paxType = null;
    String infantType = null;
    String isTravellingWithInfant = null;
    String pnr = null;
    String dateOfBirth = null;
    String paxTitle = null;
    String firstName = null;
    String firstNameOriginal = null;
    String infantFirstName = null;
    String infantSurName = null;
    String paxSurName = null;

    int couponDetailsGroupBaggageExcessAmount;
    String couponDetailsGroupBaggageExcessCurrency = null;
    String couponDetailsGroupFeeOwnerCode = null;
    String documentDetailsIssueIdentifiers = null;
    String documentDetailsIssueIndicators = null;
    double documentDetailsTotalFareAmount;
    String documentDetailsTotalFareCurrency = null;
    String manualIndicatorStatus = null;
    String officeAmId = null;
    String passengerTattoosType = null;
    String passengerTattoosValue = null;
    String pricingRecordReferenceType = null;
    String pricingRecordUniqueReference = null;
    String couponDetailsGroupBaggageQuantityCode = null;
    String couponDetailsGroupBaggageUnitQualifier = null;
    Date creationDateTime = null;
    String officeName = null;

    public void process(Exchange exchange) throws Exception {
        Booking booking = (Booking) exchange.getIn().getBody();

        List<PaxInfo> paxInfo = booking.getActivePNRimage().getPaxInfo();

        if (paxInfo != null) {
            paxInfo.forEach(p -> {
                passengerElemRefTattooNum = p.getElemRef().getTattooNum();
                passengerElemRefTattooType = p.getElemRef().getTattooType();
                passengerElemType = p.getElemType();
                paxCount = p.getPaxCount();
                paxType = p.getPaxType();
                infantType = p.getInfantType();
                isTravellingWithInfant = p.getIsTravellingWithInfant();
                dateOfBirth = p.getDateOfBirth();
                paxTitle = p.getPaxTitle();
                firstName = p.getFirstName();
                firstNameOriginal = p.getFirstNameOriginal();
                infantFirstName = p.getInfantFirstName();
                infantSurName = p.getInfantSurName();
                paxSurName = p.getPaxSurName();
            });
        }

        List<ReservationInfo> reservationInfo = booking.getActivePNRimage().getPnrHeader().getReservationInfo();

        reservationInfo.forEach(r -> {
            if (r.getAmadeusCompanyID() != null) {
                amadeusCompanyID = r.getAmadeusCompanyID();
            }
            if (r.getAmadeusRecordLocator() != null) {
                amadeusRecordLocator = r.getAmadeusRecordLocator();
            }
            if (r.getControlType() != null) {
                controlType = r.getControlType();
            }
            if (r.getLastEOTDateTime() != null) {
                lastEOTDateTime = r.getLastEOTDateTime();
            }
        });

        List<SecurityInformation> securityInformation = booking.getActivePNRimage().getPnrHeader()
                .getSecurityInformation();

        securityInformation.forEach(s -> {
            if (s.getQueueingInformation() != null && s.getQueueingInformation().getQueueingOfficeId() != null) {
                queueingOfficeId = s.getQueueingInformation().getQueueingOfficeId();
            }
            if (s.getResponsibilityInformation() != null && s.getResponsibilityInformation().getAgentId() != null) {
                responsibleAgentId = s.getResponsibilityInformation().getAgentId();
            }
            if (s.getResponsibilityInformation() != null
                    && s.getResponsibilityInformation().getResponsibleOfficeID() != null) {
                responsibleOfficeId = s.getResponsibilityInformation().getResponsibleOfficeID();
            }
            if (s.getResponsibilityInformation() != null
                    && s.getResponsibilityInformation().getTypeOfPnrElement() != null) {
                typeOfPnrElement = s.getResponsibilityInformation().getTypeOfPnrElement();
            }
            if (s.getSecondRpInformation() != null && s.getSecondRpInformation().getAgentSignature() != null) {
                agentSignature = s.getSecondRpInformation().getAgentSignature();
            }
            if (s.getSecondRpInformation() != null && s.getSecondRpInformation().getAgentSignature() != null) {
                creationOfficeId = s.getSecondRpInformation().getCreationOfficeId();
            }
            if (s.getSecondRpInformation() != null && s.getSecondRpInformation().getCreatorIataCode() != null) {
                creatorIataCode = s.getSecondRpInformation().getCreatorIataCode();
            }
            if (s.getSecondRpInformation() != null && s.getSecondRpInformation().getPnrCreationDateTime() != null) {
                pnrCreationDateTime = s.getSecondRpInformation().getPnrCreationDateTime();
            }
        });

        List<ItineraryInfo> itineraryInfo = booking.getActivePNRimage().getOriginDestinationDetails()
                .getItineraryInfo();

        if (itineraryInfo != null) {
            itineraryInfo.forEach(i -> {
                if (i.getBoardPoint() != null) {
                    boardPoint = i.getBoardPoint();
                }
                if (i.getBoardPointTerminal() != null) {
                    boardPointTerminal = i.getBoardPointTerminal();
                }
                if (i.getBookingClass() != null) {
                    bookingClass = i.getBookingClass();
                }
                if (i.getCompanyCode() != null) {
                    companyCode = i.getCompanyCode();
                }
                if (i.getDayChangeIndicator() != null) {
                    dayChangeIndicator = i.getDayChangeIndicator();
                }
                if (i.getDaysOfOperation() != null) {
                    daysOfOperation = i.getDaysOfOperation();
                }
                tattooNum = i.getElemRef().getTattooNum();
                if (i.getElemRef().getTattooType() != null) {
                    elemRefTattooType = i.getElemRef().getTattooType();
                }
                if (i.getEtIndicator() != null) {
                    etIndicator = i.getEtIndicator();
                }
                if (i.getExtAirlineCode1() != null) {
                    extAirlineCode1 = i.getExtAirlineCode1();
                }
                if (i.getFlightType() != null) {
                    flightType = i.getFlightType();
                }

                if (i.getInventoryData() != null) {
                    cabinCode = i.getInventoryData().getCabinCode();
                    inventoryDataPosInvClassification = i.getInventoryData().getPosInvClassification();
                    inventoryDataPosInvCompanyID = i.getInventoryData().getPosInvCompanyID();
                    inventoryDataPosInvCountryCode = i.getInventoryData().getPosInvCountryCode();
                    inventoryDataSubClassNum = i.getInventoryData().getSubClassNum();
                }

                if (i.getItinPosDetails() != null) {
                    itinPosDetailsCityCode = i.getItinPosDetails().getCityCode();
                    itinPosDetailsCompanyId = i.getItinPosDetails().getCompanyId();
                    itinPosDetailsCountryCode = i.getItinPosDetails().getCountryCode();
                    itinPosDetailsSourceofBooking = i.getItinPosDetails().getSourceofBooking();

                }

                if (i.getOffPoint() != null) {
                    offPoint = i.getOffPoint();
                }
                if (i.getOffPoint() != null) {
                    offPointTerminal = i.getOffPointTerminal();
                }

                if (i.getOriginalStatusCode1() != null) {
                    originalStatusCode1 = i.getOriginalStatusCode1();
                }
                if (i.getOriginalStatusCode1() != null) {
                    originalStatusCode2 = i.getOriginalStatusCode2();
                }

                quantity = Integer.parseInt(i.getQuantity());

                if (i.getSelectionDetails().getSelection().size() > 0) {
                    selectionLevelOfAccessOption = i.getSelectionDetails().getSelection().get(0)
                            .getLevelOfAccessOption();
                }

                statusCode = i.getStatusCode();

                if (i.getYieldDataGroup() != null) {
                    yieldDataGroupAdjustedYieldAmount = i.getYieldDataGroup().getAdjustedYieldAmount();
                    yieldDataGroupBidPriceAmount = i.getYieldDataGroup().getAdjustedYieldAmount();
                    yieldDataGroupEffectiveYieldAmount = i.getYieldDataGroup().getEffectiveYieldAmount();
                    yieldDataGroupTripDestination = i.getYieldDataGroup().getTripDestination();
                    yieldDataGroupTripOrigin = i.getYieldDataGroup().getTripOrigin();
                    yieldDataGroupYieldAmount = i.getYieldDataGroup().getYieldAmount();
                    yieldDataGroupYieldClassOfService = i.getYieldDataGroup().getYieldClassOfService();
                    yieldDataGroupYieldDestination = i.getYieldDataGroup().getYieldDestination();
                    yieldDataGroupYieldOrigin = i.getYieldDataGroup().getYieldOrigin();
                }

                aircraftType = i.getAircraftType();
                elemType = i.getElemType();
                extAirlineRecordLocator1 = i.getExtAirlineRecordLocator1();
                flightNum = i.getFlightNum();
                bookingCreationDateTime = i.getBookingCreationDateTime();
                endDateTime = i.getEndDateTime();
                startDateTime = i.getStartDateTime();
                itinPosDetailsOfficeID = i.getItinPosDetails().getOfficeID();
                itinPosDetailsIataCode = i.getItinPosDetails().getIataCode();

            });

            List<ProductPricingQuotationRecord> productPricingQuotationRecords = booking.getActivePNRimage().getPricingRecordGroup().getProductPricingQuotationRecord();

            if (productPricingQuotationRecords != null && productPricingQuotationRecords.size() > 0){
                ProductPricingQuotationRecord productPricingQuotationRecord = productPricingQuotationRecords.get(0);
                couponDetailsGroupBaggageExcessAmount = productPricingQuotationRecord.getDocumentDetailsGroup().getCouponDetailsGroup().get(0).getBaggageInformation().getExcessBaggageDetails().getAmount();
                couponDetailsGroupBaggageExcessCurrency = productPricingQuotationRecord.getDocumentDetailsGroup().getCouponDetailsGroup().get(0).getBaggageInformation().getExcessBaggageDetails().getCurrency();
                couponDetailsGroupFeeOwnerCode = productPricingQuotationRecord.getDocumentDetailsGroup().getCouponDetailsGroup().get(0).getFeeOwnerCode();
                documentDetailsIssueIdentifiers = productPricingQuotationRecord.getDocumentDetailsGroup().getIssueIdentifiers();
                documentDetailsIssueIndicators = productPricingQuotationRecord.getDocumentDetailsGroup().getIssueIndicators();
                documentDetailsTotalFareAmount = productPricingQuotationRecord.getDocumentDetailsGroup().getTotalFareAmount();
                documentDetailsTotalFareCurrency = productPricingQuotationRecord.getDocumentDetailsGroup().getTotalFareCurrency();
                manualIndicatorStatus = productPricingQuotationRecord.getDocumentDetailsGroup().getManualIndicatorStatus();
                officeAmId = productPricingQuotationRecord.getDocumentDetailsGroup().getOfficeAmId();
                passengerTattoosType = productPricingQuotationRecord.getPassengerTattoos().get(0).getPassengerReference().get(0).getType();
                passengerTattoosValue = productPricingQuotationRecord.getPassengerTattoos().get(0).getPassengerReference().get(0).getValue();
                pricingRecordReferenceType = productPricingQuotationRecord.getPricingRecordId().getReferenceType();
                pricingRecordUniqueReference = productPricingQuotationRecord.getPricingRecordId().getUniqueReference();
                couponDetailsGroupBaggageQuantityCode = productPricingQuotationRecord.getDocumentDetailsGroup().getCouponDetailsGroup().get(0).getBaggageInformation().getBaggageDetails().getQuantityCode();
                couponDetailsGroupBaggageUnitQualifier = productPricingQuotationRecord.getDocumentDetailsGroup().getCouponDetailsGroup().get(0).getBaggageInformation().getBaggageDetails().getUnitQualifier();
                creationDateTime = productPricingQuotationRecord.getDocumentDetailsGroup().getCreationDateTime();
                officeName = productPricingQuotationRecord.getDocumentDetailsGroup().getOfficeName();
                /*
                productPricingQuotationRecords.forEach(p -> {
                    couponDetailsGroupBaggageExcessAmount = p.getDocumentDetailsGroup().getCouponDetailsGroup().get(0).getBaggageInformation().getExcessBaggageDetails().getAmount();
                    couponDetailsGroupBaggageExcessCurrency = p.getDocumentDetailsGroup().getCouponDetailsGroup().get(0).getBaggageInformation().getExcessBaggageDetails().getCurrency();
                    couponDetailsGroupFeeOwnerCode = p.getDocumentDetailsGroup().getCouponDetailsGroup().get(0).getFeeOwnerCode();
                    documentDetailsIssueIdentifiers = p.getDocumentDetailsGroup().getIssueIdentifiers();
                    documentDetailsIssueIndicators = p.getDocumentDetailsGroup().getIssueIndicators();
                    documentDetailsTotalFareAmount = p.getDocumentDetailsGroup().getTotalFareAmount();
                    documentDetailsTotalFareCurrency = p.getDocumentDetailsGroup().getTotalFareCurrency();
                    manualIndicatorStatus = p.getDocumentDetailsGroup().getManualIndicatorStatus();
                    officeAmId = p.getDocumentDetailsGroup().getOfficeAmId();
                    passengerTattoosType = p.getPassengerTattoos().get(0).getPassengerReference().get(0).getType();
                    passengerTattoosValue = p.getPassengerTattoos().get(0).getPassengerReference().get(0).getValue();
                    pricingRecordReferenceType = p.getPricingRecordId().getReferenceType();
                    pricingRecordUniqueReference = p.getPricingRecordId().getUniqueReference();
                    couponDetailsGroupBaggageQuantityCode = p.getDocumentDetailsGroup().getCouponDetailsGroup().get(0).getBaggageInformation().getBaggageDetails().getQuantityCode();
                    couponDetailsGroupBaggageUnitQualifier = p.getDocumentDetailsGroup().getCouponDetailsGroup().get(0).getBaggageInformation().getBaggageDetails().getUnitQualifier();
                    creationDateTime = p.getDocumentDetailsGroup().getCreationDateTime();
                    officeName = p.getDocumentDetailsGroup().getOfficeName();
                 
                });
                */
            }
        }

    SimpleBooking simpleBooking = new SimpleBooking(
            booking.getActivePNRimage().getAmadeusId().getReservation().getControlNumber(),
            booking.getActivePNRimage().getPnrHeader().getCurrentEnvelopeNum(),
            booking.getActivePNRimage().getPnrHeader().getNumEnvelopesSent(),
            booking.getActivePNRimage().getPnrHeader().getNumPaxInPNR(),
            booking.getActivePNRimage().getPnrHeader().getBookingChannel(),
            booking.getActivePNRimage().getPnrHeader().getCreationPosDetails().getCityCode(),
            booking.getActivePNRimage().getPnrHeader().getCreationPosDetails().getCompanyId(),
            booking.getActivePNRimage().getPnrHeader().getCreationPosDetails().getCountryCode(),
            booking.getActivePNRimage().getPnrHeader().getCreationPosDetails().getIataCode(),
            booking.getActivePNRimage().getPnrHeader().getCreationPosDetails().getOfficeID1(),
            booking.getActivePNRimage().getPnrHeader().getCreationPosDetails().getSourceOfBooking(),
            booking.getActivePNRimage().getPnrHeader().getLastUpdatorAgentSine1(),
            booking.getActivePNRimage().getPnrHeader().getLastUpdatorOfficeID1(),
            booking.getActivePNRimage().getPnrHeader().getLastUpdatorReceivedFromInfo(),
            booking.getActivePNRimage().getPnrHeader().getOwnerPosDetails().getCityCode(),
            booking.getActivePNRimage().getPnrHeader().getOwnerPosDetails().getCompanyId(),
            booking.getActivePNRimage().getPnrHeader().getOwnerPosDetails().getCountryCode(),
            booking.getActivePNRimage().getPnrHeader().getOwnerPosDetails().getIataCode(),
            booking.getActivePNRimage().getPnrHeader().getOwnerPosDetails().getOfficeID1(),
            booking.getActivePNRimage().getPnrHeader().getOwnerPosDetails().getSourceOfBooking(),
            booking.getActivePNRimage().getPnrHeader().getPnrPurgeDate(),
            queueingOfficeId,
            amadeusCompanyID,
            amadeusRecordLocator,
            controlType,
            lastEOTDateTime,
            responsibleAgentId,
            responsibleOfficeId,
            typeOfPnrElement,
            agentSignature,
            creationOfficeId,
            creatorIataCode,
            pnrCreationDateTime,
            booking.getActivePNRimage().getPnrHeader().getUpdatorPosDetails().getCityCode(),
            booking.getActivePNRimage().getPnrHeader().getUpdatorPosDetails().getCompanyId(),
            booking.getActivePNRimage().getPnrHeader().getUpdatorPosDetails().getCountryCode(),
            booking.getActivePNRimage().getPnrHeader().getUpdatorPosDetails().getIataCode(),
            booking.getActivePNRimage().getPnrHeader().getUpdatorPosDetails().getOfficeID1(),
            booking.getActivePNRimage().getPnrHeader().getUpdatorPosDetails().getSourceOfBooking(),
            boardPoint,
            boardPointTerminal,
            bookingClass,
            companyCode,
            dayChangeIndicator,
            daysOfOperation,
            tattooNum,
            elemRefTattooType,
            etIndicator,
            extAirlineCode1,
            flightType,
            cabinCode,
            inventoryDataPosInvClassification,
            inventoryDataPosInvCompanyID,
            inventoryDataPosInvCountryCode,
            inventoryDataSubClassNum,
            itinPosDetailsCityCode,
            itinPosDetailsCompanyId,
            itinPosDetailsCountryCode,
            itinPosDetailsSourceofBooking,
            offPoint,
            offPointTerminal,
            originalStatusCode1,
            originalStatusCode2,
            quantity,
            selectionLevelOfAccessOption,
            statusCode,
            yieldDataGroupAdjustedYieldAmount,
            yieldDataGroupBidPriceAmount,
            yieldDataGroupEffectiveYieldAmount,
            yieldDataGroupTripDestination,
            yieldDataGroupTripOrigin,
            yieldDataGroupYieldAmount,
            yieldDataGroupYieldClassOfService,
            yieldDataGroupYieldDestination,
            yieldDataGroupYieldOrigin,
            aircraftType,
            elemType,
            extAirlineRecordLocator1,
            flightNum,
            bookingCreationDateTime,
            endDateTime,
            startDateTime,
            itinPosDetailsOfficeID,
            itinPosDetailsIataCode,
            passengerElemRefTattooNum,
            passengerElemRefTattooType,
            passengerElemType,
            paxCount,
            paxType,
            infantType,
            isTravellingWithInfant,
            dateOfBirth,
            paxTitle,
            firstName,
            firstNameOriginal,
            infantFirstName,
            infantSurName,
            paxSurName,
            couponDetailsGroupBaggageExcessAmount,
            couponDetailsGroupBaggageExcessCurrency,
            couponDetailsGroupFeeOwnerCode,
            documentDetailsIssueIdentifiers,
            documentDetailsIssueIndicators,
            documentDetailsTotalFareAmount,
            documentDetailsTotalFareCurrency,
            manualIndicatorStatus,
            officeAmId,
            passengerTattoosType,
            passengerTattoosValue,
            pricingRecordReferenceType,
            pricingRecordUniqueReference,
            couponDetailsGroupBaggageQuantityCode,
            couponDetailsGroupBaggageUnitQualifier,
            creationDateTime,
            officeName);
            
            booking.getActivityReport().forEach(r -> {
                Map<String, Object> m = new HashMap<>();
                m.put("actionCode", r.getActionCode());
                m.put("activityType", r.getActivityType());
                m.put("elemType", r.getElemType());
                m.put("elemRefTattooType", r.getElemRef().getTattooType());
                m.put("elemRefTattooNum", r.getElemRef().getTattooNum());
                simpleBooking.getActivityReports().add(m);

            });

            exchange.getMessage().setBody(simpleBooking);
}}
