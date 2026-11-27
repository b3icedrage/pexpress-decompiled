package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: f11, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3693f11 {

    @NotNull
    public static final C3693f11 b;

    @NotNull
    public final List<String> a;

    /* JADX INFO: renamed from: f11$a */
    public /* synthetic */ class a extends C2784ak0 implements Function1<String, String> {
        public static final a m = new a(1, String.class, "toString", "toString()Ljava/lang/String;", 0);

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(String str) {
            String p0 = str;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return p0.toString();
        }
    }

    static {
        new C3693f11(WE.f("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"));
        b = new C3693f11(WE.f("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"));
    }

    public C3693f11(@NotNull List<String> names) {
        Intrinsics.checkNotNullParameter(names, "names");
        this.a = names;
        if (names.size() != 12) {
            throw new IllegalArgumentException("Month names must contain exactly 12 elements");
        }
        Iterator<Integer> it = WE.d(names).iterator();
        while (it.hasNext()) {
            int iB = ((CB0) it).b();
            if (this.a.get(iB).length() <= 0) {
                throw new IllegalArgumentException("A month name can not be empty");
            }
            for (int i = 0; i < iB; i++) {
                if (Intrinsics.a(this.a.get(iB), this.a.get(i))) {
                    throw new IllegalArgumentException(C5807oq.b(new StringBuilder("Month names must be unique, but '"), this.a.get(iB), "' was repeated").toString());
                }
            }
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof C3693f11) {
            return Intrinsics.a(this.a, ((C3693f11) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public final String toString() {
        return CollectionsKt.J(this.a, ", ", "MonthNames(", ")", a.m, 24);
    }
}
