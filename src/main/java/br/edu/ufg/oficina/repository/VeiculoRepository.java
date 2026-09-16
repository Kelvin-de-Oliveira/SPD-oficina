package br.edu.ufg.oficina.repository;

import br.edu.ufg.oficina.domain.Veiculo;

public class VeiculoRepository extends BaseRepository<Veiculo, Long> {
    public VeiculoRepository(Database database) {
        super(database, Veiculo.class);
    }
}