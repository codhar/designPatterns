package com.mainClasses;

import com.adapter.AudioPlayer;

public class AdapterPatternDemo {

	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();
		
		audioPlayer.play("mp4", "rock");
		audioPlayer.play("vlc", "sultan");
		audioPlayer.play("mp3", "rustom");
		audioPlayer.play("3gp", "dar"); 
	}

}
