package io.sentry.okhttp;

import defpackage.EnumC4869kO1;
import defpackage.InterfaceC2347Wu0;
import defpackage.ML0;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends ML0 implements Function1<InterfaceC2347Wu0, Unit> {
    public final /* synthetic */ IOException d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(IOException iOException) {
        super(1);
        this.d = iOException;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC2347Wu0 interfaceC2347Wu0) {
        InterfaceC2347Wu0 it = interfaceC2347Wu0;
        Intrinsics.checkNotNullParameter(it, "it");
        it.o(EnumC4869kO1.INTERNAL_ERROR);
        it.i(this.d);
        return Unit.a;
    }
}
