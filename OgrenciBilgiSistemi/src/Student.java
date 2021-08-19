public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    double matAvg;
    double fizikAvg;
    double kimyaAvg;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat ,int fizik, int kimya,int matO,int fizikO,int kimyaO) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }
        if (matO >= 0 && matO <= 100){
            this.mat.oralExamNote = matO;
        }
        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }
        if (fizikO >= 0 && fizikO <=100){
            this.fizik.oralExamNote = fizikO;
        }
        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }
        if (kimyaO >= 0 && kimyaO <= 100 ){
            this.kimya.oralExamNote = kimyaO;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (this.fizikAvg + this.kimyaAvg + this.matAvg) / 3;
    }
    public void matAvg(){
        this.matAvg = (this.mat.note *9.0/10) + (this.mat.oralExamNote *1.0/10);
    }
    public void fizikAvg(){
        this.fizikAvg = ((this.fizik.note * 8.0) / 10) + ((this.fizik.oralExamNote * 2.0) / 10);
    }
    public void kimyaAvg(){
        this.kimyaAvg = ((this.kimya.note * 7.0) / 10) + ((this.kimya.oralExamNote * 3.0) / 10);
    }
    public boolean isCheckPass() {
        matAvg();
        fizikAvg();
        kimyaAvg();
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Kimya Notu : " + this.kimya.note);
    }

}