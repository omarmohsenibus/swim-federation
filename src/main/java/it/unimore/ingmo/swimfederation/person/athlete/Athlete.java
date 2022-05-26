package it.unimore.ingmo.swimfederation.person.athlete;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "athlete")
public class Athlete {
    @Id
    private String cf;
}
