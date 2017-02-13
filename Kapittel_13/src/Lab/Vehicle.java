package Lab;

public abstract class Vehicle {
	 private String color = "white";
	  private String name;
	  private double pris;
	  private long serienummer;
	  private double hastighet;
	  private double retning;
	  private java.util.Date dateCreated;
	  
	  protected Vehicle (){
		  dateCreated= new java.util.Date();
		  
	  }
	   protected Vehicle (String color, String name, double pris, long serienummer, double hastighet,double retning){
	   dateCreated = new  java.util.Date();
	   this.color = color;
		  this.name = name;
		  this.pris = pris;
		  this.serienummer = serienummer;
		  this.hastighet = hastighet;
		  this.retning = retning; 
	   }
	   
	   public String getColor(){
		   return color;
	   }
	   public void setColor (String color){
		   this.color = color;
	   }
	   public String getName(){
		   return name;
	   }
	   public void setName(String name){
		   this.name=name;
	   }
	   public double getPris(){
		   return pris;
	   }
	   public void setPris(double pris){
		   this.pris=pris;
	   }
	   public long getSerienummer(){
		   return serienummer;
	   }
	   public void setSerienummer(long serienummer){
		   this.serienummer= serienummer;
	   }
	   public double getHastighet (){
		   return hastighet;      
	  }
	   public void setHastighet(double hastighet) {
			this.hastighet = hastighet;
	   }
	public double getRetning() {
		return retning;
	}
	
	public void setRetning(double retning) {
		this.retning = retning;
	}
	
	public java.util.Date getDateCreated() {
		return dateCreated;
	}
	
	public void setDateCreated(java.util.Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	 
	@Override
	public String toString(){
		return "created on " + dateCreated + "\nname: " + name + "\npris:"
				+ pris + "\nserienummer: " + serienummer + "\nhastighet: " + hastighet 
				+ "\nretning: " + retning;
	}
	public  void setAllfields(){
	this.setAllfields();
	}
	public abstract void turnLeft(int degrees){
		
	}
	
		
	}
	
	}
		  


