package jpabook.jpashop.domain.item;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Entity
@Setter
@DiscriminatorValue("M")
public class Movie extends Item{
    private String director;
    private String actor;
}
