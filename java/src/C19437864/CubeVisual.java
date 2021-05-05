package C19437864;

import ie.tudublin.Visual;
import processing.core.PFont;

public class CubeVisual extends Visual
{
    boolean clear = false;
    WaveForm wf;
    boolean circles = false;
    boolean waves = false;
    boolean globes = false;
    boolean stars = false;

    public void settings()
    {
        size(1920,1080,P3D);
        println("CWD: " + System.getProperty("user.dir"));
        //fullScreen(P3D);
    }

    public void keyPressed()
    {
        if (key == ' ')
        {
            getAudioPlayer().cue(0);
            getAudioPlayer().play();
            
        }
        if (key == '1')
        {
            clear = ! clear;

        }
        if (key == '2')
        {
            globes = ! globes;
        }
        if (key == '3')
        {
            circles = ! circles;
        }
        if (key == '4')
        {
            waves = ! waves;
        }
    }

    public void setup()
    {
        colorMode(HSB);
        noCursor();
        
        setFrameSize(256);

        startMinim();
        loadAudio("AroundTheWorld.mp3");
        wf = new WaveForm(this);
        //getAp().play();
        //startListening(); 
        
    }

    float smoothedObjectSize = 0;

    public void draw()
    {
        PFont mono;
        mono = createFont("SunshineWishes.ttf", 64);
        textFont(mono);
        stroke(0);
        calculateAverageAmplitude();
        background(0);
        noFill();
        lights();
        stroke(map(getSmoothedAmplitude(), 0, 1, 0, 255), 255, 255);
               
        float objectSize = 25 + (getAmplitude() * 150);
        //map(average, 0, 1, 100, 400); 
        smoothedObjectSize = lerp(smoothedObjectSize, objectSize, 0.1f);        
        if (clear)
        {
            
        }
        else
        {
            if (globes)
            {
                strokeWeight(1);
                pushMatrix();
                translate(width*0.33f, height*0.33f, 0);  
                rotateY(angle);
                rotateX(angle);
                sphere(smoothedObjectSize*3f);
                sphere(smoothedObjectSize*1f);
                popMatrix();
                pushMatrix();
                translate(width*0.33f, height*0.66f, 0);
                rotateY(angle);
                rotateX(angle);   
                sphere(smoothedObjectSize*3f);
                sphere(smoothedObjectSize*1f);
                popMatrix();
                pushMatrix();
                translate(width*0.66f, height*0.66f, 0);  
                rotateY(angle);
                rotateX(angle);
                sphere(smoothedObjectSize*3f);
                sphere(smoothedObjectSize*1f);
                popMatrix();
                pushMatrix();
                translate(width*0.66f, height*0.33f, 0);  
                rotateY(angle);
                rotateX(angle);
                sphere(smoothedObjectSize*3f);
                sphere(smoothedObjectSize*1f);
                popMatrix();
            }
            fill(map(getSmoothedAmplitude(), 0, 1, 0, 255), 255, 255);
            strokeWeight(3);
            textAlign(CENTER);
            text("Around The World!",width*0.5f,height*0.1f);

            if(circles)
            {
                noFill();
                pushMatrix();
                rotateY(angle*2f);
                ellipse(width*0.66f,height*0.66f,smoothedObjectSize*8,smoothedObjectSize*8);
                popMatrix();
                pushMatrix();
                rotateY(angle*2f);
                ellipse(width*0.33f,height*0.33f,smoothedObjectSize*8,smoothedObjectSize*8);
                popMatrix();
                pushMatrix();
                rotateY(angle*2f);
                ellipse(width*0.33f,height*0.66f,smoothedObjectSize*8,smoothedObjectSize*8);
                popMatrix();
                pushMatrix();
                rotateY(angle*2f);
                ellipse(width*0.66f,height*0.33f,smoothedObjectSize*8,smoothedObjectSize*8);
                popMatrix();
                pushMatrix();
                rotateX(angle*2f);
                ellipse(width*0.66f,height*0.66f,smoothedObjectSize*8,smoothedObjectSize*8);
                popMatrix();
                pushMatrix();
                rotateX(angle*2f);
                ellipse(width*0.33f,height*0.33f,smoothedObjectSize*8,smoothedObjectSize*8);
                popMatrix();
                pushMatrix();
                rotateX(angle*2f);
                ellipse(width*0.33f,height*0.66f,smoothedObjectSize*8,smoothedObjectSize*8);
                popMatrix();
                pushMatrix();
                rotateX(angle*2f);
                ellipse(width*0.66f,height*0.33f,smoothedObjectSize*8,smoothedObjectSize*8);
                popMatrix();
                pushMatrix();
                rotateY(-(angle*2f));
                ellipse(width*0.66f,height*0.66f,smoothedObjectSize*8,smoothedObjectSize*8);
                popMatrix();
                pushMatrix();
                rotateY(-(angle*2f));
                ellipse(width*0.33f,height*0.33f,smoothedObjectSize*8,smoothedObjectSize*8);
                popMatrix();
                pushMatrix();
                rotateY(-(angle*2f));
                ellipse(width*0.33f,height*0.66f,smoothedObjectSize*8,smoothedObjectSize*8);
                popMatrix();
                pushMatrix();
                rotateY(-(angle*2f));
                ellipse(width*0.66f,height*0.33f,smoothedObjectSize*8,smoothedObjectSize*8);
                popMatrix();
                pushMatrix();
                rotateX(-angle*2f);
                ellipse(width*0.66f,height*0.66f,smoothedObjectSize*8,smoothedObjectSize*8);
                popMatrix();
                pushMatrix();
                rotateX(-angle*2f);
                ellipse(width*0.33f,height*0.33f,smoothedObjectSize*8,smoothedObjectSize*8);
                popMatrix();
                pushMatrix();
                rotateX(-angle*2f);
                ellipse(width*0.33f,height*0.66f,smoothedObjectSize*8,smoothedObjectSize*8);
                popMatrix();
                pushMatrix();
                rotateX(-angle*2f);
                ellipse(width*0.66f,height*0.33f,smoothedObjectSize*8,smoothedObjectSize*8);
                popMatrix();
            }
            if(waves)
            {
                wf.render();
            }           
        }
        angle += (getAmplitude()*0.1f);

    }
    float angle = 0;
} 