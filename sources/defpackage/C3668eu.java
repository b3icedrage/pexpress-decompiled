package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: eu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3668eu {

    @NotNull
    public final List<C5819ou> a;

    @Nullable
    public final Integer b;

    @Nullable
    public final Function0<Unit> c;

    public C3668eu(@NotNull List itemsList, @Nullable Integer num, @Nullable Function0 function0) {
        Intrinsics.checkNotNullParameter(itemsList, "itemsList");
        this.a = itemsList;
        this.b = num;
        this.c = function0;
    }

    public static C3668eu a(C3668eu c3668eu, Integer num, Function0 function0) {
        List<C5819ou> itemsList = c3668eu.a;
        c3668eu.getClass();
        c3668eu.getClass();
        c3668eu.getClass();
        Intrinsics.checkNotNullParameter(itemsList, "itemsList");
        return new C3668eu(itemsList, num, function0);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3668eu)) {
            return false;
        }
        C3668eu c3668eu = (C3668eu) obj;
        return Intrinsics.a(this.a, c3668eu.a) && Intrinsics.a(this.b, c3668eu.b) && Intrinsics.a(this.c, c3668eu.c);
    }

    public final int hashCode() {
        int iA = C2983be.a(this.a.hashCode() * 31, false, 961);
        Integer num = this.b;
        int iHashCode = (iA + (num == null ? 0 : num.hashCode())) * 31;
        Function0<Unit> function0 = this.c;
        return iHashCode + (function0 != null ? function0.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "BottomSheetData(itemsList=" + this.a + ", hasCounter=false, actionButtonStr=null, actionButtonResId=" + this.b + ", onActionButtonClicked=" + this.c + ")";
    }
}
