package com.playground.hrms.controller;

import com.playground.hrms.dto.AllConfigDTO;
import com.playground.hrms.dto.ConfigDTO;
import com.playground.hrms.service.ConfigService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
public class ConfigController {

  private final ConfigService configService;

  public ConfigController(ConfigService configService) {
    this.configService = configService;
  }

  @GetMapping
  public ResponseEntity<AllConfigDTO> getAllConfig() {
    return ResponseEntity.ok().body(configService.getAllConfig());
  }
}
