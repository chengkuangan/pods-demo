delete from pnr.pricing where pnr = :#${body.pnr};
delete from pnr.passenger where pnr = :#${body.pnr};
delete from pnr.itinerary where pnr = :#${body.pnr};
delete from pnr.header where pnr = :#${body.pnr};
delete from pnr.activityReport where pnr = :#${body.pnr};
delete from pnr.booking where pnr = :#${body.pnr};





