
# Calcular el sueldo de un empleado Solicitar el Nombre, horas trabajadas,y cuota por hora.
#
# El sueldo se calcula de la siguiente forma: si el numero de horas trabajadas
# es mayor que 40, el excedente de 40 se paga el doble de la cuata por hora.
#
# En caso de no ser mayor que 40 se paga la cuota normal por hora.
#
# Se debe mostrar el nombre del empleado, horas trabajadas, horas extras y el sueldo

# Entradas de variable 

nombre = input ("introduce el nombre: \n")
horas_traba = int ("introduce las horas trabajadas: \n")
cuota_por_hora = float ("introduce la cuota por hora: \n")

# Estructuras de control multiple para decicion 

horas_extra = 0
sueldo = 0.0

if horas_traba > 40 :
    horas_extra = horas_traba - 40
    sueldo = sueldo * cuota_por_hora + cuota_por_hora * 2
elif horas_traba > 0:
    sueldo = horas_traba * cuota_por_hora
else :
    print ("horas trabajadas no validas")

salida =f""" 
====== Nomina ======
Nombre: {nombre}
Horas trabajadas: {horas_traba}
Horas extra: {horas_extra}
Sueldo: {sueldo}
"""
print (salida)      