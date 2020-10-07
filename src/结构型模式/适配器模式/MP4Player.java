package 结构型模式.适配器模式;
/*
 ******************************************
 *           Created by ENIAC_zYF         *
 *                                        *
 *           @Date 2020/10/7              *
 ******************************************
 */

public class MP4Player implements AdvancedMediaPlayer
{
    @Override
    public void playMP4(String fileName)
    {
        System.out.println("播放MP4文件：" + fileName);
    }

    @Override
    public void playAVI(String fileName)
    {

    }
}
