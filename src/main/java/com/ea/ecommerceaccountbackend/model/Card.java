package com.ea.ecommerceaccountbackend.model;

import com.ea.ecommerceaccountbackend.Utils.CardType;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@NoArgsConstructor
@Data
@Entity
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //private String type;

    private String nameOnCard;

    private String cardNumber;

    private Date expirationDate;
    private CardType cardType;
}
