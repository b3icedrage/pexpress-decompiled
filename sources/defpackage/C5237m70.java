package defpackage;

import java.util.Collection;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: m70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5237m70 implements Function1<C5638o21, Collection<? extends InterfaceC0671Bj1>> {
    public final /* synthetic */ C5867p70.a d;

    public C5237m70(C5867p70.a aVar) {
        this.d = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Collection<? extends InterfaceC0671Bj1> invoke(C5638o21 c5638o21) {
        C5638o21 c5638o22 = c5638o21;
        C5867p70.a aVar = this.d;
        if (c5638o22 != null) {
            return aVar.j(c5638o22, aVar.i().b(c5638o22, S41.j));
        }
        aVar.getClass();
        C5867p70.a.h(4);
        throw null;
    }
}
