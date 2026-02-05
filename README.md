# Práctica 2 - API REST
### Programación de Aplicaciones Telemáticas - 3ºB GITT+BA
#### José Manuel Fernández Freige

En este documento se expone la memoria de la práctica 2 de la asignatura detallando los pasos seguidos e indicando un resumen de las funcionalidades implementadas. 

El objetivo de la práctica consiste en la creación de un servicio Web REST siguiendo el estilo **request/response** sobre el protocolo **HTTP**. Este servicio deberá implementar las funcionalidades del patrón **CRUD** (Create, Read, Upadte, Delete) sobre un recurso llamado **"Carrito"** modelando un e-commerce básico.

Para la creación de API REST se seguirá el patrón **Modelo - Vista - Controlador** visto en clase implementando un modelo básico mediante un objeto de tipo "Carrito" y un **Controlador REST** capaz de recibir, gestionar y responder peticiones del cliente. 

Los endpoints a implementar se resumen en la siguiente tabla:

| Método | Ruta | Cuerpo (Body) | Descripción | Posibles Respuestas |
| :--- | :--- | :--- | :--- | :--- |
| `GET` | `/api/carritos` | N/A | Obtener lista de los carritos | `200 OK` |
| `POST` | `/api/carritos` | JSON Carrito | Crear y añadir carritos a la lista | `201 Created`, `400 Bad Request` |
| `GET` | `/api/carritos/{idCarrito}` | N/A | Obtener el carrito con ID: "idCarrito" | `200 OK`, `404 Not Found` |
| `DELETE` | `/api/carritos/{idCarrito}` | N/A | Borrar el carrito con ID: "idCarrito" | `200 OK` (o `204`), `404 Not Found` |
| `PUT` | `/api/carritos/{idCarrito}` | JSON Carrito | Modificar el carrito con ID: "idCarrito" | `200 OK`, `400 Bad Request`, `404 Not Found` |

### Inicialización del Proyecto con Spring Boot
Para comenzar con la creación de API REST se ha hecho uso de **Spring Boot Initializer** tal y como se ha hecho en los ejemplos de clase. En la generación del proyecto de Spring, se ha seleccionado Maven como el gestor de dependencias, la versión 4.0.2 de Spring y la versión Java 21 para el lenguaje de programación. 
Una vez se ha generado el proyecto, se define como un repositorio de Git en el que se crea una rama principal para ir subiendo los cambios realizados. 


### Creación del Modelo: 

### Creación del Controlador y los Endpoints

### Pruebas realizadas
