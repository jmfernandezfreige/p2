package edu.comillas.icai.gitt.pat.spring.P2.controlador;

import edu.comillas.icai.gitt.pat.spring.P2.modelo.Carrito;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

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
    public Carrito creaCarritos(@Valid @RequestBody Carrito carritoNuevo) {
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
                                   @Valid @RequestBody Carrito carrito) {
        if (carrito.getIdCarrito() != idCarrito) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,
                    "El ID del carrito nuevo debe coincidir con el de la URL"
            );
        }

        carritos.put(idCarrito, carrito);
        return carrito;
    }

//        Carrito carritoExistente = carritos.get(idCarrito);
//
//        if (carrito.getDescripcion() != null) {
//            carritoExistente.setDescripcion(carrito.getDescripcion());
//        }
//
//        if (carrito.getUnidades() > 0) {
//            carritoExistente.setUnidades(carrito.getUnidades());
//        }
//
//        if (carrito.getPrecioFinal() > 0) {
//            carritoExistente.setPrecioFinal(carrito.getPrecioFinal());
//        }
//
//        if (carrito.getIdArticulo() > 0) {
//            carritoExistente.setIdCarrito(carrito.getIdArticulo());
//        }
//
//        return carrito;
    }

