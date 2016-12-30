package com.lucky.ch03.conditional;


import org.springframework.stereotype.Service;

/**
 * Created by lucky on 12/30/16.
 */
@Service
public class LinuxListService implements ListService {
    @Override
    public String showListCmd() {
        return "ls";
    }
}
