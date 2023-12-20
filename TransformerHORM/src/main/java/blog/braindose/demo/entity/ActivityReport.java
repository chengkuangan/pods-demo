package blog.braindose.demo.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "activityReport")
public class ActivityReport extends PanacheEntityBase{
    
    @Id
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    public long id;
    @Column(nullable=false, length=6)
    public String pnr;
    @Column(nullable=false, length=256)
    public String activityType;
    @Column(nullable=false, length=256)
    public String actionCode;
    @Column(nullable=true, length=256)
    public String elemType;
    @Column(nullable=false, length=256)
    public String elemRefTattooType;
    public int elemRefTattooNum;
    
    
}
