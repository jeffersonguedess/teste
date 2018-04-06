
package estruturapilha;

/**
 *
 * @author jefferson Guedes
 */
public class EstruturaPilha {

    

    public Object[] pilha;
    public int posicaoPilha;
    
    public EstruturaPilha() {
        this.posicaoPilha = -1;
        this.pilha = new Object[100];
        
    }
    //verifica se ela esta vazia
    public boolean isEmpty(){
        
        if (this.posicaoPilha == -1){
            return true;
        }
        return false;
    }
    
    //verifica se esta cheia 
    public boolean isFull(){
        if (this.posicaoPilha == 99){
            return true;
        }
        return false;
    }
    
//Tamanho da pilha (Quantos elementos tem na pilha)
   public int size(){
       if (this.isEmpty()){
           return 0;
       }
       return this.posicaoPilha + 1;
   }
   
   public void push(Object valor){
       if (!this.isFull()){
           this.pilha[++posicaoPilha] = valor;
       }else{
           System.out.println("Cheia!!");
       }
   }
   //Removo o elemento
   public Object pop() {
       if (isEmpty()){
           return null;
       }
       return this.pilha[this.posicaoPilha --];
   }
   //Retorno o elemento do topo
   public Object top() {
       if (isEmpty()) {
           return null;
       }else{
           return this.pilha[this.posicaoPilha];
           
       }
   }
 }

