class Student{
	
	    private String regNo ;
		private String nic ;
		private String name ;
		private int prf ;
		private int dbms ;
		private int batchNo ;

		public Student(String regNo,String nic,String name,int prf,int dbms,int batchNo){
			this.regNo=regNo;
			this.nic=nic;
			this.name=name;
			this.prf=prf;
			this.dbms=dbms;
			this.batchNo=batchNo;
		}
		
		String getRegNo(){
			return regNo;
		} 
		
		String getNic(){
			return nic;
		} 
		
		String getName(){
			return name;
		} 
		
		int getPrf(){
			return prf;
		} 
		
		int getDbms(){
			return dbms;
		} 
		
		int getBatchNo(){
			return batchNo;
		} 
		
		void setRegNo(String regNo){
			this.regNo = regNo;
		} 
		
		void setNic(String nic){
			this.nic = nic; 
		} 
		
		void setName(String name){
			this.name = name;
		} 
		
		void setPrf(int prf){
			this.prf = prf;
		} 
		
		void setDbms(int dbms){
			this.dbms = dbms;
		} 
		
		int setBatchNo(int batchNo){
			return batchNo;
		} 	
}
