package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: j60, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4600j60 implements E10 {

    @NotNull
    public static final C4600j60 b = new C4600j60();

    @Override // defpackage.E10
    @NotNull
    public final String a() {
        throw new IllegalStateException("Empty direction calculator");
    }

    @Override // defpackage.E10
    @Nullable
    public final Object b(@NotNull I10 i10, @NotNull LM lm) {
        return E10.b.a(this, i10, lm);
    }

    @Override // defpackage.E10
    @Nullable
    public final Object c(@NotNull I10 i10, @NotNull JM<? super H32.a> jm) {
        throw new IllegalStateException("Empty direction calculator");
    }
}
