package br.com.ifba.user.entity;

import br.com.ifba.infrastructure.entity.PersistenceEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
// Anotação para indicar que esta classe é uma entidade JPA
@Entity
// Gera automaticamente os métodos getters, setters, equals, hashCode e toString
@Data
// Gera um construtor sem argumentos
@NoArgsConstructor
// Gera um construtor com todos os argumentos
@AllArgsConstructor
// Define o nome da tabela no banco de dados como "users"
@Table(name = "users")
@EqualsAndHashCode(callSuper = false)
public class User extends br.com.ifba.infrastructure.model.User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // Define que este campo será uma coluna na tabela
    @Column
    private String name;

    // Define que este campo será uma coluna na tabela
    @Column
    private String username;

    // Define que este campo será uma coluna na tabela
    @Column
    private String email;

    // Define que este campo será uma coluna na tabela
    @Column
    private String password;
}