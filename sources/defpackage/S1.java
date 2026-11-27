package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import androidx.annotation.NonNull;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class S1 implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final C8100zl a;

    public S1(@NonNull C8100zl c8100zl) {
        this.a = c8100zl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof S1) {
            return this.a.equals(((S1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        C4802k40 c4802k40 = (C4802k40) this.a.e;
        AutoCompleteTextView autoCompleteTextView = c4802k40.h;
        if (autoCompleteTextView == null || C1952Ru.l(autoCompleteTextView)) {
            return;
        }
        int i = z ? 2 : 1;
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        c4802k40.d.setImportantForAccessibility(i);
    }
}
