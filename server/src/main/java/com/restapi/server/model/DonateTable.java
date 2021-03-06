package com.restapi.server.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "donateTable")
@Getter
@Setter
@ToString
public class DonateTable {
    @Id
    @GeneratedValue(generator = "donateTable_generator")
    @SequenceGenerator(
            name = "donateTable_generator",
            sequenceName = "donateTable_sequence",
            initialValue = 10
    )
    @Column(name = "donates_id")
    private int donatesID;
    @Column
    private String foodType;
    @Column
    private String amountStr;
    @Column
    private String likedStr;

    @Column(name = "container_id")
    private int containerId;

    @Column
    private String donateType;

    @Column
    private String promotionCode;

    @Column
    private String creditCardNumberStr;

    @Column
    private String fullName;

    @Column
    private String expiration_dateStr;

    @Column
    private String cvvNumberStr;

    @Column
    private String recieverName;

    @Column
    private String Iban;

    @Column
    private String donateFoodName;

    @Column
    private String donaterMail;

    @Column
    private String discountCode;

    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date donateTime;


    //@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    //@JoinColumn(name = "donates_id", referencedColumnName= "donates_id")
    //private List<Comment> commentsList;


}
