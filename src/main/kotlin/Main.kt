fun addEmployee(list : ArrayList<Employee>,Type : Int) : Unit{
    when (Type) {
        0 -> {
            var obj = Experience();
            obj.Input();
            obj.setEmployee_type(Type);
            list.add(obj);
        }
        1 -> {
            var obj = Fresher();
            obj.Input();
            list.add(obj);
        }
        2 -> {
            var obj = Intern();
            obj.Input();
            list.add(obj);
        }
        else -> {
            throw ExceptionInInitializerError("INVALID TYPE OF Empployee !");
        }
    }
}
fun editEmployee (list : ArrayList<Employee>, ID : String) : Unit{
    for (i in list.indices){
        if (list.get(i).getID().equals(ID)){
            when (list.get(i).getEmployee_type()){
                0 -> {
                    println("What do you want to edit ?\n" +
                            "ID\n" +
                            "FullName\n" +
                            "BirthDay\n" +
                            "Phone\n" +
                            "Email\n" +
                            "ExpInYear\n" +
                            "ProSkill\n" +
                            "Certificate\n");
                    var choose = readLine()!!;
                    when (choose){
                        "ID" -> {
                            print("ID new:");
                            list.get(i).setID(readLine()!!);
                        }
                        "FullName" -> {
                            print("FullName new: ");
                            list.get(i).setFullName(readLine()!!);
                        }
                        "BirthDay" -> {
                            print("BirthDay new: ");
                            list.get(i).setFullName(readLine()!!);
                        }
                        "Phone" -> {
                            print("Phone new: ");
                            list.get(i).setPhone(readLine()!!);
                        }
                        "Email" -> {
                            print("Email new: ");
                            list.get(i).setEmail(readLine()!!);
                        }
                        "ExpInYear" -> {
                            print("ExpInYear new: ");
                            var tempObj : Experience = list.get(i) as Experience;// cast list.get(i) to Experience
                            tempObj.setExpInYear(readLine()!!.toInt());
                            list.removeAt(i);
                            list.add(i,tempObj);
                        }
                        "ProSkill" -> {
                            print("ProSkill new: ");
                            var tempObj : Experience = list.get(i) as Experience;// cast list.get(i) to Experience
                            tempObj.setProSkill(readLine()!!);
                            list.removeAt(i);
                            list.add(i,tempObj);
                        }
                        "Certificate" -> {
                            println("Edit certificate....");
                            print("CertificatedID you want to edit: ");
                            editCertificatedByID(list.get(i).getlistCertificate(), readLine()!!);
                        }
                        else -> println("Not found !");
                    }
                }
                1 -> {
                    println("What do you want to edit ?\n" +
                            "ID\n" +
                            "FullName\n" +
                            "BirthDay\n" +
                            "Phone\n" +
                            "Email\n" +
                            "Graduation_date\n" +
                            "Graduation_rank\n" +
                            "Education\n" +
                            "Certificate\n");
                    var choose = readLine()!!;
                    when (choose) {
                        "ID" -> {
                            print("ID new:");
                            list.get(i).setID(readLine()!!);
                        }

                        "FullName" -> {
                            print("FullName new: ");
                            list.get(i).setFullName(readLine()!!);
                        }

                        "BirthDay" -> {
                            print("BirthDay new: ");
                            list.get(i).setFullName(readLine()!!);
                        }

                        "Phone" -> {
                            print("Phone new: ");
                            list.get(i).setPhone(readLine()!!);
                        }

                        "Email" -> {
                            print("Email new: ");
                            list.get(i).setEmail(readLine()!!);
                        }

                        "Graduation_date" -> {
                            print("Graduation_date new: ");
                            var tempobj = list.get(i) as Fresher;
                            tempobj.setGraduation_date(readLine()!!);
                            list.removeAt(i);
                            list.add(i,tempobj);
                        }
                        "Graduation_rank" -> {
                            print("Graduation_rank new: ");
                            var tempobj = list.get(i) as Fresher;
                            tempobj.setGraduation_rank(readLine()!!);
                            list.removeAt(i);
                            list.add(i,tempobj);
                        }
                        "Education" -> {
                            print("Education new: ");
                            var tempobj = list.get(i) as Fresher;
                            tempobj.setEducation(readLine()!!);
                            list.removeAt(i);
                            list.add(i,tempobj);
                        }
                        "Certificate" -> {
                            println("Edit certificate....");
                            print("CertificatedID you want to edit: ");
                            editCertificatedByID(list.get(i).getlistCertificate(), readLine()!!);
                        }
                        else -> println("Not found !");
                    }
                }
                2 -> {
                    println("What do you want to edit ?\n" +
                            "ID\n" +
                            "FullName\n" +
                            "BirthDay\n" +
                            "Phone\n" +
                            "Email\n" +
                            "Majors\n" +
                            "Semester\n" +
                            "University_name\n" +
                            "Certificate\n");
                    var choose = readLine()!!;
                    when (choose) {
                        "ID" -> {
                            print("ID new:");
                            list.get(i).setID(readLine()!!);
                        }

                        "FullName" -> {
                            print("FullName new: ");
                            list.get(i).setFullName(readLine()!!);
                        }

                        "BirthDay" -> {
                            print("BirthDay new: ");
                            list.get(i).setFullName(readLine()!!);
                        }

                        "Phone" -> {
                            print("Phone new: ");
                            list.get(i).setPhone(readLine()!!);
                        }

                        "Email" -> {
                            print("Email new: ");
                            list.get(i).setEmail(readLine()!!);
                        }
                        "Majors" -> {
                            print("Majors new: ");
                            var temoobj = list.get(i) as Intern;
                            temoobj.setMajors(readLine()!!);
                            list.removeAt(i);
                            list.add(i,temoobj);
                        }

                        "Semester" -> {
                            print("Semester new: ");
                            var temoobj = list.get(i) as Intern;
                            temoobj.setSemester(readLine()!!);
                            list.removeAt(i);
                            list.add(i,temoobj);
                        }

                        "University_name" -> {
                            print("University_name new: ");
                            var temoobj = list.get(i) as Intern;
                            temoobj.setUniversity_name(readLine()!!);
                            list.removeAt(i);
                            list.add(i,temoobj);
                        }
                        "Certificate" -> {
                            println("Edit certificate....");
                            print("CertificatedID you want to edit: ");
                            editCertificatedByID(list.get(i).getlistCertificate(), readLine()!!);
                        }
                        else -> println("Not found !");
                    }
                }
                else -> {}
            }
        } else{
            println("Not found !");
        }
    }
}
fun editCertificatedByID(listCer : ArrayList<Certificate> , ID : String) : Unit {
    for (i in listCer.indices){
        if (listCer.get(i).getCertificatedID().equals(ID)){
            println("What do you want to edit ?\n" +
                    "CertificatedID\n" +
                    "CertificateName\n" +
                    "CertificateRank\n" +
                    "CertificatedDate\n");
            var choose = readLine()!!;
            when (choose) {
                "CertificatedID" -> {
                    print("CertificatedID new: ");
                    listCer.get(i).setCertificatedID(readLine()!!);
                }
                "CertificateName" -> {
                    print("CertificateName new: ");
                    listCer.get(i).setCertificateName(readLine()!!);
                }
                "CertificateRank" -> {
                    print("CertificateRank new: ");
                    listCer.get(i).setCertificateRank(readLine()!!);
                }
                "CertificatedDate" -> {
                    print("CertificatedDate new: ");
                    listCer.get(i).setCertificatedDate(readLine()!!);
                }
                else -> println("Not found !");
            }
        }
    }
}
fun removeEmployee(list : ArrayList<Employee>, ID : String) : Unit{
    for (i in list.indices){
        if (list.get(i).getID().equals(ID))
            list.removeAt(i);
    }
}

fun searchExperience(list : ArrayList<Employee>) : Unit{
    for (i in list.indices){
        if (list.get(i) is Experience)
            (list.get(i) as Experience).ShowINfo();
    }
}

fun searchFresher(list : ArrayList<Employee>) : Unit{
    for (i in list.indices){
        if (list.get(i) is Fresher)
            (list.get(i) as Fresher).ShowINfo();
    }
}

fun searchInter(list : ArrayList<Employee>) : Unit{
    for (i in list.indices){
        if (list.get(i) is Intern)
            (list.get(i) as Intern).ShowINfo();
    }
}

fun DisplayListEmployee(listEmployee : ArrayList<Employee>) : Unit {
    for (i in listEmployee){
        when (i){
            is Experience -> (i as Experience).ShowINfo();
            is Fresher -> (i as Fresher).ShowINfo();
            is Intern -> (i as Intern).ShowINfo();
        }
    }
}

fun main(args: Array<String>) {
//    var list = ArrayList<Certificate>();
//    var obj = Certificate();
//    obj.setCertificatedID("20202530");
//    obj.setCertificateName("Excellent");
//    obj.setCertificateRank("Good");
//    obj.setCertificatedDate("15/10/2025");
//    list.add(obj);
//    list.get(0).setCertificatedID("037202001365");
//    list.get(0).showInfor();
    var listEmployee = ArrayList<Employee>();
    var flag : Boolean = true;
    while (flag){
        println("What do you want to do ?\n" +
                "Add\n" +
                "Edit\n" +
                "Remove\n" +
                "Search experience\n" +
                "Search fresher\n" +
                "Search intern\n" +
                "Show\n" +
                "Exit");
        var choose = readLine()!!;
        when (choose){
            "Add" -> {
                print("Type employee enter: ");
                addEmployee(listEmployee, readLine()!!.toInt());
            }
            "Edit" -> {
                print("ID for edit enter: ");
                editEmployee(listEmployee, readLine()!!);
            }

            "Remove" -> {
                print("ID for remove enter: ");
                removeEmployee(listEmployee, readLine()!!);
            }
            "Search experience" -> searchExperience(listEmployee);
            "Search fresher" -> searchFresher(listEmployee);
            "Search intern" -> searchInter(listEmployee);
            "Show" -> DisplayListEmployee(listEmployee);
            "Exit" -> flag = false;
            else -> println("Your choose is not exist,Please re-enter your choose: ");
        }
    }
}