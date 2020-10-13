package com.shinta.coba.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProfileDto {
    // private Integer idProfile;
    // private String nama;
    // private String pekerjaan;
    private String messages;
}
