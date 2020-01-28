package com.restapi.server.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "member")
@Getter
@Setter
@ToString
public class Member {
    @Id
    private int member_id;
    @Column
    private String first_name;
    @Column
    private String last_name;
    @Column
    private String address;
    @Column
    private String email;
    @Column
    private String pass;
}
