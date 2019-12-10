
package appvisoranimales;

/**
 *
 * @author Alejandro
 */
public class Animal
{
    private String nombre;
    private String imagenMiniatura; //thumbnail
    private String imagenGrande;
    
    
    public Animal(String nombre, String imagenMiniatura, String imagenGrande)
    {
        this.nombre = nombre;
        this.imagenMiniatura = imagenMiniatura;
        this.imagenGrande = imagenGrande;
    }
    
    
    @Override
    public String toString()
    {
        return nombre;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getImagenMiniatura()
    {
        return imagenMiniatura;
    }

    public void setImagenMiniatura(String imagenMiniatura)
    {
        this.imagenMiniatura = imagenMiniatura;
    }

    public String getImagenGrande()
    {
        return imagenGrande;
    }

    public void setImagenGrande(String imagenGrande)
    {
        this.imagenGrande = imagenGrande;
    }
    
}

 