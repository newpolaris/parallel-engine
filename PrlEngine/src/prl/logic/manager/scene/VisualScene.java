package prl.logic.manager.scene;

import prl.interf.primitive.Rotation;
import prl.interf.primitive.Translation;

public class VisualScene {
	VisualSceneArray visualSceneArray;
	int idx;
	
	public String getSceneName()
	{
		return visualSceneArray.sceneNames.get(idx);
	}

	public Translation getPosition() {
		return visualSceneArray.positions.get(idx);
	}

	public Rotation getOrientations() {
		return visualSceneArray.orientations.get(idx);
	}
}
