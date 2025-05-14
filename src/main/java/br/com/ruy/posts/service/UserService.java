package br.com.ruy.posts.service;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import br.com.ruy.posts.data.Usuario;
import br.com.ruy.posts.data.UsuarioRepository;
import br.com.ruy.posts.dto.UsuarioDto;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UsuarioRepository usuarioRepository;
    private ModelMapper modelMapper;
    
    public boolean saveUser(UsuarioDto usuarioDto) {
        modelMapper = new ModelMapper();
        Usuario usuario = modelMapper.map(usuarioDto, Usuario.class);
        usuarioRepository.save(usuario);
        return true;
    }
}
