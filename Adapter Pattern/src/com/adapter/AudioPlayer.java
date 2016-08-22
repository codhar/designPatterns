package com.adapter;

import com.interfacePlayers.MediaPlayer;

public class AudioPlayer implements MediaPlayer {
	
	MediaAdapter mediaAdapter;

	@Override
	public void play(String audioType, String filename) {
		
		if(audioType.equalsIgnoreCase("mp3")){
			System.out.println("Playing Mp3 file name : "+ filename);
		}
		else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, filename);
		}else{
			System.out.println("invalid media " +audioType + " format not supported." );
		}

	}

}
