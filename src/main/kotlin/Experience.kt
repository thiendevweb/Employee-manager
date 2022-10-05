class Experience constructor() : Employee(){
    private var ExpInYear : Int;
    private var ProSkill : String;
    init {
        this.ExpInYear = 0;
        this.ProSkill = "";
    }

//    constructor(ID : String,FullName: String,BirthDay: String,Phone: String,Email: String,Employee_type: Int,ExpInYear : Int,ProSkill : String) : super(ID, FullName, BirthDay, Phone, Email, Employee_type) {
//        this.ExpInYear = ExpInYear;
//        this.ProSkill = ProSkill;
//    }
    fun setExpInYear(ExpInYear : Int){
        this.ExpInYear = ExpInYear;
    }
    fun setProSkill(ProSkill : String){
        this.ProSkill = ProSkill;
    }
    fun getExInYear() : Int{
        return this.ExpInYear;
    }
    fun getProSkill() : String{
        return  this.ProSkill;
    }

    public override fun showMe() {
        println("Exp in year: ${this.ExpInYear}");
        println("Pro skill: ${this.ProSkill}");
    }

    public override fun ShowINfo() {
        super.ShowINfo();
        this.showMe();
    }

    public override fun Input() {
        println("Experience enter:");
        super.Input()
        print("Exp In Year enter: ");
        this.ExpInYear = readLine()!!.toInt();
        print("Pro Skill enter: ");
        this.ProSkill = readLine()!!;
    }
}