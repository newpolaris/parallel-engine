package collada.unittest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.UnmarshalException;
import javax.xml.bind.Unmarshaller;

import org.junit.Before;
import org.junit.Test;

import collada.COLLADA;
import collada.LibraryAnimationsType;
import collada.LibraryGeometriesType;
import collada.ObjectFactory;

public class ColladaTableTest {

	private ObjectFactory of;
	private COLLADA cld;

	@Before
	public void before() {
		of = new ObjectFactory();
		cld = of.createCOLLADA();
	}

	public void marshal() {
		try {
			JAXBContext jc = JAXBContext.newInstance("collada");
			Marshaller m = jc.createMarshaller();
			m.marshal(cld, System.out);
		} catch (JAXBException jbe) {
			//
		}
	}

	@SuppressWarnings("unchecked")
	public COLLADA unmarshal(InputStream inputStream) throws JAXBException {
		JAXBContext jc = JAXBContext.newInstance("collada");
		Unmarshaller u = jc.createUnmarshaller();
		COLLADA doc = null;
		try {
			doc = (COLLADA) u.unmarshal(inputStream);
		} catch (UnmarshalException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return doc;
	}

	@Test
	public void loadExample02Test() {
		InputStream inputStream = null;
		try {
			inputStream = new FileInputStream(
					"C:/Users/wrice127/workspace/ParallelEngine/PrlEngine/asset/collada/simpleColladaExample02.dae");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			cld = unmarshal(inputStream);
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		marshal();
	}

	@Test
	public void loadExample02LibarayTest() {
		InputStream inputStream = null;
		try {
			inputStream = new FileInputStream(
					"C:/Users/wrice127/workspace/ParallelEngine/PrlEngine/asset/collada/simpleColladaExample02.dae");
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			cld = unmarshal(inputStream);
		} catch (Exception e) {
			e.printStackTrace();
		}

		List<Object> libs = cld
				.getLibraryAnimationsAndLibraryAnimationClipsAndLibraryCameras();
		for (Object o : libs) {
			if (o instanceof LibraryGeometriesType) {
				System.out.println("LibraryGeometriesType.");
			}
			else
			{
				System.out.println( o.getClass().getName() );
			}
		}
	}
}
