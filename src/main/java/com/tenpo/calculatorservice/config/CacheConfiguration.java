package com.tenpo.calculatorservice.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

import javax.inject.Inject;

@Configuration
@ConditionalOnProperty(name = "spring.cache.names")
@EnableCaching
public class CacheConfiguration {

    @Value("${spring.cache.names}")
    public String[] cacheNames;

    @Inject
    public CacheManager cacheManager;

    @Bean
    public CacheManager cacheManager() {
        return new ConcurrentMapCacheManager(cacheNames); // Cache Vendor
    }

    @ConditionalOnProperty(name = "spring.cache.autoexpiry", value = "true")
    @Scheduled(fixedDelayString = "${spring.cache.expire.delay:500000}")
    public void cacheEvict() {
        cacheManager.getCacheNames().stream()
                .map(cacheManager::getCache)
                .forEach(Cache::clear);
    }
}

