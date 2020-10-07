package 结构型模式.适配器模式;
/*
 ******************************************
 *           Created by ENIAC_zYF         *
 *                                        *
 *           @Date 2020/10/7              *
 ******************************************
 */

public class AVIPlayer implements AdvancedMediaPlayer
{
    @Override
    public void playMP4(String fileName)
    {

    }

    @Override
    public void playAVI(String fileName)
    {
        System.out.println("播放AVI文件：" + fileName);
    }
}
