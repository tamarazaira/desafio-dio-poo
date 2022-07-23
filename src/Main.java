import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();

        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descroção curso java");
        curso1.setCargaHoraria(8);

        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descroção curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Descrição de mentoria java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Descrição");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devTamara = new Dev();
        devTamara.setNome("Tamara");
        devTamara.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Tamara " + devTamara.getConteudosInscritos());
        System.out.println("#######");
        devTamara.progredir();
        devTamara.progredir();
        System.out.println("Conteúdos Inscritos Tamara " + devTamara.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Tamara " + devTamara.getConteudosConcluidos());
        System.out.println("XP: " + devTamara.calcularXP());
        System.out.println("#######");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Joao " + devJoao.getConteudosInscritos());
        System.out.println("#######");
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("Conteúdos Inscritos Joao " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Joao " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularXP());


    }
}
