package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class Gf2 {

    @NotNull
    public final Function0 a;
    public final int b;
    public final int c;

    @Nullable
    public final Integer d;

    @Nullable
    public final Integer e;

    @NotNull
    public final Function0<Unit> f;

    @Nullable
    public final List<Object> g;

    public Gf2() {
        throw null;
    }

    public Gf2(int i, int i2, Integer num, Integer num2, Function0 action, List list, int i3) {
        list = (i3 & 64) != 0 ? null : list;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(action, "action");
        this.a = action;
        this.b = i;
        this.c = i2;
        this.d = num;
        this.e = num2;
        this.f = action;
        this.g = list;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Gf2)) {
            return false;
        }
        Gf2 gf2 = (Gf2) obj;
        return this.b == gf2.b && this.c == gf2.c && Intrinsics.a(this.d, gf2.d) && Intrinsics.a(this.e, gf2.e) && Intrinsics.a(this.f, gf2.f) && Intrinsics.a(this.g, gf2.g);
    }

    public final int hashCode() {
        int iA = EF0.a(this.c, Integer.hashCode(this.b) * 31, 31);
        Integer num = this.d;
        int iHashCode = (iA + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        int iHashCode2 = (this.f.hashCode() + ((iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31)) * 961;
        List<Object> list = this.g;
        return (iHashCode2 + (list != null ? list.hashCode() : 0)) * 29791;
    }

    @NotNull
    public final String toString() {
        return "WarningWithArgs(textId=" + this.b + ", btnActionText=" + this.c + ", descriptionId=" + this.d + ", icon=" + this.e + ", action=" + this.f + ", argsTitle=null, argsSubTitle=" + this.g + ", text=null, description=null, closeIconAction=null)";
    }
}
