package com.ea.ecommerceaccountbackend.model;

import com.ea.ecommerceaccountbackend.Utils.AddressType;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Data
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String street;
    private String houseNumber;
    private String zipCode;
    private String city;
    private String state;
    private AddressType type;
}
