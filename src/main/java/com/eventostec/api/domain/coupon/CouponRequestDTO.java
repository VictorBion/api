package com.eventostec.api.domain.coupon;

public record CouponRequestDTO(String codeCoupon, int desconto, Long validade) {
}
