class TrigTableDeg {

	public static void main (String args[]){
		double c,s,t;
		int d =0;
		double r=0, rround =0, cround =0, sround =0, tround =0;
		double pi=3.14159265358979323846;
		int i = 15;
		String undefined = "UN";
		System.out.println("radian measurement is represented as rad");
		System.out.println("\t\t|rad \t	|cos\t|sin\t|tan");
		while (d <=360){
			//convert angle t to radians r
			r= d * (pi/180.0);
			c= Math.cos(r);
			s= Math.sin(r);
			t= Math.tan(r);
			rround = (Math.round(r*1000.0))/1000.0;
			cround = (Math.round(c*1000.0))/1000.0;
			sround = (Math.round(s*1000.0))/1000.0;
			tround = (Math.round(t*1000.0))/1000.0;
			
			if (cround == 0.0)
				{ System.out.println("\t\t|"+d+"\t\t|"+cround+"\t\t|"+sround+"\t\t|"+"UN");
				}else{
					System.out.println("\t\t|"+d+"\t\t|"+cround+"\t\t|"+sround+"\t\t|"+tround);
				}
			
			d = d + i;
		}
	}
}
