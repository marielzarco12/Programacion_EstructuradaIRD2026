FabricaComputadoras.java, fabrica_computadoras.py 
'''
se planea ofrecer a los cliente un descuento ve dependera del numero de computadoras que compre.
si las computadores sonmens de cinco se les dara un 10% de descuento sobre el total de la compra;
si el numero de computadoras es mayor o igual a cinco pero menos de diez se le otorga el 20% de
descuento; y son 10 o mas se les dara 40% de descuento; y si son 10 o mas se les da
'''

# Declaracion variables
num_comput = int(input("introduce el numero de computadoras"))
precio = int(input("introduce el presio de computadoras"))

# Calculo de total
total = num_comput * precio

# Validacion

if num_comput < 5:
    descuento = total * 0.10
    subtotal = total - descuento
    porcentaje = '10%'
elif num_comput >= 5 and num_comput < 10 :
    descuento = total * 0.20
    subtotal = total - descuento
    porcentaje = '20%'
else:
    descuento = total * 0.40
    subtotal = total - descuento
    porcentaje = '40%'     

salida =f""" 
====== TICKET ======
Total:$ {total}
Subtotal:$ {subtotal}
Descuento:${descuento * 100}
% Descuento:$ {porcentaje}
"""
print (salida)     