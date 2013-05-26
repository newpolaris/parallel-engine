package prl.interf;

import java.util.List;

import prl.interf.asset.SoundAsset;

public interface AssetManagable {

	List<Renderable> getRenderables();

	List<SoundAsset> getAudibles();

}
