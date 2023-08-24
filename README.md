﻿# Ejercicio-2-ArreglosObjetos-Hotel
DESARROLLO EN JAVA JDK 17 LTS

Estas desarrollando un programa para gestionar las reservas de habitaciones en un hotel. El hotel tiene diferentes tipos de habitaciones: estándar, Deluxe y suite. Cada habitación tiene un número único, capacidad máxima de ocupantes (los niños y adultos se consideran ocupantes, sin importar la edad),  y precio por noche.
Debes crear un programa que permita a los clientes reservar una habitación, y a los empleados asignar las habitaciones disponibles, según las reservas entrantes. Existen las siguientes restricciones:
-	Las habitaciones Estándar pueden ser reservadas por cualquier cliente.
-	Las habitaciones Deluxe pueden ser reservadas por clientes frecuentes.
-	Las Suites solo pueden ser reservadas por clientes VIP. 

Al iniciar el sistema, se deben ingresar los datos de mínimo 3 habitaciones que esperan se encuentran disponibles para ser reservadas. Deben tener la opción de recibir huésped, que debe permitir ingresar los datos del cliente que desea realizar la reservación. También debe tener otra opción de asignar cliente a habitación; en esta, se debe verificar que se cumplan las reglas que tiene el hotel. Si no es posible ubicar al huésped, se le habilita un espacio en lista de espera.
Los clientes se clasifican de la siguiente forma:
•	Regulares, si visitan por primera vez o han visitado el hotel menos de 5 veces.
•	Frecuentes, que hayan visitado el hotel 5 a 10 veces.
•	VIP, que han visitado el hotel 10 veces o más. 
