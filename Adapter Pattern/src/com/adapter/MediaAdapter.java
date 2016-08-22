package com.adapter;

import com.interfacePlayers.AdvancedMediaPlayer;
import com.interfacePlayers.MediaPlayer;
import com.players.Mp4Player;
import com.players.VlcPlayer;

public class MediaAdapter implements MediaPlayer {
	
	AdvancedMediaPlayer advancedMediaPlayer;
	
	public MediaAdapter(String audioType) {
		if(audioType.equalsIgnoreCase("Vlc")){
			advancedMediaPlayer = new VlcPlayer();
		}
		else if (audioType.equalsIgnoreCase("Mp4")){
			advancedMediaPlayer = new Mp4Player();
		}
	}

	@Override
	public void play(String audioType, String filename) {
		if(audioType.equalsIgnoreCase("vlc")){
			advancedMediaPlayer.playVlc(filename);
		}
		else if (audioType.equalsIgnoreCase("mp4")){
			advancedMediaPlayer.playMp4(filename);
		}

	}

}
