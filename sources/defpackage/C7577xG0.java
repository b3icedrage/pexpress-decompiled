package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: xG0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7577xG0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    @NotNull
    public final String f;

    @NotNull
    public final String g;
    public final boolean h;
    public final boolean i;

    @NotNull
    public final LC j;

    public C7577xG0(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, @NotNull String prettyPrintIndent, @NotNull String classDiscriminator, boolean z6, boolean z7, @NotNull LC classDiscriminatorMode) {
        Intrinsics.checkNotNullParameter(prettyPrintIndent, "prettyPrintIndent");
        Intrinsics.checkNotNullParameter(classDiscriminator, "classDiscriminator");
        Intrinsics.checkNotNullParameter(classDiscriminatorMode, "classDiscriminatorMode");
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = prettyPrintIndent;
        this.g = classDiscriminator;
        this.h = z6;
        this.i = z7;
        this.j = classDiscriminatorMode;
    }

    @NotNull
    public final String toString() {
        return "JsonConfiguration(encodeDefaults=" + this.a + ", ignoreUnknownKeys=" + this.b + ", isLenient=" + this.c + ", allowStructuredMapKeys=" + this.d + ", prettyPrint=false, explicitNulls=" + this.e + ", prettyPrintIndent='" + this.f + "', coerceInputValues=false, useArrayPolymorphism=false, classDiscriminator='" + this.g + "', allowSpecialFloatingPointValues=" + this.h + ", useAlternativeNames=" + this.i + ", namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, classDiscriminatorMode=" + this.j + ')';
    }
}
