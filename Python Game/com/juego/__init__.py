#!/usr/bin/env python
# -*- coding: utf-8 -*-
import pygame, sys, time, random
from pygame.locals import *

# establece pygame
pygame.init()
reloj = pygame.time.Clock()  # inicializa el reloj del juego mediante el manejo de los frames por segundo 

# ventana
ancho = 400
alto = 400
ventana = pygame.display.set_mode((ancho, alto), 0, 32)  # ancho y alto de la ventana 
pygame.display.set_caption("Game T-Rex")  # titulo de la ventana pygame

derecha = 4

velocidad = 4  # cuatro pixeles  por iteracion

# velocidad de las diferentes nubes
nubechica = 3 
nubegrande = 1

# velocidad de salto
velocidad_x = 0.0
velocidad_y = 0.0
nivelSuelo = 351

# Cargarmos las imagenes del escenario
imagenNube = pygame.image.load("nube.png").convert_alpha()
imagenSuelo = pygame.image.load("suelo.png").convert_alpha()
sueloEstirado = pygame.transform.scale(imagenSuelo, (404, 50)).convert_alpha()

# Establece la estructura de datos de los bloques
                    
nube1 = {"rect":pygame.Rect(300, 50, 40, 40), "dir":derecha, "tipoNube":nubegrande, "imagen":imagenNube, "elemento":1}
nube2 = {"rect":pygame.Rect(55, 55, 40, 40), "dir":derecha, "tipoNube":nubechica, "imagen":imagenNube, "elemento":2}
nube3 = {"rect":pygame.Rect(50, 150, 40, 40), "dir":derecha, "tipoNube":nubegrande, "imagen":imagenNube, "elemento":3}
suelo = {"rect":pygame.Rect(0, 357, 308, 43), "dir":derecha, "tipoNube":velocidad, "imagen":sueloEstirado, "elemento":4}
suelo1 = {"rect":pygame.Rect(400, 357, 308, 43), "dir":derecha, "tipoNube":velocidad, "imagen":sueloEstirado, "elemento":5}
bloques = [nube1, nube2, nube3, suelo, suelo1]

# my_sprite = TestSprite() #se crea un objeto TestSprite
# my_group = pygame.sprite.Group(my_sprite)# Crea un grupo de Imagenes

# cargar imagenes
sprite1 = pygame.image.load("personaje1.png").convert_alpha()
small = pygame.transform.scale(sprite1, (50, 50))  # modificacion del tama�o del sprite mediante la funcion transform
sprite2 = pygame.image.load("personaje2.png").convert_alpha()  # convert_alpha elimina los fondos y transforma la imagen en una imagen png
small2 = pygame.transform.scale(sprite2, (50, 50))
sprite3 = pygame.image.load("personaje3.png").convert_alpha()
small3 = pygame.transform.scale(sprite3, (50, 50))
spriteuno = small.copy()  # copia de la imagenes del personaje para poder hacer un delay
spritedos = small2.copy()
spritetres = small3.copy()
listaSprite = [small, spriteuno, small2, spritedos, small3, spritetres]
                #   X   Y  ancho alto
rect = pygame.Rect(20, 310, 50, 50)
FPS = 30
imagenNumero = 0
mainLoop = True

# Bucle sprite
contador = 6

# Cargando la imange de fondo
fondo = pygame.image.load("imagen_fondo.png").convert_alpha()
posicion_fondo = [0, 0]

# Reproducimos la musica de fondo
pygame.mixer.music.load("buble.mid")
pygame.mixer.music.set_endevent(pygame.constants.USEREVENT)
pygame.mixer.music.play()

while mainLoop:
      
    
    # busca evento QUIT
    for evento in pygame.event.get():
        if evento.type == QUIT:
            pygame.quit()
            sys.exit()
        # Buscar eventos del teclado
        if evento.type == pygame.KEYDOWN:
            # buscar la tecla pulsada
            if evento.key == pygame.K_UP:
                velocidad_y -= 30.0
                if rect.top < 300: #si la parte de arriba del rectangulo es mayor que 300 invertimos el valor de velocidad
                    velocidad_y = velocidad_y * -1

    ventana.blit(fondo, posicion_fondo)
    for b in bloques:
        # mueve la estructura de datos de bloques
        if b["dir"] == derecha:
            if b["tipoNube"] == nubechica:
                b["rect"].left -= nubechica
            if b["tipoNube"] == nubegrande:
                b["rect"].left -= nubegrande
            if b["tipoNube"] == velocidad:
                b["rect"].left -= velocidad
        # verificar si el bloque salio por algun costado 
            # si la figura salio  pixeles por laa izquierda
        if b["rect"].left < -400:
            # el bloque salio por la izquierda de la ventana
            if b["imagen"] == imagenNube:
                # las coordenadas de la figura son del ancho de la pantalla mas 60
                b["rect"].right = ancho + 60
        #modificamos la altura de la nuve con un numero random
                b["rect"].top = random.randint(20, 200)
            if b["imagen"] == sueloEstirado:                
                b["rect"].left = ancho
                b["rect"].top = alto - 43

        ventana.blit(b["imagen"], b["rect"])
       
    if mainLoop:
        imagen = listaSprite[imagenNumero]
        ventana.blit(imagen, rect)
    
        rect.move_ip(velocidad_x, velocidad_y)
        imagenNumero += 1
    
        velocidad_y = velocidad_y + 4.0
    
    if rect.top < 120:
            velocidad_y = velocidad_y * -1
            # rect.move_ip(velocidad_x,velocidad_y)
            
    #if rect.top> 150:
    #   velocidad_y -velocidad_y *1
    
    if rect.bottom > nivelSuelo: # si la parte de abajo del rectangulo es mayor que el nivel del suelo
        velocidad_y = 0          #ponemos la velocidad de Y en cero y redefinimos la posicion de rectangulo
        rect = pygame.Rect(20, 310, 50, 50)
    
    if imagenNumero > 5:
        imagenNumero = 0

    pygame.display.flip()
    reloj.tick(FPS)
