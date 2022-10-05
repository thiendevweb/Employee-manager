class Certificate constructor(){
    private var CertificatedID : String;
    private var CertificateName : String;
    private var CertificateRank : String;
    private var CertificatedDate : String;
    init {
        this.CertificatedID = "";
        this.CertificateName = "";
        this.CertificateRank = "";
        this.CertificatedDate = "";
    }
    fun Input () : Unit{
        print("CertificatedID enter: ");
        this.CertificatedID = readLine()!!;
        print("CertificateName enter: ");
        this.CertificateName = readLine()!!;
        print("CertificateRank enter: ");
        this.CertificateRank = readLine()!!;
        print("CertificatedDate enter: ");
        this.CertificatedDate = readLine()!!;
    }
    fun showInfor(){
        println("CertificatedID: ${this.CertificatedID}");
        println("CertificateName: ${this.CertificateName}");
        println("CertificateRank: ${this.CertificateRank}");
        println("CertificatedDate: ${this.CertificatedDate}");
    }
    fun setCertificatedID(CertificatedID : String) {
        this.CertificatedID = CertificatedID;
    }
    fun setCertificateName (CertificateName : String) {
        this.CertificateName = CertificateName;
    }
    fun setCertificateRank (CertificateRank : String){
        this.CertificateRank = CertificateRank;
    }
    fun setCertificatedDate (CertificatedDate : String) {
        this.CertificatedDate = CertificatedDate;
    }
    fun getCertificatedID () : String{
        return this.CertificatedID;
    }
    fun getCertificateName () : String {
        return this.CertificateName;
    }
    fun getCertificateRank () : String {
        return this.CertificateRank;
    }
    fun getCertificatedDate () : String {
        return this.CertificatedDate;
    }
}