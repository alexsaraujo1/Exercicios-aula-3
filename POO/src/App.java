public class App {
    public static void main(String[] args) throws Exception {
        Cachorro rex = new Cachorro("Dhomi", "Viralata", "M", 40f , 2018);
        
        rex.description();
       
     
       
     
        System.out.println("Execução Terminada");
    }
}

class Cachorro {
    
    private String race;
    private float size;
    private int age;
    private String name;
    private String sex;

    private float weight;
    private float thirstMeter;
    private String hasVaccine;

    public Cachorro(String name){
        this.name = name;
        this.race = "Vira-lata";
        this.size = 40f;
        this.age = 2;
        this.sex = "M";
    }

    public Cachorro(String name, String race, String sex, float size, int birth){
        this.name = name;
        this.race = race;
        this.sex = sex;
        this.size = size;
        this.age = 2023 - birth;
    }

    public void description(){
        System.out.println(
        "Esse é " + this.name +
        ", ele é um cachorro da raça " + this.race +
        " tem de porte " + this.size + 
        ",é do sexo " + this.sex +
        " e tem " + this.age + " anos");
    }

}




class Glass{
    private float volume;
    private float liquidVolume;

    public Glass(float volume){
        this.volume = volume;
        this.liquidVolume = 0f;
    }

    public float getLiquidVolume(){
        return liquidVolume;
    }

    public void setLiquidVolume(float liquidVolume){
        if(liquidVolume < 0){
            return;
        }
        if(liquidVolume > this.volume){
            this.liquidVolume = this.volume;
            return;
        }
        this.liquidVolume = liquidVolume;
    }

    public float getVolume(){
        return volume;
    }

    public String description(){
        return ("Volume do copo: " + this.volume + " Volume do liquido: " + this.liquidVolume);
    }
}