package com.mentoring.transporte.domain.entity;

import lombok.Data;

@Data
public class Passenger {

    long id;
    String name;
    PaymentMethod favouritePaymentMethod;

}

enum PaymentMethod {
    CARD,
    CASH,
}
