package nigel1.com;

public class QuestionBank2 {

    private String textQuestions [] = {
            "1. Siapa Nama Menteri Pendidikan dan Kebudayaan?",
            "2. Siapa Presiden Pertama Indonesia?",
            "3. Siapa Presiden Indonesia Sekarang?",
            "4. Apa Nama Ibukota Indonesia?",
            "5. Jika Tahun ini 2020,maka Tahun depan?"

    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"Tubuh Dingin", "Tubuh hangat", "Badan Berkerak", "Tidak Pup"},
            {"Hidung Pilek", "Aktif", "Berliur", "Selalu tidur"},
            {"Tidak Nafsu Makan", "Pup cair", "Bulu lembab", "Nafsu Makan Tinggi"},
            {"Kulit Kering", "Lemas", "Pup Keras atau berdarah", "Hidung Dingan"},
            {"Muntah", "Tidak Aktif", "Pup sembarangan", "Kulit lembab"}
    };

    private String mCorrectAnswers[] = {"Tubuh Dingin", "Hidung Pilek", "Tidak Nafsu Makan", "Lemas", "Tidak Aktif"};

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