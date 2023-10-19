package homework.day5;

public class StringStaticRunner {


    public static void main(String[] args) {
        System.out.println("----------");
        FindDigitsStatic.findDigitsInString("1223fffffr45w rt");
        System.out.println("----------");
        FindDuplicateStatic.findAndPrintDuplicateWords("asd qwe asd 123 qwe qwe 123 zxc");
        System.out.println("----------");
        StringInColumnStatic.printStringInOneColumn("dffsd 134 ff");
        System.out.println("----------");
        ReturnCurrentDateInFormatStatic.returnCurrentDateInCustomFormat();
        System.out.println("----------");
        String inputDate = "22.00 07.09.2020";
        ChangeDateFormatStatic.returnDateInDifferentFormat(inputDate);
        System.out.println("----------");
        CountSymbols.returnDateBasedOnVowelsCount("asdAER а");
    }
}
