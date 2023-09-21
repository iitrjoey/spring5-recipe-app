package guru.springframework.spring5recipeapp.domain;

import jakarta.persistence.*;

@Entity
public class UnitsOfMeasure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUom() {
        return description;
    }

    public void setUom(String uom) {
        this.description = uom;
    }

}
