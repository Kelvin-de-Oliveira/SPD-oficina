package br.edu.ufg.oficina.repository;

import br.edu.ufg.oficina.domain.Mecanico;

public class MecanicoRepository extends BaseRepository<Mecanico, Long> {
    public MecanicoRepository(Database database) {
        super(database, Mecanico.class);
    }
}