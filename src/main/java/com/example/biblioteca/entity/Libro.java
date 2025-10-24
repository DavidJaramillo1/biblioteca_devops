package com.example.biblioteca.entity;

@Data // Evita definir los getters y setters
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "libro")
public class Libro {

    @Id
    @GenerateValue(strategy = GenerationType.IDENTITY) // Se genera de forma automatica
    private Long id;

    @Column(nullable = false) // Al ponerlo posterior, hayq que modificar la propiedad
    private String titulo;

    @Column
    private String autor;

}
