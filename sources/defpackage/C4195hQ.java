package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: hQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4195hQ implements Function1 {
    public final /* synthetic */ int d;

    public /* synthetic */ C4195hQ(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                FF it = (FF) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.D);
            case 1:
                return Unit.a;
            case 2:
                return Unit.a;
            default:
                UN0.a it2 = (UN0.a) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                String str = it2.a;
                Long l = it2.c;
                Intrinsics.checkNotNull(l);
                return str + ":" + (l.longValue() - it2.b);
        }
    }
}
