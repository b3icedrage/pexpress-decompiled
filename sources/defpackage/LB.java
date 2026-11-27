package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: loaded from: classes.dex */
public final class LB extends R1 {
    public final /* synthetic */ CheckableImageButton d;

    public LB(CheckableImageButton checkableImageButton) {
        this.d = checkableImageButton;
    }

    @Override // defpackage.R1
    public final void c(View view, @NonNull AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.d.h);
    }

    @Override // defpackage.R1
    public final void d(View view, @NonNull C5426n2 c5426n2) {
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        AccessibilityNodeInfo accessibilityNodeInfo = c5426n2.a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        CheckableImageButton checkableImageButton = this.d;
        accessibilityNodeInfo.setCheckable(checkableImageButton.i);
        accessibilityNodeInfo.setChecked(checkableImageButton.h);
    }
}
