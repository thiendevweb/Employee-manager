class Intern constructor() : Employee() {
    private var Majors : String;
    private var Semester : String;
    private var University_name : String;
    init {
        this.Majors = "";
        this.Semester = "";
        this.University_name = "";
    }
//    constructor(ID : String,FullName: String,BirthDay: String,Phone: String,Email: String,Employee_type: Int,Majors : String,Semester : String,University_name : String) : super(ID, FullName, BirthDay, Phone, Email, Employee_type) {
//        this.Majors = Majors;
//        this.Semester = Semester;
//        this.University_name = University_name;
//    }
    fun setMajors(Majors : String) {
        this.Majors = Majors;
    }
    fun setSemester(Semester : String){
        this.Semester  = Semester;
    }
    fun setUniversity_name (University_name : String) {
        this.University_name = University_name;
    }
    fun getMajors() : String {
        return this.Majors;
    }
    fun getSemester () :String {
        return this.Semester;
    }
    fun getUniversity_name () : String {
        return this.University_name;
    }

    public override fun showMe() {
        println("Majors: ${this.Majors}");
        println("Semester: ${this.Semester}");
        println("University_name: ${this.University_name}");
    }

    public override fun ShowINfo() {
        super.ShowINfo();
        this.showMe();
    }

    public override fun Input() {
        println("Intern enter: ");
        super.Input()
        print("Majors enter: ");
        this.Majors = readLine()!!;
        print("Semester enter: ");
        this.Semester = readLine()!!;
        print("University name enter: ");
        this.University_name = readLine()!!;
    }
}