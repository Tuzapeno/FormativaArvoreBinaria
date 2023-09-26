public class Arvore {
    private Node raiz;

    // Criação da árvore
    public Arvore(){
        this.raiz = null;
    }

    public Node getRaiz() {
        return this.raiz;
    }

    public void setRaiz(Node raiz) {
        this.raiz = raiz;
    }

    public void insert(int valor){
        // Sem valor = crie a raiz
        if (this.raiz == null){
            this.raiz = new Node(valor);
        }
        else {
            Node aux = this.raiz;
            while (aux != null){
                // Se o valor for menor que o nó atual vá a esquerda!
                if (valor < aux.getValor()){
                    if (aux.getEsquerda() == null){
                        aux.setEsquerda(new Node(valor));
                        break;
                    }
                    aux = aux.getEsquerda();
                }
                else {
                    // Se o valor for maior que o nó atual vá a direita!
                    if (aux.getDireita() == null){
                        aux.setDireita(new Node(valor));
                        break;
                    }
                    aux = aux.getDireita();
                }
            }
        }
    }

    public void printPreOrdem(Node aux) {
        if (aux == null) {
            return;
        }
        System.out.print(aux.getValor() + " ");
        printPreOrdem(aux.getEsquerda());
        printPreOrdem(aux.getDireita());
    }

    public void printPosOrdem(Node aux) {
        if (aux == null) {
            return;
        }
        printPosOrdem(aux.getEsquerda());
        printPosOrdem(aux.getDireita());
        System.out.print(aux.getValor() + " ");
    }

    public void printEmOrdem(Node aux) {
        if (aux == null) {
            return;
        }
        printEmOrdem(aux.getEsquerda());
        System.out.print(aux.getValor() + " ");
        printEmOrdem(aux.getDireita());
    }

    public void removerMaior() {
        Node aux = this.raiz;
        Node pai = null;
        while (aux.getDireita() != null) {
            pai = aux;
            aux = aux.getDireita();
        }
        pai.setDireita(aux.getEsquerda());
    }

    public void removerMenor() {
        Node aux = this.raiz;
        Node pai = null;
        while (aux.getEsquerda() != null) {
            pai = aux;
            aux = aux.getEsquerda();
        }
        pai.setEsquerda(aux.getDireita());
    }

    public Node acharMenor(Node node) {
        Node aux = node;
        while (aux.getEsquerda() != null) {
            aux = aux.getEsquerda();
        }
        return aux;
    }

    public Node removerN(Node no, int valor) {
        if (no == null) {
            return null;
        }

        if (valor < no.getValor()) {
            no.setEsquerda(removerN(no.getEsquerda(), valor));
        }
        else if (valor > no.getValor()) {
            no.setDireita(removerN(no.getDireita(), valor));
        }
        else {
            // nó com 1 filho na direita
            if (no.getEsquerda() == null) 
                return no.getDireita();
            // nó com 1 filho na esquerda
            else if (no.getDireita() == null) 
                return no.getEsquerda();
            // nó com 2 filhos
            no.setValor(acharMenor(no.getDireita()).getValor());
            no.setDireita(removerN(no.getDireita(), no.getValor()));
        }
        return no;
    }
}
