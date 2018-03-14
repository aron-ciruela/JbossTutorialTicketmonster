package org.jboss.examples.ticketmonster.test.rest;

import org.jboss.examples.ticketmonster.test.TicketMonsterDeployment;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.jboss.tools.examples.model.Booking;
import org.jboss.tools.examples.rest.BaseEntityService;
import org.jboss.tools.examples.service.SeatAllocationService;
import org.jboss.tools.examples.util.MultivaluedHashMap;

public class RESTDeployment {

    public static WebArchive deployment() {
        return TicketMonsterDeployment.deployment()
                .addPackage(Booking.class.getPackage())
                .addPackage(BaseEntityService.class.getPackage())
                .addPackage(MultivaluedHashMap.class.getPackage())
                .addPackage(SeatAllocationService.class.getPackage());
    }

}