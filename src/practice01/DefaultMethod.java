package practice01;

import practice01.interfaces.DefaultExample;
import practice01.interfaces.LambdaWithParameter;
import practice01.interfaces.LambdasUno;
import practice01.interfaces.LambdasWithTwoParameters;

public class DefaultMethod implements DefaultExample {

    public static void main(String[] args) {
        //new DefaultMethod().start("Ahora el mensaje viene desde la misma clase");

        // Functional lambdas
        LambdasUno lambdasUno = () -> System.out.println("Estes es mi primer mensaje funcional.");
        lambdasUno.showMessage();

        // Implementacion con cuerpo del lambdas
        LambdasUno otraImpl = () -> {
            System.out.println("Esta es la otra implementacion.");
        };
        otraImpl.showMessage();

        LambdaWithParameter lambdaWithParameter = (message) -> message;
        String message = lambdaWithParameter.returnMessage("Este es un mensaje con parámetros desde el lambdas.");
        System.out.println(message);

        LambdasWithTwoParameters lambdasWithTwoParameters = (a, b) -> {
            return a + b;
        };
        Integer operationResult = lambdasWithTwoParameters.operation(20, 20);
        System.out.println("El resultado es: "+ operationResult);

        LambdasWithTwoParameters lambdasWithTwoParameters2 = Integer::sum;
        Integer operationResult2 = lambdasWithTwoParameters.operation(20, 20);
        System.out.println("El resultado es: "+ operationResult2);
    }
}
