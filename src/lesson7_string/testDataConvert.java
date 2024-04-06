package lesson7_string;

public class testDataConvert {
    public static void main(String[] args) {
        testDataConvert();
        testBasics();
        testSubString();
        testEqual();
        testCompareTo();
        testCase();
        testSplit();
        testReplace();
        testFormat();
    }

    private static void testDataConvert(){
        System.out.println("====== testDataConvert ======");
        String myStrNum = "10";
        int num = Integer.parseInt(myStrNum);
        System.out.println(myStrNum);

        String myNumStr = String.valueOf(20);
        System.out.println(myNumStr);
    }

    private static void testBasics(){
        System.out.println("====== testBasics ======");
        String myStr0 = "Java programming";
        System.out.println(myStr0.charAt(5));
        String myStr1 = "" + 5 + 6;
        System.out.println( myStr1 );
        String myStr2 = "" + (5 + 6);
        System.out.println( myStr2 );

        String myStr3 = "Java programming";
        System.out.println(myStr3.indexOf("va"));
        System.out.println(myStr3.lastIndexOf("m"));

    }
    private static void testSubString(){
        System.out.println("====== testSubString ======");
        String myStr = "You can now create custom versions of ChatGPT";
        System.out.println(myStr.substring(0,6));
        System.out.println("extra knowledge".substring(4,7));
        System.out.println("and any combination of skills.".substring(4,7));
    }

    private static void testEqual(){
        System.out.println("====== testEqual ======");
        String text1 = "Hello World!";
        String text2 = "hello world!";
        System.out.println(text1.equals(text2));
        System.out.println(text1.equalsIgnoreCase(text2));
    }

    private static void testCompareTo(){
        System.out.println("====== testCompareTo ======");
        String s1 = "Mary Had a Lamb.";
        String s2 = "123 my name is Lucas";
        int result = s1.compareTo(s2);
        System.out.println("s1:" + s1);
        System.out.println("s2:" + s2);
        System.out.println("s1 compareTo s2 is:" + result);
    }

    private static void testCase(){
        System.out.println("====== testCase ======");
        String text = "Harry Had a Dog";
        System.out.println(text.toLowerCase());
        System.out.println(text.toUpperCase());
    }

    private static void testSplit(){
        System.out.println("====== testSplit ======");
        String myStr = "We are looking for experienced web developers who are passionate about giving back to their community and making a positive impact in the world to join us as volunteers";
        System.out.println(myStr);
        String[] myArray = myStr.split(" ");
        for(String e :  myArray){
            System.out.println(e);
        }
    }

    private static void testReplace(){
        String text = "10101000101001000010101";
        System.out.println(text);
        text.replace("1","3");
        System.out.println(text);
        System.out.println(text.replace("1","3"));
    }

    private static void testFormat(){
        String text = String.format("5 + 12 = %d", (5+12));
        System.out.println(text);
        double x = 3.2, y = 4.2, z = 39.0;

        System.out.println(String.format("%f + %f x %f = %f",x,y,z,(x+y*z)));

    }



}
