package via.sdj3.slaughterhouse.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "trays")
public class Tray
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @OneToMany
    private List<AnimalPart> animalParts;
    @Column(name = "description")
    private String description;
    @Column(name = "max_weight")
    private double maxWeight;

    public Tray(int id, String description, double maxWeight)
    {
        this.id = id;
        this.description = description;
        this.maxWeight = maxWeight;
    }

    public Tray()
    {
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public List<AnimalPart> getAnimalParts()
    {
        return animalParts;
    }

    public void setAnimalParts(List<AnimalPart> animalParts)
    {
        this.animalParts = animalParts;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public double getMaxWeight()
    {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight)
    {
        this.maxWeight = maxWeight;
    }
}
