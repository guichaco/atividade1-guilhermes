package br.anhembi;

/**
 * Client
 */
public class Client {

    private String name;
    private int age;
    
    public Client() {}

    public Client(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
    	return name;
    }
    
    public int getAge() {
    	return age;
    }
    
    public boolean getElderly() {
    	if(age <= 18) {
    		return true; 
    	}else {
    		return false;
    	}
    	
    }
    
    

    public String toString() {
        return "Name:" + name + ", Age:" + age;
    }
}
