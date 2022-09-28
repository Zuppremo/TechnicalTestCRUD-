#Instrucciones para correr el proyecto

Primero por razones de tiempo me disculpo, no pude terminar el frontend, sin embargo, pude realizar del backend, El POST, El GET, Y el Delete de las personas, también por un error humano(mio), puse que la identificacion del usuario fuera autoincremental, pero fue más que todo por el tiempo.


Ahora si, para poder hacer uso del proyecto backend, es necesario tener Springboot, y en esta ocasión fue trabajado con Java 17, y fue simulado en un servidor tomcat 10 localmente.

También en la base de datos que sea llamada postgres tener dos tablas, una llamada personas, que va a tener los campos id_persona (integer), nombre_persona(text), nacimiento_persona(date), y una columna de id_pais(integer) que es una llave foranea de la tabla paises, quería agregar la funcionalidad de que se pudiese elegir el pais.

La otra tabla se llama paises y tiene dos columnas id_pais (integer), nombre_pais(text)


Dejaré en el repositorio una carpeta llamada DB, donde se encontrarán los scripts para poder crearlas con el SQL y su ERD

También voy a dejar la colleción de postman y pantallazos de las peticiones corriendo, además de muestra con la conexión a la base de datos





