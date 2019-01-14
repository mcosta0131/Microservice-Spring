package br.com.viavarejo.application.service;

import java.util.List;

import br.com.viavarejo.domain.model.Filial;

public interface FilialService {

	List<Filial> listarFiliais(Integer empresa);
	
}