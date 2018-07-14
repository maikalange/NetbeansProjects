/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lusakafreeads;

import java.util.Objects;

/**
 *
 * @author MARCUS
 */
public final class Some<T> extends Option<T> {

    private final T value;

    public Some(T value) {
        this.value = value;
    }

    @Override
    public boolean hasValue() {
        return true;
    }

    @Override
    public T get() {
        return this.value;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null || other.getClass() != Some.class) {
            return false;
        }
        Some<?> that = (Some<?>) other;
        return (value.equals(that.get()));

    }

    @Override
    public String toString() {
        return "Some(" + value + ")";
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.value);
        return hash;
    }

}
