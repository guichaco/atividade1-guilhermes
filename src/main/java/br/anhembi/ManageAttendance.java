package br.anhembi;

/**
 * ManageAttendance
 */
public class ManageAttendance {
	
	Queue filaNormal;
	Queue filaIdoso;
	int cont;
    public ManageAttendance(int size) {
    	
    	filaNormal = new Queue(size);
    	filaIdoso  = new Queue(size);
     }

    public boolean isEmpty() {
        if(filaNormal.size()<=0) {
    	return true;
        }else if(filaIdoso.size()<=0){
        	return true;
        }else {
        	return false;
        }
        }

    public void addClient(Client client) {

    	if(client.getAge() > 60) {
    		filaIdoso.enqueue(client);
    	}else {
    		filaNormal.enqueue(client);	
    	}
    	
    }

    public Client showNext() {
    	Queue fila = null;
    	if (0 < 2 && !filaIdoso.isEmpty()) {
            fila.enqueue(filaIdoso.peek());
        } else {
            if (!filaNormal.isEmpty()) {
                fila.enqueue(filaNormal.peek());
            }
        }
    	
    	return fila.peek();
    
    }

    public Client getNext() {
        
    	
    	return null;
    }

    public String showQueues() {
    	
     return "Normal: " + filaNormal.show() + "\nIdoso: " + filaIdoso.show();
 	
    }

    public int numClients() {
        return filaNormal.size() + filaIdoso.size();
    }

    public int numElderlyClients() {
    	
    	 return filaIdoso.size();
    }
    
   
}