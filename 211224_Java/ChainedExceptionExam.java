package Java20211224;

public class ChainedExceptionExam {

	public static void main(String[] args) {
/*		
	Chained Exception : 예외가 예외를 발생시킨다 
		- 예외 A가 예외 B를 발생시킨다면 A를 B의 '원인 예외(cause exception)'이라고 한다
		- 절대 절대 안씀~~~~		
		
		
*/		
		try {
				install(); //에러가 발생		
			} catch (InstallException e) {
				System.out.println("InstallException");
			} catch (Exception e) {
				System.out.println("Exception");
			}
		}
	static void install() throws InstallException {
		try {
			startInstall();
			copyFiles();
		}	catch (SpaceException se) {		//용량부족 에러
			InstallException ie = new InstallException("설치 중 예외 발생");
			ie.initCause(se); //새로 생성한 에러 ie의 원인 에러를 se(용량부족 에러)로 지정
			throw ie;
		} catch (MemoryException me) {		//메모리부족 에러
			InstallException ie = new InstallException("설치 중 예외 발생");
			ie.initCause(me); //새로 생성한 에러 ie의 원인 에러를 me(메모리부족 에러)로 지정
			throw ie;
		} finally {
			deleteTempFiles();
		}
	}
	
	static void startInstall() throws SpaceException, MemoryException {
		if (!enoughSpace()) 
			throw new SpaceException("설치할 공간이 부족합니다.");
		if(!enoughMemory()) {
			throw new MemoryException("메모리가 부족합니다.");
		}
	}
	static void copyFiles() {}
	static void deleteTempFiles() {}
	static boolean enoughSpace() {
		return false;
	}
	static boolean enoughMemory() {
		return true;
	}
}

class InstallException extends Exception {
	InstallException(String msg) {
		super(msg);
	}
}
class SpaceException extends Exception {
	SpaceException(String msg) {
		super(msg);
	}
}
class MemoryException extends Exception {
	MemoryException(String msg) {
		super(msg);
	}
}