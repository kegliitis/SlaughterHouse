package via.sdj3.slaughterhouse.model;

import javax.persistence.*;

@Entity
@Table(name = "animal_parts")
public class AnimalPart
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "weight")
    private double weight;
    @OneToOne
    private Animal animal;
    @OneToOne
    private AnimalPartType animalPartType;
    @ManyToOne
    private Tray tray;
    @ManyToOne
    private Product product;

    public AnimalPart(int id, double weight, Animal animal, AnimalPartType animalPartType, Tray tray, Product product)
    {
        this.id = id;
        this.weight = weight;
        this.animal = animal;
        this.animalPartType = animalPartType;
        this.tray = tray;
        this.product = product;
    }

    public AnimalPart(int id, double weight, Animal animal)
    {
        this.id = id;
        this.weight = weight;
        this.animal = animal;
    }

    public AnimalPart()
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

    public Animal getAnimal()
    {
        return animal;
    }

    public void setAnimal(Animal animal)
    {
        this.animal = animal;
    }

    public AnimalPartType getAnimalPartType()
    {
        return animalPartType;
    }

    public void setAnimalPartType(AnimalPartType animalPartType)
    {
        this.animalPartType = animalPartType;
    }

    public Tray getTray()
    {
        return tray;
    }

    public void setTray(Tray tray)
    {
        this.tray = tray;
    }

    public Product getProduct()
    {
        return product;
    }

    public void setProduct(Product product)
    {
        this.product = product;
    }

    public double getWeight()
    {
        return weight;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }
}
