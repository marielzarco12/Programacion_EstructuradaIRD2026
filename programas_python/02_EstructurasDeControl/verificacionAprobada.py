calif1 = float (input("introduce calificacion 1"))
calif2 = float (input("introduce calificacion 2"))
calif3 = float (input("introduce calificacion 3"))
#solicitud de calificaciones
promedio = (calif1 + calif2 + calif3) / 3

if promedio >= 7.0:

    if promedio >= 7.1 and promedio <= 7.5:
            print ('Aprobado bajo')
    elif promedio >= 7.6 and promedio <= 8.7 :
                print ('Aprobado medio')
    else:
             print ('Aprobado alto"')
else:    
    print ('No Aprobado')
   
               