package defpackage;

import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jI0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4640jI0 implements Function0 {
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ C4640jI0(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                return new C5060lI0.b((T01) this.e);
            case 1:
                C3545eJ0.a aVar = (C3545eJ0.a) this.e;
                Collection<PI0<?>> collectionA = aVar.a();
                IJ0<Object> ij0 = C3545eJ0.a.p[10];
                Object objInvoke = aVar.k.invoke();
                Intrinsics.checkNotNullExpressionValue(objInvoke, "getValue(...)");
                return CollectionsKt.Q(collectionA, (Collection) objInvoke);
            case 2:
                return new KJ0.a((KJ0) this.e);
            default:
                FO0 fo0 = (FO0) this.e;
                return C5907pJ1.d(fo0.a(), fo0.c());
        }
    }
}
