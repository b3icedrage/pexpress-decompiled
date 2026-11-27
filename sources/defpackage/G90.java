package defpackage;

import java.lang.reflect.Constructor;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class G90 extends ML0 implements Function1<Throwable, Throwable> {
    public final /* synthetic */ Constructor d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G90(Constructor constructor) {
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
            Object objNewInstance = this.d.newInstance(e.getMessage());
            Intrinsics.c(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
            Throwable th2 = (Throwable) objNewInstance;
            th2.initCause(e);
            objA = th2;
        } catch (Throwable th3) {
            C1717Ot1.a aVar2 = C1717Ot1.e;
            objA = C1795Pt1.a(th3);
        }
        boolean z = objA instanceof C1717Ot1.b;
        Object obj = objA;
        if (z) {
            obj = null;
        }
        return (Throwable) obj;
    }
}
