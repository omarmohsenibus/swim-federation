package it.unimore.ingmo.swimfederation.league;

import javax.persistence.*;

@Entity
@Table(name = "league")
public class League {
    @Id
    @GeneratedValue
    private Integer code;

    @Column
    private String type;

    @Column
    private int year;

}
