package 结构型模式.适配器模式;
/*
 ******************************************
 *           Created by ENIAC_zYF         *
 *                                        *
 *           @Date 2020/10/7              *
 ******************************************
 */

public class AudioPlayer implements MediaPlayer
{
    MediaPlayer mediaPlayer;

    @Override
    public void play(String audioType, String fileName)
    {
        if (audioType.equalsIgnoreCase("MP3"))
        {
            System.out.println("播放MP3文件：" + fileName);
        }
        else if (audioType.equalsIgnoreCase("MP4")
                || audioType.equalsIgnoreCase("AVI"))
        {
            mediaPlayer = new MediaAdapter(audioType);
            mediaPlayer.play(audioType, fileName);
        }
        else
        {
            System.out.println("不支持该文件种类！");
        }

    }
}
