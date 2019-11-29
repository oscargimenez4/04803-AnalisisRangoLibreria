/*
 * Copyright 2019 Oscar G.4 - oscargimenez4@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.libraries;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Oscar G.4 - oscargimenez4@gmail.com
 */
public class UtilesEntrada {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");
    //Constantes
    public static final int NUM = 0;
    public static final int MIN = 1;
    public static final int MAX = 10;
    public static final String MSG_USR = "Número ......: ";
    public static final String MSG_MIN = "Mínimo ......: ";
    public static final String MSG_MAX = "Máximo ......: ";
    public static final String MSG_ANA = "Análisis ....: ";
    public static final String MSG_ERR = "Error";

    public static final int analizarRango(double num, int min, int max) {
        boolean errorOK = true;
        int valor = 0;
        do {
            try {
                System.out.print(MSG_USR);
                num = SCN.nextInt();
                if (num > min && num < max) {
                    valor = 0;
                } else if (num < min) {
                    valor = 1;
                } else if (num > max) {
                    valor = 2;
                }
                errorOK = false;

            } catch (Exception e) {
                System.out.println(MSG_ERR);
                System.out.println("---");

            } finally {
                SCN.nextLine();
            }
        } while (errorOK);

        System.out.println("---");
        System.out.printf(MSG_MIN + "%d%n", min);
        System.out.printf(MSG_MAX + "%d%n", max);
        System.out.println("---");

        return valor;
    }
}
