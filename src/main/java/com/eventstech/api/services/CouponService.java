package com.eventstech.api.services;

import com.eventstech.api.domain.coupon.Coupon;
import com.eventstech.api.domain.coupon.CouponRequestDTO;
import com.eventstech.api.domain.event.Event;
import com.eventstech.api.repositories.CouponRepository;
import com.eventstech.api.repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class CouponService {

    @Autowired
    private CouponRepository couponRepository;

    @Autowired
    private EventRepository eventRepository;

    public Coupon addCouponToEvent(UUID eventId, CouponRequestDTO couponData) {
        Event event = eventRepository.findById(eventId)
                .orElseThrow(() -> new IllegalArgumentException("Event not found."));

        Coupon coupon = new Coupon();
        coupon.setCode(couponData.code());
        coupon.setDiscount(couponData.discount());
        coupon.setValidity(new Date(couponData.validity()));
        coupon.setEvent(event);

        return couponRepository.save(coupon);
    }

    public List<Coupon> consultCoupons(UUID eventID, Date currentDate) {
        return this.couponRepository.findByEventIdAndValidityAfter(eventID, currentDate);
    }
}
