package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: aS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2719aS extends C2943bS.a<Object, Boolean> {
    public final /* synthetic */ Function1 a;
    public final /* synthetic */ boolean[] b;

    public C2719aS(Function1 function1, boolean[] zArr) {
        this.a = function1;
        this.b = zArr;
    }

    @Override // defpackage.C2943bS.c
    public final Object a() {
        return Boolean.valueOf(this.b[0]);
    }

    @Override // defpackage.C2943bS.c
    public final boolean c(Object obj) {
        boolean zBooleanValue = ((Boolean) this.a.invoke(obj)).booleanValue();
        boolean[] zArr = this.b;
        if (zBooleanValue) {
            zArr[0] = true;
        }
        return !zArr[0];
    }
}
