public class Cachorro extends Animal {

    public Cachorro(String n){
        if (n == null || (n.trim().length() == 0)) {
            n = "Nome não definido";
        }
        super.nome = n;
    }

    public Cachorro() {
        super.nome = "Nome não definido";
    }

    public String getNome(){
        return this.nome;
    }
    
    @Override
     public void fazerSom(){
        System.out.println("au au");
        System.out.println("au au au");
    }
    
}
