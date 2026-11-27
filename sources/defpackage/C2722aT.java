package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: aT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2722aT extends ML0 implements Function2<AbstractC6373rZ0.a<Object>, Throwable, Unit> {
    public static final C2722aT d = new C2722aT(2);

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(AbstractC6373rZ0.a<Object> aVar, Throwable th) {
        AbstractC6373rZ0.a<Object> msg = aVar;
        Throwable cancellationException = th;
        Intrinsics.checkNotNullParameter(msg, "msg");
        DG dg = msg.b;
        if (cancellationException == null) {
            cancellationException = new CancellationException("DataStore scope was cancelled before updateData could complete");
        }
        dg.k(cancellationException);
        return Unit.a;
    }
}
