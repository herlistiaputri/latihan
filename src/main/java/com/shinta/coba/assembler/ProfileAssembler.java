package com.shinta.coba.assembler;

import org.springframework.stereotype.Component;
import com.shinta.coba.model.ProfileDto;
import com.shinta.coba.model.ProfileEntity;

@Component
public class ProfileAssembler implements InterfaceAssembler <ProfileEntity, ProfileDto> {

	@Override
	public ProfileEntity fromDto(ProfileDto dto) {
		ProfileEntity entity = new ProfileEntity();
		entity.setNama(dto.getNama());
		entity.setPekerjaan(dto.getPekerjaan());
		return entity;
	}

	@Override
	public ProfileDto fromEntity(ProfileEntity entity) {
		if (entity == null) return null;
		return ProfileDto.builder()
				.idProfile(entity.getIdProfile())
				.nama(entity.getNama())
				.pekerjaan(entity.getPekerjaan())
				.build();
	}
    
}
