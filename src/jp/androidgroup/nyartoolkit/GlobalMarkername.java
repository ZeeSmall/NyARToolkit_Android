package jp.androidgroup.nyartoolkit;

public class GlobalMarkername {
	
	private static int MarkerID;
	
	public GlobalMarkername() {
		
	}
	
	public void SetData(int marlerid){
		MarkerID = marlerid;
	}
	
	public int GetData(){
		return MarkerID;
	}
	
}