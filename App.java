public class App {
    public static void main(String[] args) throws Exception {
        Arvore arvore = new Arvore();
        arvore.insert(4);
        arvore.insert(1);
        arvore.insert(6);
        arvore.insert(3);
        arvore.insert(5);
        arvore.insert(7);
        arvore.insert(2);

        System.out.println("Pos ordem:");
        arvore.printPosOrdem(arvore.getRaiz());
        System.out.println("\nEm ordem:");
        arvore.printEmOrdem(arvore.getRaiz());
        System.out.println("\nPre ordem:");
        arvore.printPreOrdem(arvore.getRaiz());

        arvore.removerMaior();

        System.out.println("\n\nApos remoção do maior:");
        System.out.println("\nPos ordem:");
        arvore.printPosOrdem(arvore.getRaiz());
        System.out.println("\nEm ordem:");
        arvore.printEmOrdem(arvore.getRaiz());
        System.out.println("\nPre ordem:");
        arvore.printPreOrdem(arvore.getRaiz());

        arvore.removerMenor();

        System.out.println("\n\nApos remoção do menor:");
        System.out.println("\nPos ordem:");
        arvore.printPosOrdem(arvore.getRaiz());
        System.out.println("\nEm ordem:");
        arvore.printEmOrdem(arvore.getRaiz());
        System.out.println("\nPre ordem:");
        arvore.printPreOrdem(arvore.getRaiz());

        arvore.setRaiz(arvore.removerN(arvore.getRaiz(), 5));


        System.out.println("\n\nApos remoção do N(5):");
        System.out.println("\nPos ordem:");
        arvore.printPosOrdem(arvore.getRaiz());
        System.out.println("\nEm ordem:");
        arvore.printEmOrdem(arvore.getRaiz());
        System.out.println("\nPre ordem:");
        arvore.printPreOrdem(arvore.getRaiz());
    }
}
