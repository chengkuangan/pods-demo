#!/bin/bash

psql -v ON_ERROR_STOP=1 --username "$POSTGRES_USER" -d "$POSTGRES_DB"  <<-EOSQL

    alter table if exists $POSTGRES_SCHEMA.activityReport
        drop constraint if exists FKlfhtfrdyslsnphle7n564879r6;
    alter table if exists $POSTGRES_SCHEMA.header
        drop constraint if exists FK6wj688u9ok4jyfadt63gcvabc;
    alter table if exists $POSTGRES_SCHEMA.itinerary
        drop constraint if exists FK6wj688u9ok4jyfadt63gcvtxp;
    alter table if exists $POSTGRES_SCHEMA.passenger
        drop constraint if exists FKf4w93jgbg1gffi9b19g06x8k6;
    alter table if exists $POSTGRES_SCHEMA.pricing
        drop constraint if exists FKlfhtfrdyslsnphle7n71287r6;

    drop table if exists $POSTGRES_SCHEMA.activityReport cascade;
    drop table if exists $POSTGRES_SCHEMA.booking cascade;
    drop table if exists $POSTGRES_SCHEMA.header cascade;
    drop table if exists $POSTGRES_SCHEMA.itinerary cascade;
    drop table if exists $POSTGRES_SCHEMA.passenger cascade;
    drop table if exists $POSTGRES_SCHEMA.pricing cascade;

    create schema if not exists $POSTGRES_SCHEMA;

    create table $POSTGRES_SCHEMA.activityReport (
        elemRefTattooNum integer not null,
        pnr varchar(6) not null,
        id bigserial not null,
        actionCode varchar(256) not null,
        activityType varchar(256) not null,
        elemRefTattooType varchar(256) not null,
        elemType varchar(256),
        primary key (id)
    );

    create table $POSTGRES_SCHEMA.booking (
        pnr varchar(6) not null,
        reservationLastEOTDateTime timestamp(6),
        pnrPurgeDate varchar(255) not null,
        queueingOfficeId varchar(255) not null,
        reservationAmadeusCompanyID varchar(255) not null,
        reservationAmadeusRecordLocator varchar(255) not null,
        reservationControlType varchar(255) not null,
        primary key (pnr)
    );

    create table $POSTGRES_SCHEMA.header (
        currentEnvelopeNum integer not null,
        numEnvelopesSent integer not null,
        numPaxInPNR integer not null,
        pnr varchar(6) not null,
        id bigserial not null,
        secondRpPnrCreationDateTime timestamp(6),
        bookingChannel varchar(255) not null,
        creationPosDetailsCityCode varchar(255) not null,
        creationPosDetailsCompanyId varchar(255) not null,
        creationPosDetailsCountryCode varchar(255) not null,
        creationPosDetailsIataCode varchar(255) not null,
        creationPosDetailsOfficeID1 varchar(255) not null,
        creationPosDetailsSourceOfBooking varchar(255) not null,
        lastUpdatorAgentSine1 varchar(255) not null,
        lastUpdatorOfficeID1 varchar(255) not null,
        lastUpdatorReceivedFromInfo varchar(255) not null,
        ownerPosDetailsCityCode varchar(255) not null,
        ownerPosDetailsCompanyId varchar(255) not null,
        ownerPosDetailsCountryCode varchar(255) not null,
        ownerPosDetailsIataCode varchar(255) not null,
        ownerPosDetailsOfficeID1 varchar(255) not null,
        ownerPosDetailsSourceOfBooking varchar(255) not null,
        responsibleAgentId varchar(255) not null,
        responsibleOfficeID varchar(255) not null,
        responsibleTypeOfPnrElement varchar(255) not null,
        secondRpAgentSignature varchar(255) not null,
        secondRpCreationOfficeId varchar(255) not null,
        secondRpCreatorIataCode varchar(255) not null,
        updatorPosDetailsCityCode varchar(255) not null,
        updatorPosDetailsCompanyId varchar(255) not null,
        updatorPosDetailsCountryCode varchar(255) not null,
        updatorPosDetailsIataCode varchar(255) not null,
        updatorPosDetailsOfficeID1 varchar(255) not null,
        updatorPosDetailsSourceOfBooking varchar(255) not null,
        primary key (id)
    );

    create table $POSTGRES_SCHEMA.itinerary (
        elemRefTattooNum integer not null,
        yieldDataGroupAdjustedYieldAmount integer not null,
        yieldDataGroupBidPriceAmount integer not null,
        yieldDataGroupEffectiveYieldAmount integer not null,
        yieldDataGroupYieldAmount integer not null,
        pnr varchar(6) not null,
        endDateTime timestamp(6),
        id bigserial not null,
        startDateTime timestamp(6),
        aircraftType varchar(255) not null,
        boardPoint varchar(255) not null,
        boardPointTerminal varchar(255) not null,
        bookingClass varchar(255) not null,
        bookingCreationDateTime varchar(255) not null,
        companyCode varchar(255) not null,
        dayChangeIndicator varchar(255),
        daysOfOperation varchar(255) not null,
        elemRefTattooType varchar(255) not null,
        elemType varchar(255) not null,
        etIndicator varchar(255) not null,
        extAirlineCode1 varchar(255) not null,
        extAirlineRecordLocator1 varchar(255) not null,
        flightNum varchar(255) not null,
        flightType varchar(255) not null,
        inventoryDataCabinCode varchar(255) not null,
        inventoryDataPosInvClassification varchar(255) not null,
        inventoryDataPosInvCompanyID varchar(255) not null,
        inventoryDataPosInvCountryCode varchar(255) not null,
        inventoryDataSubClassNum varchar(255) not null,
        itinPosDetailsCityCode varchar(255) not null,
        itinPosDetailsCompanyId varchar(255) not null,
        itinPosDetailsCountryCode varchar(255) not null,
        itinPosDetailsIataCode varchar(255) not null,
        itinPosDetailsOfficeID varchar(255) not null,
        itinPosDetailsSourceofBooking varchar(255) not null,
        offPoint varchar(255) not null,
        offPointTerminal varchar(255) not null,
        originalStatusCode1 varchar(255) not null,
        originalStatusCode2 varchar(255) not null,
        quantity varchar(255),
        selectionLevelOfAccessOption varchar(255) not null,
        statusCode varchar(255) not null,
        yieldDataGroupTripDestination varchar(255) not null,
        yieldDataGroupTripOrigin varchar(255) not null,
        yieldDataGroupYieldClassOfService varchar(255) not null,
        yieldDataGroupYieldDestination varchar(255) not null,
        yieldDataGroupYieldOrigin varchar(255) not null,
        primary key (id)
    );

    create table $POSTGRES_SCHEMA.passenger (
        passengerElemRefTattooNum integer not null,
        paxCount integer not null,
        pnr varchar(6) not null,
        id bigserial not null,
        dateOfBirth varchar(255) not null,
        firstName varchar(255) not null,
        firstNameOriginal varchar(255) not null,
        infantFirstName varchar(255) not null,
        infantSurName varchar(255) not null,
        infantType varchar(255) not null,
        isTravellingWithInfant varchar(255) not null,
        passengerElemRefTattooType varchar(255) not null,
        passengerElemType varchar(255) not null,
        paxSurName varchar(255) not null,
        paxTitle varchar(255) not null,
        paxType varchar(255) not null,
        primary key (id)
    );

    create table $POSTGRES_SCHEMA.pricing (
        couponDetailsGroupBaggageExcessAmount integer not null,
        documentDetailsTotalFareAmount float(53) not null,
        pnr varchar(6) not null,
        creationDateTime timestamp(6),
        id bigserial not null,
        couponDetailsGroupBaggageExcessCurrency varchar(255) not null,
        couponDetailsGroupBaggageQuantityCode varchar(255) not null,
        couponDetailsGroupBaggageUnitQualifier varchar(255) not null,
        couponDetailsGroupFeeOwnerCode varchar(255) not null,
        documentDetailsIssueIdentifiers varchar(255) not null,
        documentDetailsIssueIndicators varchar(255) not null,
        documentDetailsTotalFareCurrency varchar(255) not null,
        manualIndicatorStatus varchar(255) not null,
        officeAmId varchar(255) not null,
        officeName varchar(255) not null,
        passengerTattoosType varchar(255) not null,
        passengerTattoosValue varchar(255) not null,
        pricingRecordReferenceType varchar(255) not null,
        pricingRecordUniqueReference varchar(255) not null,
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