package defpackage;

import java.util.List;

/* JADX INFO: renamed from: Im0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1225Im0 extends AbstractC7799yK0<C1147Hm0> {
    public final C1147Hm0 i;

    public C1225Im0(List<C7589xK0<C1147Hm0>> list) {
        super(list);
        C1147Hm0 c1147Hm0 = list.get(0).b;
        int length = c1147Hm0 != null ? c1147Hm0.b.length : 0;
        this.i = new C1147Hm0(new float[length], new int[length]);
    }

    @Override // defpackage.AbstractC1002Fq
    public final Object g(C7589xK0 c7589xK0, float f) {
        C1147Hm0 c1147Hm0 = (C1147Hm0) c7589xK0.b;
        C1147Hm0 c1147Hm1 = (C1147Hm0) c7589xK0.c;
        C1147Hm0 c1147Hm2 = this.i;
        c1147Hm2.getClass();
        int[] iArr = c1147Hm0.b;
        int length = iArr.length;
        int[] iArr2 = c1147Hm1.b;
        if (length != iArr2.length) {
            StringBuilder sb = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
            sb.append(iArr.length);
            sb.append(" vs ");
            throw new IllegalArgumentException(SK.b(sb, iArr2.length, ")"));
        }
        for (int i = 0; i < iArr.length; i++) {
            c1147Hm2.a[i] = C7099v01.d(c1147Hm0.a[i], c1147Hm1.a[i], f);
            c1147Hm2.b[i] = MP0.f(f, iArr[i], iArr2[i]);
        }
        return c1147Hm2;
    }
}
