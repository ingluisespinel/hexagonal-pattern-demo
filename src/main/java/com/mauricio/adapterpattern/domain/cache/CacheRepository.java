package com.mauricio.adapterpattern.domain.cache;

import java.util.Map;

public interface CacheRepository {

    Map<String,String> getUserCategories();
}
