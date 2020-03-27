package net.gondr.views;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import net.gondr.tetris.App;
import net.gondr.tetris.Game;

public class MainController {
	@FXML
	private Canvas gameCanvas;

	@FXML
	public void initialize() {
		App.app.game = new Game(gameCanvas);

	}
}
