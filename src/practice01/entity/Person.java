package practice01.entity;

import java.util.Objects;

public class Person {

    private Long id;
    private String name;
    private String lastName;
    private String email;
    private String phone;
    private String address;
    private String city;
    private String postalCOde;
    private String country;

    public Person(){}

    public Person(Long id, String name, String lastName, String email, String phone, String address, String city, String postalCOde, String country) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.city = city;
        this.postalCOde = postalCOde;
        this.country = country;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCOde() {
        return postalCOde;
    }

    public void setPostalCOde(String postalCOde) {
        this.postalCOde = postalCOde;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Person person = (Person) object;
        return Objects.equals(id, person.id) && Objects.equals(name, person.name) && Objects.equals(lastName, person.lastName) && Objects.equals(email, person.email) && Objects.equals(phone, person.phone) && Objects.equals(address, person.address) && Objects.equals(city, person.city) && Objects.equals(postalCOde, person.postalCOde) && Objects.equals(country, person.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, lastName, email, phone, address, city, postalCOde, country);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", postalCOde='" + postalCOde + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
