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
package org.japo.java.app;

import org.japo.java.libraries.UtilesEntrada;

/**
 *
 * @author Oscar G.4 - oscargimenez4@gmail.com
 */
public final class App {

    public final void launchApp() {
        System.out.println("ANÁLISIS DE RANGO");
        System.out.println("=================");
        int valor;

        valor = UtilesEntrada.analizarRango(UtilesEntrada.NUM,
                UtilesEntrada.MIN, UtilesEntrada.MAX);

        switch (valor) {
            case 0:
                System.out.println(UtilesEntrada.MSG_ANA + "DENTRO");
                break;
            case 1:
                System.out.println(UtilesEntrada.MSG_ANA
                        + "FUERA ( Abajo )");
                break;
            case 2:
                System.out.println(UtilesEntrada.MSG_ANA
                        + "FUERA ( Arriba )");
        }
    }
}
