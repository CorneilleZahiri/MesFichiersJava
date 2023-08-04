public class Commande {
    private long id;
    private String reference;
    private Date dateCommande;
    private Client client;

    public Commande() {

    }

    public Commande(long id, String reference, Date dateCommande, Client client) {
        this.id = id;
        this.reference = reference;
        this.dateCommande = dateCommande;
        this.client = client;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getReference() {
        return this.reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Date getDateCommande() {
        return this.dateCommande;
    }

    public void setDateCommande(Date dateCommande) {
        this.dateCommande = dateCommande;
    }

    public Client getClient() {
        return this.client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}