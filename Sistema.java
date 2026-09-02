public class Sistema {
    
    public static void main(String[] args) {
        String nomeAluno = "Carlos";
        double nota1 = 8.0;
        double nota2 = 7.0;
        
        double mediaFinal = calcularMedia(nota1, nota2);
        String situacao = verificarSituacao(mediaFinal);
        
        apresentarResultados(nomeAluno, mediaFinal, situacao);
    }
    
    private static double calcularMedia(double nota1, double nota2) {
        return (nota1 + nota2) / 2.0;
    }
    
    private static String verificarSituacao(double media) {
        if (media >= 6.0) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
    
    private static void apresentarResultados(String nomeAluno, double mediaFinal, String situacao) {
        System.out.println("Aluno: " + nomeAluno);
        System.out.println("Media: " + mediaFinal);
        System.out.println("Situação: " + situacao);
    }
}
