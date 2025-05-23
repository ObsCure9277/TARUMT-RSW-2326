public class House implements Cloneable, Comparable{
	private int id;
	private double area;
	private java.util.Date whenBuilt;

  public House(int id, double area) {
    this.id = id;
    this.area = area;
    whenBuilt = new java.util.Date();
  }
    
  public int getId(){
   	return id;
  }
    
  public double getArea(){
   	return area;
  }
    
  public java.util.Date getWhenBuilt(){
   	return whenBuilt;
  }
    
  /** Override the protected clone method defined in the Object class, and 
      strengthen its accessibility */
  public Object clone(){
   	try{
   		return super.clone();
   	}
   	catch (CloneNotSupportedException ex){
   		return null;
   	}
  }
    
  /** Implement the compareTo method defined in Comparable */
  public int compareTo(Object o){
   	if (area > ((House)o).area)
   		return 1;
   	else if (area < ((House)o).area)
   		return -1;
   	else 
    	return 0;	
  }    
}