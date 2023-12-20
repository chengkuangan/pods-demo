#!/bin/bash

psql -v ON_ERROR_STOP=1 --username "$POSTGRES_USER" -d "$POSTGRES_DB"  <<-EOSQL
    
    create schema if not exists $POSTGRES_SCHEMA;

    create table $POSTGRES_SCHEMA.booking (
        pnr varchar(6) not null,
        pnrPurgeDate varchar(255),
        queueingOfficeId varchar(255),
        reservationAmadeusCompanyID varchar(255),
        reservationAmadeusRecordLocator varchar(255),
        reservationControlType varchar(255),
        reservationLastEOTDateTime varchar(255),
        primary key (pnr)
    );

    create table $POSTGRES_SCHEMA.header (
        pnr varchar(6) not null,
        currentEnvelopeNum integer not null,
        numEnvelopesSent integer not null,
        numPaxInPNR integer not null,
        id bigserial not null,
        bookingChannel varchar(255),
        creationPosDetailsCityCode varchar(255),
        creationPosDetailsCompanyId varchar(255),
        creationPosDetailsCountryCode varchar(255),
        creationPosDetailsIataCode varchar(255),
        creationPosDetailsOfficeID1 varchar(255),
        creationPosDetailsSourceOfBooking varchar(255),
        lastUpdatorAgentSine1 varchar(255),
        lastUpdatorOfficeID1 varchar(255),
        lastUpdatorReceivedFromInfo varchar(255),
        ownerPosDetailsCityCode varchar(255),
        ownerPosDetailsCompanyId varchar(255),
        ownerPosDetailsCountryCode varchar(255),
        ownerPosDetailsIataCode varchar(255),
        ownerPosDetailsOfficeID1 varchar(255),
        ownerPosDetailsSourceOfBooking varchar(255),
        responsibleAgentId varchar(255),
        responsibleOfficeID varchar(255),
        responsibleTypeOfPnrElement varchar(255),
        secondRpAgentSignature varchar(255),
        secondRpCreationOfficeId varchar(255),
        secondRpCreatorIataCode varchar(255),
        secondRpPnrCreationDateTime varchar(255),
        updatorPosDetailsCityCode varchar(255),
        updatorPosDetailsCompanyId varchar(255),
        updatorPosDetailsCountryCode varchar(255),
        updatorPosDetailsIataCode varchar(255),
        updatorPosDetailsOfficeID1 varchar(255),
        updatorPosDetailsSourceOfBooking varchar(255),
        primary key (id)
    );

    create table $POSTGRES_SCHEMA.itinerary (
        boardPoint varchar(3) not null,
        boardPointTerminal varchar(2) not null,
        bookingClass varchar(1) not null,
        companyCode varchar(2) not null,
        dayChangeIndicator varchar(1) not null,
        daysOfOperation varchar(5) not null,
        elemRefTattooNum integer not null,
        elemRefTattooType varchar(2) not null,
        etIndicator varchar(2) not null,
        extAirlineCode1 varchar(2) not null,
        flightType varchar(1) not null,
        inventoryDataCabinCode varchar(1) not null,
        inventoryDataPosInvClassification varchar(1) not null,
        inventoryDataPosInvCompanyID varchar(2) not null,
        inventoryDataPosInvCountryCode varchar(2) not null,
        inventoryDataSubClassNum varchar(1) not null,
        itinPosDetailsCityCode varchar(3) not null,
        itinPosDetailsCompanyId varchar(2) not null,
        itinPosDetailsCountryCode varchar(2) not null,
        itinPosDetailsSourceofBooking varchar(1) not null,
        offPoint varchar(3) not null,
        offPointTerminal varchar(2) not null,
        originalStatusCode1 varchar(2) not null,
        originalStatusCode2 varchar(2) not null,
        quantity integer not null,
        selectionLevelOfAccessOption varchar(2) not null,
        statusCode varchar(2) not null,
        yieldDataGroupAdjustedYieldAmount integer not null,
        yieldDataGroupBidPriceAmount integer not null,
        yieldDataGroupEffectiveYieldAmount integer not null,
        yieldDataGroupTripDestination varchar(3) not null,
        yieldDataGroupTripOrigin varchar(3) not null,
        yieldDataGroupYieldAmount integer not null,
        yieldDataGroupYieldClassOfService varchar(1) not null,
        yieldDataGroupYieldDestination varchar(3) not null,
        yieldDataGroupYieldOrigin varchar(3) not null,
        aircraftType varchar(5) not null,
        elemType varchar(5) not null,
        extAirlineRecordLocator1 varchar(6) not null,
        flightNum varchar(6) not null,
        pnr varchar(6) not null,
        bookingCreationDateTime varchar(20) not null,
        endDateTime timestamp(6) not null,
        id bigserial not null,
        startDateTime timestamp(6) not null,
        itinPosDetailsOfficeID varchar(12) not null,
        itinPosDetailsIataCode varchar(12) not null,
        primary key (id)
    );

    create table $POSTGRES_SCHEMA.passenger (
        elemRefTattooNum integer not null,
        elemRefTattooType varchar(2) not null,
        elemType varchar(2) not null,
        paxCount integer not null,
        paxType varchar(3) not null,
        infantType varchar(5),
        isTravellingWithInfant varchar(5),
        pnr varchar(6) not null,
        dateOfBirth varchar(20) not null,
        id bigserial not null,
        paxTitle varchar(10) not null,
        firstName varchar(125) not null,
        firstNameOriginal varchar(125) not null,
        infantFirstName varchar(125),
        infantSurName varchar(125),
        paxSurName varchar(125) not null,
        primary key (id)
    );

    create table $POSTGRES_SCHEMA.pricing (
        couponDetailsGroupBaggageExcessAmount float default 0.0 not null,
        couponDetailsGroupBaggageExcessCurrency varchar(3) not null,
        couponDetailsGroupFeeOwnerCode varchar(2) not null,
        documentDetailsIssueIdentifiers varchar(1) not null,
        documentDetailsIssueIndicators varchar(1) not null,
        documentDetailsTotalFareAmount float default 0.0 not null,
        documentDetailsTotalFareCurrency varchar(3) not null,
        manualIndicatorStatus varchar(1) not null,
        officeAmId varchar(2) not null,
        passengerTattoosType varchar(2) not null,
        passengerTattoosValue varchar(1) not null,
        pricingRecordReferenceType varchar(3) not null,
        pricingRecordUniqueReference varchar(2) not null,
        couponDetailsGroupBaggageQuantityCode varchar(20) not null,
        couponDetailsGroupBaggageUnitQualifier varchar(20) not null,
        pnr varchar(6) not null,
        creationDateTime timestamp(6),
        id bigserial not null,
        officeName varchar(12) not null,
        primary key (id)
    );

    create table $POSTGRES_SCHEMA.activityreport (
        id bigserial not null,
        pnr varchar(6) not null,
        activityType varchar(5) not null,
        actionCode varchar(5) not null,
        elemType varchar(5),
        elemRefTattooType varchar(5) not null,
        elemRefTattooNum integer,
        primary key (id)
    );

    alter table if exists $POSTGRES_SCHEMA.header 
        add constraint FK6wj688u9ok4jyfadt63gcvabc 
        foreign key (pnr) 
        references $POSTGRES_SCHEMA.booking;

    alter table if exists $POSTGRES_SCHEMA.itinerary 
        add constraint FK6wj688u9ok4jyfadt63gcvtxp 
        foreign key (pnr) 
        references $POSTGRES_SCHEMA.booking;

    alter table if exists $POSTGRES_SCHEMA.passenger 
        add constraint FKf4w93jgbg1gffi9b19g06x8k6 
        foreign key (pnr) 
        references $POSTGRES_SCHEMA.booking;

    alter table if exists $POSTGRES_SCHEMA.pricing 
        add constraint FKlfhtfrdyslsnphle7n71287r6 
        foreign key (pnr) 
        references $POSTGRES_SCHEMA.booking;

    alter table if exists $POSTGRES_SCHEMA.activityreport 
        add constraint FKlfhtfrdyslsnphle7n564879r6 
        foreign key (pnr) 
        references $POSTGRES_SCHEMA.booking;
EOSQL