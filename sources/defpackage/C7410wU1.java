package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: wU1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7410wU1 extends C6120qK1<Integer> implements FP1<Integer> {
    @Override // defpackage.FP1
    public final Integer getValue() {
        Integer numValueOf;
        synchronized (this) {
            Object[] objArr = this.l;
            Intrinsics.checkNotNull(objArr);
            numValueOf = Integer.valueOf(((Number) C1589Ne.j(objArr, (this.m + ((long) ((int) ((s() + ((long) this.o)) - this.m)))) - 1)).intValue());
        }
        return numValueOf;
    }

    public final void z(int i) {
        synchronized (this) {
            Object[] objArr = this.l;
            Intrinsics.checkNotNull(objArr);
            h(Integer.valueOf(((Number) C1589Ne.j(objArr, (this.m + ((long) ((int) ((s() + ((long) this.o)) - this.m)))) - 1)).intValue() + i));
        }
    }
}
