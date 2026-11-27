package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* JADX INFO: renamed from: Wq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2334Wq extends R1 {
    public final /* synthetic */ BaseTransientBottomBar d;

    public C2334Wq(BaseTransientBottomBar baseTransientBottomBar) {
        this.d = baseTransientBottomBar;
    }

    @Override // defpackage.R1
    public final void d(View view, @NonNull C5426n2 c5426n2) {
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        AccessibilityNodeInfo accessibilityNodeInfo = c5426n2.a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        c5426n2.a(1048576);
        accessibilityNodeInfo.setDismissable(true);
    }

    @Override // defpackage.R1
    public final boolean g(View view, int i, Bundle bundle) {
        if (i != 1048576) {
            return super.g(view, i, bundle);
        }
        this.d.a();
        return true;
    }
}
