package via.sdj3.slaughterhouse.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "stores")
public class Store
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "address")
    private String address;
    @OneToMany
    private List<Product> products;

    public Store(int id, String name, String description, String address, List<Product> products)
    {
        this.id = id;
        this.name = name;
        this.description = description;
        this.address = address;
        this.products = products;
    }

    public Store()
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

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public List<Product> getProducts()
    {
        return products;
    }

    public void setProducts(List<Product> products)
    {
        this.products = products;
    }
}
