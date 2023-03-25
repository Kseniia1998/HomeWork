package home_work5;

import java.util.ArrayList;
import java.util.List;

public class FitnessClub {
    private String clubName;
    private String address;
    private int maxAvailabilityClientsPlaces;
    private List<Client> clientList;

    public FitnessClub(String clubName, String address, int maxAvailabilityClientsPlaces) {
        this.clubName = clubName;
        this.address = address;
        this.maxAvailabilityClientsPlaces = maxAvailabilityClientsPlaces;
        this.clientList = new ArrayList<>();
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMaxAvailabilityClientsPlaces() {
        return maxAvailabilityClientsPlaces;
    }

    public void setMaxAvailabilityClients(int maxAvailabilityClientsPlaces) {
        this.maxAvailabilityClientsPlaces = maxAvailabilityClientsPlaces;
    }

    public int getCurrentClientsNumber() {
        return this.clientList.size();
    }

    public List<Client> getClientList() {
        return clientList;
    }

    public void addNewClient(Client newClient) {
        if(getMaxAvailabilityClientsPlaces() < getCurrentClientsNumber()){
            System.out.println("Не можем добавить нового клиента. Мест нет =(");
            return;
        }
        getClientList().add(newClient);
    }

    public Client getClientByName(String clientName){
        for (Client client : getClientList()) {
            if (client.getFirstName().equals(clientName)) {
                return client;
            }
        }
        return null;
    }

    public Client getClientByLastName(String clientLastName){
        for (Client client : getClientList()) {
            if (client.getLastName().equals(clientLastName)) {
                return client;
            }
        }
        return null;
    }
}
