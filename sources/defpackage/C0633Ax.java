package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Ax, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0633Ax {

    @NotNull
    public static final UH a = C4097gx.a(C7508wx.e);

    @NotNull
    public static final UH b = C4097gx.a(C7718xx.e);

    @NotNull
    public static final UH c = C4097gx.a(C1428Lc.g);

    @NotNull
    public static final UH d;

    static {
        C4097gx.a(C7928yx.e);
        d = C4097gx.a(C8138zx.e);
    }

    @NotNull
    public static final <T> C3545eJ0<T> a(@NotNull Class<T> jClass) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        Object objA = a.a(jClass);
        Intrinsics.c(objA, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<T of kotlin.reflect.jvm.internal.CachesKt.getOrCreateKotlinClass>");
        return (C3545eJ0) objA;
    }
}
