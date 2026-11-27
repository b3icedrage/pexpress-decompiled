package defpackage;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: y91, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7766y91 {

    @NotNull
    public static final KW1 a = XO0.b(a.d);

    /* JADX INFO: renamed from: y91$a */
    public static final class a extends ML0 implements Function0<E91> {
        public static final a d = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final E91 invoke() {
            return new E91();
        }
    }

    public static InterfaceC3459du0 a() {
        return (InterfaceC3459du0) a.getValue();
    }

    @NotNull
    public static InterfaceC1719Ou0 b() {
        InterfaceC3459du0 interfaceC3459du0A = a();
        Intrinsics.c(interfaceC3459du0A, "null cannot be cast to non-null type com.onesignal.common.services.IServiceProvider");
        return (InterfaceC1719Ou0) interfaceC3459du0A;
    }

    public static final boolean c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return a().initWithContext(context, null);
    }
}
