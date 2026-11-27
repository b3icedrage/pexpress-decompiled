package defpackage;

import androidx.annotation.NonNull;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class F01 extends QU0<G01.a<Object>, Object> {
    @Override // defpackage.QU0
    public final void c(@NonNull G01.a<Object> aVar, Object obj) {
        G01.a<Object> aVar2 = aVar;
        aVar2.getClass();
        ArrayDeque arrayDeque = G01.a.b;
        synchronized (arrayDeque) {
            arrayDeque.offer(aVar2);
        }
    }
}
