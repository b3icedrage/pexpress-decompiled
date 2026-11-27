package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: zK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8008zK<T> implements InterfaceC7750y51<T> {

    @NotNull
    public final String a;

    public C8008zK(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        this.a = string;
    }

    @Override // defpackage.InterfaceC1132Hh0
    @NotNull
    public final InterfaceC1210Ih0<T> a() {
        String string = this.a;
        Intrinsics.checkNotNullParameter(string, "string");
        return new BK();
    }

    @Override // defpackage.InterfaceC1132Hh0
    @NotNull
    public final C7436wc1<T> b() {
        List listA;
        String strSubstring;
        String strSubstring2 = this.a;
        if (strSubstring2.length() == 0) {
            listA = C5653o60.d;
        } else {
            CQ0 cq0B = VE.b();
            String strSubstring3 = "";
            if (Character.isDigit(strSubstring2.charAt(0))) {
                int length = strSubstring2.length();
                int i = 0;
                while (true) {
                    if (i >= length) {
                        strSubstring = strSubstring2;
                        break;
                    }
                    if (!Character.isDigit(strSubstring2.charAt(i))) {
                        strSubstring = strSubstring2.substring(0, i);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                        break;
                    }
                    i++;
                }
                cq0B.add(new C7758y71(VE.c(new AK(strSubstring))));
                int length2 = strSubstring2.length();
                int i2 = 0;
                while (true) {
                    if (i2 >= length2) {
                        strSubstring2 = "";
                        break;
                    }
                    if (!Character.isDigit(strSubstring2.charAt(i2))) {
                        strSubstring2 = strSubstring2.substring(i2);
                        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                        break;
                    }
                    i2++;
                }
            }
            if (strSubstring2.length() > 0) {
                if (Character.isDigit(strSubstring2.charAt(strSubstring2.length() - 1))) {
                    for (int iE = StringsKt.E(strSubstring2); -1 < iE; iE--) {
                        if (!Character.isDigit(strSubstring2.charAt(iE))) {
                            strSubstring3 = strSubstring2.substring(0, iE + 1);
                            Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
                            break;
                        }
                    }
                    cq0B.add(new C1747Pd1(strSubstring3));
                    for (int iE2 = StringsKt.E(strSubstring2); -1 < iE2; iE2--) {
                        if (!Character.isDigit(strSubstring2.charAt(iE2))) {
                            strSubstring2 = strSubstring2.substring(iE2 + 1);
                            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                            break;
                        }
                    }
                    cq0B.add(new C7758y71(VE.c(new AK(strSubstring2))));
                } else {
                    cq0B.add(new C1747Pd1(strSubstring2));
                }
            }
            listA = VE.a(cq0B);
        }
        return new C7436wc1<>(listA, C5653o60.d);
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof C8008zK) {
            return Intrinsics.a(this.a, ((C8008zK) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public final String toString() {
        return C1039Gc0.e(new StringBuilder("ConstantFormatStructure("), this.a, ')');
    }
}
