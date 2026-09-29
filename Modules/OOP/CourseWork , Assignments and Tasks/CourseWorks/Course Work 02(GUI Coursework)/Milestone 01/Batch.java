public class Batch {
    private int batchId;
    private int studentCount;
    private int status;

    public Batch(int batchId) {
        this.batchId = batchId;
        this.studentCount = 0;
        this.status = 1; 
    }

    public int getBatchId() { 
		return batchId; 
	}
	
    public int getStudentCount() { 
		return studentCount; 
	}
	
    public int getStatus() { 
		return status; 
	}
    
    public void setStatus(int status) { 
		this.status = status; 
	}
	
    public void setStudentCount(int studentCount) { 
		this.studentCount = studentCount; 
	}
}
