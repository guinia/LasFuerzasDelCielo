package com.tup.buensabor.services;

import com.tup.buensabor.entities.Cliente;
import com.tup.buensabor.entities.Pedido;
import com.tup.buensabor.repositories.BaseRepository;
import com.tup.buensabor.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl extends BaseServiceImpl<Cliente,Long> implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public ClienteServiceImpl(BaseRepository<Cliente, Long> baseRepository, ClienteRepository clienteRepository) {
        super(baseRepository);
        this.clienteRepository = clienteRepository;
    }

    @Override
    public List<Cliente> search(String filtro) throws Exception {
        try{
            List<Cliente> cliente = clienteRepository.searchNativo(filtro);
            return cliente;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Cliente> search(String filtro, Pageable pageable) throws Exception {
        try{
            Page<Cliente> cliente = clienteRepository.searchNativo(filtro, pageable);
            return cliente;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
