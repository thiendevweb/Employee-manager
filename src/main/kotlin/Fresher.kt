class Fresher constructor() : Employee() {
    private var Graduation_date : String;
    private var Graduation_rank : String;
    private var Education : String;
    init {
        this.Graduation_date = "";
        this.Graduation_rank = "";
        this.Education = "";
    }
//    constructor(ID : String,FullName: String,BirthDay: String,Phone: String,Email: String,Employee_type: Int,Graduation_date : String,Graduation_rank : String,Education : String) : super(ID, FullName, BirthDay, Phone, Email, Employee_type){
//        this.Graduation_date = Graduation_date;
//        this.Graduation_rank = Graduation_rank;
//        this.Education = Education;
//    }
    fun setGraduation_date(Graduation_date : String){
        this.Graduation_date = Graduation_date;
    }
    fun setGraduation_rank(Graduation_rank : String){
        this.Graduation_rank = Graduation_rank;
    }
    fun setEducation(Education : String){
        this.Education = Education;
    }
    fun getGraduation_date() : String {
        return this.Graduation_date;
    }
    fun getGraduation_rank() : String {
        return this.Graduation_rank;
    }
    fun getEducation() : String {
        return this.Education;
    }

    public override fun showMe() {
        println("Graduation_date: ${this.Graduation_date}");
        println("Graduation_rank: ${this.Graduation_rank}");
        println("Education: ${this.Education}");
    }

    public override fun ShowINfo() {
        super.ShowINfo();
        this.showMe();
    }

    public override fun Input() {
        println("Fresher enter: ");
        super.Input()
        print("Graduation date enter: ");
        this.Graduation_date = readLine()!!;
        print("Graduation rank enter: ");
        this.Graduation_rank = readLine()!!;
        print("Education enter: ");
        this.Education = readLine()!!;
    }
}