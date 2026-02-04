package edu.comillas.icai.gitt.pat.spring.P2.controlador;

import edu.comillas.icai.gitt.pat.spring.P2.modelo.Carrito;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@RestController
public class CarritoControlador {
    private final Map<Integer, Carrito> carritos = new HashMap<>();

    @GetMapping("/api/carritos")
    public Collection<Carrito> getCarritos() {
            return carritos.values();
    }

    @PostMapping("/api/carritos")
    @ResponseStatus(HttpStatus.CREATED)
    public Carrito creaCarritos(@RequestBody Carrito carritoNuevo) {
        carritos.put(carritoNuevo.getIdCarrito(), carritoNuevo);
        return carritoNuevo;
    }

    @GetMapping("/api/carritos/{idCarrito}")
    public Carrito getCarrito(@PathVariable int idCarrito) {
        return carritos.get(idCarrito);
    }

    @DeleteMapping("/api/carritos/{idCarrito}")
    public void borraCarrito(@PathVariable int idCarrito) {
        carritos.remove(idCarrito);
    }

    @PutMapping("/api/carritos/{idCarrito}")
    public Carrito modificaCarrito(@PathVariable int idCarrito,
                                   @RequestBody Carrito carrito) {
        carritos.put(idCarrito, carrito);
        return carrito;
    }
}

