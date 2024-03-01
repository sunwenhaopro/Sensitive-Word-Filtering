package test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class TestMain {
    public static void main(String[] args) {
        DFA dfa=DFA.getInstance();
        AC ac=new AC();
        ACPro acPro=new ACPro();

        List<String> list = new ArrayList<>();
//        try {
//            BufferedReader in = new BufferedReader(new FileReader("SensitiveWordList.txt"));
//            String str;
//            while ((str = in.readLine()) != null) {
//                list.add(str);
//            }
//        }catch (Exception e){
//            System.out.println("----------------敏感词库加载失败------------------");
//        }
//        System.out.println("----------------敏感词库已加载:"+list.size()+"------------------");
        list.add("bcbcd");
        list.add("dem");
        dfa.loadWord(list);
        ac.loadWord(list);
        acPro.loadWord(list);
        long start;
        long end;
        String test1="bcbcbcd";
        String result="";
        System.out.println(test1);
        start=System.nanoTime();
        result=acPro.filter(test1);
        end=System.nanoTime();
        System.out.print((end-start));
        System.out.println(" AC   "+result);
//        start=System.nanoTime();
//        result=ac.filter(test1);
//        end=System.nanoTime();
//        System.out.print((end-start));
//        System.out.println(" AC   "+result);
//        start=System.nanoTime();
//        result=acPro.filter(test1);
//        end=System.nanoTime();
//        System.out.print((end-start));
//        System.out.println(" ACPro   "+result);
    }
}
