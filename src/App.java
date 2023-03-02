import javadraw.*;

public class App extends Window{
    public static void main(String[] args) throws Exception {
       Window.open();
    }

    public void start(){
        Oval ball = new Oval(screen, 50, 50, 75, 75);
        double dx = 10;
        
        while(true){
            ball.move(dx, 0);
            if(ball.x() <= 0 || ball.x() + ball.width() >= 800){
                dx = -dx;
            }

            screen.sleep(1/30.0);
            screen.update();
        }
    }


}
