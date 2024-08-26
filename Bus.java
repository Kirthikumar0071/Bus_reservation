package training;

public class Bus {
	 private int BusNo;
   private  boolean AC;
   private  int Capacity;
     
     Bus(int no,boolean ac,int cap){
    	 this.BusNo=no;
    	 this.AC=ac;
    	 this.Capacity=cap;
     }
     
     public int getBusNo() {
    	 return BusNo;
     }
     
     public int  getCapacity(){//accessor
    	 return Capacity;
     }
     public boolean isAC() {
    	 return AC;
     }
     
     public void setCapacity(int cap) {//mutator
    	 Capacity=cap;
     }
     public void setAC(boolean ac) {
    	 AC=ac;
     }
     
   public void  displayBusInfo(){
	   System.out.println("Bus no:"+BusNo+ "AC:"+AC+ "Total capacity:"+Capacity);
    	 
     }
	//public static void main(String[] args) {
		// TODO Auto-generated method stub
       
	//}

}
