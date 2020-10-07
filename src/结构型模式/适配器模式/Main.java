package 结构型模式.适配器模式;
/*
 ******************************************
 *           Created by ENIAC_zYF         *
 *                                        *
 *           @Date 2020/10/7              *
 ******************************************
 *     适配器模式（Adapter Pattern）是作为两个不兼容的接口之间的桥梁。
 *
 *     主要解决：主要解决在软件系统中，常常要将一些"现存的对象"放到新的环境中，
 *             而新环境要求的接口是现对象不能满足的。
 */

public class Main
{
    public static void main(String[] args)
    {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}
