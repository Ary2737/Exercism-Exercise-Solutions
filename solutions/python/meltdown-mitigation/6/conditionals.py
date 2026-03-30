"""Functions to prevent a nuclear meltdown."""


def is_criticality_balanced(temperature, neutrons_emitted):
    # Checks if initial conditions are met (temperature is < 800K and neutrons_emitted is > 500)
    if temperature < 800 and neutrons_emitted > 500:
        temp_neutron_product = temperature * neutrons_emitted
        # If intial conditions are met , check that product is < 500000
        if temp_neutron_product < 500000:
            return True

    
    return False
    

def reactor_efficiency(voltage, current, theoretical_max_power):
    # Calculate % Efficeny
    generated_power = voltage * current
    efficency_percentage = (generated_power/theoretical_max_power) * 100

    # Variable to set efficency band
    efficency_band = 'black'

    if efficency_percentage >= 80:
        efficency_band = 'green'
    elif efficency_percentage >= 60 and efficency_percentage < 80:
        efficency_band = 'orange'
    elif efficency_percentage >= 30 and efficency_percentage < 60:
        efficency_band = 'red'


    return efficency_band
        
        


def fail_safe(temperature, neutrons_produced_per_second, threshold):
    # Getting product of temperature and neutrons_produced_per_second
    temp_neutron_product = temperature * neutrons_produced_per_second

    # Getting margin pf threshold
    margin = threshold * 10/100

    # Status code of reactor
    status = 'DANGER'

    # Variables to get bottom + top 10% of threshold
    bottom_ten_percent = threshold - margin
    top_ten_percent = threshold + margin

    if temp_neutron_product < (threshold * 90/100):
        status = 'LOW'
    elif bottom_ten_percent <= temp_neutron_product <= top_ten_percent:
        status = 'NORMAL'
    elif temp_neutron_product == threshold:
        status = 'NORMAL'
           
    return status
        
        
        

    
    


    



        
