package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class ML1<Output> implements InterfaceC7015uc1<Output> {

    @NotNull
    public final TL1.b a;

    @NotNull
    public final String b;

    public ML1(@NotNull TL1.b isNegativeSetter, @NotNull String whatThisExpects) {
        Intrinsics.checkNotNullParameter(isNegativeSetter, "isNegativeSetter");
        Intrinsics.checkNotNullParameter(whatThisExpects, "whatThisExpects");
        this.a = isNegativeSetter;
        this.b = whatThisExpects;
    }

    @Override // defpackage.InterfaceC7015uc1
    @NotNull
    public final Object a(InterfaceC2928bN interfaceC2928bN, @NotNull String input, int i) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (i >= input.length()) {
            return Integer.valueOf(i);
        }
        char cCharAt = input.charAt(i);
        TL1.b bVar = this.a;
        if (cCharAt == '-') {
            bVar.invoke(interfaceC2928bN, Boolean.TRUE);
            return Integer.valueOf(i + 1);
        }
        if (cCharAt == '+') {
            bVar.invoke(interfaceC2928bN, Boolean.FALSE);
            return Integer.valueOf(i + 1);
        }
        LL1 message = new LL1(this, cCharAt);
        Intrinsics.checkNotNullParameter(message, "message");
        return new C4235hc1(i, message);
    }

    @NotNull
    public final String toString() {
        return this.b;
    }
}
