package br.com.ruy.posts.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDto {
    private int codigoUsuario;
    private String nome;
    private String email;
    private String senha;
}
