package br.com.tcc.teclab.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "Laboratorios")
public class Laboratorios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idlaboratorio;

    private String nomeLab;

    @OneToMany(mappedBy = "laboratorios")
    private List<Agendamento> agendamento = new ArrayList<>();

    public String getNomeLab() {
        return nomeLab;
    }

    public void setNomeLab(String nomeLab) {
        this.nomeLab = nomeLab;
    }

    public Integer getIdlaboratorio() {
        return idlaboratorio;
    }

    public void setIdlaboratorio(Integer idlaboratorio) {
        this.idlaboratorio = idlaboratorio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laboratorios that = (Laboratorios) o;
        return idlaboratorio.equals(that.idlaboratorio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idlaboratorio);
    }
}
