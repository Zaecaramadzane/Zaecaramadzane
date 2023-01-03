package nigel1.com;

public class QuestionBank {

    private String textQuestions [] = {
            "1. Siapa Nama Menteri Pendidikan dan Kebudayaan?",
            "2. Siapa Presiden Pertama Indonesia?",
            "3. Siapa Presiden Indonesia Sekarang?",
            "4. Apa Nama Ibukota Indonesia?",
            "5. Jika Tahun ini 2020,maka Tahun depan?"

    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"Kulit Melembap", "Bulu Halus", "Basah", "Mengkilat"},
            {"Kering", "Iritasi(menghitam)", "Rontok Sedikit", "Bersih"},
            {"Tidak berbau", "Bulu Halus Tidak rontok", "Berbau", "Terdapat kutu"},
            {"Tidak Aktif", "Mogok Makan", "Terdapat Kerak", "Kucing Tidak Pup"},
            {"Kulit lembut", "Kulit melembek", "Kulit Mengkilat", "Kulit Keras"}
    };

    private String mCorrectAnswers[] = {"Kulit Melembap", "Iritasi(menghitam)", "Berbau", "Terdapat Kerak", "Kulit Keras"};

    public int getLength(){
        return textQuestions.length;
    }

    public String getQuestion(int a) {
        String question = textQuestions[a];
        return question;
    }

    public String getChoice(int index, int num) {
        String choice0 = multipleChoice[index][num-1];
        return choice0;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}