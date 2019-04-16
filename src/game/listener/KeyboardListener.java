package game.listener;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardListener implements KeyListener {

	private boolean[] keys = new boolean[256];

	@Override
	public void keyPressed(KeyEvent event) {
		this.keys[event.getKeyCode()] = true; // Pressed
	}

	@Override
	public void keyReleased(KeyEvent event) {
		this.keys[event.getKeyCode()] = false; // Not pressed
	}

	@Override
	public void keyTyped(KeyEvent event) {

	}

	public boolean isKeyPressed(int key) {
		return keys[key];
	}

	public boolean isKeyReleased(int key) {
		return !keys[key];
	}

}
