package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: xY1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7632xY1 extends AbstractC8052zY1 {
    @Override // defpackage.AbstractC8052zY1
    public final void v(C2610Zv0 c2610Zv0, ArrayList arrayList) {
        C2837aw0 c2837aw0FirstElement = c2610Zv0.h.firstElement();
        if (!c2837aw0FirstElement.d) {
            throw new IllegalStateException("setThenSaxEventList() invoked on inactive IfAction");
        }
        c2837aw0FirstElement.b = arrayList;
    }
}
