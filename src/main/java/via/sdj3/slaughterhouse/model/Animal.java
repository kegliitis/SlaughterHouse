package via.sdj3.slaughterhouse.model;

import javax.persistence.*;

@Entity
@Table(name = "animals")
public class Animal
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @OneToOne
    private AnimalType animalType;
    @Column(name = "weight")
    private double weight;
    @Column(name = "registration_date")
    private String registrationDate;
    @Column(name = "healthy")
    private boolean healthy;

    public Animal(int id, AnimalType animalType, double weight, String registrationDate, boolean healthy)
    {
        this.id = id;
        this.animalType = animalType;
        this.weight = weight;
        this.registrationDate = registrationDate;
        this.healthy = healthy;
    }

    public Animal()
    {
    }

    public AnimalType getAnimalType()
    {
        return animalType;
    }

    public void setAnimalType(AnimalType animalType)
    {
        this.animalType = animalType;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public double getWeight()
    {
        return weight;
    }

    public void setWeight(int weight)
    {
        this.weight = weight;
    }

    public String getRegistrationDate()
    {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate)
    {
        this.registrationDate = registrationDate;
    }

    public boolean isHealthy()
    {
        return healthy;
    }

    public void setHealthy(boolean healthy)
    {
        this.healthy = healthy;
    }
}

