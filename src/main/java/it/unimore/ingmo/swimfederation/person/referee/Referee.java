package it.unimore.ingmo.swimfederation.person.referee;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "referee")
public class Referee {
    @Id
    private String cf;
}
