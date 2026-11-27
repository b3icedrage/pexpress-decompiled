package io.sentry.android.replay.capture;

import defpackage.ML0;
import java.util.ArrayList;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class y extends ML0 implements Function1<io.sentry.rrweb.b, Unit> {
    public final /* synthetic */ Date d;
    public final /* synthetic */ ArrayList e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(Date date, ArrayList arrayList) {
        super(1);
        this.d = date;
        this.e = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(io.sentry.rrweb.b bVar) {
        io.sentry.rrweb.b event = bVar;
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.e >= this.d.getTime()) {
            this.e.add(event);
        }
        return Unit.a;
    }
}
