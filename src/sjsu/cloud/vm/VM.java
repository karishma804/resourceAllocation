package sjsu.cloud.vm;

import java.text.NumberFormat;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Locale;

public class VM {
	 private HashMap<String, String> vm;
	   
	    public static NumberFormat tidy = NumberFormat.getCurrencyInstance(Locale.US);
	    public VM(String ID, String name, String mem, String core, String storage, String bit, String cost)
	    {
	        vm = new HashMap<String, String>();
	       
	        vm.put("ID", ID);
	        vm.put("name", name);
	        vm.put("memory", mem);
	        vm.put("cores", core);
	        vm.put("storage", storage);
	        vm.put("bits", bit);
	        vm.put("cost", cost);
	    }
	   
	    public Double getID()
	    {
	        return Double.parseDouble((String) vm.get("ID"));
	    }
	    public String getName()
	    {
	        return (String) vm.get("name");
	    }
	   
	    public Double getMemory()
	    {
	        return Double.parseDouble((String) vm.get("memory"));
	    }
	   
	   
	    public Double getCores()
	    {
	        return Double.parseDouble((String) vm.get("cores"));
	    }
	   
	   

	    public Double getStorage()
	    {
	        return Double.parseDouble((String) vm.get("storage"));
	    }
	   
	    public Double getBits()
	    {
	        return Double.parseDouble((String) vm.get("bits"));
	    }
	   
	   
	    public Double getCost()
	    {
	        return Double.parseDouble((String) vm.get("cost"));
	    }
	   

	    public void printVM()
	    {
	        System.out.print("ID\tName\tMemory\tCores\tStorage\tBits\tCost\n");
	        System.out.print(getID() +"\t");
	        System.out.print(getName() +"\t");
	        System.out.print(getMemory() +"\t");
	        System.out.print(getCores() +"\t");
	        System.out.print(getStorage() +"\t");
	        System.out.print(getBits() +"\t");
	        System.out.print(tidy.format(getCost()) +"\n");
	       
	    }
	    
		public static Comparator<VM> VMCostComparator = new Comparator<VM>() {
			public int compare(VM VM1, VM VM2) {
				if (VM1.getCost() < VM2.getCost()) return -1;
		        if (VM1.getCost() > VM2.getCost()) return 1;
		        
		        return 0;
			}
		
		};

}
