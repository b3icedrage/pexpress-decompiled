package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: q50, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6069q50 extends AbstractC8052zY1 {
    @Override // defpackage.AbstractC8052zY1
    public final void v(C2610Zv0 c2610Zv0, ArrayList arrayList) {
        C2837aw0 c2837aw0FirstElement = c2610Zv0.h.firstElement();
        if (!c2837aw0FirstElement.d) {
            throw new IllegalStateException("setElseSaxEventList() invoked on inactive IfAction");
        }
        c2837aw0FirstElement.c = arrayList;
    }
}
