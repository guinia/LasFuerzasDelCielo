package com.tup.buensabor.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

import lombok.Builder;

@Entity
@Getter
@Setter
@Table(name = "persona")
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Persona extends Base {

    private String nombre;

    private String apellido;

    private String telefono;

    private String email;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
    @JoinColumn(name = "id_persona")
    @Builder.Default
    private List<Domicilio> domicilios = new ArrayList<>();

    public void agregarDomicilio(Domicilio domi){
        domicilios.add(domi);
    }

    public void mostrarDomicilios() {
        System.out.println("Domicilios de " + nombre + " " + apellido + ":");
        for (Domicilio domicilio : domicilios) {
            System.out.println("Calle: " + domicilio.getCalle() + ", Número: " + domicilio.getNumero() + ", Localidad: " + domicilio.getLocalidad());
        }
    }

}
