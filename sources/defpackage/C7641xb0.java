package defpackage;

import java.util.Random;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;
import kotlin.time.b;
import kotlin.time.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: xb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7641xb0 implements InterfaceC4209hU1 {
    public static final long c;
    public final /* synthetic */ InterfaceC4209hU1 a;
    public double b;

    static {
        b.a aVar = b.e;
        c = c.g(700, R40.MILLISECONDS);
    }

    public C7641xb0(@NotNull InterfaceC4209hU1 subscribeToValueUpdatesUseCase) {
        Intrinsics.checkNotNullParameter(subscribeToValueUpdatesUseCase, "subscribeToValueUpdatesUseCase");
        this.a = subscribeToValueUpdatesUseCase;
        this.b = 1.0517d;
    }

    public static CF c(C7641xb0 c7641xb0, double d, double d2, String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Random random = new Random();
        c7641xb0.getClass();
        double dB = (f.b((d - d2) / 0.0015d, -1.0d, 1.0d) * 0.0015d) + (((random.nextGaussian() * 5.0E-6d) * ((double) 2)) - 5.0E-6d);
        return new CF(str, jCurrentTimeMillis, (float) (d2 + (dB <= 5.0E-6d ? dB : 5.0E-6d)), jCurrentTimeMillis);
    }

    @Override // defpackage.InterfaceC4209hU1
    @Nullable
    public final Object a(@NotNull I10 i10, int i, @NotNull LM lm) {
        return this.a.a(i10, i, lm);
    }

    @Override // defpackage.InterfaceC4209hU1
    @Nullable
    public final Object b(@NotNull String str, @NotNull LM lm) {
        return new C3735fC1(new C7431wb0(this, str, null));
    }
}
