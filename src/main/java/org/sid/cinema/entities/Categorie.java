package org.sid.cinema.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Categorie {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length =75)
    private String name;
    @OneToMany(mappedBy = "categorie")
    private Collection<Film> films;
}
