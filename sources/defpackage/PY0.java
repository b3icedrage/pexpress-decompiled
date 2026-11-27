package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PY0 implements InterfaceC6510sB {

    @NotNull
    public final String a;

    public static final class a extends PY0 {

        @NotNull
        public static final a b = new a("must be a member function");

        @Override // defpackage.InterfaceC6510sB
        public final boolean a(@NotNull AE0 functionDescriptor) {
            Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
            return functionDescriptor.n != null;
        }
    }

    public static final class b extends PY0 {

        @NotNull
        public static final b b = new b("must be a member or an extension function");

        @Override // defpackage.InterfaceC6510sB
        public final boolean a(@NotNull AE0 functionDescriptor) {
            Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
            return (functionDescriptor.n == null && functionDescriptor.m == null) ? false : true;
        }
    }

    public PY0(String str) {
        this.a = str;
    }

    @Override // defpackage.InterfaceC6510sB
    @Nullable
    public final String b(@NotNull AE0 ae0) {
        return InterfaceC6510sB.a.a(this, ae0);
    }

    @Override // defpackage.InterfaceC6510sB
    @NotNull
    public final String getDescription() {
        return this.a;
    }
}
