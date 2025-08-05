package br.com.dio.challenge.challenge;

public class Course extends Content {
    private int workload;

    @Override
    public double calculateExp() {
        return DEFAULT_EXP * workload;
    }

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitle() + '\'' +
                ", descricao='" + getDescription() + '\'' +
                ", cargaHoraria=" + workload +
                '}';
    }
}
