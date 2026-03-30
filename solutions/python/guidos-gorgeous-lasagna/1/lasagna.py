EXPECTED_BAKE_TIME = 40

def bake_time_remaining(time_in_oven):

    """"
    Calculate the time remaining to bake the lasagna

    :param: time_in_oven: int - This is the time remaining for 
    the lasagna to cook in oven

    :return: int- This function returns the time remeaining for the lasagan to cook in oven
    """
    remaining_time = EXPECTED_BAKE_TIME - time_in_oven

    return remaining_time
    
def preparation_time_in_minutes(number_of_layers):
    """ Calculate the preperation time in mimutes

        :param number_of_layers: int - The number of layers in the lasagna
        :return: int - The total baking time taken for baking the lasagna according to its layers

    """
    
    baking_time = number_of_layers * 2

    return baking_time

def elapsed_time_in_minutes(number_of_layers , elasped_bake_time):

    """Calculate the elapsed cooking time.

    :param number_of_layers: int - the number of layers in the lasagna.
    :param elapsed_bake_time: int - elapsed cooking time.
    :return: int - total time elapsed (in minutes) preparing and cooking.

    This function takes two integers representing the number of lasagna layers and the
    time already spent baking and calculates the total elapsed minutes spent cooking the
    lasagna.
    """
    preparation_time = preparation_time_in_minutes(number_of_layers)

    total_time = preparation_time + elasped_bake_time

    return total_time

    