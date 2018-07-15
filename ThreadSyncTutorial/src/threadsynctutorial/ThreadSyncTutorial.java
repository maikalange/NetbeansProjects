/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadsynctutorial;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author MARCUS
 */
public class ThreadSyncTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Account account = new Account();
        AddPennyTask task  = new AddPennyTask(account);
        
        ExecutorService es = Executors.newCachedThreadPool();
        
        for (int i = 0; i < 100; i++) {
            es.execute(task);
        }
        es.shutdown();
        
        while(!es.isTerminated()){
            
        }
        System.out.println(account.getBalance());
    }
    
}
