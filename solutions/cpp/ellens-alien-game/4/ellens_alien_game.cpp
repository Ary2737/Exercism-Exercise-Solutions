

namespace targets {
    class Alien {
        private:
            // Private member variable
            int health = 3; // Default health = 3
        
        public:
            // Const = Tells compiler that this method won't modify the data

            // Public member variables
            int x_coordinate{0}; // Same as int x_coordinate = 0;
            int y_coordinate{0};

            // Constructor
            // x_coordianate(x) = Assigns x to x_coordinate at exact moment of creation
            Alien(int x,int y): x_coordinate(x),y_coordinate(y){};

            bool hit() {
                int current_health = get_health();

                if(current_health >= 1) {
                    --health;
                    return true;
                }

                return false;
            }

            bool is_alive() const {return get_health() > 0;}

            
            bool teleport(int new_x , int new_y) {
                x_coordinate = new_x;
                y_coordinate = new_y;

                return true;
            }

            bool collision_detection(Alien other_alien) const {
                // Get the x-cordinates of the Alien instance
                int pos_x = other_alien.x_coordinate;
                int pos_y = other_alien.y_coordinate;

                return (x_coordinate == pos_x && y_coordinate == pos_y);
            }
             
            // Getter method for health
            int get_health() const {
                return health;
            }
        

   };
}
