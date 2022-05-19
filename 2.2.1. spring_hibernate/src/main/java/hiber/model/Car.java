package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    String model;
    int series;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
