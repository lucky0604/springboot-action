package com.lucky.ch03.conditional;

/**
 * Created by lucky on 12/30/16.
 */
public class WindowsListService implements ListService {
    @Override
    public String showListCmd() {
        return "dir";
    }
}
