package com.proyecto.listaPendientes.domain.port.in;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.proyecto.listaPendientes.domain.aggregates.dto.ComentarioDTO;
import com.proyecto.listaPendientes.domain.aggregates.request.RequestComentario;


public interface ComentarioServiceIn {

    ComentarioDTO crearComentarioIn(RequestComentario requestComentario) throws JsonProcessingException;

    ComentarioDTO actualzarComentarioIn(Long id, RequestComentario requestComentario);
    ComentarioDTO deleteComentarioIn(Long id);
}
