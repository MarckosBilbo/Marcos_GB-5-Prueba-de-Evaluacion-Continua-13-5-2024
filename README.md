# Marcos_GB-5-Prueba-de-Evaluacion-Continua-13-5-2024

Repositorio-->

Este proyecto es un sistema de gestión de restaurantes implementado en Java. El sistema utiliza varios patrones de diseño y está organizado en cuatro paquetes principales.

## Parte 1: Ej_1_DelExamen.Entrega_1

### Descripción

Esta parte del proyecto contiene las clases e interfaces que representan diferentes tipos de restaurantes y estrategias de servicio al cliente. Aquí se implementa el patrón de diseño Factory para crear diferentes tipos de restaurantes.

### Clases e Interfaces Principales

- `Restaurant`: Interfaz para diferentes tipos de restaurantes.
- `CustomerServiceStrategy`: Interfaz para diferentes estrategias de servicio al cliente.
- `RestaurantFactory`: Clase Factory para crear diferentes tipos de restaurantes.
- `FastFoodRestaurant`, `ThemedRestaurant`, `LuxuryRestaurant`: Clases que representan diferentes tipos de restaurantes.
- `FastFoodCustomerServiceStrategy`, `ThemedCustomerServiceStrategy`, `LuxuryCustomerServiceStrategy`: Clases que representan diferentes estrategias de servicio al cliente.

## Parte 2: Ej_1_DelExamen.Entrega_2

### Descripción

Esta parte del proyecto contiene las clases e interfaces que representan diferentes componentes de un restaurante, como los clientes y los sistemas externos. Aquí se implementan los patrones de diseño Observer y Composite.

### Clases e Interfaces Principales

- `RestaurantComponent`: Interfaz para diferentes tipos de componentes de un restaurante.
- `Observer`: Interfaz para observadores en el patrón Observer.
- `Subject`: Interfaz para un sujeto que puede notificar a los observadores.
- `ExternalSystemAdapter`: Interfaz para adaptadores de sistemas externos.
- `Customer`, `RestaurantGroup`, `RestaurantWithObserver`, `ReservationSystemAdapter`: Clases que representan diferentes componentes de un restaurante.

## Parte 3: Ej_1_DelExamen.Entrega_3

### Descripción

Esta parte del proyecto contiene las clases e interfaces que representan diferentes comandos y estados de una mesa de restaurante. Aquí se implementan los patrones de diseño Command y State.

### Clases e Interfaces Principales

- `Command`: Interfaz para comandos en el patrón Command.
- `State`: Interfaz para estados en el patrón State.
- `ReserveTableCommand`, `OrderFoodCommand`, `CancelReservationCommand`: Clases que representan diferentes comandos.
- `FreeTableState`, `ReservedTableState`, `OccupiedTableState`: Clases que representan diferentes estados de una mesa de restaurante.

## Parte 4: Ej_1_DelExamen.Entrega_4

### Descripción

Esta parte del proyecto contiene las clases que representan el modelo, la vista y el controlador en el patrón de diseño MVC. Aquí se implementa el patrón de diseño MVC para conectar el modelo y la vista a través del controlador.

### Clases Principales

- `RestaurantModel`: Clase que representa el modelo en el patrón MVC.
- `RestaurantGUI`: Clase que representa la vista en el patrón MVC.
- `RestaurantController`: Clase que representa el controlador en el patrón MVC.

## Instalación y Uso

Aquí puedes proporcionar instrucciones sobre cómo instalar y usar tu programa.

## Contribuciones

Si deseas permitir contribuciones a tu proyecto, puedes proporcionar detalles sobre cómo hacerlo aquí.

## Licencia

Si tu proyecto tiene una licencia, puedes proporcionar detalles sobre la licencia aquí.
