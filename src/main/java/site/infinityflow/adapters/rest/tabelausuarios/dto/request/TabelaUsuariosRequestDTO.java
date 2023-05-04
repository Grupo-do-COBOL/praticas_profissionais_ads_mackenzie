package site.infinityflow.adapters.rest.tabelausuarios.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import site.infinityflow.entities.security.Funcao;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TabelaUsuariosRequestDTO {



    private String nome;


    private String email;


    private Funcao funcao;


    private String senha;

}
