package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: fI0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3752fI0 implements Function0 {
    public final /* synthetic */ int d;
    public final Object e;
    public final Object g;

    public /* synthetic */ C3752fI0(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.g = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                C4172hI0 c4172hI0 = (C4172hI0) this.e;
                Function1<S01, InterfaceC4675jU> function1 = c4172hI0.b;
                T01 t01 = c4172hI0.a;
                InterfaceC4675jU interfaceC4675jUInvoke = function1.invoke(t01);
                C01 c01 = C01.i;
                SC sc = SC.e;
                List listC = VE.c(t01.h.e());
                C5638o21 c5638o21 = C4172hI0.g;
                C2720aS0 storageManager = (C2720aS0) this.g;
                IC containingClass = new IC(interfaceC4675jUInvoke, c5638o21, c01, sc, listC, storageManager);
                Intrinsics.checkNotNullParameter(storageManager, "storageManager");
                Intrinsics.checkNotNullParameter(containingClass, "containingClass");
                containingClass.T0(new C3739fE(storageManager, containingClass), C6702t60.d, null);
                return containingClass;
            case 1:
                FJ0.a aVar = (FJ0.a) this.g;
                aVar.getClass();
                IJ0<Object> ij0 = FJ0.a.g[1];
                Object objInvoke = aVar.d.invoke();
                Intrinsics.checkNotNullExpressionValue(objInvoke, "getValue(...)");
                AbstractC5906pJ0.c cVar = AbstractC5906pJ0.c.d;
                return ((FJ0) this.e).o((QY0) objInvoke, cVar);
            default:
                return ((AbstractC6331rL0) this.e).t(((C4661jP0) this.g).g.invoke());
        }
    }
}
