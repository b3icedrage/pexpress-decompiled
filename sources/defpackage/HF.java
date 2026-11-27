package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class HF {

    @NotNull
    public final ArrayList a;

    public HF(@NotNull ArrayList countryList) {
        Intrinsics.checkNotNullParameter(countryList, "countryList");
        this.a = countryList;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HF) && this.a.equals(((HF) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "CommonCountriesLocalized(countryList=" + this.a + ")";
    }
}
