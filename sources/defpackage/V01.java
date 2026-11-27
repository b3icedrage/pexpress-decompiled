package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface V01 {

    public static final class a implements V01 {

        @NotNull
        public static final a a = new a();

        @Override // defpackage.V01
        public final void a(@NotNull InterfaceC5938pU what, @NotNull InterfaceC4675jU from) {
            Intrinsics.checkNotNullParameter(what, "what");
            Intrinsics.checkNotNullParameter(from, "from");
        }
    }

    void a(@NotNull InterfaceC5938pU interfaceC5938pU, @NotNull InterfaceC4675jU interfaceC4675jU);
}
