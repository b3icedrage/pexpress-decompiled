package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: renamed from: hn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4278hn0 extends T52<AtomicLongArray> {
    public final /* synthetic */ T52 a;

    public C4278hn0(T52 t52) {
        this.a = t52;
    }

    @Override // defpackage.T52
    public final AtomicLongArray a(C7790yH0 c7790yH0) throws IOException {
        ArrayList arrayList = new ArrayList();
        c7790yH0.l1();
        while (c7790yH0.hasNext()) {
            arrayList.add(Long.valueOf(((Number) this.a.a(c7790yH0)).longValue()));
        }
        c7790yH0.h1();
        int size = arrayList.size();
        AtomicLongArray atomicLongArray = new AtomicLongArray(size);
        for (int i = 0; i < size; i++) {
            atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
        }
        return atomicLongArray;
    }

    @Override // defpackage.T52
    public final void b(ZH0 zh0, AtomicLongArray atomicLongArray) throws IOException {
        AtomicLongArray atomicLongArray2 = atomicLongArray;
        zh0.l1();
        int length = atomicLongArray2.length();
        for (int i = 0; i < length; i++) {
            this.a.b(zh0, Long.valueOf(atomicLongArray2.get(i)));
        }
        zh0.h1();
    }
}
