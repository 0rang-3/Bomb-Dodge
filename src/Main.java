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
    AudioPlayer explosion;

    int loadScreenCounter = 300;
    boolean loadScreenCondition = true;
    PImage loadScreen;

    boolean move = false;

    boolean isHitting = false;
    boolean wasHitting = false;
    PImage bomb;

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
        bomb = loadImage("bomb.png");
        bomb.resize(100, 100);

        loadScreen = loadImage("LoadingScreen.png");

        loader = new Minim(this);
        song = loader.loadFile("background_music.mp3");
        explosion = loader.loadFile("explosion.mp3");
        song.play();
        song.loop();
        loadScreenCounter = 0;
    }

    public void draw() {
        //DRAW SHAPES
        //background
        image(background, 0, 0);
        //player
        fill(158, 53, 232);
        ellipse(mouseX, mouseY, 50, 50);
        //shape1
        image(bomb, x1, y1);
        //shape2
        image(bomb, x2, y2);
        //shape3
        image(bomb, x3, y3);
        //shape4
        image(bomb, x4, y4);
        //lives text
        fill(255, 255, 255);
        text("Lives: " + lives, 500, 50);

        //MOVEMENT
        if(move) {
            x1 = x1 + x1s;
            y1 = y1 + y1s;
            x2 = x2 + x2s;
            y2 = y2 + y2s;
            x3 = x3 + x3s;
            y3 = y3 + y3s;
            x4 = x4 + x4s;
            y4 = y4 + y4s;
        }

        //BOUNCING
        //shape1
        if (x1 + 25 <= 0) {
            x1s = -x1s;
        }
        if (x1 + 75 >= width) {
            x1s = -x1s;
        }
        if (y1 <= 0) {
            y1s = -y1s;
        }
        if (y1 + 100 >= height) {
            y1s = -y1s;
        }
        //shape2
        if (x2 + 25 <= 0) {
            x2s = -x2s;
        }
        if (x2 + 75 >= width) {
            x2s = -x2s;
        }
        if (y2 <= 0) {
            y2s = -y2s;
        }
        if (y2 + 100 >= height) {
            y2s = -y2s;
        }
        //shape3
        if (x3 + 25 <= 0) {
            x3s = -x3s;
        }
        if (x3 + 75 >= width) {
            x3s = -x3s;
        }
        if (y3 <= 0) {
            y3s = -y3s;
        }
        if (y3 + 100 >= height) {
            y3s = -y3s;
        }
        //shape4
        if (x4 + 25 <= 0) {
            x4s = -x4s;
        }
        if (x4 + 75 >= width) {
            x4s = -x4s;
        }
        if (y4 <= 0) {
            y4s = -y4s;
        }
        if (y4 + 100 >= height) {
            y4s = -y4s;
        }

        //LIVES AND COLLISIONS
        //shape1
        wasHitting = isHitting;
        isHitting = false;
        if (mouseX >= x1 && mouseX <= x1 + 50 && mouseY >= y1 && mouseY <= y1 + 100) {
            isHitting = true;
            explosion.play();
            explosion.rewind();

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
            isHitting = true;
            explosion.play();
            explosion.rewind();

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
            isHitting = true;
            explosion.play();
            explosion.rewind();

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
            isHitting = true;
            explosion.play();
            explosion.rewind();

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
        if(wasHitting == false && isHitting == true) {
            lives--;
        }

        //score
        if (lives > 0) {
            score = score + 1;
        }
        fill(255, 255, 255);
        text("Score: " + score / 30, 50, 50);

        if(lives <= 0) {
            explosion.setGain(-100);
        } else {
            explosion.setGain(0);
        }

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

        if(loadScreenCondition) {
            image(loadScreen, 0, 0);
            text("Game starting in "+(loadScreenCounter/30), 235, 425);
            if(loadScreenCounter > 0) {
                loadScreenCounter--;
            } else {
                loadScreenCondition = false;
                move = true;
                score = 0;
            }

        }
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }
}