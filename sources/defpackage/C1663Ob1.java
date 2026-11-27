package defpackage;

import java.util.Iterator;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: Ob1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1663Ob1 extends AbstractC1819Qb1<Iterable<Object>> {
    public final /* synthetic */ AbstractC1819Qb1 a;

    public C1663Ob1(AbstractC1819Qb1 abstractC1819Qb1) {
        this.a = abstractC1819Qb1;
    }

    @Override // defpackage.AbstractC1819Qb1
    public final void a(C6235qs1 c6235qs1, @Nullable Iterable<Object> iterable) {
        Iterable<Object> iterable2 = iterable;
        if (iterable2 == null) {
            return;
        }
        Iterator<Object> it = iterable2.iterator();
        while (it.hasNext()) {
            this.a.a(c6235qs1, it.next());
        }
    }
}
