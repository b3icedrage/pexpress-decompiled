package defpackage;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class Z6 implements InterfaceC7604xP0 {
    public final Set<DP0> d = Collections.newSetFromMap(new WeakHashMap());
    public boolean e;
    public boolean g;

    @Override // defpackage.InterfaceC7604xP0
    public final void a(@NonNull DP0 dp0) {
        this.d.remove(dp0);
    }

    public final void b() {
        this.g = true;
        Iterator it = C6177qc2.e(this.d).iterator();
        while (it.hasNext()) {
            ((DP0) it.next()).onDestroy();
        }
    }

    @Override // defpackage.InterfaceC7604xP0
    public final void c(@NonNull DP0 dp0) {
        this.d.add(dp0);
        if (this.g) {
            dp0.onDestroy();
        } else if (this.e) {
            dp0.onStart();
        } else {
            dp0.onStop();
        }
    }
}
