package Controller;

import Commons.C8MenuAction;
import Commons.C8MenuListener;

class C8EmuMenuListener implements C8MenuListener {

    @Override
    public void onMenuAction(C8MenuAction action) {
        System.out.println(action.name() + ": " + action.ordinal());
    }
}
