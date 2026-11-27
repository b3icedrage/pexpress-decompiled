package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: h1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4111h1 implements Function1 {
    public final C7755y62 d;
    public final C2905bF0[] e;

    public C4111h1(C7755y62 c7755y62, C2905bF0[] c2905bF0Arr) {
        this.d = c7755y62;
        this.e = c2905bF0Arr;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C2905bF0 c2905bF0;
        int iIntValue = ((Number) obj).intValue();
        C7755y62 c7755y62 = this.d;
        if (c7755y62 != null && (c2905bF0 = (C2905bF0) c7755y62.a.get(Integer.valueOf(iIntValue))) != null) {
            return c2905bF0;
        }
        if (iIntValue >= 0) {
            C2905bF0[] c2905bF0Arr = this.e;
            if (iIntValue < c2905bF0Arr.length) {
                return c2905bF0Arr[iIntValue];
            }
        }
        return C2905bF0.e;
    }
}
