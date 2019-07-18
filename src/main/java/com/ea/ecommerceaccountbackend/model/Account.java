package com.ea.ecommerceaccountbackend.model;

import com.ea.ecommerceaccountbackend.Utils.Membership;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@Data
@Getter
@Setter
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userName;
    private String password;
    private String email;
    private Membership membership;
    @OneToOne(cascade =CascadeType.ALL)
    private Address address;
    @OneToOne(cascade = CascadeType.ALL)
    private Card cards;



}
