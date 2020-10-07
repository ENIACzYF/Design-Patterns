package 结构型模式.适配器模式;
/*
 ******************************************
 *           Created by ENIAC_zYF         *
 *                                        *
 *           @Date 2020/10/7              *
 ******************************************
 */

public class MediaAdapter implements MediaPlayer
{
    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType)
    {
        if (audioType.equalsIgnoreCase("MP4"))
        {
            advancedMediaPlayer = new MP4Player();
        }
        else if (audioType.equalsIgnoreCase("AVI"))
        {
            advancedMediaPlayer = new AVIPlayer();
        }
    }

    @Override
    public void play(String audioType, String fileName)
    {
        if (audioType.equalsIgnoreCase("MP4"))
        {
            advancedMediaPlayer.playMP4(fileName);
        }
        else if (audioType.equalsIgnoreCase("AVI"))
        {
            advancedMediaPlayer.playAVI(fileName);
        }
    }
}
