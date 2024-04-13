package com.proyecto.listaPendientes.domain.port.in;

import com.proyecto.listaPendientes.domain.aggregates.dto.CategoriaDTO;
import com.proyecto.listaPendientes.domain.aggregates.request.RequestCategoria;

import java.util.List;
import java.util.Optional;

public interface CategoriaServiceIn {
    CategoriaDTO crearCategoriaIn(RequestCategoria requestCategoria);
    Optional<CategoriaDTO> obtenerCategoriaIn(Long id);
    List<CategoriaDTO> obtenerCategoriaAllIn();
    CategoriaDTO actualzarCategoriaIn(Long id, RequestCategoria requestCategoria);
    CategoriaDTO deleteCategoriaIn(Long id);
}
