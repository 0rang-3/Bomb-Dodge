import ddf.minim.AudioPlayer;
import ddf.minim.Minim;
import processing.core.PApplet;
import processing.core.PImage;

public class Main extends PApplet {
    int x1, y1, x2, y2, x3, y3, x4, y4;
    int x1s, y1s, x2s, y2s, x3s, y3s, x4s, y4s;
    int s1c, s2c, s3c, s4c;
    int lives;
    int score;
    PImage background;
    Minim loader;
    AudioPlayer song;

    public void settings() {
        size(600, 600);
    }

    public void setup() {
        x1 = 300;
        y1 = 400;
        x2 = 300;
        y2 = 400;
        x3 = 300;
        y3 = 400;
        x4 = 300;
        y4 = 400;

        x1s = 2;
        y1s = 2;
        x2s = 3;
        y2s = 2;
        x3s = 2;
        y3s = -3;
        x4s = -3;
        y4s = -3;

        s1c = color(227, 48, 16);
        s2c = color(242, 234, 10);
        s3c = color(0, 251, 255);
        s4c = color(26, 252, 10);

        lives = 10;

        score = 0;

        background = loadImage("image.png");
        background.resize(600, 600);

        loader = new Minim(this);
        song = loader.loadFile("background_music.mp3");
        song.play();
        song.loop();
    }

    public void draw() {
        //DRAW SHAPES
        //background
        image(background, 0, 0);
        //player
        fill(158, 53, 232);
        ellipse(mouseX, mouseY, 50, 50);
        //shape1
        fill(s1c);
        rect(x1, y1, 50, 100);
        //shape2
        fill(s2c);
        rect(x2, y2, 75, 75);
        //shape3
        fill(s3c);
        rect(x3, y3, 150, 100);
        //shape4
        fill(s4c);
        rect(x4, y4, 45, 80);
        //lives text
        fill(255, 255, 255);
        text("Lives: " + lives, 500, 50);

        //MOVEMENT
        x1 = x1 + x1s;
        y1 = y1 + y1s;
        x2 = x2 + x2s;
        y2 = y2 + y2s;
        x3 = x3 + x3s;
        y3 = y3 + y3s;
        x4 = x4 + x4s;
        y4 = y4 + y4s;

        //BOUNCING
        //shape1
        if (x1 <= 0) {
            x1s = -x1s;
        }
        if (x1 + 50 >= width) {
            x1s = -x1s;
        }
        if (y1 <= 0) {
            y1s = -y1s;
        }
        if (y1 + 100 >= height) {
            y1s = -y1s;
        }
        //shape2
        if (x2 <= 0) {
            x2s = -x2s;
        }
        if (x2 + 75 >= width) {
            x2s = -x2s;
        }
        if (y2 <= 0) {
            y2s = -y2s;
        }
        if (y2 + 75 >= height) {
            y2s = -y2s;
        }
        //shape3
        if (x3 <= 0) {
            x3s = -x3s;
        }
        if (x3 + 150 >= width) {
            x3s = -x3s;
        }
        if (y3 <= 0) {
            y3s = -y3s;
        }
        if (y3 + 100 >= height) {
            y3s = -y3s;
        }
        //shape4
        if (x4 <= 0) {
            x4s = -x4s;
        }
        if (x4 + 45 >= width) {
            x4s = -x4s;
        }
        if (y4 <= 0) {
            y4s = -y4s;
        }
        if (y4 + 80 >= height) {
            y4s = -y4s;
        }

        //LIVES AND COLLISIONS
        //shape1
        if (mouseX >= x1 && mouseX <= x1 + 50 && mouseY >= y1 && mouseY <= y1 + 100) {
            lives = --lives;
            x1 = 300;
            y1 = 300;
            x2 = 300;
            y2 = 300;
            x3 = 300;
            y3 = 300;
            x4 = 300;
            y4 = 300;

            if (x1s < 0) {
                x1s = -x1s;
            }
            if (y1s < 0) {
                y1s = -y1s;
            }
            if (x2s < 0) {
                x2s = -x2s;
            }
            if (y2s < 0) {
                y2s = -y2s;
            }
            if (x3s < 0) {
                x3s = -x3s;
            }
            if (y3s < 0) {
                y3s = -y3s;
            }
            if (x4s < 0) {
                x4s = -x4s;
            }
            if (y4s < 0) {
                y4s = -y4s;
            }

            x1s = x1s + 3;
            y1s = y1s + 3;
            x2s = x2s + 3;
            y2s = y2s + 3;
            x3s = x3s + 3;
            y3s = y3s + 3;
            x4s = x4s + 3;
            y4s = y4s + 3;
        }
        //shape2
        if (mouseX >= x2 && mouseX <= x2 + 75 && mouseY >= y2 && mouseY <= y2 + 75) {
            lives = --lives;
            x1 = 300;
            y1 = 300;
            x2 = 300;
            y2 = 300;
            x3 = 300;
            y3 = 300;
            x4 = 300;
            y4 = 300;

            if (x1s < 0) {
                x1s = -x1s;
            }
            if (y1s < 0) {
                y1s = -y1s;
            }
            if (x2s < 0) {
                x2s = -x2s;
            }
            if (y2s < 0) {
                y2s = -y2s;
            }
            if (x3s < 0) {
                x3s = -x3s;
            }
            if (y3s < 0) {
                y3s = -y3s;
            }
            if (x4s < 0) {
                x4s = -x4s;
            }
            if (y4s < 0) {
                y4s = -y4s;
            }

            x1s = x1s + 3;
            y1s = y1s + 3;
            x2s = x2s + 3;
            y2s = y2s + 3;
            x3s = x3s + 3;
            y3s = y3s + 3;
            x4s = x4s + 3;
            y4s = y4s + 3;
        }
        //shape3
        if (mouseX >= x3 && mouseX <= x3 + 150 && mouseY >= y3 && mouseY <= y3 + 100) {
            lives = --lives;
            x1 = 300;
            y1 = 300;
            x2 = 300;
            y2 = 300;
            x3 = 300;
            y3 = 300;
            x4 = 300;
            y4 = 300;

            if (x1s < 0) {
                x1s = -x1s;
            }
            if (y1s < 0) {
                y1s = -y1s;
            }
            if (x2s < 0) {
                x2s = -x2s;
            }
            if (y2s < 0) {
                y2s = -y2s;
            }
            if (x3s < 0) {
                x3s = -x3s;
            }
            if (y3s < 0) {
                y3s = -y3s;
            }
            if (x4s < 0) {
                x4s = -x4s;
            }
            if (y4s < 0) {
                y4s = -y4s;
            }

            x1s = x1s + 3;
            y1s = y1s + 3;
            x2s = x2s + 3;
            y2s = y2s + 3;
            x3s = x3s + 3;
            y3s = y3s + 3;
            x4s = x4s + 3;
            y4s = y4s + 3;
        }
        //shape4
        if (mouseX >= x4 && mouseX <= x4 + 45 && mouseY >= y4 && mouseY <= y4 + 80) {
            lives = --lives;
            x1 = 300;
            y1 = 300;
            x2 = 300;
            y2 = 300;
            x3 = 300;
            y3 = 300;
            x4 = 300;
            y4 = 300;

            if (x1s < 0) {
                x1s = -x1s;
            }
            if (y1s < 0) {
                y1s = -y1s;
            }
            if (x2s < 0) {
                x2s = -x2s;
            }
            if (y2s < 0) {
                y2s = -y2s;
            }
            if (x3s < 0) {
                x3s = -x3s;
            }
            if (y3s < 0) {
                y3s = -y3s;
            }
            if (x4s < 0) {
                x4s = -x4s;
            }
            if (y4s < 0) {
                y4s = -y4s;
            }

            x1s = x1s + 3;
            y1s = y1s + 3;
            x2s = x2s + 3;
            y2s = y2s + 3;
            x3s = x3s + 3;
            y3s = y3s + 3;
            x4s = x4s + 3;
            y4s = y4s + 3;
        }

        //score
        if (lives > 0) {
            score = score + 1;
        }
        fill(255, 255, 255);
        text("Score: " + score / 30, 50, 50);


        //GAMEOVER
        if (lives <= 0) {
            background(0, 0, 0);
            fill(255, 0, 0);
            text("GAME OVER! Press R to restart!", 225, 300);
            text("Score: " + score / 30, 50, 50);
            text("Lives: 0", 500, 50);
            song.pause();
            song.rewind();

            if (keyPressed) {
                if (key == 'r') {
                    x1 = 300;
                    y1 = 400;
                    x2 = 300;
                    y2 = 400;
                    x3 = 300;
                    y3 = 400;
                    x4 = 300;
                    y4 = 400;

                    x1s = 2;
                    y1s = 2;
                    x2s = 3;
                    y2s = 2;
                    x3s = 2;
                    y3s = -3;
                    x4s = -3;
                    y4s = -3;

                    lives = 10;

                    score = 0;

                    song.play();
                }
            }
        }
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }
}