package io.sentry.android.replay.capture;

import defpackage.C2512Yo1;
import defpackage.C2688aH1;
import defpackage.ML0;
import defpackage.NG1;
import java.io.File;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class x extends ML0 implements Function1<A.b.a, Boolean> {
    public final /* synthetic */ long d;
    public final /* synthetic */ w e;
    public final /* synthetic */ C2512Yo1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(long j, w wVar, C2512Yo1 c2512Yo1) {
        super(1);
        this.d = j;
        this.e = wVar;
        this.g = c2512Yo1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(A.b.a aVar) {
        A.b.a it = aVar;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.a.y.getTime() >= this.d) {
            return Boolean.FALSE;
        }
        w wVar = this.e;
        wVar.i(wVar.j() - 1);
        File file = it.a.t;
        C2688aH1 c2688aH1 = wVar.r;
        if (file != null) {
            try {
                if (!file.delete()) {
                    c2688aH1.getLogger().a(NG1.ERROR, "Failed to delete replay segment: %s", file.getAbsolutePath());
                }
            } catch (Throwable th) {
                c2688aH1.getLogger().c(NG1.ERROR, th, "Failed to delete replay segment: %s", file.getAbsolutePath());
            }
        }
        this.g.d = true;
        return Boolean.TRUE;
    }
}
