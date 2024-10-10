/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package executorService;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 *
 * @author FP
 */
public class Principal {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        //declro e instancio ala executorService
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        //preparo una coloeccion de objetos callable 
        //que habran cada uno en una cosa
        Set<Callable<String>> callables = new HashSet<Callable<String>>();

        //añado los objetosa la cola 
        //cada uno con su operacion 
        callables.add(new Callable<String>() {
            public String call() throws Exception {
                return "tarea 1";
            }
        });
        callables.add(new Callable<String>() {
            public String call() throws Exception {
                return "tarea 2";
            }
        });
        callables.add(new Callable<String>() {
            public String call() throws Exception {
                return "tarea 3";
            }
        });
        
        //declaro la lista d obejetos future 
        // y utilizo el metodo de llamar a todos 
        
        java.util.List<Future<String>> futures = executorService.invokeAll(callables);
        
        //recojo las soluciones de cada uno de los objetos future 
        for (Future<String> future : futures){
            System.out.println("futute.get = "+future.get());
        }
        
        //hay que terminar el proceso siempre 
        executorService.shutdown();

    }
}
