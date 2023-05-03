package classes;
import java.util.Date;

public class Finance {

    private int id;
    private String description;
    private double value;
    private Date date;

    public Finance(int id, String description, double value, Date date) {
        this.id = id;
        this.description = description;
        this.value = value;
        this.date = date;
    }

    // Adicionando o método setValue() na classe Finance
    public void setValue(double value) {
        this.value = value;
    }

    // Adicionando os getters e setters para as demais propriedades
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getValue() {
        return value;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Finance [id=" + id + ", description=" + description + ", value=" + value + ", date=" + date + "]";
    }
}
