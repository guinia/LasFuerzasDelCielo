package com.tup.buensabor.services;

import com.tup.buensabor.entities.RubroArticulo;
import com.tup.buensabor.entities.UnidadMedida;
import com.tup.buensabor.repositories.BaseRepository;
import com.tup.buensabor.repositories.RubroArticuloRepository;
import com.tup.buensabor.repositories.UnidadMedidaRepository;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RubroArticuloServiceImpl extends BaseServiceImpl<RubroArticulo, Long> implements RubroArticuloService {

    @Autowired
    private RubroArticuloRepository rubroArticuloRepository;

    public RubroArticuloServiceImpl(BaseRepository<RubroArticulo, Long> baseRepository, RubroArticuloRepository rubroArticuloRepository) {
        super(baseRepository);
        this.rubroArticuloRepository = rubroArticuloRepository;
    }

    @Override
    public List<RubroArticulo> search(String filtro) throws Exception {
        try{
            List<RubroArticulo> rubroArticulo = rubroArticuloRepository.searchNativo(filtro);
            return rubroArticulo;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<RubroArticulo> search(String filtro, Pageable pageable) throws Exception {
        try{
            Page<RubroArticulo> rubroArticulo = rubroArticuloRepository.searchNativo(filtro, pageable);
            return rubroArticulo;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
