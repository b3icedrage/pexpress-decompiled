package defpackage;

import java.lang.reflect.Array;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: Pb1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1741Pb1 extends AbstractC1819Qb1<Object> {
    public final /* synthetic */ AbstractC1819Qb1 a;

    public C1741Pb1(AbstractC1819Qb1 abstractC1819Qb1) {
        this.a = abstractC1819Qb1;
    }

    @Override // defpackage.AbstractC1819Qb1
    public final void a(C6235qs1 c6235qs1, @Nullable Object obj) {
        if (obj == null) {
            return;
        }
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.a.a(c6235qs1, Array.get(obj, i));
        }
    }
}
