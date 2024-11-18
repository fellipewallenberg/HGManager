package com.cefetmg.hgmanager.Model;

import com.cefetmg.hgmanager.Model.Enum.Estado;

import jakarta.persistence.*;

@Entity
public class Recurso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String marca;
    private String descricao;

    @Enumerated(EnumType.STRING)
    private Estado estado;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_departamento", nullable = false)
    private Departamento departamento;

    // constructors
    public Recurso() {}

    public Recurso(Long id, String marca, String descricao, Estado estado, Departamento departamento) {

        setId(id);
        setMarca(marca);
        setDescricao(descricao);
        setEstado(estado);
        setDepartamento(departamento);

    }

    // getters
    public Departamento getDepartamento() {
        return departamento;
    }

    public Estado getEstado() {
        return estado;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getMarca() {
        return marca;
    }

    public Long getId() {
        return Id;
    }

    // setters
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setId(Long id) {
        Id = id;
    }



}