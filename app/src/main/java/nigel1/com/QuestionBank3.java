package nigel1.com;

public class QuestionBank3 {

    private String textQuestions [] = {
            "1. Siapa Nama Menteri Pendidikan dan Kebudayaan?",
            "2. Siapa Presiden Pertama Indonesia?",
            "3. Siapa Presiden Indonesia Sekarang?",
            "4. Apa Nama Ibukota Indonesia?",
            "5. Jika Tahun ini 2020,maka Tahun depan?"

    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"Tubuh Dingin", "Terdapat Baretan", "Badan Berkerak", "Tidak Pup"},
            {"Hidung Pilek", "Aktif", "Berliur", "Berdarah Pada Kulit"},
            {"baretan menghilang", "Lembap Pada Baretan", "Bulu lembab", "Nafsu Makan Tinggi"},
            {"Kulit Terinfeksi", "Lemas", "Pup Keras atau berdarah", "Hidung Dingan"},
            {"Bernanah", "Tidak Aktif", "Pup sembarangan", "Kulit lembab"}
    };

    private String mCorrectAnswers[] = {"Terdapat Baretan ", "Berdarah Pada Kulit", "Lembap Pada Baretan", "Kulit Terinfeksi", "Bernanah"};

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