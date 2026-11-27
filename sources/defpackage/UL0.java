package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class UL0 implements Cloneable {

    @NotNull
    public final String d;

    @NotNull
    public final String e;

    @NotNull
    public final String g;

    @NotNull
    public final String h;

    @NotNull
    public final String i;

    @NotNull
    public final String j;

    @NotNull
    public final String k;
    public final int l;
    public final boolean m;

    public UL0(@NotNull String languageName, @NotNull String languageTwoLettersRegionCode, @NotNull String languageTwoLettersLanguageCode, @NotNull String languageSelectionTitle, @NotNull String languageSelectionSubTitle, @NotNull String languageSelectionButtonNextText, @NotNull String languageSelectionButtonConfirmText, int i, boolean z) {
        Intrinsics.checkNotNullParameter(languageName, "languageName");
        Intrinsics.checkNotNullParameter(languageTwoLettersRegionCode, "languageTwoLettersRegionCode");
        Intrinsics.checkNotNullParameter(languageTwoLettersLanguageCode, "languageTwoLettersLanguageCode");
        Intrinsics.checkNotNullParameter(languageSelectionTitle, "languageSelectionTitle");
        Intrinsics.checkNotNullParameter(languageSelectionSubTitle, "languageSelectionSubTitle");
        Intrinsics.checkNotNullParameter(languageSelectionButtonNextText, "languageSelectionButtonNextText");
        Intrinsics.checkNotNullParameter(languageSelectionButtonConfirmText, "languageSelectionButtonConfirmText");
        this.d = languageName;
        this.e = languageTwoLettersRegionCode;
        this.g = languageTwoLettersLanguageCode;
        this.h = languageSelectionTitle;
        this.i = languageSelectionSubTitle;
        this.j = languageSelectionButtonNextText;
        this.k = languageSelectionButtonConfirmText;
        this.l = i;
        this.m = z;
    }

    public final Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        Intrinsics.c(objClone, "null cannot be cast to non-null type com.api.feature.changelanguage.models.LanguageModel");
        return (UL0) objClone;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UL0)) {
            return false;
        }
        UL0 ul0 = (UL0) obj;
        return Intrinsics.a(this.d, ul0.d) && Intrinsics.a(this.e, ul0.e) && Intrinsics.a(this.g, ul0.g) && Intrinsics.a(this.h, ul0.h) && Intrinsics.a(this.i, ul0.i) && Intrinsics.a(this.j, ul0.j) && Intrinsics.a(this.k, ul0.k) && this.l == ul0.l && this.m == ul0.m;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.m) + EF0.a(this.l, C1039Gc0.b(C1039Gc0.b(C1039Gc0.b(C1039Gc0.b(C1039Gc0.b(C1039Gc0.b(this.d.hashCode() * 31, 31, this.e), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("LanguageModel(languageName=");
        sb.append(this.d);
        sb.append(", languageTwoLettersRegionCode=");
        sb.append(this.e);
        sb.append(", languageTwoLettersLanguageCode=");
        sb.append(this.g);
        sb.append(", languageSelectionTitle=");
        sb.append(this.h);
        sb.append(", languageSelectionSubTitle=");
        sb.append(this.i);
        sb.append(", languageSelectionButtonNextText=");
        sb.append(this.j);
        sb.append(", languageSelectionButtonConfirmText=");
        sb.append(this.k);
        sb.append(", languageIntResource=");
        sb.append(this.l);
        sb.append(", languageSelected=");
        return C2983be.b(sb, this.m, ")");
    }
}
