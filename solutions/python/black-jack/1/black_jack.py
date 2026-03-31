"""Functions to help play and score a game of blackjack.

How to play blackjack:    https://bicyclecards.com/how-to-play/blackjack/
"Standard" playing cards: https://en.wikipedia.org/wiki/Standard_52-card_deck
"""

def value_of_card(card):
    match(card):
        case 'A':
            return 1
        case 'J' | 'Q' | 'K':
            return 10
        case _: 

            if(card.isdigit()):
                # Get numerical value of card
                card_value = int(card)

                # Only if card_value is between 2-10 return value
                if(2 <= card_value <= 10):
                    return card_value
                
            return 0 # In ll other cases return 0 as default


def higher_card(card_one, card_two):

    # Geting values of cards
    card_one_value = value_of_card(card_one)
    card_two_value = value_of_card(card_two)


    # Checking if one card is greater + check equality

    if card_one_value > card_two_value:
        return card_one
    elif card_two_value > card_one_value:
        return card_two
    else:
        return card_one, card_two
    
    

def value_of_ace(card_one, card_two):

    # Geting values of cards
    card_one_value = value_of_card(card_one)
    card_two_value = value_of_card(card_two)

    # Sum of both csrd values
    ace_sum = card_one_value + card_two_value

    if ace_sum in range(11,22) or 'A' in [card_one,card_two]:
        return 1
    else:
        return 11
    




def is_blackjack(card_one, card_two):
    # Confirm whether pair has an Ace
    has_ace = 'A' in [card_one,card_two]

    # Confirm whether card_one or card_two is a 10 card
    has_ten = card_one in ['10','J','K','Q'] or card_two in ['10','J','K','Q']

    if(has_ace and has_ten):
        return True

   
    return False



def can_split_pairs(card_one, card_two):
    # Get the value of both cards
    card_one_value = value_of_card(card_one)
    card_two_value = value_of_card(card_two)

    if card_one_value == card_two_value:
        return True
    

    return False


def can_double_down(card_one, card_two):

    # Get the value of both cards
    card_one_value = value_of_card(card_one)
    card_two_value = value_of_card(card_two)

    # If the sum of the card values is in range 9-11 return True
    if card_one_value + card_two_value in range(9,12):
        return True
    
    return False

    
