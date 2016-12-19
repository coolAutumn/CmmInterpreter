package tokenanalysis;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by LeeAutumn on 10/23/16.
 * blog: leeautumn.net
 */
public class Interpreter {

//    List<String> stringLines = new ArrayList<>();
//    List<Token>  tokenList   = new ArrayList<>();
//
//    public void read(InputStream inputStream){
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
//
//        String temp;
//        boolean isNote = false;
//        try {
//
//            //在对lines进行添加进ArrayList时,就把注释给忽略掉
//            while ((temp = bufferedReader.readLine()) != null){
//                if(!isNote) {
//                    if (temp.contains("//")) {   //找到//注释
//                        String before = temp.substring(0, temp.indexOf("//"));
//                        stringLines.add(before.trim());
//                    } else if(temp.contains("/*")){
//                        isNote = true;
//                        String before = temp.substring(0, temp.indexOf("/*"));
//                        stringLines.add(before.trim());
//                        continue;
//                    }else{
//                        stringLines.add(temp.trim());
//                    }
//                }else{
//                    if(temp.contains("*/")){
//                        isNote = false;
//                        String after = temp.substring(temp.indexOf("*/")+2);
//                        stringLines.add(after.trim());
//                    }
//                    continue;
//                }
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            if(isNote){
//                System.out.println("注释没有闭合");
//                System.exit(1);
//            }
//        }
//    }
//
//    /**
//     * 开始对每一行进行词法分析
//     */
//    public void analysis(){
//        int lineNumber = 1;
//        while(stringLines.size() >= lineNumber){
//
//            analysisLine(stringLines.get(lineNumber-1),lineNumber);
//        }
//    }
//
//    private void analysisLine(String line, int lineNumber){
//        //忽略空格、tab键、回车换行等分隔符
//        line = line.replaceAll("\t"," ");
//        String[] tokens = line.split(" ");
//
//        ArrayList<String> stringLineList = new ArrayList<>();
//        for(String token : tokens){
//            if(token.length() > 0){
//                stringLineList.add(token.trim());
//            }
//        }
//
//        //已经忽略了那些空格符号,现在得到了准确的各个String
//        for(String s : stringLineList){
//
//        }
//
//    }
//
//    private int isBasicType(){
//        return 0;
//    }
    public static void main(String[] args) {
        InputStream inputStream = null;
        try {
             inputStream = new FileInputStream("cmm.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



        CmmLexer cmmLexer = null;

        try {
            cmmLexer = new CmmLexer(new ANTLRInputStream(inputStream));
        } catch (IOException e) {
            e.printStackTrace();
        }

        CommonTokenStream tokens = new CommonTokenStream(cmmLexer);
        tokens.getText();

        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("cmm.txt")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        List<String> lines = new ArrayList<>();
        int size=1;
        String temp;
        try {
            while((temp=bufferedReader.readLine()) != null){
                lines.add(temp.trim());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        int line = 0;
        for(Token t : tokens.getTokens()){
            if(t.getLine()>line){
                for(int i=line+1;i<t.getLine();i++){
                    if(lines.get(i-1).length() > 0){

                    }
//                        System.out.println(i+" "+lines.get(i-1)+"   注释");
                }
            }

            if(t.getLine() != line) {
                if(t.getType() != -1)
//                    System.out.println(t.getLine()+" "+lines.get(t.getLine()-1));
                line = t.getLine();
            }


            if(t.getLine() == line && t.getType() != -1){
//                System.out.print("  "+line+": "+ cmmLexer.getTokenNames()[t.getType()]+", "+t.getText()+"\n");
            }else{
//                System.out.print("  "+line+": EOF, "+t.getText()+"\n");
            }
        }


        CmmParser cmmParser = new CmmParser(tokens);
        ParseTree parseTree = cmmParser.prog();

        System.out.println(parseTree.toStringTree(cmmParser));

        CmmBaseVisitor cmmBaseVisitor = new CmmBaseVisitor();
        cmmBaseVisitor.visit(parseTree);


        //在这里开始进行解释工作

    }

}
