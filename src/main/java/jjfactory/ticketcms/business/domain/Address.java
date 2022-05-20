package jjfactory.ticketcms.business.domain;

import lombok.AllArgsConstructor;

import javax.persistence.Embeddable;

@Embeddable
@AllArgsConstructor
public class Address {
    private String post;
    private String address1;
    private String address2;
}
