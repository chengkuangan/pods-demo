insert into pnr.activityReport (
    pnr,
    activityType,
    actionCode,
    elemType,
    elemRefTattooType,
    elemRefTattooNum 
    ) 
    values(
        :#${header.pnr},
        :#activityType,
        :#actionCode,
        :#elemType,
        :#elemRefTattooType,
        :#elemRefTattooNum
    );



