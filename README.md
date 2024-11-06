# miPortfolio-BackEnd

IMPORTANTE: El codigo actualizado esta en la rama MASTER

Si no carga ningún dato en la pagina carga esta URL en el navegador: https://portfolio-jqa0.onrender.com. Esto es por que Render se apaga si esta mucho tiempo inactivo entonces debemos activar el servidor

Como iniciar si la base de datos esta vacia? 

Debe ejecutar ir al siguente url: 'apiUrl'/portfolio/cargar
Esta url cargara todos los datos de prueba, mostrando mi portfolio. Si la url se ejecuta dos veces entonces van a ver duplicados. 

Luego se puede ver la API de forma normal con todos los datos cargados. 

Problemas para deploy
Aplicacion Web funciona bien de forma local pero al hacer el deploy online por medio de render, firebase y clever-cloud se presentan problemas:
render no inicia: se muestra el mensaje "Started PortfolioApplication in 192.493 seconds (JVM running for 209.888)" pero se queda en "in progress". 
En ese estado al intentar realizar un request por medio de Postman dice "502 Bad Gateway" y luego la conexion de render falla. 
En consecuencia no pude probar el render para ver detectar si hay mas errores. La configuracion del front esta realizada por lo que si intentan iniciar el render
y les funciona entonces en teoria no tendran problemas con el resto. Muchas gracias. 

atte: Franco Ruiz 



