package it.unimore.ingmo.swimfederation.gametype;

import javax.persistence.*;

@Entity
@Table(name = "type_of_game")
public class GameType {
    @Id
    @GeneratedValue
    private Integer code;

    @Column
    private String description;
}
