package org.upsam.tecmov.madridplaces.domain.calificacion;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.upsam.tecmov.madridplaces.domain.codpostal.CodPostal;

public interface CalificacionRepository extends PagingAndSortingRepository<Calificacion, Integer> {

	Calificacion findByCodPostal(CodPostal codPostal);
}
