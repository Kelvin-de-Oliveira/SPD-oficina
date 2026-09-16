package br.edu.ufg.oficina.repository;

import br.edu.ufg.oficina.domain.Peca;

public class PecaRepository extends BaseRepository<Peca, Long> {
    public PecaRepository(Database database) {
        super(database, Peca.class);
    }
}