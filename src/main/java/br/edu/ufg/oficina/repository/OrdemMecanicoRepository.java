package br.edu.ufg.oficina.repository;

import br.edu.ufg.oficina.domain.OrdemMecanico;

public class OrdemMecanicoRepository extends BaseRepository<OrdemMecanico, Long> {
    public OrdemMecanicoRepository(Database database) {
        super(database, OrdemMecanico.class);
    }
}