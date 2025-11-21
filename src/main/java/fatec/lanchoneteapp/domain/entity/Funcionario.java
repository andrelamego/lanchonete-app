package fatec.lanchoneteapp.domain.entity;

import java.time.LocalDate;

public class Funcionario {
    private int id;
    private String nome;
    private String tel;
    private LocalDate dataContrato;
    private Cargo cargo;

    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public String getTel() {
        return tel;
    }
    public LocalDate getDataContrato() {
        return dataContrato;
    }
    public Cargo getCargo() {
        return cargo;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }
    public void setDataContrato(LocalDate dataContrat) {
        this.dataContrato = dataContrat;
    }
    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
}

