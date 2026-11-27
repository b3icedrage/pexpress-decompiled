package defpackage;

import java.lang.reflect.Constructor;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class F90 extends ML0 implements Function1<Throwable, Throwable> {
    public final /* synthetic */ Constructor d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F90(Constructor constructor) {
        super(1);
        this.d = constructor;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Throwable invoke(Throwable th) {
        Object objA;
        Throwable e = th;
        Intrinsics.checkNotNullParameter(e, "e");
        try {
            C1717Ot1.a aVar = C1717Ot1.e;
            Object objNewInstance = this.d.newInstance(e);
            Intrinsics.c(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
            objA = (Throwable) objNewInstance;
        } catch (Throwable th2) {
            C1717Ot1.a aVar2 = C1717Ot1.e;
            objA = C1795Pt1.a(th2);
        }
        if (objA instanceof C1717Ot1.b) {
            objA = null;
        }
        return (Throwable) objA;
    }
}
