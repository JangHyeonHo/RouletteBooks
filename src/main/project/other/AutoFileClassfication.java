package other;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;

import org.springframework.web.multipart.MultipartFile;

public class AutoFileClassfication {
	//자동 파일 분류 시스템
	//웹에서 받아온 파일을 자동으로 이름, 저장할 이름, 파일 사이즈를 계산해서 넣어줌

	//단일 파일 분류시스템 1개의 파일 이름과 파일 저장할 이름등을 분류해서 만들어줌
	//ClassifiedFile 변수명 = AutoFileClassfication.OnefileClassficationing(멀티파트파일, 저장할 디렉토리);
	//위 방식으로 사용가능
	public static ClassifiedFile OnefileClassficationing(MultipartFile file, String directory) {
		ClassifiedFile fileNaming = new ClassifiedFile();

		fileNaming.setFileOriginName(file.getOriginalFilename());

		String extension = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));

		fileNaming.setFileStoreName(UUID.randomUUID().toString().replaceAll("-", "") + extension);

		fileNaming.setFileSize(file.getSize());

		try {
			file.transferTo(new File(directory+fileNaming.getFileStoreName()));
			AutoLinePrint.println("해당 파일 " + fileNaming.getFileStoreName() + "이 저장되었습니다.","경로 : " + directory);
		} catch (IllegalStateException | IOException e) {
			// TODO Auto-generated catch block
			System.out.println("파일 전송 실패");
		}

		return fileNaming;
	}

	//복수 파일 분류 시스템 여러개의 파일과 파일 저장할 이름을 &으로 묶어서 분류해서 만들어줌
	public static ClassifiedFile ArrayFileClassficationing(MultipartFile[] files, String directory){
		ClassifiedFile fileNaming = new ClassifiedFile();
		String originalFile = "";
		String storeFileList = "";
		String fileSize = "";
		for(MultipartFile file : files) {
			if(originalFile != "") {
				originalFile += "&";
				storeFileList += "&";
				fileSize += "&";
			}
			originalFile += file.getOriginalFilename();

			String originalFileExtension = originalFile.substring(originalFile.lastIndexOf("."));
			//
			System.out.println(originalFileExtension);
			String storeFile = UUID.randomUUID().toString().replaceAll("-", "");
			storeFile = storeFile + originalFileExtension;

			storeFileList += storeFile;

			File storeFileItem = new File(directory+storeFile);
			try {
				file.transferTo(storeFileItem);
				AutoLinePrint.println("해당 파일 " + storeFile + "이 저장되었습니다.","경로 : " + directory);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				//	            path="report/submissionForm";
				System.out.println("파일 전송 실패");
			} 
		}
		fileNaming.setFileOriginName(originalFile);
		fileNaming.setFileStoreName(storeFileList);
		fileNaming.setFileSizes(fileSize);

		return fileNaming;
	}



}
