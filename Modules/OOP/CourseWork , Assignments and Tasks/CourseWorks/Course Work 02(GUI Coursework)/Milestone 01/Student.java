public class Student {

    private String id;
    private String name;
    private String nic;
    private int prfMarks;
    private int dbmsMarks;

   
    public Student(String id, String name, String nic, int prfMarks, int dbmsMarks) {
        this.id = id;
        this.name = name;
        this.nic = nic;
        this.prfMarks = prfMarks;
        this.dbmsMarks = dbmsMarks;
    }

        public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getNic() {
        return nic;
    }

    public int getPrfMarks() {
        return prfMarks;
    }

    public int getDbmsMarks() {
        return dbmsMarks;
    }
}
