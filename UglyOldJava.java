import java.util.List;
import java.util.ArrayList;

class UglyOldJava{
	public List<String> getItems(){
		List list = new ArrayList<String>();
		for(int i=0; i<10; i++){
			list.add("Item " + i);
		}
		return list;
	}
	public static void main(String[] args){
		System.out.println( new UglyOldJava().getItems());
	}
}