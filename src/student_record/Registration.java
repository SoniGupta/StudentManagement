/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student_record;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author soni
 */
@Entity
@Table(name = "Registration", catalog = "studentdb", schema = "")
@NamedQueries({
    @NamedQuery(name = "Registration.findAll", query = "SELECT r FROM Registration r"),
    @NamedQuery(name = "Registration.findByStuId", query = "SELECT r FROM Registration r WHERE r.stuId = :stuId"),
    @NamedQuery(name = "Registration.findByName", query = "SELECT r FROM Registration r WHERE r.name = :name"),
    @NamedQuery(name = "Registration.findByFatherName", query = "SELECT r FROM Registration r WHERE r.fatherName = :fatherName"),
    @NamedQuery(name = "Registration.findByAddress", query = "SELECT r FROM Registration r WHERE r.address = :address"),
    @NamedQuery(name = "Registration.findByGender", query = "SELECT r FROM Registration r WHERE r.gender = :gender"),
    @NamedQuery(name = "Registration.findByLastQualification", query = "SELECT r FROM Registration r WHERE r.lastQualification = :lastQualification"),
    @NamedQuery(name = "Registration.findByEmailId", query = "SELECT r FROM Registration r WHERE r.emailId = :emailId"),
    @NamedQuery(name = "Registration.findByContact", query = "SELECT r FROM Registration r WHERE r.contact = :contact")})
public class Registration implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Stu_Id")
    private String stuId;
    @Column(name = "Name")
    private String name;
    @Column(name = "Father_Name")
    private String fatherName;
    @Column(name = "Address")
    private String address;
    @Column(name = "Gender")
    private String gender;
    @Column(name = "LastQualification")
    private String lastQualification;
    @Column(name = "Email_Id")
    private String emailId;
    @Column(name = "Contact")
    private String contact;

    public Registration() {
    }

    public Registration(String stuId) {
        this.stuId = stuId;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        String oldStuId = this.stuId;
        this.stuId = stuId;
        changeSupport.firePropertyChange("stuId", oldStuId, stuId);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        String oldFatherName = this.fatherName;
        this.fatherName = fatherName;
        changeSupport.firePropertyChange("fatherName", oldFatherName, fatherName);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        String oldAddress = this.address;
        this.address = address;
        changeSupport.firePropertyChange("address", oldAddress, address);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        String oldGender = this.gender;
        this.gender = gender;
        changeSupport.firePropertyChange("gender", oldGender, gender);
    }

    public String getLastQualification() {
        return lastQualification;
    }

    public void setLastQualification(String lastQualification) {
        String oldLastQualification = this.lastQualification;
        this.lastQualification = lastQualification;
        changeSupport.firePropertyChange("lastQualification", oldLastQualification, lastQualification);
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        String oldEmailId = this.emailId;
        this.emailId = emailId;
        changeSupport.firePropertyChange("emailId", oldEmailId, emailId);
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        String oldContact = this.contact;
        this.contact = contact;
        changeSupport.firePropertyChange("contact", oldContact, contact);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (stuId != null ? stuId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Registration)) {
            return false;
        }
        Registration other = (Registration) object;
        if ((this.stuId == null && other.stuId != null) || (this.stuId != null && !this.stuId.equals(other.stuId))) {
            return false;
        }
        return true;
    }

//    @Override
//    public String toString() {
//        return "student_record.Registration[ stuId=" + stuId + " ]";
//    }

    @Override
    public String toString() {
        return "Registration{" + "changeSupport=" + changeSupport + ", stuId=" + stuId + ", name=" + name + ", fatherName=" + fatherName + ", address=" + address + ", gender=" + gender + ", lastQualification=" + lastQualification + ", emailId=" + emailId + ", contact=" + contact + '}';
    }

    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
