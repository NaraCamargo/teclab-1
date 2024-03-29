package br.com.tcc.teclab.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "Cadastro")
public class Cadastro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idusuario;
    private String nomeusuario;
    private String senha;

    @JsonIgnore
    @OneToMany(mappedBy = "cadastro")
    private List<Agendamento> agendamento = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "idpermissoes")
    private Permissoes permissoes;

    public Integer getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Integer idusuario) {
        this.idusuario = idusuario;
    }

    public String getNomeusuario() {
        return nomeusuario;
    }

    public void setNomeusuario(String nomeusuario) {
        this.nomeusuario = nomeusuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Permissoes getPermissoes() {
        return permissoes;
    }

    public void setPermissoes(Permissoes permissoes) {
        this.permissoes = permissoes;
    }

    public List<Agendamento> getAgendamento() {
        return agendamento;
    }

    public void setAgendamento(List<Agendamento> agendamento) {
        this.agendamento = agendamento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cadastro cadastro = (Cadastro) o;
        return idusuario.equals(cadastro.idusuario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idusuario);
    }
}
