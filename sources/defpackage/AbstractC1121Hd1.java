package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Hd1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1121Hd1<TSubject, TContext> implements KN {

    @NotNull
    public final TContext d;

    public AbstractC1121Hd1(@NotNull TContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.d = context;
    }

    @Nullable
    public abstract Object a(@NotNull Object obj, @NotNull LM lm);

    @NotNull
    public abstract TSubject b();

    @Nullable
    public abstract Object c(@NotNull JM<? super TSubject> jm);

    @Nullable
    public abstract Object d(@NotNull JM jm, @NotNull Object obj);
}
