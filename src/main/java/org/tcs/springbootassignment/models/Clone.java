package org.tcs.springbootassignment.models;

import com.sun.istack.NotNull;
import com.sun.istack.Nullable;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Clone{
    //inspired myself from star wars clone troops
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    private final String birthPlace = "Kamino";

    @NotNull
    private String codeName;

    @Nullable
    private int platoon;

    private final String affiliation = "Galactic Republic";
}