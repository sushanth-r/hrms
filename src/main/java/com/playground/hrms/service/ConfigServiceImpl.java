package com.playground.hrms.service;

import com.playground.hrms.dto.AllConfigDTO;
import com.playground.hrms.dto.ConfigDTO;
import com.playground.hrms.entity.Config;
import com.playground.hrms.repository.ConfigRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class ConfigServiceImpl implements ConfigService {

  private final ConfigRepository configRepository;

  public ConfigServiceImpl(ConfigRepository configRepository) {
    this.configRepository = configRepository;
  }

  @Override
  public AllConfigDTO getAllConfig() {
    log.info("Fetching all available config from database");
    List<ConfigDTO> configList = new ArrayList<>();
    List<Config> allConfig = configRepository.findAll();
    for (Config config: allConfig) {
      ConfigDTO configDTO = ConfigDTO.builder().key(config.getKey()).value(config.getValue()).build();
      configList.add(configDTO);
    }
    return AllConfigDTO.builder().configList(configList).build();
  }

}
