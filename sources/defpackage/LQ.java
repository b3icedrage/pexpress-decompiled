package defpackage;

import java.util.LinkedList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class LQ implements KQ {

    @NotNull
    public final C6038px a;

    @NotNull
    public final GP1 b;

    @NotNull
    public final C1699On1 c;

    @NotNull
    public final GP1 d;

    @NotNull
    public final C1699On1 e;
    public long f;
    public float g;

    public LQ(@NotNull C6038px cachedCandlesProvider) {
        Intrinsics.checkNotNullParameter(cachedCandlesProvider, "cachedCandlesProvider");
        this.a = cachedCandlesProvider;
        GP1 gp1I = C1589Ne.i(-1L);
        this.b = gp1I;
        this.c = C4466ii.f(gp1I);
        GP1 gp1I2 = C1589Ne.i(Float.valueOf(Float.NaN));
        this.d = gp1I2;
        this.e = C4466ii.f(gp1I2);
        this.f = -1L;
        this.g = Float.NaN;
    }

    @Override // defpackage.KQ
    public final void a() {
        GP1 gp1 = this.b;
        gp1.getClass();
        gp1.m(null, -1L);
        Float fValueOf = Float.valueOf(Float.NaN);
        GP1 gp2 = this.d;
        gp2.getClass();
        gp2.m(null, fValueOf);
        this.f = -1L;
        this.g = Float.NaN;
    }

    @Override // defpackage.KQ
    @NotNull
    public final FP1<Long> b() {
        return this.c;
    }

    @Override // defpackage.KQ
    public final void c(float f) {
        Float fValueOf = Float.valueOf(f);
        GP1 gp1 = this.d;
        gp1.getClass();
        gp1.m(null, fValueOf);
    }

    @Override // defpackage.KQ
    public final void d(long j) {
        Long lValueOf = Long.valueOf(j);
        GP1 gp1 = this.b;
        gp1.getClass();
        gp1.m(null, lValueOf);
    }

    @Override // defpackage.KQ
    @NotNull
    public final SZ1 e() {
        LinkedList<SZ1> linkedList;
        if (Float.isNaN(((Number) this.e.d.getValue()).floatValue()) || ((Number) this.c.d.getValue()).longValue() < 0) {
            return SZ1.c;
        }
        boolean zIsNaN = Float.isNaN(this.g);
        GP1 gp1 = this.d;
        if (zIsNaN) {
            this.g = ((Number) gp1.getValue()).floatValue();
        }
        long j = this.f;
        GP1 gp2 = this.b;
        if (j < 0) {
            this.f = ((Number) gp2.getValue()).longValue();
        }
        this.f += (long) ((((Number) gp2.getValue()).longValue() - this.f) * 0.1f);
        float fA = BX.a(((Number) gp1.getValue()).floatValue(), this.g, 0.1f, this.g);
        this.g = fA;
        long j2 = this.f;
        SZ1 entry = new SZ1(fA, j2);
        if (j2 > 0 && !Float.isInfinite(fA) && !Float.isNaN(fA)) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            C6038px c6038px = this.a;
            c6038px.getClass();
            Intrinsics.checkNotNullParameter(entry, "entry");
            while (true) {
                linkedList = c6038px.a;
                if (linkedList.size() < 105000) {
                    break;
                }
                linkedList.remove(0);
            }
            linkedList.add(entry);
        }
        return entry;
    }
}
