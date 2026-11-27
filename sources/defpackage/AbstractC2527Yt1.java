package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Yt1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2527Yt1 implements InterfaceC6510sB {

    @NotNull
    public final Function1<RK0, AbstractC4649jL0> a;

    @NotNull
    public final String b;

    /* JADX INFO: renamed from: Yt1$a */
    public static final class a extends AbstractC2527Yt1 {

        @NotNull
        public static final a c = new a("Boolean", C7508wx.h);
    }

    /* JADX INFO: renamed from: Yt1$b */
    public static final class b extends AbstractC2527Yt1 {

        @NotNull
        public static final b c = new b("Int", C7718xx.h);
    }

    /* JADX INFO: renamed from: Yt1$c */
    public static final class c extends AbstractC2527Yt1 {

        @NotNull
        public static final c c = new c("Unit", C1428Lc.i);
    }

    public AbstractC2527Yt1(String str, Function1 function1) {
        this.a = function1;
        this.b = "must return ".concat(str);
    }

    @Override // defpackage.InterfaceC6510sB
    public final boolean a(@NotNull AE0 functionDescriptor) {
        Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
        return Intrinsics.a(functionDescriptor.k, this.a.invoke(C4900kZ.e(functionDescriptor)));
    }

    @Override // defpackage.InterfaceC6510sB
    @Nullable
    public final String b(@NotNull AE0 ae0) {
        return InterfaceC6510sB.a.a(this, ae0);
    }

    @Override // defpackage.InterfaceC6510sB
    @NotNull
    public final String getDescription() {
        return this.b;
    }
}
