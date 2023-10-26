package com.tup.buensabor.repositories;

import com.tup.buensabor.entities.ArticuloManufacturado;
import com.tup.buensabor.entities.Cliente;
import com.tup.buensabor.services.ClienteServiceImpl;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
public class ClienteRepositoryTest {
    @Autowired
    private EntityManager entityManager;

    @Autowired
    private ClienteRepository clienteRepository;

    @Test
    void testSearchString() throws Exception {

        Cliente cliente1 = new Cliente();
        cliente1.setNombre("Tomas");
        cliente1.setApellido("Guiñazu");

        Cliente cliente2 = new Cliente();
        cliente2.setNombre("Santiago");
        cliente2.setApellido("Vicente");

        List<Cliente> listaEnviada = new ArrayList();
        listaEnviada.add(cliente1);
        listaEnviada.add(cliente2);

        entityManager.persist(cliente1);
        entityManager.persist(cliente2);
        entityManager.flush();

        assertEquals(listaEnviada, clienteRepository.searchNativo("Tomas"));
        assertEquals(listaEnviada, clienteRepository.searchNativo("Guiñazu"));
        assertEquals(listaEnviada, clienteRepository.searchNativo("Santiago"));
        assertEquals(listaEnviada, clienteRepository.searchNativo("Vicente"));


    }
}