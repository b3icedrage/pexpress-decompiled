package defpackage;

import java.util.Collection;
import java.util.HashSet;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: n70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5447n70 implements Function0<Collection<InterfaceC4675jU>> {
    public final /* synthetic */ C5867p70.a d;

    public C5447n70(C5867p70.a aVar) {
        this.d = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Collection<InterfaceC4675jU> invoke() {
        C5867p70.a aVar = this.d;
        aVar.getClass();
        HashSet hashSet = new HashSet();
        for (C5638o21 c5638o21 : aVar.e.m.invoke()) {
            S41 s41 = S41.j;
            hashSet.addAll(aVar.d(c5638o21, s41));
            hashSet.addAll(aVar.b(c5638o21, s41));
        }
        return hashSet;
    }
}
