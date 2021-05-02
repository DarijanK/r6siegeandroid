package hr.android.webapi.r6siege.map.service;

import hr.android.webapi.r6siege.map.model.MapDTO;

import java.util.List;

public interface MapService {

    List<MapDTO> findAll();
    MapDTO findByCode (String Code);

}
