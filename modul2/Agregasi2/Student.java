package modul.modul2.Agregasi2;

class Student {
    int rno;
    String stName;

    Address stAddr;
    Student(int roll, String name, Address address){
        this.rno=roll;
        this.stName=name;
        this.stAddr=address;
    }
}
