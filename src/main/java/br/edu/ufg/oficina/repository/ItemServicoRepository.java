package br.edu.ufg.oficina.repository;

import br.edu.ufg.oficina.domain.ItemServico;

public class ItemServicoRepository extends BaseRepository<ItemServico, Long> {
    public ItemServicoRepository(Database database) {
        super(database, ItemServico.class);
    }
}