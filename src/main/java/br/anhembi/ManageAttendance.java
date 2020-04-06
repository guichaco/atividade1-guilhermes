package br.anhembi;

/**
 * ManageAttendance
 */
public class ManageAttendance {
	Queue filas;
    public ManageAttendance(int size) {
    	
    	 filas = new Queue(size);
     }

    public boolean isEmpty() {
        if(filas.size()<=0) {
    	return true;
        }else {
        	return false;
        }
        }

    public void addClient(Client client) {

    	filas.enqueue(client);
    }

    public Client showNext() {
        return null;
    }

    public Client getNext() {
        return null;
    }

    public String showQueues() {
        return null;
    }

    public int numClients() {
        return 0;
    }

    public int numElderlyClients() {
        return 0;
    }
}
