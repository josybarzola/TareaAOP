# TareaAOP

# AOP VS POO en Adapter
- En la intención de obtener un círculo circunscrito para la base de todo tipo de prisma, como fue en este caso de uno triangular, AOP tiene la limitación que no se permita aplicar un método de adapatación a una figura distinto a un cilindro, en un mismo aspecto sin importar el tipo. Esto por no poder recibir otro parámetro distinto al de Cilindro en el método cabe().
- AOP beneficia en el sentido de verificar que el código cumple con su funcionalidad, como pasó para comprobar que del prisma se pueda obtener su círculo circunscrito.

# AOP VS POO en Singleton: 
- AOP beneficia al hecho de no repetir código, puesto que el pointcut getInstance()apunta a un mismo método alrededor del código como pasó con getInstance() de la clase AdministradorRecursos. Esto referido a los cross-cutting concerns frente a POO.
- AOP presenta la limitación de no poder ejecutar una estructura de control que haga uso de una variable de clase. Con especial énfasis con el patrón de diseño Singleton; donde se tiene una variable estática privada, al momento de comprobar si esta tenía un valor nulo.