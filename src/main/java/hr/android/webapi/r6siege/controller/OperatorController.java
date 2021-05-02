package hr.android.webapi.r6siege.controller;

import hr.android.webapi.r6siege.operator.model.OperatorDTO;
import hr.android.webapi.r6siege.operator.service.OperatorService;
import org.apache.commons.io.IOUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/operator", produces = "application/json")
public class OperatorController {

    private final OperatorService opService;

    public OperatorController(OperatorService opService) {
        this.opService = opService;
    }

    @GetMapping
    public List<OperatorDTO> findAll(){
        return opService.findAll();
    }

    @GetMapping(params = "TYPE")
    public List<OperatorDTO> findByType(@RequestParam final String TYPE){
        return opService.findByType(TYPE);
    }

    @GetMapping(params = "ID")
    public ResponseEntity<OperatorDTO> findById(@RequestParam final String ID){
        return Optional.ofNullable(opService.findById(ID))
                .map(
                        OperatorDTO -> ResponseEntity
                                .status(HttpStatus.OK)
                                .body(OperatorDTO)
                ).orElseGet(
                        () -> ResponseEntity
                                .status(HttpStatus.NOT_FOUND)
                                .build()
                );
    }

    @GetMapping(params = "image", produces = MediaType.IMAGE_PNG_VALUE)
    public byte[] getImage(@RequestParam final String image) throws IOException {
        InputStream in = this.getClass().getResourceAsStream("/images/" + image);
        return IOUtils.toByteArray(in);
    }
}
