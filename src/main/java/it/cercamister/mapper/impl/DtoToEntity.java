package it.cercamister.mapper.impl;

import org.springframework.stereotype.Component;

import it.cercamister.dto.AllenatoreDTO;
import it.cercamister.dto.TipoLicenzaDTO;
import it.cercamister.mapper.IDtoToEntity;
import it.cercamister.model.entity.AllenatoreEntity;

@Component
public class DtoToEntity implements IDtoToEntity {

	@Override
	public AllenatoreEntity allenatoreDTOToAllenatoreEntity(AllenatoreDTO allenatoreDTO) {
		AllenatoreEntity allenatoreEntity = null;
		
		if ( allenatoreDTO != null ) {
			allenatoreEntity = new AllenatoreEntity();
			
			allenatoreEntity.setId(allenatoreDTO.getProgressivoAllenatore());
			
			TipoLicenzaDTO tipoLicenzaDTO = allenatoreDTO.getTipoLicenzaDTO();
			if ( tipoLicenzaDTO != null && tipoLicenzaDTO.getProgressivoTipoLicenza() != null ) {
				allenatoreEntity.setLicId(tipoLicenzaDTO.getProgressivoTipoLicenza());
			}
			
			allenatoreEntity.setAllNome(allenatoreDTO.getNome());
			allenatoreEntity.setAllCognome(allenatoreDTO.getCognome());
			allenatoreEntity.setAllNazione(allenatoreDTO.getNazione());
			allenatoreEntity.setAllCitta(allenatoreDTO.getCitta());
			allenatoreEntity.setAllIndirizzo(allenatoreDTO.getDescrizioneIndirizzo());
			allenatoreEntity.setAllEmail(allenatoreDTO.getEmail());
			allenatoreEntity.setAllTelefono(allenatoreDTO.getTelefono());
			allenatoreEntity.setAllFlagTrasfertaCitta(allenatoreDTO.getFlagSpostaCitta());
			allenatoreEntity.setAllFlagTrasfertaNazione(allenatoreDTO.getFlagSpostaNazione());
			allenatoreEntity.setAllFlagTrasfertaContinente(allenatoreDTO.getFlagSpostaContinente());
		}
		
		return allenatoreEntity;
	}

}