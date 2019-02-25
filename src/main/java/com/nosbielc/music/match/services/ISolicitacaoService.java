package com.nosbielc.music.match.services;

import com.nosbielc.music.match.entities.Solicitacao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;
import java.util.Optional;

public interface ISolicitacaoService {

    Page<Solicitacao> findAllPageable(PageRequest pageRequest);

    Optional<Solicitacao> findById(Long id);

    Solicitacao persist(Solicitacao solicitacao);

    void remove(Solicitacao solicitacao);

    Optional<List<Solicitacao>> findAll();

}