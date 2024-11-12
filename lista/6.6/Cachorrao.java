public class Cachorrao extends Cachorro {

    public Cachorrao() {
        super();
    }

    public Cachorrao(String n) {
        super(n);
    }
   
    public String getNome(){
        return super.nome;
    }
    
    @Override
     public void fazerSom(){
        System.out.println("au au grandão");
        System.out.println("au au au grandão");
    }
}
