package defpackage;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: fV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3790fV extends C7 implements Function2<String, Map<String, ? extends Object>, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, Map<String, ? extends Object> map) {
        String p0 = str;
        Intrinsics.checkNotNullParameter(p0, "p0");
        C3595ea.m((C4693ja) this.d, p0, map, 4);
        return Unit.a;
    }
}
