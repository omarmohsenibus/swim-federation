package it.unimore.ingmo.swimfederation.person.athlete;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AthleteRepository extends JpaRepository<Athlete, String> {
}
