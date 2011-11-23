public class View{
	public static void main(String[] args){
		Employee e= new Employee("budi", 1200000);
		Employee em=new Manager("badrol",1200000,"Informatika");
		
		System.out.println("\tData Employee : \n"+e.getData());
		System.out.println("\tData Manager : \n"+em.getData());
		em.cetak();
	}
}