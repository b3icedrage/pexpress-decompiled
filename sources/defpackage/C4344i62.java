package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: i62, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4344i62 {

    @NotNull
    public final H62 a;

    @NotNull
    public final AbstractC4649jL0 b;

    @NotNull
    public final AbstractC4649jL0 c;

    public C4344i62(@NotNull H62 typeParameter, @NotNull AbstractC4649jL0 inProjection, @NotNull AbstractC4649jL0 outProjection) {
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        Intrinsics.checkNotNullParameter(inProjection, "inProjection");
        Intrinsics.checkNotNullParameter(outProjection, "outProjection");
        this.a = typeParameter;
        this.b = inProjection;
        this.c = outProjection;
    }
}
