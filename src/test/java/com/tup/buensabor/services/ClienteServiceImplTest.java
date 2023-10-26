package com.tup.buensabor.services;

import com.tup.buensabor.entities.ArticuloManufacturado;
import com.tup.buensabor.entities.Cliente;
import com.tup.buensabor.repositories.ClienteRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class ClienteServiceImplTest {

    @MockBean
    private ClienteRepository clienteRepository;

    @Autowired
    private ClienteServiceImpl clienteServiceImpl;

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

        when(clienteRepository.searchNativo("Tomas")).thenReturn(listaEnviada);
        when(clienteRepository.searchNativo("Guiñazu")).thenReturn(listaEnviada);
        when(clienteRepository.searchNativo("Santiago")).thenReturn(listaEnviada);
        when(clienteRepository.searchNativo("Vicente")).thenReturn(listaEnviada);
        assertEquals(listaEnviada, clienteServiceImpl.search("Tomas"));
        assertEquals(listaEnviada, clienteServiceImpl.search("Guiñazu"));
        assertEquals(listaEnviada, clienteServiceImpl.search("Santiago"));
        assertEquals(listaEnviada, clienteServiceImpl.search("Vicente"));


    }


}
