package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;

/* JADX INFO: renamed from: Xy0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2463Xy0 extends View.AccessibilityDelegate {
    public final /* synthetic */ C2359Wy0 a;

    public C2463Xy0(C2359Wy0 c2359Wy0) {
        this.a = c2359Wy0;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        EditText editText = this.a.h.getEditText();
        if (editText != null) {
            accessibilityNodeInfo.setLabeledBy(editText);
        }
    }
}
