package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class GZ implements Function0 {
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ GZ(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                return C3476e.f((FZ) this.e);
            case 1:
                Collection<FC> collectionP = ((C3545eJ0.a) this.e).b().P();
                Intrinsics.checkNotNullExpressionValue(collectionP, "getSealedSubclasses(...)");
                ArrayList arrayList = new ArrayList();
                for (FC fc : collectionP) {
                    Intrinsics.c(fc, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    Class<?> clsK = C7437wc2.k(fc);
                    C3545eJ0 c3545eJ0 = clsK != null ? new C3545eJ0(clsK) : null;
                    if (c3545eJ0 != null) {
                        arrayList.add(c3545eJ0);
                    }
                }
                return arrayList;
            case 2:
                WJ0 wj0 = (WJ0) this.e;
                return wj0.c(wj0.a);
            case 3:
                return ((QO0) this.e).k();
            default:
                C1758Ph0 c1758Ph0C = C4194hP1.l.c(((EnumC6405rh1) this.e).d);
                Intrinsics.checkNotNullExpressionValue(c1758Ph0C, "child(...)");
                return c1758Ph0C;
        }
    }
}
