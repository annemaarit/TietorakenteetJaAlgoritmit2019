import java.util.*;

public class Lukujono {
	
    public long laske(int n) {
		PriorityQueue<Long> luvut = new PriorityQueue<>();
		PriorityQueue<Long> apu2 = new PriorityQueue<>();
		PriorityQueue<Long> apu22 = new PriorityQueue<>();
		PriorityQueue<Long> apu3 = new PriorityQueue<>();
		
		int k=1;
		long tulos=0;
		while (k<=10000){
			tulos=(long)Math.pow(2,k);
			apu2.add(tulos);
			apu22.add(tulos);
			luvut.add(tulos);
			k++;
		}
		
		k=1;
		long luku2=0;
		boolean eka=true;
		while (apu2.isEmpty()==false){
			luku2=apu2.poll();
			tulos=(long)Math.pow(3,k);
			while((tulos<=288555831593533440L)&&(tulos>0)){
				if (eka){
					tulos=(long)Math.pow(3,k);
					luvut.add(tulos);
					apu3.add(tulos);
				}
				tulos=luku2*(long)Math.pow(3,k);
				if (tulos>0){
					luvut.add(tulos);
					apu3.add(tulos);
				}
				k++;
			}
			k=1;
			eka=false;
		}		
		
		k=1;
		long luku3=0;
		eka=true;
		while (apu3.isEmpty()==false){
			luku3=apu3.poll();
			tulos=(long)Math.pow(5,k);
			while((tulos<=288555831593533440L)&&(tulos>0)){
				if (eka){
					tulos=(long)Math.pow(5,k);
					luvut.add(tulos);
				}
				tulos=luku3*(long)Math.pow(5,k);
				if (tulos>0){
					luvut.add(tulos);
				}
				k++;
			}
			k=1;
			eka=false;
		}	
		
		while (n!=1){
			luvut.poll();
			n--;
		}
		
		/*long luku=0;
		long max=(long)Math.cbrt(n)*3;
		long kpl=0;
		//System.out.println("Max: "+max);
		for (long i=0;i<=max*0.4;i++){
			for (long j=0;j<=max;j++){
				for (long k=0;k<=max;k++){
					luku=((long)Math.pow(2,k))*((long)Math.pow(3,j))*((long)Math.pow(5,i));
					if (luku>0){
						luvut.add(luku);
						kpl++;
						//System.out.println("Luku: "+luku);
						if (luku==288325195312500000L){
							System.out.println("BINGO-------------------------------"+kpl);
						}
					}
				}
			}
		}
		
		luvut.poll();
		
		while (luvut.peek()<=0){
			luvut.poll();
		}
		
		while (n!=1){
				luvut.poll();
				n--;
		}*/
		
		/*
		long luku=0;
		int max=(int)Math.cbrt(n)*3;
		System.out.println("Max: "+max);
		for (int i=0;i<=max;i++){
			for (int j=0;j<=max;j++){
				for (int k=0;k<=max;k++){
					luku=((long)Math.pow(2,k))*((long)Math.pow(3,j))*((long)Math.pow(5,i));
					if (luku>0){
						luvut.add(luku);
					}
				}
			}
		}
		
		luvut.poll();
		
		while (n!=1){
			luvut.poll();
			n--;
		}
		*/
		
		/*
		long k=0;
		long j=0;
		long i=0;
		long kpl=0;
		long luku,luku3,luku5=0;
		do{
			luku5=((long)Math.pow(2,k))*((long)Math.pow(3,j))*((long)Math.pow(5,i+1));  //5
			System.out.println("Luku5: "+luku5);
			do{
				luku3=((long)Math.pow(2,k))*((long)Math.pow(3,j+1))*((long)Math.pow(5,i)); //9
				System.out.println("Luku3: "+luku3);
				do{
					luku=((long)Math.pow(2,k))*((long)Math.pow(3,j))*((long)Math.pow(5,i)); //3
					luvut.add(luku); //1,2,4,3,6,12
					System.out.println("Add: "+luku);
					kpl++;
					k++; //1,2
				}while(luku<=luku3);
				j++; //1
				k=0;
			}while(luku3<=luku5);
			i++;
			j=0;
		}while(kpl<n);
			
		luvut.poll();
		
		while (n!=1){
			luvut.poll();
			n--;
		}
		*/
		return luvut.poll();
    }
}