package api.apps.HR_Media.panel.icon;

import core.UiObject;
import core.UiSelector;

/**
 * Created by arikzil on 19/03/17.
 */
public class UIPanelUiObjects {

    /**
     * array representing the the user of the panel starting
     * in he top left cornder and ending in the button right
     */
    private static UiObject userPanel[] = new UiObject[16];

    /**
     * @param index the x axis location of the panel
     * @return UiObject representing a panelist box
     **/
    public UiObject userPanel(int index) {

        if (userPanel[index] == null) {

            userPanel[index] = new UiSelector().resourceId("com.mrl.fixed.mexico:id/row_kn").index(index).makeUiObject();
        }

        return userPanel[index];
    }


}
