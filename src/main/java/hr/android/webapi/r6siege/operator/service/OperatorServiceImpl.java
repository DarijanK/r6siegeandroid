package hr.android.webapi.r6siege.operator.service;

import hr.android.webapi.r6siege.operator.model.Operator;
import hr.android.webapi.r6siege.operator.model.OperatorDTO;
import hr.android.webapi.r6siege.operator.repository.OperatorJpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OperatorServiceImpl implements OperatorService {

    private final OperatorJpaRepository opRes;

    public OperatorServiceImpl(OperatorJpaRepository jdbcRep) {
        this.opRes = jdbcRep;
    }

    @Override
    public List<OperatorDTO> findAll(){
        return opRes.findAll().stream().map(this::mapOperatorToDTO).collect(Collectors.toList());
    }

    @Override
    public List<OperatorDTO> findByType(String type){
        return opRes.findByType(type.toLowerCase()).stream().map(this::mapOperatorToDTO).collect(Collectors.toList());
    }

    @Override
    public OperatorDTO findById(String code){
        return opRes.findByCode(code.toUpperCase()).map(this::mapOperatorToDTO).orElse(null);
    }

    private OperatorDTO mapOperatorToDTO(Operator operator){
        return new OperatorDTO(operator.getCode(), operator.getNickname(), operator.getDob(), operator.getType(), operator.getIconImg(), operator.getArmor(), operator.getSpeed(), operator.getSpecGadget());
    }
}
