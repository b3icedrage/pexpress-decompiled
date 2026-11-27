package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Wc2 implements InterfaceC6510sB {

    @NotNull
    public final String a;

    public static final class a extends Wc2 {
        public final int b;

        /* JADX WARN: Illegal instructions before constructor call */
        public a(int i) {
            StringBuilder sbC = C1332Jw.c(i, "must have at least ", " value parameter");
            sbC.append(i > 1 ? "s" : "");
            super(sbC.toString());
            this.b = i;
        }

        @Override // defpackage.InterfaceC6510sB
        public final boolean a(@NotNull AE0 functionDescriptor) {
            Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
            return functionDescriptor.j().size() >= this.b;
        }
    }

    public static final class b extends Wc2 {
        public final int b;

        public b() {
            super("must have exactly 2 value parameters");
            this.b = 2;
        }

        @Override // defpackage.InterfaceC6510sB
        public final boolean a(@NotNull AE0 functionDescriptor) {
            Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
            return functionDescriptor.j().size() == this.b;
        }
    }

    public static final class c extends Wc2 {

        @NotNull
        public static final c b = new c("must have no value parameters");

        @Override // defpackage.InterfaceC6510sB
        public final boolean a(@NotNull AE0 functionDescriptor) {
            Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
            return functionDescriptor.j().isEmpty();
        }
    }

    public static final class d extends Wc2 {

        @NotNull
        public static final d b = new d("must have a single value parameter");

        @Override // defpackage.InterfaceC6510sB
        public final boolean a(@NotNull AE0 functionDescriptor) {
            Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
            return functionDescriptor.j().size() == 1;
        }
    }

    public Wc2(String str) {
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
