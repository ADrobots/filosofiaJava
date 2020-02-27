package strings;

import java.util.Scanner;
import java.util.regex.MatchResult;

public class ThreatAnalizer {
    //threat - угроза
    static String threatData=
            "58.77.65.11@22/02/1956\n"+
            "66.77.895.256@01/02/1999\n"+
            "[Next log section with different data format]";

    public static void main(String[] args) {
        Scanner scanner=new Scanner(threatData);
        String pattern="(\\d+[.]\\d+[.]\\d+[.]\\d+)@(\\d{2}/\\d{2}/\\d{4})";

        while (scanner.hasNext(pattern)){
            scanner.next(pattern);
            MatchResult matchResult=scanner.match();
            String ip=matchResult.group(1);
            String date=matchResult.group(2);
            System.out.format("Threat on %s from %s\n",date, ip);
        }
    }
}

/**
 * При использовании метода nexxt() c шаблоном этот шаблон применяется к следущей
 * входной лексеме.
 * Метод match() используется для доступа к результатам
 * Внимание, совпадение шаблона ищется к следующей входой лексеме, если используется
 * разделитель то совпадение не будет найдено
 */
