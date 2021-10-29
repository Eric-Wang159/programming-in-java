package agh.ii.prinjava.lab06.lst01_05;

import java.util.Optional;

record Person2(String givenName,
               Optional<String> middleName,
               String surname) {
}
