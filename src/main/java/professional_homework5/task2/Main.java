package professional_homework5.task2;

public class Main {
    public static void main(String[] args) {
        String str = "Эта книга адресована всем, кто изучает русский язык. Но состоит она не из правил, упражнений и учебных текстов. Для этого созданы другие замечательные учебники.\n" +
                "\n" +
                "У этой книги совсем иная задача. Она поможет вам научиться не только разговаривать, но и размышлять по-русски. Книга, которую вы держите в руках, составлена из афоризмов и размышлений великих мыслителей, писателей, поэтов, философов и общественных деятелей различных эпох." +
                " Их мысли - о тех вопросах, которые не перестают волновать человечество.";

        String[] sentence = str.split("[\\!|\\.|\\?]\\s?");
        String[] sentenceResult = new String[sentence.length];

        for (int i = 0; i < sentence.length; i++){
            sentenceResult[i] = sentence[i].trim().replaceAll("(?U)^(\\w+)(.*)(\\b\\w+)([.?!]?$)", "$3$2$1$4");
        }

        for (String s : sentenceResult){
            System.out.println(s);
        }

    }


}
