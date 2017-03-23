package api.apps.HR_Media;

import api.android.Android;
import api.apps.HR_Media.audioSource.AudioSource;
import api.apps.HR_Media.Indications.top.TopIndication;
import api.apps.HR_Media.Indications.buttom.*;
import api.apps.HR_Media.panel.icon.UIPanel;
import api.interfaces.Application;

import java.awt.*;

/**
 * Created by arikzil on 19/03/17.
 * Represents the main menu of HR Media fixed
 */
public class HRMedia implements Application {

    // Home menu
    public Menu menu = new Menu();
    public AudioSource audioSource = new AudioSource();
    public UIPanel uiPanle = new UIPanel();
    public TopIndication topIndication = new TopIndication();
    public ButtomIndication buttomIndication = new ButtomIndication();

    @Override
    public void forceStop() {
        Android.adb.forceStopApp(packageID());
    }

    @Override
    public void clearData() {
        Android.adb.clearAppsData(packageID());
    }

    @Override
    public Object open() {
        Android.adb.openAppsActivity(packageID(), activityID());
        return null;
    }

    // TODO: change the package id and activity id
    @Override
    public String packageID() {
        return "org.zwanoo.android.speedtest";
    }

    @Override
    public String activityID() {
        return "com.ookla.speedtest.softfacade.MainActivity";
    }
}
