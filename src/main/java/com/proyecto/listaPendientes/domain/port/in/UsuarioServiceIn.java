package com.proyecto.listaPendientes.domain.port.in;

import com.proyecto.listaPendientes.domain.aggregates.dto.UsuarioDTO;
import com.proyecto.listaPendientes.domain.aggregates.request.RequestUsuario;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;
import java.util.Optional;

public interface UsuarioServiceIn {
    Optional<UsuarioDTO> getUsuarioIn(Long id);
    UsuarioDTO updateUsuarioIn(Long id, RequestUsuario requestUsuario);
    UsuarioDTO deleteUsuarioIn(Long id);
    List<UsuarioDTO> obtenerTodasIn();
    UserDetailsService userDetailsServiceIn();
}
