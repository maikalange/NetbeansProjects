/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lusakafreeads;

/**
 *
 * @author MARCUS
 */
public abstract class Option<T> {

    public abstract boolean hasValue();

    public abstract T get();

    public  T getOrElse(T alternative) {
        return hasValue() == true ? get() : alternative;
    }

}
