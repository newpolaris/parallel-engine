package prl.interf;

import java.util.List;

import prl.interf.asset.Audible;
import prl.interf.asset.Renderable;

public interface AssetManagable {

	List<Renderable> getRenderables();

	List<Audible> getAudibles();

}
