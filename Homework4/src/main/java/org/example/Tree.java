package org.example;

import javax.persistence.*;

@Entity
@Table(name = "TREES")
public class Tree {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "parent_id")
    private int parentId;

    // Геттеры, сеттеры и другие поля
}