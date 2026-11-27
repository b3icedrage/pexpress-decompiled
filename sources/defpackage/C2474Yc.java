package defpackage;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Yc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2474Yc<A, C> extends J.a<A> {

    @NotNull
    public final HashMap a;

    @NotNull
    public final HashMap b;

    @NotNull
    public final HashMap c;

    public C2474Yc(@NotNull HashMap memberAnnotations, @NotNull HashMap propertyConstants, @NotNull HashMap annotationParametersDefaultValues) {
        Intrinsics.checkNotNullParameter(memberAnnotations, "memberAnnotations");
        Intrinsics.checkNotNullParameter(propertyConstants, "propertyConstants");
        Intrinsics.checkNotNullParameter(annotationParametersDefaultValues, "annotationParametersDefaultValues");
        this.a = memberAnnotations;
        this.b = propertyConstants;
        this.c = annotationParametersDefaultValues;
    }
}
