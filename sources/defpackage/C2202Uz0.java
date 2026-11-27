package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Uz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2202Uz0 implements Function1 {
    public final /* synthetic */ long d;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long jLongValue = ((Long) obj).longValue();
        long j = this.d;
        if (jLongValue > j) {
            jLongValue = j;
        }
        return Long.valueOf(jLongValue);
    }
}
