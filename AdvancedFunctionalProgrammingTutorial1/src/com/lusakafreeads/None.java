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
public final class None<T> extends Option<T> {

    private static class NoneHasNoValue extends RuntimeException {
    }

    public None() {
    }

    @Override
    public boolean hasValue() {
        return false;
    }

    public T get() {
        throw new NoneHasNoValue();
    }

    @Override
    public String toString() {
        return "None";
    }

    @Override
    public boolean equals(Object other) {
        return (other != null && other.getClass() == None.class);
    }

    @Override
    public int hashCode() {
        return -1;
    }

}
