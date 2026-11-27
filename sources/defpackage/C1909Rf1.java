package defpackage;

import android.widget.PopupWindow;

/* JADX INFO: renamed from: Rf1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1909Rf1 {
    public static boolean a(PopupWindow popupWindow) {
        return popupWindow.getOverlapAnchor();
    }

    public static int b(PopupWindow popupWindow) {
        return popupWindow.getWindowLayoutType();
    }

    public static void c(PopupWindow popupWindow, boolean z) {
        popupWindow.setOverlapAnchor(z);
    }

    public static void d(PopupWindow popupWindow, int i) {
        popupWindow.setWindowLayoutType(i);
    }
}
