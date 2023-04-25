package com.ecommerce;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import javax.persistence.Entity;

@Entity
public class Produto extends PanacheEntity {
    public String nome;
    public String marca;
    public int quantidade;
    public double preco;
}
