/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smms;

/**
 *
 * @author pc
 */
public class AccessStudentCollection {
    private static AccessStudentCollection accessStudentCollection;
    private final StudentCollection studentCollection;
    private AccessStudentCollection() {
        studentCollection=new StudentCollection();
    }
    public static AccessStudentCollection getInstance(){
        if(accessStudentCollection==null){
            accessStudentCollection=new AccessStudentCollection();
        }
        return accessStudentCollection;
    }
    public StudentCollection getStudentCollection(){
        return studentCollection;
    }
}
