package com.example.prcappcrud.infrastructure;

import com.example.prcappcrud.domain.Producto;
import com.example.prcappcrud.domain.ResponseData;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.UUID;

@Repository
public class ProductoInfrastructure {
    ArrayList<Producto> DB = new ArrayList<>();
     public Producto createProducto(Producto producto){
         DB.add(producto);
         return  producto;
    }
    public ArrayList<Producto> getAllProducto(){
         return DB;
    }
    public ResponseData deleteProducto(UUID id){
             boolean delPro = DB.removeIf(producto -> producto.getId().equals(id));
             if (delPro){
                return new ResponseData("usuario eliminado");
             } else{
                 return new ResponseData("no se pudo eliminar");
             }

    }
}
