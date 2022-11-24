package via.sdj3.slaughterhouse.model;


import java.util.List;
import javax.persistence.*;
@Entity
@Table(name = "products")
public class Product
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @ElementCollection
    private List<Integer> animalPartIds;
    @OneToOne
    private Tray tray;

    public Product(int id, String name, String description, Tray tray)
    {
        this.id = id;
        this.name = name;
        this.description = description;
        this.tray = tray;
    }

    public Product()
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

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public List<Integer> getAnimalPartIds()
    {
        return animalPartIds;
    }

    public void setAnimalPartIds(List<Integer> animalPartIds)
    {
        this.animalPartIds = animalPartIds;
    }

    public Tray getTray()
    {
        return tray;
    }

    public void setTray(Tray tray)
    {
        this.tray = tray;
    }
}
