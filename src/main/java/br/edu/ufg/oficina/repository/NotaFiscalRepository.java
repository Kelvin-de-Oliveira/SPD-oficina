package br.edu.ufg.oficina.repository;

import br.edu.ufg.oficina.domain.NotaFiscal;

public class NotaFiscalRepository extends BaseRepository<NotaFiscal, Long> {
    public NotaFiscalRepository(Database database) {
        super(database, NotaFiscal.class);
    }
}