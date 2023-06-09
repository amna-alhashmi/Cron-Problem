package com.example.UserRegistration.Controller;

import com.example.UserRegistration.Models.TicketBooking;
import com.example.UserRegistration.Models.UserRegistration;
import com.example.UserRegistration.RequestObject.EventRequest;
import com.example.UserRegistration.RequestObject.TicketRequest;
import com.example.UserRegistration.Service.TicketBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "bookings")
public class TicketBookingController {
    @Autowired
    TicketBookingService ticketBookingService;

    @RequestMapping(value = "addTicketBooking", method = RequestMethod.POST)
    public String addNewTicket(@RequestBody TicketRequest ticketRequest) {
        ticketBookingService.addNewTicket(ticketRequest);

        return "Ticket add successful";
    }

    @RequestMapping(value = "getAllBooking", method = RequestMethod.GET)
    public List<TicketBooking> getAllTicket1() {
        List<TicketBooking> ticketBookings = ticketBookingService.getAllTicket1();
        return ticketBookings;
    }
    @RequestMapping(value = "BookingCancellation:",method = RequestMethod.POST)
public void BookingCancellation(@RequestParam Integer bookingId){
        ticketBookingService.BookingCancellation(bookingId);
    }
}
