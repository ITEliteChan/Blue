package com.rf.ch.bagezuoye;
import java.util.HashMap;
import java.util.Map;
public class Daxie {
private static String[] danwei={"元","十","百","千","万","十","百","千","亿"};
private static String[] chinastr={"元","十","百","千","万","十","百","千","亿"};
private static Map<Integer,String> map=new HashMap<Integer,String>();
private static int flag=0;
private static int iszero=0;
public static void main(String[] args) {
String englishstr="10000700";
String formatstr="";
map.put(1, "壹");
map.put(2, "贰");
map.put(3, "叁");
map.put(4, "肆");
map.put(5, "伍");
map.put(6, "陆");
map.put(7, "漆");
map.put(8, "捌");
map.put(9, "玖");
map.put(0, "零");
    for (int i = englishstr.length(); i >0 ; i--) {
    if(englishstr.charAt(englishstr.length()-i)=='0'){
flag=flag+1;
    if(flag==4&&formatstr.indexOf("万")==-1) formatstr=formatstr+"万";
iszero=1;}
else
flag=0; 
    if(flag==0){
    if(iszero==1)formatstr=formatstr+"零";
    formatstr = formatstr+map.get(Integer.parseInt(englishstr.charAt(englishstr.length()-i)+""))+danwei[i-1];
    iszero=0;}	
}
    System.out.println(formatstr);
}
}