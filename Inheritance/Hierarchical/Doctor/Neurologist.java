package Doctor;

public class Neurologist extends Doctor{
    String spl;
    String organ;
     public Neurologist(){}

     Neurologist( String name,double fee,String degree,int exp,String hospital,String spl,String organ){

        this.name=name;
        this.fee=fee;
        this.degree=degree;
        this.exp=exp;
        this.hospital=hospital;

        this.spl=spl;
        this.organ=organ;
     }
     public void displayNeurologist(){
        displayDoctor();
        System.out.println(spl);
        System.out.println(organ);
        
     }

    
}
