
# Cleaning Robot - Java

Este proyecto sigue los principios de **Arquitectura Hexagonal** y **Domain-Driven Design (DDD)**:

### **Dominio**
En la capa de dominio se definen los modelos principales:
- `CleaningRobot`, `Position`, `Grid`, `Orientation`.  
  Los nombres de estos modelos han sido tomados directamente de las especificaciones. Aquí también se encuentra toda la lógica de negocio, concentrada en el dominio en lugar de los servicios, los cuales están definidos de manera sencilla y concisa.

### **Aplicación**
La capa de aplicación se encarga de la orquestación de las operaciones:
- `InstructionProcessor`: Actúa como intermediario entre las instrucciones y el robot. Aunque es útil, podría ser prescindible en un enfoque más simple.
- `CleaningRobotService`: Es el componente encargado de obtener las instrucciones iniciales y procesar todos los movimientos y giros del robot.

### **Infraestructura**
La capa de infraestructura maneja la entrada de datos:
- `ConsoleAdapter`: Se encarga de recibir los datos iniciales y los movimientos del robot desde la entrada estándar (pantalla).


### Run
Para ejecutar el programa, simplemente ejecutar el archivo `App.java`. 
### **Tests**
Dado que la lógica es relativamente sencilla, he optado por crear dos pruebas unitarias:
1. Una prueba para verificar los giros y movimientos del robot.
2. Otra prueba que utiliza los datos proporcionados en el PDF, actuando más como una prueba de extremo a extremo (E2E).
