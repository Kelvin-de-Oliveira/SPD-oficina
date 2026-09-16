package br.edu.ufg.oficina.repository;

import br.edu.ufg.oficina.domain.ItemPeca;

public class ItemPecaRepository extends BaseRepository<ItemPeca, Long> {
    public ItemPecaRepository(Database database) {
        super(database, ItemPeca.class);
    }
}