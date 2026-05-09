

namespace targets {
    class Alien {
        private:
            // Private member variable
            int health = 3; // Default health = 3
        
        public:
            // Public member variables
            int x_coordinate{0}; // Same as int x_coordinate = 0;
            int y_coordinate{0};

            // Constructor
            Alien(int x,int y) {
                x_coordinate = x;
                y_coordinate = y;
            }

            bool hit() {
                int current_health = get_health();

                if(current_health >= 1) {
                    --health;
                    return true;
                }

                return false;
            }

            bool is_alive() {return get_health() > 0;}

            void teleport(int new_x , int new_y) {
                x_coordinate = new_x;
                y_coordinate = new_y;
            }

            bool collision_detection(Alien coordinates) {
                // Get the x-cordinates of the Alien instance
                int pos_x = x_coordinate;
                int pos_y = y_coordinate;

                // This = Instance calling the method

                if(x_coordinate == pos_x && y_coordinate == pos_y) {
                    return true;
                }

                return false;
            }
             
            // Getter method for health
            int get_health() {
                return health;
            }

   };
}
