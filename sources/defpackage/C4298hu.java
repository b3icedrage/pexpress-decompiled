package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import com.google.android.material.bottomsheet.b;

/* JADX INFO: renamed from: hu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4298hu extends R1 {
    public final /* synthetic */ b d;

    public C4298hu(b bVar) {
        this.d = bVar;
    }

    @Override // defpackage.R1
    public final void d(View view, @NonNull C5426n2 c5426n2) {
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        AccessibilityNodeInfo accessibilityNodeInfo = c5426n2.a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        if (!this.d.n) {
            accessibilityNodeInfo.setDismissable(false);
        } else {
            c5426n2.a(1048576);
            accessibilityNodeInfo.setDismissable(true);
        }
    }

    @Override // defpackage.R1
    public final boolean g(View view, int i, Bundle bundle) {
        if (i == 1048576) {
            b bVar = this.d;
            if (bVar.n) {
                bVar.cancel();
                return true;
            }
        }
        return super.g(view, i, bundle);
    }
}
