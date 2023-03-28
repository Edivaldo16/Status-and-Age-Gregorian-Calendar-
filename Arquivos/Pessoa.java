package revisao01;

import java.util.Date;
import java.util.GregorianCalendar;

public class Pessoa {
	private String nome;
	private String sexo;
	private Double peso;
	GregorianCalendar calendar = new GregorianCalendar();
    public int idade;
    public final int anoatual= calendar.get(GregorianCalendar.YEAR);
    public final int mesatual = calendar.get(GregorianCalendar.MONTH);
    public final int diaatual = calendar.get(GregorianCalendar.DAY_OF_MONTH); 
    public int anoNasc;
    public int mesNsac;
    public int diaNasc;
    
    //Special Methods
    public void calculandoIdade() {
        Date data = new Date(System.currentTimeMillis());
         System.out.println(data);

         System.out.println("                                          Data:"+this.diaatual+"/"+(this.mesatual+1)+"/"+this.anoatual);
         if (this.diaNasc>31 || this.mesNsac > 12 || this.diaatual>31 || this.mesatual > 12){
             System.out.println("Você digitou alguma data errada confira novamente!");
                     }else{System.out.println("Você nasceu em: "+this.diaNasc+"/"+this.mesNsac+"/"+this.anoNasc);}

         if (this.diaNasc>31 || this.mesNsac > 12 || this.diaatual>31 || this.mesatual > 12){
             System.out.println("Você digitou alguma data errada confira novamente!");
           }else if(this.mesNsac < this.mesatual ){
             this.idade = this.anoNasc - this.anoatual;
             System.out.println("Idade: "+this.idade+" anos");
         }else if (this.mesNsac > this.mesatual){
             this.idade = this.anoatual - this.anoNasc - 1;
             System.out.println("Idade: "+this.idade+" anos");
       }else if (this.mesNsac == this.mesatual && this.diaNasc == this.diaatual ){
             this.idade = this.anoatual - this.anoNasc;
             System.out.println("Idade: "+this.idade+" anos");
             System.out.println("Parabens!! Feliz Aniversário");
         }else if(this.mesNsac == this.mesatual && this.diaNasc < this.diaatual){
             this.idade = this.anoatual - this.anoNasc - 1;
             System.out.println("Idade: "+this.idade+" anos");
         }else if(this.mesNsac == this.mesatual && this.diaNasc > this.diaatual){
             this.idade = this.anoatual - this.anoNasc;

      };
    }
    
    public void status() {
	System.out.println("Nome: " + this.getNome() +  "\nSexo: " + this.getSexo() + "\nPeso: " + this.getPeso());
	calculandoIdade();
	}
  
    //Constructor
    
    public Pessoa(String nome, String sexo, Double peso, int diaNasc, int mesNsac, int anoNasc) {
		this.nome = nome;
		this.sexo = sexo;
		this.peso = peso;
		this.calendar = calendar;
		this.anoNasc = anoNasc;
		this.mesNsac = mesNsac;
		this.diaNasc = diaNasc;
		status();	
	}
    
	//Methods Getters and Setters 
		
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

}
