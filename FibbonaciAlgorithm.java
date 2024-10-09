package ForGithub;



import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

class FibbonaciAlgoritm1{

public BigInteger[] FibbonaciAlghoritm()

      {
          BigInteger n =BigInteger.valueOf(0);
          BigInteger m = BigInteger.valueOf(1);



          BigInteger[] bIntegers = new BigInteger[100];

          bIntegers[0] = n;
          bIntegers[1] = m;


          for (int i = 2; i < bIntegers.length; i++) {


              bIntegers[i] = bIntegers[i - 1].add(bIntegers[i - 2]);

              int o=1;
              long l = Long.MAX_VALUE;
              if (o==bIntegers[i].compareTo(BigInteger.valueOf(l))) {
                  System.out.println("bIntegers too big for signed value");
              }


          }

return bIntegers;
      }

}








public class FibbonaciAlgorithm {

   public Long[] algorithmF() {







       System.out.println(" - ");
       System.out.println("function has been called ");

       Byte b111= (byte) -300;
       Long long111=Long.parseLong("-9");
       String i11=Integer.toUnsignedString(9);
       System.out.println(b111+" "+i11+" "+long111);

BigInteger big1= BigInteger.valueOf(-3659523366270331776L-8612576878699335103L);
       long n =0;
       long m = 1;

       System.out.println(" temp "+big1+" n "+n);

       Long[] integers = new Long[100];

       integers[0] = n;
       integers[1] = m;


       for (int i = 2; i < integers.length; i++) {


           integers[i] = integers[i - 1] + integers[i - 2];


           long l = Long.MAX_VALUE;
           if (integers[i] > l) {
               System.out.println("integers too big for signed value");
           }


       }




       String ii  = Long.toUnsignedString(integers[99]);
       Long iii = Long.parseUnsignedLong(ii, 10);

       Long iiiii= 111L;

       String iiiiii=Long.toBinaryString(iii);
       BigInteger bigInteger4=new BigInteger(ii);
       String s4=bigInteger4.toString(2);
       String i3=Long.toBinaryString(integers[99]);

       String i2=Long.toBinaryString(iii);
       int int1= s4.compareTo(i3);


       BigInteger bigX= BigInteger.valueOf(4);
       BigInteger bigX1= BigInteger.valueOf(5);
       System.out.println(bigX.xor(bigX1)+" bigX");






       String s1234=String.valueOf("12272100244969666879");
       BigInteger big1234=new BigInteger( "12272100244969666879");
       long integerT=Long.parseUnsignedLong(s1234);



       BigInteger bigInteger5=new BigInteger(String.valueOf(9223372036854775807L));
       BigInteger bigInteger6=bigInteger4.add(bigInteger5);

       Long i1 = Long.parseUnsignedLong(iiiiii, 2);









       byte byte2= (byte) 240;
       //String string2=Byte.toUnsignedInt(byte2);
       System.out.println(byte2+" byte2 ");

        String s7=Long.toUnsignedString(1);
       String s8=Long.toBinaryString(-1);
       String s2=Long.toBinaryString(integers[96]);
       String s3=Long.toBinaryString(integers[97]);
       String s5=s2+s3;


       String s9=Long.toUnsignedString(integers[96]);
       String s10=Long.toUnsignedString(integers[97]);
       String s13=Long.toString(integers[96]);
       String s14=Long.toString(integers[97]);

       BigInteger newBig3 = new BigInteger(s13);
       BigInteger newBig4 = new BigInteger(s14);
       BigInteger newBig = new BigInteger(s9);
       BigInteger newBig1 = new BigInteger(s10);
       BigInteger newBig2 = newBig.add(newBig1);
       BigInteger newBig5 = newBig3.add(newBig4);

       String ss=String.valueOf(newBig5);
       String sss=newBig5.toString(2);
       String ssss=sss.replaceAll("0","1");
       BigDecimal bigDecimal=new BigDecimal(newBig5);








       int a=newBig5.bitCount();
       BigInteger aa=newBig5.max(newBig5);
       System.out.println(a+" a "+newBig5.bitLength()+" radix 2 "+newBig5.toString(2)+" aa "+aa+" ss "+ss+" ssss "+ssss);


       String s11=newBig2.toString(2);
       String s12=s11.substring(1);



       System.out.println(" THIS "+newBig+" s9 "+s9+" s10 "+s10+" newBig2 "+newBig2+" s12 "+s12+" s13 "+s13+" newBig5 "+newBig5);


       System.out.println(s2+" s2 "+s2.length()+" s5 "+s5+" s5 lenght "+s5.length()+" s7 "+s7);




       BigDecimal big2=new BigDecimal("9223372036854775808");
       String s15=big2.toString();



       String unsignedString1=Long.toUnsignedString(-55,2);
       String s22=Long.toString(-55,2);
       Byte byte22= (byte) 129;


       BigInteger bigInteger444=new BigInteger("124",10);
       BigDecimal bigDecimal1=new BigDecimal(3);



       BigInteger bigInteger111= new BigInteger("11111111111111111111111111111111111111111111111111111111111111010011001011001001001111010001110011010101110010001110101110000000",2);
        String stringTemp111=bigInteger111.toString(2);
       int int111=bigInteger111.bitLength();
       Integer integerTemp=4;


       System.out.println(int111+" int111 "+stringTemp111+" stringTemp111 ");

        String stringTemp333="11111100";
        Integer intValue=Integer.parseUnsignedInt(stringTemp333,2);
        long longValue=Long.parseLong(stringTemp333,2);

       System.out.println(intValue+" intValue "+longValue+" longValue ");


       String temp1=bigInteger111.toString(10);
       System.out.println(temp1+" temp1 temp "+stringTemp111+" stringTemp111 "+int111+" int111 ");


        int int222=128-stringTemp111.length();
      String stringTemp3="0";
      String stringTemp4=stringTemp3.repeat(int222);
      String stringTemp5=stringTemp4.concat(stringTemp111);
       StringBuilder temp2=new StringBuilder(stringTemp5);

       Long longTemp=Long.parseLong("10",2);
       StringBuilder temp3=temp2.reverse();

       String temp22=String.valueOf(temp2);


       String temp33=temp22.replaceAll("-","");




       System.out.println(temp1+" temp1 "+temp3+" temp3 "+temp2+" temp2 "+temp2.compareTo(temp3)+" temp22 "+temp22+" longTemp "+longTemp+" stringTemp5 "+stringTemp5+" int222 "+int222);

       Integer integer=Integer.parseUnsignedInt("12",10)  ;


        BigInteger bigIntegerTemp1=new BigInteger(temp33);
        int a1=bigIntegerTemp1.bitLength();
        byte[] bytesTemp=bigIntegerTemp1.toByteArray();
       System.out.println(Arrays.toString(bytesTemp)+" bytesTemp ");



       long iReverse=Long.parseUnsignedLong("1",2);
       System.out.println(iReverse+" iReverse THIS "+a1+" a1 "+bigIntegerTemp1+" bigIntegerTemp1 ");
       String string8=Long.toBinaryString(iReverse);



       int one= Long.numberOfLeadingZeros(iReverse);
       String string444=Long.toBinaryString(iReverse);
       String string6="0";
       String string5=string6.repeat(one);
       String string7=string5.concat(string444);

       System.out.println(one+" one "+ string7+" string7 ");


       byte[] bytes444=bigInteger444.toByteArray();
       String bytes444String=Arrays.toString(bytes444);
       String bigInteger444String=bigInteger444.toString(2);

       System.out.println(bigInteger444String+" bigInteger444String "+bytes444String+" bytes444String + string444 "+ string444+" iReverse "+iReverse+" string8 "+string8+" "+Long.numberOfLeadingZeros(iReverse));
       StringBuilder stringBuilder=new StringBuilder(string444);
       StringBuilder stringBuilder1=stringBuilder.reverse();


       BigInteger bigIntegerttt=new BigInteger("1111111111111100",2);
       System.out.println(bigIntegerttt+" bigIntegerttt ");

       System.out.println(stringBuilder1+" stringBuilder1 ");



       BigInteger bigInteger44=new BigInteger("-12",10);
        BigInteger bigInteger9=new BigInteger(string7,2);



            int bigInteger44Lenght=bigInteger44.bitLength();


       byte[] byteArray1=bigInteger9.toByteArray();
       System.out.println(Arrays.toString(byteArray1)+" byteArray1 "+bigInteger9+" bigInteger9 ");

       BigInteger bigInteger55=new BigInteger(byteArray1);
       //BigInteger new byte[]
       //bigInteger44 to signed string
       String s55=bigInteger44.toString(2);
       String s666=s55.substring(1,s55.length());


       String temp4=temp3.toString();
       System.out.println(temp4+" temp4 ");
       char[] characters=temp22.toCharArray();
       System.out.println(Arrays.toString(characters)+" characters ");

Character[] characters1=new Character[characters.length];

           for (int i=0;i<characters.length;i++){
             Character ch=characters[i];

               characters1[i]=Character.valueOf(ch);
           }

       System.out.println(characters1[97]+" characters[97] ");
           BigInteger bigInteger11111=new BigInteger("0",10);
       System.out.println(bigInteger11111.toString(2).length()+" bitLenght11111 "+bigInteger11111.bitLength());




       System.out.println(-(Math.floor(-2.2))+" floor ");
       Double int1234= 4.0;
       Integer int12= (int) 1.0;
       System.out.println(int12+" int12 ");
       System.out.println(Integer.bitCount(0)+" bitCount "+int1234+" int1234 ");
Double d3=Math.log(+0.0);
       Double d4=Math.log(7);
               Double d2=Math.log(1)/Math.log(2);
       Double double1=Math.ceil(2.2);
       System.out.println(double1+" double1 "+d3+" d3 "+d2+" d2 "+d4+" d4 ");

       Double d1=Double.MAX_VALUE;
       System.out.println(d1+" d1 ");


       System.out.println(Arrays.toString(characters) +" characters "+characters1.length);

       ArrayList<Character> s88= Arrays.stream(characters1).collect(()-> (new ArrayList<Character>()),(ArrayList<Character> s444, Character s555)->{if (s555=='0'){s555='1';} else {s555='0';} s444.add(s555);},(ArrayList<Character> s222, ArrayList<Character> s333)->s222.addAll(s333));

String s99=s88.toString();
       System.out.println(s99+" s99 THIS ");
String s00=s99.replaceAll(",","");
        String s222=s00.replaceAll(" ","");
       String s333=s222.replaceAll("]","");
       String s777=s333.replaceAll("\\[","");



       String sssss="0101010110110000101111011101100011111010100110010100011011000001";
       long tempLong=Long.parseUnsignedLong(sssss,2);
        BigInteger bigInteger1111=new BigInteger("11111111111111111111111111111111111111111111111111111111111111101100110100110110110000101110001100101010001101110001010010000000",2);


       byte[] b11=bigInteger44.toByteArray();

       String s77=bigInteger44.toString(2);
       String s66=s77.substring(0,bigInteger44Lenght);
       System.out.println(unsignedString1.length()+" unsignedString1 "+s22+" s22 "+byte22+" byte22 "+bigInteger44+" bigInteger44 "+s55+" s55 "+s66+" s66 "+s77.length()+" s77" +" b11 "+ Arrays.toString(b11)+" biginteger55"+bigInteger55+" s88 "+s88+" s99 "+s99+" s00 "+s00+" s222 "+s222+" s666 "+s666+" s333 "+s333);
       System.out.println(s777+" s777 "+tempLong+" tempLong "+sssss+" sssss "+bigInteger1111+" bigInteger1111 ");

       Byte byte1= (byte) -129;
       String s555= Byte.toString(byte1);

       String s5555=Integer.toBinaryString(byte1);
        byte byte222=Byte.parseByte(s555,10);
        int i111=Integer.parseUnsignedInt("1111111111111111",2);
       System.out.println(" byte222 "+byte222+" s5555 "+s5555+" i111 "+i111);


       int b=5>>1;
       String s123=Integer.toBinaryString(b);
       System.out.println(b+" b "+s123.length()+" s123 ");





       int c=12;
       String cString=Integer.toBinaryString(c);


       String cString1=cString.replaceAll("1","2");
       String cString2=cString1.replaceAll("0","1");
       String cString3=cString2.replaceAll("2","0");



       System.out.println(cString3+" cString3 "+cString+" cString ");
       int cc=Integer.parseInt(cString3,2);
       Integer ccc=Integer.reverse(cc);
       System.out.println(cc+" cc "+Integer.toBinaryString(ccc)+" ccc ");

       BigInteger d= BigInteger.valueOf(1);     //WAS int
       int lenght1;
       String string1="111";
       String string11="101";


       String temp5=temp4.replaceAll("-","");
       System.out.println(temp5+" temp5 ");



       String stringB=d.toString(2);
       StringBuilder dStringB=new StringBuilder(stringB);
       StringBuilder builderB=dStringB.reverse();
       String stringB2=builderB.toString();


       BigInteger e=new BigInteger(s777,2);
       BigInteger f=new BigInteger(stringB2,2);


       String string111=s777;

       String string222=f.toString(2);


        if (string111.length()>string222.length()){

           lenght1=string111.length();
        }else {

            lenght1=string222.length();
        }

       BigInteger[] ints= new BigInteger[lenght1];
       BigInteger h,k,p,r,l= BigInteger.valueOf(0);
       int o;
       for (int i=1, j=0;i<=lenght1;i++,j++) {
           int int1111 = string111.length()-i;
           int int2222 = string222.length()-i;
           BigInteger i1111=BigInteger.valueOf(int1111);                            new BigInteger(String.valueOf(int1111));


             h=e.shiftRight(int1111);
              h=h.and(BigInteger.valueOf(1));
              k=f.shiftRight(int2222);
               k=k.and(BigInteger.valueOf(1)) ;

           if (h.equals(BigInteger.valueOf(1))  & k.equals(BigInteger.valueOf(1)) ){
                 if (l.equals(BigInteger.valueOf(0))){
                   p=h.xor(k);

                     l= BigInteger.valueOf(1);
                     ints[j]= BigInteger.valueOf(0);
                 } else if (l.equals(BigInteger.valueOf(1))) {
                     p=  h.xor(k) ;
                       r=p.or(l);
                             l= BigInteger.valueOf(1);
                     ints[j]=r;
                 }



                System.out.println(" two ");




            }else if (h.equals(BigInteger.valueOf(0))  & k.equals(BigInteger.valueOf(0))){
                 if (l.equals(BigInteger.valueOf(0))){
                  p=h.xor(k);

                     l= BigInteger.valueOf(0);
                     ints[j]=p;
                 } else if (l.equals(BigInteger.valueOf(1))) {
                    p= h.xor(k);
                     r=p.or(l);
                     l= BigInteger.valueOf(0);
                     ints[j]=r;
                 }

                System.out.println(" one ");
            }else if(h.equals(BigInteger.valueOf(1))  & k.equals(BigInteger.valueOf(0))) {

                 if (l.equals(BigInteger.valueOf(0))){
                 p=h.xor(k);

                     l= BigInteger.valueOf(0);
                     ints[j]=p;
                 } else if (l.equals(BigInteger.valueOf(1))) {
                     p=    h.or(k);
                     r=p.xor(l);
                     l= BigInteger.valueOf(1);
                     ints[j]=r;
                 }


            }

            else if ( h.equals(BigInteger.valueOf(0))  & k.equals(BigInteger.valueOf(1))) {
                 if (l.equals(BigInteger.valueOf(0))){
                     p=  h.or(k) ;

                     l= BigInteger.valueOf(0);
                     ints[j]=p;
                 } else if (l.equals(BigInteger.valueOf(1))) {
                     p=  h.or(k) ;
                     r=p.xor(l);
                     l= BigInteger.valueOf(1);
                     ints[j]=r;
                 }
            }





       }

       String intsString =Arrays.toString(ints);

       String intsString2=intsString.replaceAll(",","");
       String intsString3=intsString2.replaceAll(" ","");
       String intsString4=intsString3.replaceAll("]","");
       String intsString5=intsString4.replaceAll("\\[","");


       StringBuilder stringBuilderTemp2=new StringBuilder(intsString5);
       StringBuilder stringBuilderTemp3=stringBuilderTemp2.reverse();
       String stringTemp7= String.valueOf(stringBuilderTemp3);
       BigInteger bigIntegerTemp=new BigInteger(stringTemp7);

       System.out.println(bigIntegerTemp+" bigIntegerTemp "+stringTemp7.length());

       System.out.println(intsString5+" intsString5 ");




       StringBuilder builderFinall= new StringBuilder(intsString5);
       StringBuilder builderFinall1=builderFinall.reverse();
       String finalStrig=builderFinall1.toString();
       BigInteger intsInteger=new BigInteger(finalStrig,2);
       String stringSubstring=finalStrig.substring(64,128);



       System.out.println(intsString+" ints THIS "+intsInteger+" intsInteger "+finalStrig+" finalString "+intsInteger+" intsInteger "+stringSubstring+" stringSubstring ");



       char[] chars11=string11.toCharArray();
       char[] chars1=string1.toCharArray();
       char ch ='1';
       char[] result=new char[chars11.length];

       for (int i=0;i<string11.length();i++) {


           for (char ch1 :chars11){
               for (char ch2:chars1
                    ) {

               if (ch1=='1'& ch2=='1') {


                   result[i]='0';
               } else {
                   result[i]='1';
               }


               }

           }

       }

       System.out.println(Arrays.toString(result)+" result ");









        long long1=integers[96];
        BigInteger bigInteger11=new BigInteger(String.valueOf((-3659523366270331776L)+(-8612576878699335103L)));
       BigInteger bigInteger1=BigInteger.valueOf(-2437933049959450366L);
       BigInteger bigInteger= BigInteger.valueOf(9223372036854775807L);
       BigInteger bigInteger2= bigInteger.add(bigInteger1);


       String s1=bigInteger1.toString();

       System.out.println(ii + " ii " + integers[99] + " iii " + iii + " iiii "/*+iiii*/+bigInteger+" bigInteger "+bigInteger1+" bigInteger1 "+bigInteger2+" bigInteger2 "+iiiiii+" iiiiii "+i1+" i1 "+s1+" s1 "+bigInteger4+" bigInteger4 "+bigInteger6+" bigInteger6 "+int1+" int1 "+i2+" i2 "+s4+" s4 "+" bigInteger11 "+bigInteger11);

       System.out.println(Arrays.toString(ints)+" ints THIS2 "+ints.length+" ints lenght "+string111.length()+" string111 lenght "+string222.length()+" string222 lenght ");





       return integers;
   }

   public  void temp(){

       int byte3= 2147483647+99;
       Integer byte4=2147483646;
       Integer byte8=byte3+byte4;

       Integer integer4= (byte4+byte3);
       System.out.println(integer4+" integer4 "+" byte3 "+byte3);


       byte byte5= (byte) -129;
       Byte byte6=127;
       Byte byte7= (byte) (byte5+byte6);


       long long1=0;
       int integer3=343;

       Byte byte1= (byte) -2250;


      Integer integer2=Byte.toUnsignedInt((byte) -256);

       Double double1 =Math.pow(2,32);
       System.out.println(double1);


       Long iii=Integer.toUnsignedLong((int) 21474836489999999L);
       String one="-129";
       System.out.println(one);

       Integer ii=Integer.parseInt(one);
       String iiii=Integer.toUnsignedString((int) 5);
       System.out.println(/*i+*/" i "+ii+" ii "+iii+" iii "+Integer.MIN_VALUE+" MIN "+" byte1 "+byte1+" integer2 "+integer2+" MAX "+Long.MAX_VALUE+" MIN "+Long.MIN_VALUE);
   }

    public static void main(String[] args) {

        FibbonaciAlgoritm1 fibbonaciAlgoritm1=new FibbonaciAlgoritm1();
        FibbonaciAlgorithm fibbonaciAlgorithm=new FibbonaciAlgorithm();

        fibbonaciAlgorithm.temp();
        fibbonaciAlgorithm.algorithmF();
        System.out.println(" FibbonaciAlghoritm "+Arrays.toString(fibbonaciAlgoritm1.FibbonaciAlghoritm()));

        BigInteger[] bigIntegers=fibbonaciAlgoritm1.FibbonaciAlghoritm();

        for (int a=0;a<bigIntegers.length;a++) {
            System.out.println(" a "+a+"."+bigIntegers[a]);
        }


        System.out.println(Arrays.toString(fibbonaciAlgorithm.algorithmF()));

        System.out.println("----------------------------------------");




        System.out.println(" break ");
        Long[] integers1=fibbonaciAlgorithm.algorithmF();
        Object[] integers2=  Arrays.stream(fibbonaciAlgorithm.algorithmF()).toArray();
        System.out.println(" integers2 "+ Arrays.toString(integers2));
        System.out.println(fibbonaciAlgorithm.algorithmF().equals(integers1));


        int lenght1=fibbonaciAlgorithm.algorithmF().length;
        for (int i=0;i<lenght1;i++){
            System.out.println(i+". "+integers2[i]+" , ");




        }

        Long[] longs1=new Long[10];

    }










}
