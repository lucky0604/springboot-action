package com.lucky.ch02.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by lucky on 12/29/16.
 */
@Service
// 声明scope为prototype
@Scope("prototype")
public class PrototypeService {
}
