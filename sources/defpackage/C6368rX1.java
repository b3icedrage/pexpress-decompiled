package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: rX1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6368rX1 implements DP0 {
    public final Set<InterfaceC5529nX1<?>> d = Collections.newSetFromMap(new WeakHashMap());

    @Override // defpackage.DP0
    public final void onDestroy() {
        Iterator it = C6177qc2.e(this.d).iterator();
        while (it.hasNext()) {
            ((InterfaceC5529nX1) it.next()).onDestroy();
        }
    }

    @Override // defpackage.DP0
    public final void onStart() {
        Iterator it = C6177qc2.e(this.d).iterator();
        while (it.hasNext()) {
            ((InterfaceC5529nX1) it.next()).onStart();
        }
    }

    @Override // defpackage.DP0
    public final void onStop() {
        Iterator it = C6177qc2.e(this.d).iterator();
        while (it.hasNext()) {
            ((InterfaceC5529nX1) it.next()).onStop();
        }
    }
}
