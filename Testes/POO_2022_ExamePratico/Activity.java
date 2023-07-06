package POO_2022_ExamePratico;

public abstract class Activity {
    private String atividade;
    private int participant;
    private int preco;
    private String modal;
    
    public Activity(String atividade, String modal, int participant, int preco) {
        this.atividade = atividade;
        this.participant = participant;
        this.modal = modal;
        this.preco = preco;
    }
    public String getAtividade() {
        return atividade;
    }
    public void String(String atividade) {
        this.atividade = atividade;
    }
    public int getParticipant() {
        return participant;
    }
    public void setParticipant(int participant) {
        this.participant = participant;
    }
    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }
    public int getPreco() {
        return preco*this.participant;
    }
    public void setPreco(int preco) {
        this.preco = preco;
    }
    public String getModal() {
        return modal;
    }
    public void setModal(String modal) {
        this.modal = modal;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((atividade == null) ? 0 : atividade.hashCode());
        result = prime * result + preco;
        result = prime * result + ((modal == null) ? 0 : modal.hashCode());
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
        Activity other = (Activity) obj;
        if (atividade == null) {
            if (other.atividade != null)
                return false;
        } else if (!atividade.equals(other.atividade))
            return false;
        if (preco != other.preco)
            return false;
        if (modal == null) {
            if (other.modal != null)
                return false;
        } else if (!modal.equals(other.modal))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Activity [atividade=" + atividade + ", participant=" + participant + ", preco=" + preco + ", modal="
                + modal + "]";
    }
    
}
