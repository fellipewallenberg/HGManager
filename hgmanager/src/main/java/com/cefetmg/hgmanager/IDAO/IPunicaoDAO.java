package com.cefetmg.hgmanager.IDAO;

import com.cefetmg.hgmanager.DTO.Punicao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPunicaoDAO extends IBaseDAO<Punicao, Long> {
}
