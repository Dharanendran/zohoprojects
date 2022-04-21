package enumtask;

public class EnumTest {

enum SuperMarket{
	BRUSH(20) , SOAP(30) , BUCKET(100) , BISCUIT(10) , BREAD(25) ;
	int rupees ;

	SuperMarket(int rupees) {
		this.rupees = rupees ;

	}
}

public static void main(String[] args) {
	
	for(SuperMarket i :SuperMarket.values()) {
		System.out.println(i +"-"+i.rupees +"rs");
	}
	
	}
}
