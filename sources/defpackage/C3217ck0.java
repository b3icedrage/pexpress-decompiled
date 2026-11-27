package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ck0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3217ck0 {

    @NotNull
    public static final C3217ck0 c = new C3217ck0(WE.f(AbstractC3008bk0.a.c, AbstractC3008bk0.d.c, AbstractC3008bk0.b.c, AbstractC3008bk0.c.c));

    @NotNull
    public final List<AbstractC3008bk0> a;

    @NotNull
    public final LinkedHashMap b;

    /* JADX INFO: renamed from: ck0$a */
    public static final class a {

        @NotNull
        public final AbstractC3008bk0 a;
        public final int b;

        public a(@NotNull AbstractC3008bk0 kind, int i) {
            Intrinsics.checkNotNullParameter(kind, "kind");
            this.a = kind;
            this.b = i;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.a(this.a, aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "KindWithArity(kind=" + this.a + ", arity=" + this.b + ')';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3217ck0(@NotNull List<? extends AbstractC3008bk0> kinds) {
        Intrinsics.checkNotNullParameter(kinds, "kinds");
        this.a = kinds;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : kinds) {
            C1758Ph0 c1758Ph0 = ((AbstractC3008bk0) obj).a;
            Object arrayList = linkedHashMap.get(c1758Ph0);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(c1758Ph0, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.b = linkedHashMap;
    }

    @Nullable
    public final a a(@NotNull C1758Ph0 packageFqName, @NotNull String className) {
        Integer numValueOf;
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        Intrinsics.checkNotNullParameter(className, "className");
        List<AbstractC3008bk0> list = (List) this.b.get(packageFqName);
        if (list != null) {
            for (AbstractC3008bk0 abstractC3008bk0 : list) {
                int i = 0;
                if (d.o(className, abstractC3008bk0.b, false)) {
                    String strSubstring = className.substring(abstractC3008bk0.b.length());
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    if (strSubstring.length() == 0) {
                        numValueOf = null;
                        break;
                    }
                    int length = strSubstring.length();
                    int i2 = 0;
                    while (true) {
                        if (i >= length) {
                            numValueOf = Integer.valueOf(i2);
                            break;
                        }
                        int iCharAt = strSubstring.charAt(i) - '0';
                        if (iCharAt < 0 || iCharAt >= 10) {
                            numValueOf = null;
                            break;
                        }
                        i2 = (i2 * 10) + iCharAt;
                        i++;
                    }
                    if (numValueOf != null) {
                        return new a(abstractC3008bk0, numValueOf.intValue());
                    }
                }
            }
        }
        return null;
    }
}
