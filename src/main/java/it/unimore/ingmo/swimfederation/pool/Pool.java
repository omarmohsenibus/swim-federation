package it.unimore.ingmo.swimfederation.pool;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "swimming_pool")
public class Pool {
    @Id
    private String name;

    @Column
    @NotBlank(message = "description is mandatory")
    private String description;

    @Column
    @NotBlank(message = "address is mandatory")
    private String address;

    @Column(name = "n_lanes")
    @Min(value = 4)
    @Max(value = 8)
    @NotNull(message = "numberOfLanes is mandatory")
    private Integer numberOfLanes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getNumberOfLanes() {
        return numberOfLanes;
    }

    public void setNumberOfLanes(Integer numberOfLanes) {
        this.numberOfLanes = numberOfLanes;
    }
}
