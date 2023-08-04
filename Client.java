public class Client {
    // propriété
    private long id;
    private String nomPrenoms;
    private String telephone;
    private CategorieClient categorieClient;

    // Constructeur sans paramètre
    public Client() {

    }

    // constructeur avec paramètre
    public Client(long id, String nomPrenoms, String contact, CategorieClient categorieClient) {
        this.id = id;
        this.nomPrenoms = nomPrenoms;
        this.contact = contact;
        this.categorieClient = categorieClient;
    }

    // Les accesseurs et les mutateurs
    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomPrenoms() {
        return this.nomPrenoms;
    }

    public void setNomPrenoms(String nomPrenoms) {
        this.nomPrenoms = nomPrenoms;
    }

    public String getTelephone() {
        return this.telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public CategorieClient getCategorieClient() {
        return this.categorieClient;
    }

    public void setCategorieClient(CategorieClient categorieClient) {
        this.categorieClient = categorieClient;
    }

}
