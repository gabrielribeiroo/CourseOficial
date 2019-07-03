/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author cn3
 */
public class Aluguel {
    private int room;
    private String name;
    private String email;
    
    public Aluguel (int room, String name, String email){
        this.room = room;
        this.name = name;
        this.email = email;
    }

    /**
     * @return the room
     */
    public int getRoom() {
        return room;
    }

    /**
     * @param room the room to set
     */
    public void setRoom(int room) {
        this.room = room;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
}
