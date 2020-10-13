package com.shinta.coba.model;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name="tabel_profile")
public class ProfileEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer idProfile;
    @Column(name="nama")
    private String nama;
    @Column(name="pekerjaan")
    private String pekerjaan;
}
