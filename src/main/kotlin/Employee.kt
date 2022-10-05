open abstract class Employee constructor(){
    protected var ID : String;
    protected var FullName : String;
    protected var BirthDay : String;
    protected var Phone : String;
    protected var Email : String;
    protected var Employee_type : Int;
    protected var listCertificate : ArrayList<Certificate>;

    companion object Count{
        var Employee_count : Int = 0;// object companion of class giống như 1 thành viên tĩnh của 1 lớp, nó là thành viên chung của 1 class chứ kh phải riêng của 1 object
    }

    init {
        this.ID = "";
        this.FullName = "";
        this.BirthDay = "";
        this.Phone = "";
        this.Email = "";
        this.Employee_type = 0;
        this.listCertificate = ArrayList<Certificate>();
        Employee.Employee_count++;
    }

//    constructor(ID : String,FullName: String,BirthDay: String,Phone: String,Email: String,Employee_type: Int) : this(){
//        this.ID = ID;
//        this.FullName = FullName;
//        this.BirthDay = BirthDay;
//        this.Phone = Phone;
//        this.Email = Email;
//        this.Employee_type = Employee_type;
//    }
    @JvmName("setID1")
    fun setID(ID : String) : Unit{
        this.ID = ID;
    }
    @JvmName("setFullname")
    fun setFullName(FullName : String){
        this.FullName = FullName;
    }
    @JvmName("setBirthDay1")
    fun setBirthDay (BirthDay : String){
        this.BirthDay = BirthDay;
    }
    @JvmName("setPhone1")
    fun setPhone(Phone : String) {
        this.Phone = Phone;
    }
    @JvmName("setEmail1")
    fun setEmail(Email : String){
        this.Email = Email;
    }
    @JvmName("setEmployee_type1")
    fun setEmployee_type (Employee_type : Int){
        this.Employee_type = Employee_type;
    }
    @JvmName("getID1")
    fun getID() : String {
        return this.ID;
    }
    @JvmName("getFullName1")
    fun getFullName () :String {
        return this.FullName;
    }
    @JvmName("getBirthDay1")
    fun getBirthDay() : String {
        return this.BirthDay;
    }
    @JvmName("getPhone1")
    fun getPhone () : String {
        return this.Phone;
    }
    @JvmName("getEmail1")
    fun getEmail() : String {
        return this.Email;
    }
    @JvmName("getEmployee_type1")
    fun getEmployee_type() : Int {
        return this.Employee_type;
    }

    fun getlistCertificate() : ArrayList<Certificate> {
        return this.listCertificate;
    }
    protected abstract fun showMe();
    protected open fun Input() : Unit {
        print("ID enter: ");
        this.ID = readLine()!!;
        print("Full name enter: ");
        this.FullName = readLine()!!;
        print("Birth day enter: ");
        this.BirthDay = readLine()!!;
        print("Phone number enter: ");
        this.Phone = readLine()!!;
        print("Email enter: ");
        this.Email = readLine()!!;
//        print("Employee type enter: ");
//        this.Employee_type = readLine()!!.toInt();
        println("Information of list Certificate enter...");
        print("Amount of certificate enter: ");
        for (i in 1..readLine()!!.toInt()){
            var tempCer = Certificate();
            tempCer.Input();
            this.listCertificate.add(tempCer);
        }
    }
    protected open fun ShowINfo() : Unit {
        println("ID: ${this.ID}");
        println("Full name: ${this.FullName}");
        println("Birth day: ${this.BirthDay}");
        println("Phone number: ${this.Phone}");
        println("Email: ${this.Email}");
        println("Type: ${this.Employee_type}");
        println("Information of Certificates:");
        for (i in this.listCertificate)
            i.showInfor();
    }
}