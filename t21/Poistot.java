public class Poistot {
    int laske(int[] t) {
		int koko=t.length-1;
		int kpl=0;
		if (koko>0){
			int i=0;
			int j=1;
			int ed=-1;
			int[] edelliset=new int[koko];
			boolean loppu=false;
			
			while (loppu!=true){
				//System.out.println("i: "+i+"j: "+j+"ed: "+ed);
				if (t[i]==t[j]){
					t[i]=-1;
					t[j]=-1;
					//System.out.println(" poisto ");
					if (ed==-1){
						if (koko>i+2){
							i+=2;
							j=i+1;
						} else {
							loppu=true;
						}
					} else {
						if (koko>=j+1){
							i=edelliset[ed];
							if (ed>0){
								ed--;
							}
							j++;
						} else {
							loppu=true;
						}
					}
				} else {
					if (koko>=j+1){
						ed++;
						edelliset[ed]=i;
						i=j;
						j++;
					} else {
						loppu=true;
					}
				}
			}
			
			for (int x=0;x<=koko;x++){
				if (t[x]!=-1){
					kpl++;
				}
			};
		} else {
			kpl=1;
		}

		return kpl;
			
    }    
}

/*
    int laske(int[] t) {

        int k = -1;

        for (int i = 0; i < t.length; i++) {

            if (k != -1 && t[k] == t[i]) {

                k--;

            } else {

                t[++k] = t[i];

            }

        }

        return k+1;

    }    
*/