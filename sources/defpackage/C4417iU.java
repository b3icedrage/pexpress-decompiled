package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: iU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4417iU<T> implements InterfaceC1210Ih0<T> {

    @NotNull
    public final List<Integer> a;

    public C4417iU(@NotNull AbstractC4207hU.a number, @NotNull List zerosToAdd) {
        Intrinsics.checkNotNullParameter(number, "number");
        Intrinsics.checkNotNullParameter(zerosToAdd, "zerosToAdd");
        this.a = zerosToAdd;
    }
}
