package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final class NI0 implements Function0 {
    public final PI0 d;

    public NI0(PI0 pi0) {
        this.d = pi0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z;
        List<GJ0> listB = this.d.b();
        if (listB == null || !listB.isEmpty()) {
            Iterator<T> it = listB.iterator();
            while (it.hasNext()) {
                if (C7437wc2.h(((GJ0) it.next()).getType())) {
                    z = true;
                }
            }
            z = false;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
