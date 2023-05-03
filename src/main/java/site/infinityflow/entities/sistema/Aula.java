package site.infinityflow.entities.sistema;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@Builder
@Entity
@Table(name = "tabela_aulas")
public class Aula implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idAula;
    LocalDate data;
    @ManyToOne
    Materia materia;
}
