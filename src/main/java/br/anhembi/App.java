package br.anhembi;
import java.util.Scanner;

/**
 * Gerenciador de Fila!
 */
public class App {
    private App() {
    }

    /**
     * Gerenciar filas.
     * @author Guilherme Innocencio/ Guilherme.
     */
    public static void main(String[] args) {
      Scanner e = new Scanner(System.in);
      Client cliente;
      int num;
      boolean valida = false;
      
      ManageAttendance manage = new ManageAttendance(100);
    	
    	
    	do {
    		
    		System.out.println("------------- ESCOLHA UMA OPÇÃO (1 à 5) -----------------------");
        	System.out.println("|       1 – Chegada do cliente na agencia                     |");
        	System.out.println("|       2 – Verificar quem é o próximo a ser atendido         |");
        	System.out.println("|       3 – Atender um cliente                                |");
        	System.out.println("|       4 – Exibir as filas (idoso e não idoso)               |");
        	System.out.println("|       5 – Finalizar o programa                              |");
        	System.out.println("---------------------------------------------------------------");
            num = e.nextInt();
            
            switch(num) {
            case 1: 
            	System.out.println("Nome: ");
            	String nome = e.next();
            	System.out.println("Idade: ");
            	int idade = e.nextInt();
            	cliente = new Client(nome,idade);
            	manage.addClient(cliente);
            	break;
            case 2: 
            	break;
           case 3: 
        	   
        	   
        	   break;
           case 4: System.out.println(manage.showQueues());
        	   
        	   
        	   break;
           case 5:
        	   if(manage.numClients() == 0) {
        		  valida =  true;
        	   }else {
        		   System.out.println("Todos os clientes precisam ser atendidos");
        	   }
        	   break;
        	}
    		
    	}while(!valida);
    	
    	
    	
    	
    e.close();  
    	
    }
}