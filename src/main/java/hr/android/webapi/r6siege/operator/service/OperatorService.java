package hr.android.webapi.r6siege.operator.service;

import hr.android.webapi.r6siege.operator.model.OperatorDTO;

import java.util.List;

public interface OperatorService {

    List<OperatorDTO> findAll();
    List<OperatorDTO> findByType(String type);
    OperatorDTO findById(String code);

}
