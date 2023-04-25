package com.ecommerce;

import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/produto")
public class GreetingResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Produto> listProdutos() {
        return Produto.listAll();
    }

    @POST
    @Transactional
    public void addProduto() {
        Produto produto = new Produto();
        produto.nome = "Refrigerante Coca Cola";
        produto.marca = "Coca Cola";
        produto.quantidade = 10;
        produto.preco = 5.60;
        produto.persist();
    }

}