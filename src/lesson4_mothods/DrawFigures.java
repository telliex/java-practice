package lesson4_mothods;

public class DrawFigures {
    public static void main(String[] args) {
        drawV();
        System.out.println();
        drawX();
        System.out.println();
        drawDiamond();
        System.out.println();
        drawBox();
        System.out.println();
        drawRocket();
        System.out.println();
    }
    public static void drawV(){
        System.out.println("\\     /");
        System.out.println(" \\   /");
        System.out.println("  \\ /");
        System.out.println("   V");
    }

    public static void drawInvertedV(){
        System.out.println("   / \\");
        System.out.println("  /   \\");
        System.out.println(" /     \\");
        System.out.println("/       \\");
    }

    public static void drawX(){
        System.out.println(" \\     /");
        System.out.println("  \\   /");
        System.out.println("   \\ /");
        System.out.println("    X    ");
        System.out.println("   / \\  ");
        System.out.println("  /   \\  ");
        System.out.println(" /     \\  ");
    }

    public static void drawDiamond(){
        System.out.println(" -------");
        System.out.println("/       \\");
        System.out.println("\\       /");
        System.out.println(" \\     /");
        System.out.println("  \\   /");
        System.out.println("   \\ /");
        System.out.println("    V");

    }
    public static  void  drawBox(){
        System.out.println("+-------+");
        System.out.println("|       |");
        System.out.println("|       |");
        System.out.println("+-------+");
    }
    public static  void drawRocket(){
        drawInvertedV();
        drawBox();
        drawBox();
        drawBox();
        drawInvertedV();
    }
}
