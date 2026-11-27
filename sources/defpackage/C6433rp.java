package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: rp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6433rp implements Function1 {
    public final /* synthetic */ int d;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                C6946uG0 Json = (C6946uG0) obj;
                Intrinsics.checkNotNullParameter(Json, "$this$Json");
                Json.c = true;
                Json.i = false;
                return Unit.a;
            default:
                return obj;
        }
    }
}
