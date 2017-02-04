#!/usr/bin/env python
# -*- coding: utf-8 -*-
import pygame
from pygame.locals import *
from unittest.test.test_result import __init__
from tempfile import _name_sequence

def main(): 
    pygame.init()
    pygame.display.set_mode([300, 300])  # establecemos el tama�o de la pantalla(ancho y alto)
    salir = False
    
    while salir != True:  # loop principal
        for event in pygame.event.get():  # busca eventos
            if event.type == pygame.QUIT:  # si el evento es igual a Quit sale de bucle while
                salir = True
        
        pygame.display.update()  # actualiza toda la pantalla o el rectangulo que especifiquemos en los parametros
        
    pygame.quit()
    
if __name__ == "__main__":
    main()
    