package br.com.viavarejo.host;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.viavarejo.application.service.FilialService;
import br.com.viavarejo.domain.model.Filial;
import br.com.viavarejo.host.dto.FilialDTO;

@RestController
public class FilialEndpoint {

    private static final Logger LOGGER = LoggerFactory.getLogger(FilialEndpoint.class);

    @Autowired
    private FilialService filialService;

    @GetMapping(value = "/filiais/{empresa}")
    public ResponseEntity<FilialDTO> listarFiliais(@PathVariable(name = "empresa", required = true) final Integer empresa) {
        
    	List<Filial> filiais = filialService.listarFiliais(empresa);
    	
    	// converter a lista de "Filial" para a lista de "FilialDTO"
    	
    	FilialDTO response = new FilialDTO();
    	
    	response.setTeste("testedddd");
    	
        return ResponseEntity.ok().body(response);
    }
}
