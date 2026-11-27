package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Pd1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1747Pd1<Output> implements InterfaceC7015uc1<Output> {

    @NotNull
    public final String a;

    public C1747Pd1(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        this.a = string;
        if (string.length() <= 0) {
            throw new IllegalArgumentException("Empty string is not allowed");
        }
        if (Character.isDigit(string.charAt(0))) {
            throw new IllegalArgumentException(C1039Gc0.d("String '", string, "' starts with a digit").toString());
        }
        if (Character.isDigit(string.charAt(string.length() - 1))) {
            throw new IllegalArgumentException(C1039Gc0.d("String '", string, "' ends with a digit").toString());
        }
    }

    @Override // defpackage.InterfaceC7015uc1
    @NotNull
    public final Object a(InterfaceC2928bN interfaceC2928bN, @NotNull String input, int i) {
        Intrinsics.checkNotNullParameter(input, "input");
        String str = this.a;
        if (str.length() + i > input.length()) {
            C2 message = new C2(this, 3);
            Intrinsics.checkNotNullParameter(message, "message");
            return new C4235hc1(i, message);
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (input.charAt(i + i2) != str.charAt(i2)) {
                C1669Od1 message2 = new C1669Od1(this, input, i, i2);
                Intrinsics.checkNotNullParameter(message2, "message");
                return new C4235hc1(i, message2);
            }
        }
        return Integer.valueOf(str.length() + i);
    }

    @NotNull
    public final String toString() {
        return C1039Gc0.e(new StringBuilder("'"), this.a, '\'');
    }
}
