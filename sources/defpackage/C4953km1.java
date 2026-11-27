package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: km1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4953km1 implements E10 {

    @NotNull
    public final AbstractC4743jm1 b;

    public C4953km1(@NotNull AbstractC4743jm1 random) {
        Intrinsics.checkNotNullParameter(random, "random");
        this.b = random;
    }

    @Override // defpackage.E10
    @NotNull
    public final String a() {
        throw new IllegalStateException("Only for local indicators");
    }

    @Override // defpackage.E10
    @Nullable
    public final Object b(@NotNull I10 i10, @NotNull LM lm) {
        return E10.b.a(this, i10, lm);
    }

    @Override // defpackage.E10
    @Nullable
    public final Object c(@NotNull I10 i10, @NotNull JM<? super H32.a> jm) {
        C3279d22 c3279d22 = C5163lm1.a;
        AbstractC4743jm1 abstractC4743jm1 = this.b;
        Intrinsics.checkNotNullParameter(abstractC4743jm1, "<this>");
        return abstractC4743jm1.b() ? H32.a.CALL_UP : H32.a.PUT_DOWN;
    }
}
