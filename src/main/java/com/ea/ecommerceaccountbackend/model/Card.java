package com.ea.ecommerceaccountbackend.model;

import com.ea.ecommerceaccountbackend.Utils.CardType;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
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


    private String expirationDate;
    private CardType cardType;
}
