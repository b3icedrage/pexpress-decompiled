package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* JADX INFO: renamed from: q2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C6056q2 {
    public final AccessibilityNodeProvider a;

    /* JADX INFO: renamed from: q2$a */
    public static class a extends AccessibilityNodeProvider {
        public final C6056q2 a;

        public a(C6056q2 c6056q2) {
            this.a = c6056q2;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            C5426n2 c5426n2A = this.a.a(i);
            if (c5426n2A == null) {
                return null;
            }
            return c5426n2A.a;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            this.a.getClass();
            return null;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final AccessibilityNodeInfo findFocus(int i) {
            C5426n2 c5426n2B = this.a.b(i);
            if (c5426n2B == null) {
                return null;
            }
            return c5426n2B.a;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final boolean performAction(int i, int i2, Bundle bundle) {
            return this.a.c(i, i2, bundle);
        }
    }

    /* JADX INFO: renamed from: q2$b */
    public static class b extends a {
        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.a.getClass();
        }
    }

    public C6056q2() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.a = new b(this);
        } else {
            this.a = new a(this);
        }
    }

    public C5426n2 a(int i) {
        return null;
    }

    public C5426n2 b(int i) {
        return null;
    }

    public boolean c(int i, int i2, Bundle bundle) {
        return false;
    }

    public C6056q2(AccessibilityNodeProvider accessibilityNodeProvider) {
        this.a = accessibilityNodeProvider;
    }
}
