import javax.swing.JOptionPane;

public class C11EX05 
{
    public static void main(String[] args) 
    {
        String nomeAluno, linguagem;
        int curso, alunosIngles = 0;
        Object[] linguaOpcoes = {1, 2, 3};
        double mensalidade, totalIngles = 0, totalEspanhol = 0, totalFrances = 0, media; 

        nomeAluno = JOptionPane.showInputDialog(null,
        "Informe o nome do aluno:",
        "Exercício 05",
        JOptionPane.QUESTION_MESSAGE);

        while (!nomeAluno.equalsIgnoreCase("fim")) 
        {
            curso = JOptionPane.showOptionDialog(null,
            "Informe o o curso do aluno:\n1 - Inglês\n2 - Francês\n3 - Espanhol", 
            "Exercício 05", 
            0, 
            JOptionPane.QUESTION_MESSAGE, 
            null, 
            linguaOpcoes,
            null);  
            
            if (curso == 0) 
            {
                mensalidade = 100;
                linguagem = "INGLÊS";
                alunosIngles++;
                totalIngles += mensalidade;

            } else if (curso == 1)
            {
                mensalidade = 150;
                linguagem = "FRANCÊS";
                totalFrances += mensalidade;

            } else 
            {
                mensalidade = 120;
                linguagem = "ESPANHOL";
                totalEspanhol += mensalidade;
            }

            System.out.printf("NOME DO ALUNO: %s\nCURSO: %s\nVALOR DA MENSALIDADE: R$ %.2f\n", nomeAluno.toUpperCase(), linguagem, mensalidade);
            System.out.println();

            nomeAluno = JOptionPane.showInputDialog(null,
            "Informe o nome do aluno:",
            "Exercício 05",
            JOptionPane.QUESTION_MESSAGE); 
        }
        media = (100 + 150 + 120) / 3;
        System.out.printf("ALUNOS MATRICULADOS NO CURSO DE INGLÊS = %d\nMENSALIDADE MÉDIA DA ESCOLA: R$ %.2f\nVALOR TOTAL DA MENSALIDADE NAS TURMAS DE INGLÊS: R$ %.2f\nVALOR TOTAL DA MENSALIDADE NAS TURMAS DE FRANCÊS: R$ %.2f\nVALOR TOTAL DA MENSALIDADE NAS TURMAS DE ESPANHOL: R$ %.2f\n", alunosIngles, media, totalIngles, totalFrances, totalEspanhol);
    }
}
