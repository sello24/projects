import java.io.Serializable;

@Named
@SessionScoped
@ConnectionFactoryDefinition(
    interfaceName = "MyConnectionFactory",
    resourceAdapter = "#myData-rar",
)
public class ResourceAccessBean implements Serializable { ... }


