package com.tup.buensabor.entities;

import jakarta.persistence.*;

import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "rubro_articulo")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class RubroArticulo extends Base {

    @ManyToOne()
    @JoinColumn(name = "id_rubro_padre")
    private RubroArticulo rubroPadre;

    //@OneToMany(mappedBy = "rubroPadre", cascade = CascadeType.ALL)
    //private List<RubroArticulo> subRubros = new ArrayList<>();

    @NotNull
    private String denominacion;

    // asi estaba antes
  /*public RubroArticulo(String denominacion, RubroArticulo rubroPadre) {
        this.denominacion = denominacion;
        this.rubroPadre = rubroPadre;
    }
    */
    //public void setRubroPadre(RubroArticulo rubroPadre) {
        //this.rubroPadre = rubroPadre;
    //}

    //public void agregarSubRubro(RubroArticulo rubroArticulo) {
        //subRubros.add(rubroArticulo);
   // }

}
