package set.Ordenacao;

import java.util.Comparator;

public class Aluno implements Comparable<Aluno> {
    private String nome;
    private Long matricula;
    private Double media;

    
    public Aluno(String nome, Long matricula, Double media) {
        this.nome = nome;
        this.matricula = matricula;
        this.media = media;
    }
    public String getNome() {
        return nome;
    }
    public Long getMatricula() {
        return matricula;
    }
    public Double getMedia() {
        return media;
    }
    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", matricula=" + matricula + ", media=" + media + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Aluno other = (Aluno) obj;
        if (matricula == null) {
            if (other.matricula != null)
                return false;
        } else if (!matricula.equals(other.matricula))
            return false;
        return true;
    }
    @Override
    public int compareTo(Aluno a) {
        return nome.compareTo(a.getNome());
    }

    

}

class ComparatorNota implements Comparator<Aluno> {
    public int compare(Aluno a1, Aluno a2) {
        return Double.compare(a1.getMedia(), a2.getMedia());
        }
}
