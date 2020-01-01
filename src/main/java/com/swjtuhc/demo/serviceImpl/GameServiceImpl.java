package com.swjtuhc.demo.serviceImpl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.List;

import javax.swing.filechooser.FileNameExtensionFilter;

import org.apache.ibatis.io.ResolverUtil.IsA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.swjtuhc.demo.mapper.GameMapper;
import com.swjtuhc.demo.model.Game;
import com.swjtuhc.demo.service.GameService;

@Service
public class GameServiceImpl implements GameService{

	
	@Autowired
	GameMapper gameMapper;
	@Override
	public List<Game> getGameList() {
		// TODO Auto-generated method stub
		return gameMapper.selectAllGames();
	}

	
	
	@Override
	public int createGame(Game game, InputStream fileStream) {
		// TODO Auto-generated method stub
		String path ="D:\\localFiles\\";
		int i =-1; 
		//成功
		byte[] bs =new byte[1024];
		//读取到的数据长度
		int len;
		//输出的文件流保存到本地文件
		try {
			File tempFile = new File(path);
			if(!tempFile.exists()) {
				tempFile.mkdirs();
			}
			
			Date today =new Date();
		    String fileName =today.getTime()+game.getPoster();
		    game.setPoster("/posters/"+ fileName);
			OutputStream os =new FileOutputStream(tempFile.getPath()+File.separator+fileName);
			//开始读取
			while ((len = fileStream.read(bs)) !=-1) {
				os.write(bs,0,len);
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			i=-2;
			//失败读取
		}
		if(game.getPoster().equals("")) {
			i=-3;
			//文件名为空
		}else {
			//调用mapper，将movie信息存入数据库
			 i= gameMapper.insertGame(game);
		}
		
		return i;
	}

}
