package com.eventstech.api.domain.coupon;

public record CouponRequestDTO(String code, Integer discount, Long validity) {
}
