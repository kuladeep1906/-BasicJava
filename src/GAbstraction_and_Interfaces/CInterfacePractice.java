package GAbstraction_and_Interfaces;


interface member{
	void call();
}

class store{
	member m[]=new member[100];
	int count =0;
	
	void register(member n) {
		m[count++]=n;
	
	}
	
	void festiveOffer() {
		for (int i=0;i<count;i++) {
			m[i].call();
		
		}
	}
}

class customer implements member{
	String name;
	customer(String n){
		name=n;	
	}
	
	@Override
	public void call() {
		System.out.println("I will visit: " + name);   
	}
	
}



public class CInterfacePractice {
	
	public static void main(String[] args) {
		store s=new store();
		customer c1= new customer("kuladeep");
		customer c2= new customer("mahendra");
		s.register(c1);
		s.register(c2);
		s.festiveOffer();
	}
	
	

}
