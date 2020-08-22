# Prueba Location

### Aplicacion 

Es una api restful que contiene el crear, actualizar, listar y eliminar una location comprendida
con un nombre y un area m2.

#### Funcionamiento en Angular

##### Listar locations
Se muestran el listado de locations, en este momento solo existe una que se deja inicial para
verificar que funciona correctamente.
![Alt text](https://github.com/afrancom2/spring-app-location/blob/master/listar.png "Listar locations")

##### Crear location
Se muestra para crear una location, con su nombre y area m2
![Alt text](https://github.com/afrancom2/spring-app-location/blob/master/Crear.png "Crear location")

##### Editar o actualizar location
Se muestra para actualizar una location, con su nombre y area m2 cargados y listos para editar
![Alt text](https://github.com/afrancom2/spring-app-location/blob/master/editar.png "Editar o actualizar location")

##### Eliminar location
Se muestra un botón para eliminar location y su respectiva confirmación
![Alt text](https://github.com/afrancom2/spring-app-location/blob/master/Eliminar.png "Eliminar location")
![Alt text](https://github.com/afrancom2/spring-app-location/blob/master/Confirmareliminar.png "Confirmacion Eliminar location")

## Notas importantes
Lastimosamente no he manejado docker para los proyectos, por lo tanto no logre persistir la base
 de datos y se debe crear en MySql que es el motor que elegí.

## Creación de base de datos
Solamente se debe crear la base de datos con el nombre db_prueba.
 Comando: create database db_prueba;

## Clave de usuario root de MySql
Las claves del usuario root se pueden cambiar en la siguiente ubicación del proyecto de Spring Boot
 src/main/resources -> application.properties -> spring.datasource.password
 En mi caso tengo 1012, pero se debe colocar la contraseña correspondiente

## Clonar y ejecutar

- Realizar git clone del repositorio en cualquier carpeta.
- Abrir proyecto con spring tools suite.
- Abrir MySql WorkBrench y logearse con usuario root y la contraseña respectiva
- Ejecutar aplicación en spring tools suite: spring-boot-backend-apirest-fullstack
- Seguir con las instrucciones del repositorio de angular
