package nigel1.com;

public class QuestionBank4 {

    private String textQuestions [] = {
            "1. Siapa Nama Menteri Pendidikan dan Kebudayaan?",
            "2. Siapa Presiden Pertama Indonesia?",
            "3. Siapa Presiden Indonesia Sekarang?",
            "4. Apa Nama Ibukota Indonesia?",
            "5. Jika Tahun ini 2020,maka Tahun depan?"

    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"Tidak Nafsu Makan", "Tubuh hangat", "Badan Berkerak", "Nafsu makan berlebih"},
            {"Hidung Pilek", "Aktif", "Tidak Pup", "Selalu tidur"},
            {"Kulit Mengelupas", "Muntah", "Bulu lembab", "Nafsu Makan Tinggi"},
            {"Kulit Kering", "Penurunan Berat Badan", "Pup Keras atau berdarah", "Hidung Dingan"},
            {"Bulu Mengkilap", "Tidak Aktif", "Pup sembarangan", "Lemas"}
    };

    private String mCorrectAnswers[] = {"Tidak Nafsu Makan", "Tidak Pup", "Muntah", "Penurunan Berat Badan", "Lemas"};

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