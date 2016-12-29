package com.lucky.ch02.scope;

import org.springframework.stereotype.Service;

/**
 * Created by lucky on 12/29/16.
 *
 * Scope描述的是Spring容器如何新建Bean的实例
 */
// 默认为Singleto，相当于@Scope("singleton")
@Service
public class SingletonService {
}
