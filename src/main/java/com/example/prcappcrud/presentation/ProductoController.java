package com.example.prcappcrud.presentation;

import com.example.prcappcrud.domain.Producto;
import com.example.prcappcrud.domain.ResponseData;
import com.example.prcappcrud.infrastructure.ProductoInfrastructure;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.UUID;

@RestController
public class ProductoController {
    ProductoInfrastructure productoInfrastructure;
    public ProductoController(ProductoInfrastructure productoInfrastructure){
        this.productoInfrastructure=productoInfrastructure;
    }
    @GetMapping("/")
    public String saludo(){
        return "Bienvenido";
    }
    @GetMapping("/producto")
    public ArrayList<Producto> getAll(){
       return productoInfrastructure.getAllProducto();
    }
    @PostMapping("/producto")
    public Producto create (@RequestBody Producto producto){
       return productoInfrastructure.createProducto(producto);
    }
    @DeleteMapping("/producto/{id}")
    public ResponseData delete (@PathVariable UUID id){
        return productoInfrastructure.deleteProducto(id);
    }
    @PutMapping("/producto/{id}")
    public ResponseData update(@PathVariable UUID id,@RequestBody Producto producto){
        productoInfrastructure.updateProducto(id,producto);
      return new ResponseData("ok");
    }
}
