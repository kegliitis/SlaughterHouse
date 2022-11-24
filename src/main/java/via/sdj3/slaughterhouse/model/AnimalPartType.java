package via.sdj3.slaughterhouse.model;


import javax.persistence.*;

@Entity
@Table(name = "animal_part_types")
public class AnimalPartType
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;

    public AnimalPartType(int id, String name, String description)
    {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public AnimalPartType()
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
}
