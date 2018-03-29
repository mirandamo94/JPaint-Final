package viewInterfaces;

import java.util.List;

import controller.ColorAdapter;

public interface IDialogChoice {
    String getDialogTitle();

    String getDialogText();

    Object[] getDialogOptions();

    Object getDefaultChoice();
}
