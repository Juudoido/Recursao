package Recursao;

public class Recursao {
    static void printChilds(Pessoa father) {
        if (father != null) {
            if (father.filhoA != null) {
                System.out.println("Pai: " + father.nome + "\nFilhoA: " + father.filhoA.nome + "\n");
                printChilds(father.filhoA);
            }
            if (father.filhoB != null) {
                System.out.println("Pai: " + father.nome + "\nFilhoB: " + father.filhoB.nome + "\n");
                printChilds(father.filhoB);
            }
        }

    }

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.nome = "Juarez";
        p1.ancestral = null;
        p1.filhoA = null;
        p1.filhoB = null;

        Pessoa p2 = new Pessoa();
        p2.nome = "Kotone";
        p2.filhoA = null;
        p2.filhoB = null;
        p2.ancestral = p1;

        p1.filhoA = p2;

        Pessoa p3 = new Pessoa();
        p3.nome = "Jorgin";
        p3.filhoA = null;
        p3.filhoB = null;
        p3.ancestral = p1;

        p1.filhoB = p3;

        Pessoa p4 = new Pessoa();
        p4.nome = "Matheus";
        p4.filhoA = null;
        p4.filhoB = null;
        p4.ancestral = p2;

        p2.filhoA = p4;

        Pessoa p5 = new Pessoa();
        p5.nome = "Gerson";
        p5.filhoA = null;
        p5.filhoB = null;
        p5.ancestral = p2;

        p2.filhoB = p5;

        printChilds(p1);
    }
}
