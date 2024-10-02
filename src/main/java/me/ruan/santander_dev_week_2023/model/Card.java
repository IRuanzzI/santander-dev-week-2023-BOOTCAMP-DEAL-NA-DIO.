package me.ruan.santander_dev_week_2023.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "tb_card") // Usar a anotação @Table para especificar o nome da tabela
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true)
    private String number;

    @Column(name = "credit_limit", precision = 13, scale = 2) // Alterando de 'limit' para 'credit_limit'
    private BigDecimal creditLimit;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public BigDecimal getCreditLimit() { // Alterando o getter
        return creditLimit;
    }

    public void setCreditLimit(BigDecimal creditLimit) { // Alterando o setter
        this.creditLimit = creditLimit;
    }
}
