package com.callcenter.CallCenterApplication.gateways;

import com.callcenter.CallCenterApplication.entitys.clients.ClientEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.math.BigDecimal;

@RepositoryRestResource(collectionResourceRel = "client", path = "client")
public interface ClientsGateway extends PagingAndSortingRepository<ClientEntity, BigDecimal> {

    ClientEntity findByCpf(@Param("cpf") final BigDecimal cpf);

}
