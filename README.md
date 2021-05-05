# Music Visualiser Project

Name: Kevinas Majauskas

Student Number: C19437864

## Instructions
- Fork this repository and use it a starter project for your assignment
- Create a new package named your student number and put all your code in this package.
- You should start by creating a subclass of ie.tudublin.Visual
- There is an example visualiser called MyVisual in the example package
- Check out the WaveForm and AudioBandsVisual for examples of how to call the Processing functions from other classes that are not subclasses of PApplet

# Description of the assignment
This is my submission for the year Project. I used project fork template to get started with the code, taking examples from the work that we did in class and in the labs to guide me through the assignment. I got some help from the PApplett 'wiki', as to how some of the code works and how to adapt it to what I want it to do. Overall this was a very informative assignment and I learned a lot about Java, inheritance and classes. I chose to do an "Around the World" theme, because one of my favourite groups, Daft Punk, recently split up. They made some of my favourite music growing up, and even to this day their music is still amazing for the industry standards. I felt that the song "Around the World" fit great into the theme of this project, allowing for many interesting visuals to be made from that song.

# Instructions
To start the program, run the CubeVisuals.java file in VisualStudioCode, press '2','3' and '4' to enable all the different elements of the program. '1' disables all the visuals but you can press '1' again to re-enable them. Press 'esc' to quit the program.

# How it works
I used spheres and ellipses to make the visual of the planets, and used the rotateY() and rotateX() functions to make them spin like a planet would. I made the ellipses rotate around the 'planets' as to give it a more aesthethic look and feel. I also added sound waves to the left and right of the screen, as to give more vibrance and colour to the whole program, and to show what each sound does to the waveform. I used getAmplitude() to get the amplitude of the music being played, and I lerped it to make the object size of the spheres and ellipses move in tune to the music. I also made the rainbow effect for the ellipses and spheres by using the map function to map the amplitude on the HSB spectrum, so that it cycles through the colour and gives a nice visual effect.

# What I am most proud of in the assignment
I am most proud that I did everything myself, with help from the examples provided, the labs and lectures we done, and a small bit of help from the internet in terms of how to properly use commands such as sphere(),map() and the waveform. I feel that I made a nice aesthetic to watch while listening to music, it really provides me a good experience when listening to the song in relation to the visuals, and it would do the same for any song. I made this project kind of as an homage to Daft Punk, as they provided me much joy in my childhood, and even made these tough times of sitting at home that much easier to get through!

# Markdown Tutorial

This is *emphasis*

This is a bulleted list

- Item
- Item

This is a numbered list

1. Item
1. Item

This is a [hyperlink](http://bryanduggan.org)

# Headings
## Headings
#### Headings
##### Headings

This is code:

```Java
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

So is this without specifying the language:

```
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

This is an image using a relative URL:

![An image](images/p8.png)

This is an image using an absolute URL:

![A different image](https://bryanduggandotorg.files.wordpress.com/2019/02/infinite-forms-00045.png?w=595&h=&zoom=2)

This is a youtube video:

[![YouTube](http://img.youtube.com/vi/J2kHSSFA4NU/0.jpg)](https://www.youtube.com/watch?v=J2kHSSFA4NU)

This is a table:

| Heading 1 | Heading 2 |
|-----------|-----------|
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |

