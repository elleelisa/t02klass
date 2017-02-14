public class pyramiid{
  double d, k, h, t;
  public pyramiid(double diameeter,  double korgus, double kkorgus, double tihedus){
    if(diameeter<=0){throw new RuntimeException("Sobimatu Pikkus");}
    if(korgus<=0){throw new RuntimeException("Sobimatu Pikkus");}
    if(kkorgus<=0){throw new RuntimeException("Sobimatu Pikkus");}
    if(tihedus<=0){throw new RuntimeException("Sobimatu Pikkus");}
    d=diameeter;
    k=korgus; //püramiidi kõrgus
    h=kkorgus;
    t=tihedus;
  }
  public double PPindala(){ //Põhja pindala
    return d*d;
  }
  public double PYmbermoot(){
    return 2*(d+d);
  }
  public double KPindala(){ //Külgpindala
    return PYmbermoot()*h/2;
  }
  public double KoguPindala(){
    return PPindala()+KPindala();
  }
  public double Ruumala(){
    return Math.round(PPindala()*k/3);
  }
  public double Mass(){
    return t*Ruumala();
  }
  public String toString(){
  	return "Pyramiid "+d+" x "+d+"m, põhja ümbermõõt "+PYmbermoot()+" m, põhja pindala "+PPindala()+" m2, külgpindala "+KPindala()+" m2, kogupindala "+KoguPindala()+" m2, ruumala "+Ruumala()+" m3 ja mass "+Mass()+"kg/m3.";
	}
}
