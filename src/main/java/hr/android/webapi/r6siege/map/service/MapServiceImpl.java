package hr.android.webapi.r6siege.map.service;

import hr.android.webapi.r6siege.map.model.Map;
import hr.android.webapi.r6siege.map.model.MapDTO;
import hr.android.webapi.r6siege.map.repository.MapJpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MapServiceImpl implements MapService {

    private final MapJpaRepository mapRep;

    public MapServiceImpl(MapJpaRepository mapRep) {
        this.mapRep = mapRep;
    }

    @Override
    public List<MapDTO> findAll(){
        return mapRep.findAll().stream().map(this::MapToMapDTO).collect(Collectors.toList());
    }

    @Override
    public MapDTO findByCode(String Code){
        return mapRep.findByCode(Code).map(this::MapToMapDTO).orElse(null);
    }

    public MapDTO MapToMapDTO(Map map){
        return new MapDTO(map.getCode(), map.getName(), map.getLocation(), map.getImg(), map.getImg(), map.getImgGr(), map.getImgFrst());
    }
}
