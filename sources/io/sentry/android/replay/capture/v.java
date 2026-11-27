package io.sentry.android.replay.capture;

import defpackage.ML0;
import defpackage.SD1;
import io.sentry.android.replay.ReplayIntegration;
import java.util.ArrayList;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class v extends ML0 implements Function1<A.b, Unit> {
    public final /* synthetic */ w d;
    public final /* synthetic */ ReplayIntegration.c e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, ReplayIntegration.c cVar) {
        super(1);
        this.d = wVar;
        this.e = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(A.b bVar) throws InterruptedException {
        SD1 sd1;
        A.b segment = bVar;
        Intrinsics.checkNotNullParameter(segment, "segment");
        w wVar = this.d;
        ArrayList arrayList = wVar.v;
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        A.b.a aVar = (A.b.a) (arrayList.isEmpty() ? null : arrayList.remove(0));
        while (true) {
            sd1 = wVar.s;
            if (aVar == null) {
                break;
            }
            A.b.a.a(aVar, sd1);
            Intrinsics.checkNotNullParameter(arrayList, "<this>");
            aVar = (A.b.a) (arrayList.isEmpty() ? null : arrayList.remove(0));
            Thread.sleep(100L);
        }
        if (segment instanceof A.b.a) {
            A.b.a aVar2 = (A.b.a) segment;
            A.b.a.a(aVar2, sd1);
            Date date = aVar2.a.y;
            Intrinsics.checkNotNullExpressionValue(date, "getTimestamp(...)");
            this.e.invoke(date);
        }
        return Unit.a;
    }
}
