
public class Roomcalculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = new int[5];
		int repeat = 0;	
		
		Room[] rooms = new Room[5];

		for(int i = 0 ; i < 5 ; i++ ) {rooms[i] = new Room();}
		
		array[0] = (int)(Math.random()*1000+1);
		for(int i = 1 ; i<5 ; i++){do {
				repeat = 0;
				array[i]=(int)(Math.random()*1000+1);
				for(int j = 0 ; j < i ; j++ ){if(array[j]==array[i]){ repeat++ ;}}
			}while(repeat !=0);}
		 
		for(int i = 0 ; i<5 ; i++){rooms[i].setnumber(array[i]);
								   System.out.printf("Room #%d was created!\n",array[i]);}
		
		System.out.println("");
		System.out.printf("房間編號  #%d ,共%d元\n",rooms[0].getnumber(),(int)rooms[0].calculate(2));
		System.out.printf("房間編號  #%d ,共%d元\n",rooms[1].getnumber(),(int)rooms[1].calculate(3,4));
		System.out.printf("房間編號  #%d ,共%d元\n",rooms[2].getnumber(),(int)rooms[2].calculate(3,2,true));
		System.out.printf("房間編號  #%d ,共%d元\n",rooms[3].getnumber(),(int)rooms[3].calculate(2,3,true,true));
		System.out.printf("房間編號  #%d ,共%d元\n",rooms[4].getnumber(),(int)rooms[4].calculate(4,4,false,false));
	}

}
