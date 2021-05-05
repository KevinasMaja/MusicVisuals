package C19437864;

import processing.core.*;

// This is an example of a visual that renders the waveform
public class WaveForm
{
    CubeVisual mv;
    float cy = 0;
    float cx = 0;
    float x = 0;
    float y = 0;

    public WaveForm(CubeVisual mv)
    {
        this.mv = mv;
        cy = this.mv.height/2;
        cx = this.mv.width/2;
        x = this.mv.width;
        y = this.mv.height;
    }

    public void render()
    {
        mv.colorMode(PApplet.HSB);
        for(int i = 0 ; i < mv.getAudioBuffer().size() ; i ++)
        {
            mv.stroke(
                PApplet.map(i, 0, mv.getAudioBuffer().size(), 0, 255)
                , 255
                , 255
            );

            mv.line(x,i * 5,x + x*mv.getAudioBuffer().get(i)*0.1f,i * 5);
            mv.line(0,i * 5,0 + x*mv.getAudioBuffer().get(i)*0.1f,i * 5);
        }
    }
}