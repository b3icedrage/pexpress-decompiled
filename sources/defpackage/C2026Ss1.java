package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: Ss1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2026Ss1 {
    public final Set<InterfaceC4762js1> a = Collections.newSetFromMap(new WeakHashMap());
    public final HashSet b = new HashSet();
    public boolean c;

    public final boolean a(InterfaceC4762js1 interfaceC4762js1) {
        boolean z = true;
        if (interfaceC4762js1 == null) {
            return true;
        }
        boolean zRemove = this.a.remove(interfaceC4762js1);
        if (!this.b.remove(interfaceC4762js1) && !zRemove) {
            z = false;
        }
        if (z) {
            interfaceC4762js1.clear();
        }
        return z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{numRequests=");
        sb.append(this.a.size());
        sb.append(", isPaused=");
        return C2983be.b(sb, this.c, "}");
    }
}
