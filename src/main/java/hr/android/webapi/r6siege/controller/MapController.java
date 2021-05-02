package hr.android.webapi.r6siege.controller;

import hr.android.webapi.r6siege.map.model.MapDTO;
import hr.android.webapi.r6siege.map.service.MapService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/map", produces = "application/json")
public class MapController {

    private MapService mapService;

    public MapController(MapService mapSer) {
        this.mapService = mapSer;
    }

    @GetMapping
    public List<MapDTO> findAll(){
        return mapService.findAll();
    }

    @GetMapping(params = "CODE")
    public ResponseEntity<MapDTO> findByCode(@RequestParam String CODE){
        return Optional.ofNullable(mapService.findByCode(CODE))
                .map(
                        MapDTO -> ResponseEntity
                                .status(HttpStatus.OK)
                                .body(MapDTO))
                .orElseGet(() -> ResponseEntity
                        .status(HttpStatus.NOT_FOUND)
                        .build());
    }

}
