package homework.day5;

public class StringObjectRunner {
    public static void main(String[] args) {
        System.out.println("----------");
        new FindDigits().findDigitsInString("1223fffffr45w rt");
        System.out.println("----------");
        new FindDuplicate().findAndPrintDuplicateWords("asd qwe asd 123 qwe qwe 123 zxc");
        System.out.println("----------");
        new StringInColumn().printStringInOneColumn("dffsd 134 ff");
        System.out.println("----------");
        new ReturnCurrentDateInFormat().returnCurrentDateInCustomFormat();
        System.out.println("----------");
        String inputDate = "22.00 07.09.2020";
        new ChangeDateFormat().returnDateInDifferentFormat(inputDate);
        System.out.println("----------");
        new CountSymbols().returnDateBasedOnVowelsCount("asdAER а");

       // DRAFT - not ready new LogProcessorStaticDraft()
    }

}
