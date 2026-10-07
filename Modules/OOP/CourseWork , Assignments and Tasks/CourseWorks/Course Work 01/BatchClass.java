class Bacth{
	
    private int ENROLLMENTOPEN = 1;
    private int ENROLLMENTCLOSED = 0;
	
    private int batchName ;
    private int batchStatus ;
    
    Bacth(int batchName,int batchStatus){
		this.batchName = batchName;
		this.batchStatus = batchStatus;
	}
	
	int getBatchName(){
		return batchName;
	}
	
	int getBatchStatus(){
		return batchStatus;
	}
	
}
